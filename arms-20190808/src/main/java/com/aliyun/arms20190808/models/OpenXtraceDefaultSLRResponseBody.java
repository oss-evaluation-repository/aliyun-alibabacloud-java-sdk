// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenXtraceDefaultSLRResponseBody extends TeaModel {
    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static OpenXtraceDefaultSLRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceDefaultSLRResponseBody self = new OpenXtraceDefaultSLRResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenXtraceDefaultSLRResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpenXtraceDefaultSLRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
