// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorResponseBody self = new UpdateAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
