// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class RejectVpcPeerConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RejectVpcPeerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectVpcPeerConnectionResponseBody self = new RejectVpcPeerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectVpcPeerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
