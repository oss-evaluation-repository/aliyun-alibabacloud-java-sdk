// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchUpdateFormDataByInstanceIdShrinkRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("AsynchronousExecution")
    public Boolean asynchronousExecution;

    @NameInMap("FormInstanceIdList")
    public String formInstanceIdListShrink;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("IgnoreEmpty")
    public Boolean ignoreEmpty;

    @NameInMap("NoExecuteExpression")
    public Boolean noExecuteExpression;

    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("UpdateFormDataJson")
    public String updateFormDataJson;

    @NameInMap("UseLatestFormSchemaVersion")
    public Boolean useLatestFormSchemaVersion;

    public static BatchUpdateFormDataByInstanceIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFormDataByInstanceIdShrinkRequest self = new BatchUpdateFormDataByInstanceIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setAsynchronousExecution(Boolean asynchronousExecution) {
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setFormInstanceIdListShrink(String formInstanceIdListShrink) {
        this.formInstanceIdListShrink = formInstanceIdListShrink;
        return this;
    }
    public String getFormInstanceIdListShrink() {
        return this.formInstanceIdListShrink;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setIgnoreEmpty(Boolean ignoreEmpty) {
        this.ignoreEmpty = ignoreEmpty;
        return this;
    }
    public Boolean getIgnoreEmpty() {
        return this.ignoreEmpty;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setNoExecuteExpression(Boolean noExecuteExpression) {
        this.noExecuteExpression = noExecuteExpression;
        return this;
    }
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setUpdateFormDataJson(String updateFormDataJson) {
        this.updateFormDataJson = updateFormDataJson;
        return this;
    }
    public String getUpdateFormDataJson() {
        return this.updateFormDataJson;
    }

    public BatchUpdateFormDataByInstanceIdShrinkRequest setUseLatestFormSchemaVersion(Boolean useLatestFormSchemaVersion) {
        this.useLatestFormSchemaVersion = useLatestFormSchemaVersion;
        return this;
    }
    public Boolean getUseLatestFormSchemaVersion() {
        return this.useLatestFormSchemaVersion;
    }

}
