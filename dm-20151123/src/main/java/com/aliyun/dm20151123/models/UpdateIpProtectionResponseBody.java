// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateIpProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpProtectionResponseBody self = new UpdateIpProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
