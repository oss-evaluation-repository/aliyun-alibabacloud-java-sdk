// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLiveResponseBody body;

    public static CreateLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveResponse self = new CreateLiveResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveResponse setBody(CreateLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveResponseBody getBody() {
        return this.body;
    }

}
