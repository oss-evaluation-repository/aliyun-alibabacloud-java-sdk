// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Description` to specify the description of security group rule N.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestGroupId` to specify the ID of the destination security group.</p>
     */
    @NameInMap("DestGroupId")
    public String destGroupId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestGroupOwnerAccount` to specify the Alibaba Cloud account that manages the destination security group.</p>
     */
    @NameInMap("DestGroupOwnerAccount")
    public String destGroupOwnerAccount;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the destination security group.</p>
     */
    @NameInMap("DestGroupOwnerId")
    public Long destGroupOwnerId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestPrefixListId` to specify the ID of the destination prefix list.</p>
     */
    @NameInMap("DestPrefixListId")
    public String destPrefixListId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.IpProtocol` to specify the transport layer protocol.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Ipv6DestCidrIp` to specify the destination IPv6 CIDR block.</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.NicType` to specify the NIC type.</p>
     */
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The security group rules. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<RevokeSecurityGroupEgressRequestPermissions> permissions;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Policy` to specify whether to allow outbound access.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.PortRange` to specify the range of destination ports.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Priority` to specify the priority of the rule.</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security group rules. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public java.util.List<String> securityGroupRuleId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.SourceCidrIp` to specify the source IPv4 CIDR block.</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.SourcePortRange` to specify the range of source ports.</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static RevokeSecurityGroupEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupEgressRequest self = new RevokeSecurityGroupEgressRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupEgressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RevokeSecurityGroupEgressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RevokeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    public RevokeSecurityGroupEgressRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    public RevokeSecurityGroupEgressRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    public RevokeSecurityGroupEgressRequest setDestPrefixListId(String destPrefixListId) {
        this.destPrefixListId = destPrefixListId;
        return this;
    }
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    public RevokeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public RevokeSecurityGroupEgressRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public RevokeSecurityGroupEgressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RevokeSecurityGroupEgressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RevokeSecurityGroupEgressRequest setPermissions(java.util.List<RevokeSecurityGroupEgressRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<RevokeSecurityGroupEgressRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public RevokeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public RevokeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public RevokeSecurityGroupEgressRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public RevokeSecurityGroupEgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeSecurityGroupEgressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RevokeSecurityGroupEgressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RevokeSecurityGroupEgressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeSecurityGroupEgressRequest setSecurityGroupRuleId(java.util.List<String> securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public java.util.List<String> getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public RevokeSecurityGroupEgressRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static class RevokeSecurityGroupEgressRequestPermissions extends TeaModel {
        /**
         * <p>The description of security group rule N. The description must be 1 to 512 characters in length.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The ID of the destination security group that is referenced in security group rule N.</p>
         * <br>
         * <p>*   Specify at least one of the following parameters: `DestGroupId`, `DestCidrIp`, `Ipv6DestCidrIp`, and `DestPrefixListId`.</p>
         * <p>*   If you specify `DestGroupId` but you do not specify `DestCidrIp`, you must set `NicType` to intranet.</p>
         * <p>*   If you specify `DestGroupId` and `DestCidrIp`, `DestCidrIp` takes precedence.</p>
         * <br>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <br>
         * <p>*   You cannot reference security groups as destinations or sources in the rules of advanced security groups.</p>
         * <p>*   You can reference up to 20 security groups as destinations or sources in the rules of each basic security group.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestGroupId")
        public String destGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the destination security group when you delete security group rule N across accounts.</p>
         * <br>
         * <p>*   If both `DestGroupOwnerAccount` and `DestGroupOwnerId` are not specified, the security group rule that controls access to other security groups managed by your account is deleted.</p>
         * <p>*   If you specify `DestCidrIp`, `DestGroupOwnerAccount` is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the destination security group when you delete security group rule N across accounts.</p>
         * <br>
         * <p>*   If both `DestGroupOwnerId` and `DestGroupOwnerAccount` are not specified, the security group rule that controls access to other security groups managed by your account is deleted.</p>
         * <p>*   If you specify `DestCidrIp`, `DestGroupOwnerId` is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestGroupOwnerId")
        public String destGroupOwnerId;

        /**
         * <p>The ID of the destination prefix list that is referenced in security group rule N. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.</p>
         * <br>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <br>
         * <p>*   If the network type of a security group is classic network, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).</p>
         * <p>*   If you specify the `DestCidrIp`, `Ipv6DestCidrIp`, or `DestGroupId` parameter, this parameter is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        /**
         * <p>The transport layer protocol of security group rule N. The values of this parameter are not case-sensitive. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         * <p>*   ICMP</p>
         * <p>*   ICMPv6</p>
         * <p>*   GRE</p>
         * <p>*   ALL: All protocols are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> This parameter is valid only when the destination is an Elastic Compute Service (ECS) instance that resides in a virtual private cloud (VPC) and supports IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.</p>
         * <br>
         * <p>This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> This parameter is valid only when the source is an ECS instance that resides in a VPC and supports IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface card (NIC) type of the security group rule if the security group is of the classic network type. Valid values:</p>
         * <br>
         * <p>*   internet: public NIC</p>
         * <p>*   intranet: internal NIC</p>
         * <br>
         * <p>If the security group is in a VPC, this parameter is set to intranet by default and cannot be changed.</p>
         * <br>
         * <p>If you specify only `SourceGroupId` when you configure access between security groups, this parameter must be set to intranet.</p>
         * <br>
         * <p>Default value: internet.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The action of security group rule N that determines whether to allow outbound access. Valid values:</p>
         * <br>
         * <p>*   accept: allows access.</p>
         * <p>*   drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.</p>
         * <br>
         * <p>Default value: accept.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the transport layer protocol of security group rule N. Valid values:</p>
         * <br>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: 1/200.</p>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to ICMP, the port range is -1/-1, which indicates all ports.</p>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to GRE, the port range is -1/-1, which indicates all ports.</p>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to ALL, the port range is -1/-1, which indicates all ports.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of security group rule N. A smaller value specifies a higher priority. Valid values: 1 to 100.</p>
         * <br>
         * <p>Default value: 1.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
         * <br>
         * <p>This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source ports that correspond to the transport layer protocol of security group rule N. Valid values:</p>
         * <br>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: 1/200.</p>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to ICMP, the port range is -1/-1, which indicates all ports.</p>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to GRE, the port range is -1/-1, which indicates all ports.</p>
         * <p>*   If the Permissions.N.IpProtocol parameter is set to ALL, the port range is -1/-1, which indicates all ports.</p>
         * <br>
         * <p>This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static RevokeSecurityGroupEgressRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            RevokeSecurityGroupEgressRequestPermissions self = new RevokeSecurityGroupEgressRequestPermissions();
            return TeaModel.build(map, self);
        }

        public RevokeSecurityGroupEgressRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestGroupOwnerId(String destGroupOwnerId) {
            this.destGroupOwnerId = destGroupOwnerId;
            return this;
        }
        public String getDestGroupOwnerId() {
            return this.destGroupOwnerId;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestPrefixListId(String destPrefixListId) {
            this.destPrefixListId = destPrefixListId;
            return this;
        }
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        public RevokeSecurityGroupEgressRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public RevokeSecurityGroupEgressRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public RevokeSecurityGroupEgressRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public RevokeSecurityGroupEgressRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public RevokeSecurityGroupEgressRequestPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public RevokeSecurityGroupEgressRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
