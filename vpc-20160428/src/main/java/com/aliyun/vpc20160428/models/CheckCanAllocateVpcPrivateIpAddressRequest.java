// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CheckCanAllocateVpcPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>Indicates whether the private IP address is available. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operation that you want to perform. Set the value to **CheckCanAllocateVpcPrivateIpAddress**.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>To query whether a private IP address is available, the private IP address must belong to the vSwitch specified by the **VSwitchId** parameter.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The version of the private IP address. Valid values:</p>
     * <br>
     * <p>*   **ipv4**: IPv4 If you want to query an IPv4 address, this parameter is optional.</p>
     * <p>*   **ipv6**: IPv6 If you want to query an IPv6 address, this parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CheckCanAllocateVpcPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCanAllocateVpcPrivateIpAddressRequest self = new CheckCanAllocateVpcPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckCanAllocateVpcPrivateIpAddressRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
