// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConnectionResponseBody body;

    public static CreateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionResponse self = new CreateConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConnectionResponse setBody(CreateConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConnectionResponseBody getBody() {
        return this.body;
    }

}
