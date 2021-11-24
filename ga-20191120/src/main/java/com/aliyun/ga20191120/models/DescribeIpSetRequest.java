// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeIpSetRequest extends TeaModel {
    @NameInMap("IpSetId")
    public String ipSetId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpSetRequest self = new DescribeIpSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpSetRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DescribeIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
