// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserVpcAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserVpcAuthorizationResponseBody self = new AddUserVpcAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserVpcAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
