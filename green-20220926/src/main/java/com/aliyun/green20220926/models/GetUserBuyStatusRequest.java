// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUserBuyStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetUserBuyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserBuyStatusRequest self = new GetUserBuyStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUserBuyStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
