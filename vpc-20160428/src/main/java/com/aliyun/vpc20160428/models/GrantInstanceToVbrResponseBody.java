// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToVbrResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99F13AE-D733-5856-AB97-80CC88B1D5A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantInstanceToVbrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToVbrResponseBody self = new GrantInstanceToVbrResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToVbrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
