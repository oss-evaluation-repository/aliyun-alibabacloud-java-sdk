// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImagePermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImagePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImagePermissionResponseBody self = new ModifyImagePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImagePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
