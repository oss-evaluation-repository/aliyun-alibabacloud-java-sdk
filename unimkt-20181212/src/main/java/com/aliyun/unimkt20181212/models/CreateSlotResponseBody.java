// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateSlotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateSlotResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotResponseBody self = new CreateSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSlotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSlotResponseBody setModel(CreateSlotResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateSlotResponseBodyModel getModel() {
        return this.model;
    }

    public CreateSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSlotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSlotResponseBodyModel extends TeaModel {
        @NameInMap("AdSlotCorporateStatus")
        public String adSlotCorporateStatus;

        @NameInMap("AdSlotId")
        public String adSlotId;

        @NameInMap("AdSlotName")
        public String adSlotName;

        @NameInMap("AdSlotStatus")
        public String adSlotStatus;

        @NameInMap("AdSlotTemplateId")
        public String adSlotTemplateId;

        @NameInMap("AdSlotType")
        public String adSlotType;

        @NameInMap("BlockingRule")
        public String blockingRule;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("InspireScene")
        public String inspireScene;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static CreateSlotResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateSlotResponseBodyModel self = new CreateSlotResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateSlotResponseBodyModel setAdSlotCorporateStatus(String adSlotCorporateStatus) {
            this.adSlotCorporateStatus = adSlotCorporateStatus;
            return this;
        }
        public String getAdSlotCorporateStatus() {
            return this.adSlotCorporateStatus;
        }

        public CreateSlotResponseBodyModel setAdSlotId(String adSlotId) {
            this.adSlotId = adSlotId;
            return this;
        }
        public String getAdSlotId() {
            return this.adSlotId;
        }

        public CreateSlotResponseBodyModel setAdSlotName(String adSlotName) {
            this.adSlotName = adSlotName;
            return this;
        }
        public String getAdSlotName() {
            return this.adSlotName;
        }

        public CreateSlotResponseBodyModel setAdSlotStatus(String adSlotStatus) {
            this.adSlotStatus = adSlotStatus;
            return this;
        }
        public String getAdSlotStatus() {
            return this.adSlotStatus;
        }

        public CreateSlotResponseBodyModel setAdSlotTemplateId(String adSlotTemplateId) {
            this.adSlotTemplateId = adSlotTemplateId;
            return this;
        }
        public String getAdSlotTemplateId() {
            return this.adSlotTemplateId;
        }

        public CreateSlotResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public CreateSlotResponseBodyModel setBlockingRule(String blockingRule) {
            this.blockingRule = blockingRule;
            return this;
        }
        public String getBlockingRule() {
            return this.blockingRule;
        }

        public CreateSlotResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateSlotResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CreateSlotResponseBodyModel setInspireScene(String inspireScene) {
            this.inspireScene = inspireScene;
            return this;
        }
        public String getInspireScene() {
            return this.inspireScene;
        }

        public CreateSlotResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public CreateSlotResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public CreateSlotResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateSlotResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateSlotResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
