// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddIpControlPolicyItemRequest extends TeaModel {
    /**
     * <p>The restriction policy on app IDs for a specific policy. You can restrict app IDs only for whitelists. The IpControlType values of whitelists are ALLOW.</p>
     * <ul>
     * <li>You can add only one app ID restriction policy at a time.</li>
     * <li>If this parameter is empty, no restriction is imposed on the app IDs.</li>
     * <li>If this parameter is not empty, there is restriction not only on IP addresses, but also on apps.</li>
     * <li>Please note that if this parameter is not empty and the security authentication method of the API is No Authentication, all API calls are restricted.</li>
     * <li>If this parameter is not empty for a blacklist, API Gateway automatically skips this parameter and sets only restriction on IP addresses. The IpControlType value of a blacklist is REFUSE.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The IP addresses or CIDR blocks involved in the policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can specify a maximum of 10 IP addresses or CIDR blocks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>113.125.1.101;101.11.1.1</p>
     */
    @NameInMap("CidrIp")
    public String cidrIp;

    /**
     * <p>The ID of the ACL. The ID is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4223a10e-eed3-46a6-8b7c-23003f488153</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddIpControlPolicyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpControlPolicyItemRequest self = new AddIpControlPolicyItemRequest();
        return TeaModel.build(map, self);
    }

    public AddIpControlPolicyItemRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddIpControlPolicyItemRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public AddIpControlPolicyItemRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public AddIpControlPolicyItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
