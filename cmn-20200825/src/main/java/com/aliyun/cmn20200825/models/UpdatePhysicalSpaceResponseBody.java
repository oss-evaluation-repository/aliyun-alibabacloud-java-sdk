// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePhysicalSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhysicalSpaceResponseBody self = new UpdatePhysicalSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePhysicalSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
