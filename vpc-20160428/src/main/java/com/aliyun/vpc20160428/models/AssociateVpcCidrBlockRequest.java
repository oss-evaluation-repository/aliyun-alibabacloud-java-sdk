// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockRequest extends TeaModel {
    /**
     * <p>The secondary IPv4 CIDR block. Take note of the following requirements:</p>
     * <br>
     * <p>*   You can specify one of the following standard IPv4 CIDR blocks or their subnets as the secondary IPv4 CIDR block: 192.168.0.0/16, 172.16.0.0/12, and 10.0.0.0/8.</p>
     * <p>*   You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, 169.254.0.0/16, or their subnets as the secondary IPv4 CIDR block of the VPC.</p>
     * <br>
     * <p>In addition, the following requirements must be met:</p>
     * <br>
     * <p>*   The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.</p>
     * <p>*   The secondary CIDR block cannot overlap with the primary CIDR block or an existing secondary CIDR block.</p>
     * <br>
     * <p>>  You must set one of the **SecondaryCidrBlock** and **Ipv6CidrBlock** parameters.</p>
     */
    @NameInMap("IPv6CidrBlock")
    public String IPv6CidrBlock;

    /**
     * <p>The type of the IPv6 CIDR block. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): Alibaba Cloud Border Gateway Protocol (BGP) IPv6</p>
     * <p>*   **ChinaMobile**: China Mobile (single line)</p>
     * <p>*   **ChinaUnicom**: China Unicom (single line)</p>
     * <p>*   **ChinaTelecom**: China Telecom (single line)</p>
     * <br>
     * <p>>  If your Alibaba Cloud account is allowed to use single-ISP bandwidth, valid values are: **ChinaTelecom**, **ChinaUnicom**, and **ChinaMobile**.</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>The IPv6 CIDR block.</p>
     * <br>
     * <p>>  You must set one of the **SecondaryCidrBlock** and **Ipv6CidrBlock** parameters.</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>*   The following list describes the limits on the maximum number of secondary CIDR blocks that can be added:</p>
     * <br>
     * <p>    *   You can add up to five secondary IPv4 CIDR blocks to each VPC.</p>
     * <p>    *   You can add up to three secondary IPv6 CIDR blocks to each VPC.</p>
     * <br>
     * <p>*   You cannot repeatedly call the **AssociateVpcCidrBlock** operation to add secondary CIDR blocks to a VPC within the specified period of time.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    /**
     * <p>The region ID of the VPC to which you want to add a secondary CIDR block.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static AssociateVpcCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpcCidrBlockRequest self = new AssociateVpcCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public AssociateVpcCidrBlockRequest setIPv6CidrBlock(String IPv6CidrBlock) {
        this.IPv6CidrBlock = IPv6CidrBlock;
        return this;
    }
    public String getIPv6CidrBlock() {
        return this.IPv6CidrBlock;
    }

    public AssociateVpcCidrBlockRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AssociateVpcCidrBlockRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public AssociateVpcCidrBlockRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public AssociateVpcCidrBlockRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociateVpcCidrBlockRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateVpcCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateVpcCidrBlockRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateVpcCidrBlockRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssociateVpcCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    public AssociateVpcCidrBlockRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
