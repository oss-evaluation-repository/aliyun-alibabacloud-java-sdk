// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOperateVulResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOperateVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulResponseBody self = new ModifyOperateVulResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
