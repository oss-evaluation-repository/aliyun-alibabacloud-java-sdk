// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddUserToVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the endpoint service. You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eu-west-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The endpoint service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The whitelist in the format of Aliyun Resource Name (ARN).</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:<em>:<account-id>:</em></p>
     */
    @NameInMap("UserARN")
    public String userARN;

    /**
     * <p>The account ID that you want to add to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>132193271328****</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static AddUserToVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToVpcEndpointServiceRequest self = new AddUserToVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserToVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddUserToVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddUserToVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AddUserToVpcEndpointServiceRequest setUserARN(String userARN) {
        this.userARN = userARN;
        return this;
    }
    public String getUserARN() {
        return this.userARN;
    }

    public AddUserToVpcEndpointServiceRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
