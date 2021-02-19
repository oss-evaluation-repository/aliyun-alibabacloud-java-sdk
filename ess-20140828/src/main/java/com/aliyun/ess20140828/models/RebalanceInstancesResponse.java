// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class RebalanceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebalanceInstancesResponseBody body;

    public static RebalanceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebalanceInstancesResponse self = new RebalanceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RebalanceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebalanceInstancesResponse setBody(RebalanceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebalanceInstancesResponseBody getBody() {
        return this.body;
    }

}
