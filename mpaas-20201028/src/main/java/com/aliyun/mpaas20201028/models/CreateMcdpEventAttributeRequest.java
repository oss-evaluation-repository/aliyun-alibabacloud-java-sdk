// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpEventAttributeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpEventAttributeCreateJsonStr")
    public String mpaasMappcenterMcdpEventAttributeCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcdpEventAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpEventAttributeRequest self = new CreateMcdpEventAttributeRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcdpEventAttributeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcdpEventAttributeRequest setMpaasMappcenterMcdpEventAttributeCreateJsonStr(String mpaasMappcenterMcdpEventAttributeCreateJsonStr) {
        this.mpaasMappcenterMcdpEventAttributeCreateJsonStr = mpaasMappcenterMcdpEventAttributeCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpEventAttributeCreateJsonStr() {
        return this.mpaasMappcenterMcdpEventAttributeCreateJsonStr;
    }

    public CreateMcdpEventAttributeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcdpEventAttributeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
