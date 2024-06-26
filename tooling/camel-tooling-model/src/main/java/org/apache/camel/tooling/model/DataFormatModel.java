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
package org.apache.camel.tooling.model;

public class DataFormatModel extends ArtifactModel<DataFormatModel.DataFormatOptionModel> {

    protected String modelName;
    protected String modelJavaType;

    public static class DataFormatOptionModel extends BaseOptionModel {

    }

    public DataFormatModel() {
    }

    @Override
    public Kind getKind() {
        return Kind.dataformat;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelJavaType() {
        return modelJavaType;
    }

    public void setModelJavaType(String modelJavaType) {
        this.modelJavaType = modelJavaType;
    }
}
