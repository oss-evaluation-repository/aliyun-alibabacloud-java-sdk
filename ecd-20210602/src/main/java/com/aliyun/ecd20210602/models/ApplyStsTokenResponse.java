// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ApplyStsTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyStsTokenResponseBody body;

    public static ApplyStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyStsTokenResponse self = new ApplyStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyStsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyStsTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyStsTokenResponse setBody(ApplyStsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyStsTokenResponseBody getBody() {
        return this.body;
    }

}
