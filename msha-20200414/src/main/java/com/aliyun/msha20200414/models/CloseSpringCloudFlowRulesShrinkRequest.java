// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CloseSpringCloudFlowRulesShrinkRequest extends TeaModel {
    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 应用名
    @NameInMap("AppNames")
    public String appNamesShrink;

    public static CloseSpringCloudFlowRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseSpringCloudFlowRulesShrinkRequest self = new CloseSpringCloudFlowRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloseSpringCloudFlowRulesShrinkRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public CloseSpringCloudFlowRulesShrinkRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public CloseSpringCloudFlowRulesShrinkRequest setAppNamesShrink(String appNamesShrink) {
        this.appNamesShrink = appNamesShrink;
        return this;
    }
    public String getAppNamesShrink() {
        return this.appNamesShrink;
    }

}
