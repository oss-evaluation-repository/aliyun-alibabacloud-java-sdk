// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class StartFailoverTestJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartFailoverTestJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartFailoverTestJobResponseBody self = new StartFailoverTestJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartFailoverTestJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
