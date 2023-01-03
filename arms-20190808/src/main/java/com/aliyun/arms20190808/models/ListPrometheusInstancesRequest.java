// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether to obtain global aggregation instances. Valid values:
    // 
    // *   true
    // *   false
    @NameInMap("ShowGlobalView")
    public Boolean showGlobalView;

    public static ListPrometheusInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesRequest self = new ListPrometheusInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPrometheusInstancesRequest setShowGlobalView(Boolean showGlobalView) {
        this.showGlobalView = showGlobalView;
        return this;
    }
    public Boolean getShowGlobalView() {
        return this.showGlobalView;
    }

}
