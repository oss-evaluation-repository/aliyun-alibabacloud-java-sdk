// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AddIpamPoolCidrRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddIpamPoolCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpamPoolCidrRequest self = new AddIpamPoolCidrRequest();
        return TeaModel.build(map, self);
    }

    public AddIpamPoolCidrRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public AddIpamPoolCidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddIpamPoolCidrRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddIpamPoolCidrRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public AddIpamPoolCidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
