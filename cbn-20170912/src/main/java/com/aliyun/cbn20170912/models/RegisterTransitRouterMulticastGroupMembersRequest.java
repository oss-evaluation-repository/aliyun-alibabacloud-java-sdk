// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupMembersRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the multicast group to which the multicast members belong. Valid values: <strong>224.0.0.1</strong> to <strong>239.255.255.254</strong>.</p>
     * <p>If the multicast group does not exist in the specified multicast domain, the system automatically creates the multicast group in the multicast domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239.XX.XX.2</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>The IDs of the ENIs.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of inter-region multicast domains.</p>
     */
    @NameInMap("PeerTransitRouterMulticastDomains")
    public java.util.List<String> peerTransitRouterMulticastDomains;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the multicast domain to which the multicast members belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-mcast-domain-91wpg6wbhchjeq****</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>The ID of the VPC to which the ENI belongs.</p>
     * <ul>
     * <li>If the ENI belongs to the current Alibaba Cloud account, ignore this parameter.</li>
     * <li>If the ENI belongs to a different Alibaba Cloud account, you must set this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9fusm6zq8uy7cfa****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RegisterTransitRouterMulticastGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupMembersRequest self = new RegisterTransitRouterMulticastGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setPeerTransitRouterMulticastDomains(java.util.List<String> peerTransitRouterMulticastDomains) {
        this.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
        return this;
    }
    public java.util.List<String> getPeerTransitRouterMulticastDomains() {
        return this.peerTransitRouterMulticastDomains;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public RegisterTransitRouterMulticastGroupMembersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
