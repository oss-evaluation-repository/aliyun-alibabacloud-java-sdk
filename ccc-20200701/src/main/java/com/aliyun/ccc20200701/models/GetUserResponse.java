// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserResponseBody body;

    public static GetUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponse self = new GetUserResponse();
        return TeaModel.build(map, self);
    }

    public GetUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserResponse setBody(GetUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserResponseBody getBody() {
        return this.body;
    }

}
