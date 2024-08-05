// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIntranetDomainPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to enable the VPC domain name. Valid values:</p>
     * <ul>
     * <li>TRUE</li>
     * <li>FALSE</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VpcIntranetEnable")
    public Boolean vpcIntranetEnable;

    public static ModifyIntranetDomainPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetDomainPolicyRequest self = new ModifyIntranetDomainPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetDomainPolicyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyIntranetDomainPolicyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyIntranetDomainPolicyRequest setVpcIntranetEnable(Boolean vpcIntranetEnable) {
        this.vpcIntranetEnable = vpcIntranetEnable;
        return this;
    }
    public Boolean getVpcIntranetEnable() {
        return this.vpcIntranetEnable;
    }

}
