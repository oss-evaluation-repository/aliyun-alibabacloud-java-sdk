// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateCustomImageNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomImageNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomImageNameResponseBody self = new UpdateCustomImageNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomImageNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
