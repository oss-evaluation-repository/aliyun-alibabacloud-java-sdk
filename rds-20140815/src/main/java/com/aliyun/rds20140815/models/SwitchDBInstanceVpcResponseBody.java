// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceVpcResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchDBInstanceVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceVpcResponseBody self = new SwitchDBInstanceVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
