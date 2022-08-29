// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaPsiJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrustDaPsiJobResponseBody body;

    public static GetTrustDaPsiJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaPsiJobResponse self = new GetTrustDaPsiJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustDaPsiJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustDaPsiJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustDaPsiJobResponse setBody(GetTrustDaPsiJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustDaPsiJobResponseBody getBody() {
        return this.body;
    }

}
