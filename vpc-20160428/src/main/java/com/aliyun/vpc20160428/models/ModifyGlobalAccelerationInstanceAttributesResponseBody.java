// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceAttributesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD5BCEE8-F62C-40C2-9AC3-89XXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalAccelerationInstanceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceAttributesResponseBody self = new ModifyGlobalAccelerationInstanceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
