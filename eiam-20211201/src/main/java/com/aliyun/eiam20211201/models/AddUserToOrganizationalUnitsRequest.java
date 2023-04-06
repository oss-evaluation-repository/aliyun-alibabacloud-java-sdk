// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUserToOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>组织ID集合</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>账户ID</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddUserToOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToOrganizationalUnitsRequest self = new AddUserToOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUserToOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public AddUserToOrganizationalUnitsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
