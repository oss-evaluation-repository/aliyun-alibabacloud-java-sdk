// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookResponseBody extends TeaModel {
    /**
     * <p>The ID of the lifecycle hook.</p>
     * 
     * <strong>example:</strong>
     * <p>ash-bp1at9ufhmcf9cmy****</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLifecycleHookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleHookResponseBody self = new CreateLifecycleHookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleHookResponseBody setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    public CreateLifecycleHookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
