// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableServiceForCloudSiemRequest extends TeaModel {
    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableServiceForCloudSiemRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceForCloudSiemRequest self = new EnableServiceForCloudSiemRequest();
        return TeaModel.build(map, self);
    }

    public EnableServiceForCloudSiemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
