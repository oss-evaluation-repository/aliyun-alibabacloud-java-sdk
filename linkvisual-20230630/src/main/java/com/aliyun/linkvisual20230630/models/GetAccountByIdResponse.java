// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetAccountByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountByIdResponseBody body;

    public static GetAccountByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByIdResponse self = new GetAccountByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountByIdResponse setBody(GetAccountByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountByIdResponseBody getBody() {
        return this.body;
    }

}
