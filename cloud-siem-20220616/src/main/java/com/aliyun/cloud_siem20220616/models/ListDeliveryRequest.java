// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDeliveryRequest extends TeaModel {
    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    public static ListDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryRequest self = new ListDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ListDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDeliveryRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListDeliveryRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
