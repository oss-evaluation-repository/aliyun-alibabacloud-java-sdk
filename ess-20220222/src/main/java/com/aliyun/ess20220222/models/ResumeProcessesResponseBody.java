// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ResumeProcessesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E38EB733-D714-4658-8A5F-0688AB68****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeProcessesResponseBody self = new ResumeProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
