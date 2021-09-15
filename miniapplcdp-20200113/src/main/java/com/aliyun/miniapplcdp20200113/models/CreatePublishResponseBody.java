// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreatePublishResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreatePublishResponseBodyData data;

    public static CreatePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishResponseBody self = new CreatePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePublishResponseBody setData(CreatePublishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePublishResponseBodyData getData() {
        return this.data;
    }

    public static class CreatePublishResponseBodyData extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("VersionNumber")
        public String versionNumber;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SubTasks")
        public java.util.List<java.util.Map<String, ?>> subTasks;

        public static CreatePublishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePublishResponseBodyData self = new CreatePublishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePublishResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreatePublishResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePublishResponseBodyData setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public CreatePublishResponseBodyData setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public CreatePublishResponseBodyData setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public CreatePublishResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreatePublishResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreatePublishResponseBodyData setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public CreatePublishResponseBodyData setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public CreatePublishResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePublishResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreatePublishResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public CreatePublishResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreatePublishResponseBodyData setSubTasks(java.util.List<java.util.Map<String, ?>> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSubTasks() {
            return this.subTasks;
        }

    }

}
