// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class DeleteClusterInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteClusterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterInstanceRequest self = new DeleteClusterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
