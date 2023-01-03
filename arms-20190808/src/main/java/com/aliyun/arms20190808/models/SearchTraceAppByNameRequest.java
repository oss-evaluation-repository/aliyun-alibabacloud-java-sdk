// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The name of the application for which you want to query application monitoring jobs.
    @NameInMap("TraceAppName")
    public String traceAppName;

    public static SearchTraceAppByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameRequest self = new SearchTraceAppByNameRequest();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTraceAppByNameRequest setTraceAppName(String traceAppName) {
        this.traceAppName = traceAppName;
        return this;
    }
    public String getTraceAppName() {
        return this.traceAppName;
    }

}
