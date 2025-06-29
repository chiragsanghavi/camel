/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.seda;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.FailedToStartRouteException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SedaConcurrentConsumersNPEIssueTest extends ContextTestSupport {

    @Test
    public void testSendToSeda() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello World");

        template.sendBody("seda:foo", "Hello World");

        assertMockEndpointsSatisfied();

        FailedToStartRouteException e
                = assertThrows(FailedToStartRouteException.class, () -> context.getRouteController().startRoute("first"),
                        "Should have thrown exception");

        assertEquals("Failed to start route: first because: Multiple consumers for the same endpoint is not allowed:"
                     + " seda://foo?concurrentConsumers=5",
                e.getMessage());
    }

    @Test
    public void testStartThird() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello World");

        template.sendBody("seda:foo", "Hello World");

        assertMockEndpointsSatisfied();

        // this should be okay
        context.getRouteController().startRoute("third");

        FailedToStartRouteException e
                = assertThrows(FailedToStartRouteException.class, () -> context.getRouteController().startRoute("first"),
                        "Should have thrown exception");

        assertEquals("Failed to start route: first because: Multiple consumers for the same endpoint is not allowed:"
                     + " seda://foo?concurrentConsumers=5",
                e.getMessage());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("seda:foo?concurrentConsumers=5").routeId("first").autoStartup(false).to("mock:result");

                from("seda:foo?concurrentConsumers=5").routeId("second").to("mock:result");

                from("direct:foo").routeId("third").autoStartup(false).to("mock:result");
            }
        };
    }
}
