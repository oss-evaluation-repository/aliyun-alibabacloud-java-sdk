// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDescriptionResponseBody self = new UpdateUserDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
