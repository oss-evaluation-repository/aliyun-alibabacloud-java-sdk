// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomizedFilterId")
    public String customizedFilterId;

    public static CreateCustomizedFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedFilterResponseBody self = new CreateCustomizedFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomizedFilterResponseBody setCustomizedFilterId(String customizedFilterId) {
        this.customizedFilterId = customizedFilterId;
        return this;
    }
    public String getCustomizedFilterId() {
        return this.customizedFilterId;
    }

}
