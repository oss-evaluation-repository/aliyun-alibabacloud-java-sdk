// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyLifecycleHookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLifecycleHookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLifecycleHookResponseBody self = new ModifyLifecycleHookResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLifecycleHookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
