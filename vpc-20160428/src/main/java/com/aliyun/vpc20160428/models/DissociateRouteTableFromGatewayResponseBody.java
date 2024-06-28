// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateRouteTableFromGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C5644C9A-7480-13B6-AECB-30FF142E3724</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateRouteTableFromGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateRouteTableFromGatewayResponseBody self = new DissociateRouteTableFromGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateRouteTableFromGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
