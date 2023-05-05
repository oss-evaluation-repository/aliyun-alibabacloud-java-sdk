// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvCertStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIsvCertStatusResponseBody body;

    public static GetIsvCertStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIsvCertStatusResponse self = new GetIsvCertStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetIsvCertStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIsvCertStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIsvCertStatusResponse setBody(GetIsvCertStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIsvCertStatusResponseBody getBody() {
        return this.body;
    }

}
