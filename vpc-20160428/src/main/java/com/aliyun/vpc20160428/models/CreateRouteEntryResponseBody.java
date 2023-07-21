// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the custom route entry.</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    public static CreateRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryResponseBody self = new CreateRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteEntryResponseBody setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

}
