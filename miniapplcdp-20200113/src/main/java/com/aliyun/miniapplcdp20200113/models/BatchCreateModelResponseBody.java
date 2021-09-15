// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchCreateModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchCreateModelResponseBodyData data;

    public static BatchCreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateModelResponseBody self = new BatchCreateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateModelResponseBody setData(BatchCreateModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCreateModelResponseBodyData getData() {
        return this.data;
    }

    public static class BatchCreateModelResponseBodyDataItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Revision")
        public Integer revision;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Props")
        public java.util.Map<String, ?> props;

        @NameInMap("ModelStatus")
        public String modelStatus;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModelId")
        public String modelId;

        public static BatchCreateModelResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateModelResponseBodyDataItems self = new BatchCreateModelResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public BatchCreateModelResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchCreateModelResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public BatchCreateModelResponseBodyDataItems setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public BatchCreateModelResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public BatchCreateModelResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public BatchCreateModelResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchCreateModelResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public BatchCreateModelResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public BatchCreateModelResponseBodyDataItems setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public BatchCreateModelResponseBodyDataItems setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public BatchCreateModelResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public BatchCreateModelResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public BatchCreateModelResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchCreateModelResponseBodyDataItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class BatchCreateModelResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<BatchCreateModelResponseBodyDataItems> items;

        public static BatchCreateModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateModelResponseBodyData self = new BatchCreateModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateModelResponseBodyData setItems(java.util.List<BatchCreateModelResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<BatchCreateModelResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
