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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * LangChain4j Chat component
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LangChainChatEndpointBuilderFactory {


    /**
     * Builder for endpoint for the langChain4j Chat component.
     */
    public interface LangChainChatEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedLangChainChatEndpointBuilder advanced() {
            return (AdvancedLangChainChatEndpointBuilder) this;
        }
        /**
         * Operation in case of Endpoint of type CHAT. The value is one of the
         * values of
         * org.apache.camel.component.langchain.LangChainChatOperations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.chat.LangChainChatOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Default: CHAT_SINGLE_MESSAGE
         * Group: producer
         * 
         * @param chatOperation the value to set
         * @return the dsl builder
         */
        default LangChainChatEndpointBuilder chatOperation(
                org.apache.camel.component.chat.LangChainChatOperations chatOperation) {
            doSetProperty("chatOperation", chatOperation);
            return this;
        }
        /**
         * Operation in case of Endpoint of type CHAT. The value is one of the
         * values of
         * org.apache.camel.component.langchain.LangChainChatOperations.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.chat.LangChainChatOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Default: CHAT_SINGLE_MESSAGE
         * Group: producer
         * 
         * @param chatOperation the value to set
         * @return the dsl builder
         */
        default LangChainChatEndpointBuilder chatOperation(String chatOperation) {
            doSetProperty("chatOperation", chatOperation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the langChain4j Chat component.
     */
    public interface AdvancedLangChainChatEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LangChainChatEndpointBuilder basic() {
            return (LangChainChatEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedLangChainChatEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedLangChainChatEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Chat Language Model of type
         * dev.langchain4j.model.chat.ChatLanguageModel.
         * 
         * The option is a:
         * &lt;code&gt;dev.langchain4j.model.chat.ChatLanguageModel&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param chatModel the value to set
         * @return the dsl builder
         */
        default AdvancedLangChainChatEndpointBuilder chatModel(
                dev.langchain4j.model.chat.ChatLanguageModel chatModel) {
            doSetProperty("chatModel", chatModel);
            return this;
        }
        /**
         * Chat Language Model of type
         * dev.langchain4j.model.chat.ChatLanguageModel.
         * 
         * The option will be converted to a
         * &lt;code&gt;dev.langchain4j.model.chat.ChatLanguageModel&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param chatModel the value to set
         * @return the dsl builder
         */
        default AdvancedLangChainChatEndpointBuilder chatModel(String chatModel) {
            doSetProperty("chatModel", chatModel);
            return this;
        }
    }

    public interface LangChainChatBuilders {
        /**
         * langChain4j Chat (camel-langchain-chat)
         * LangChain4j Chat component
         * 
         * Category: ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-langchain-chat
         * 
         * @return the dsl builder for the headers' name.
         */
        default LangChainChatHeaderNameBuilder langchainChat() {
            return LangChainChatHeaderNameBuilder.INSTANCE;
        }
        /**
         * langChain4j Chat (camel-langchain-chat)
         * LangChain4j Chat component
         * 
         * Category: ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-langchain-chat
         * 
         * Syntax: <code>langchain-chat:chatId</code>
         * 
         * Path parameter: chatId (required)
         * The id
         * 
         * @param path chatId
         * @return the dsl builder
         */
        default LangChainChatEndpointBuilder langchainChat(String path) {
            return LangChainChatEndpointBuilderFactory.endpointBuilder("langchain-chat", path);
        }
        /**
         * langChain4j Chat (camel-langchain-chat)
         * LangChain4j Chat component
         * 
         * Category: ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-langchain-chat
         * 
         * Syntax: <code>langchain-chat:chatId</code>
         * 
         * Path parameter: chatId (required)
         * The id
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path chatId
         * @return the dsl builder
         */
        default LangChainChatEndpointBuilder langchainChat(
                String componentName,
                String path) {
            return LangChainChatEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the langChain4j Chat component.
     */
    public static class LangChainChatHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final LangChainChatHeaderNameBuilder INSTANCE = new LangChainChatHeaderNameBuilder();

        /**
         * The prompt Template.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code LangChainChatPromptTemplate}.
         */
        public String langChainChatPromptTemplate() {
            return "CamelLangChainChatPromptTemplate";
        }
    }
    static LangChainChatEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class LangChainChatEndpointBuilderImpl extends AbstractEndpointBuilder implements LangChainChatEndpointBuilder, AdvancedLangChainChatEndpointBuilder {
            public LangChainChatEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new LangChainChatEndpointBuilderImpl(path);
    }
}