// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddUserToVpcEndpointServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserToVpcEndpointServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserToVpcEndpointServiceResponseBody self = new AddUserToVpcEndpointServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserToVpcEndpointServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
