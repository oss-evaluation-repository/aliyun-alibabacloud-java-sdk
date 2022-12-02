// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Task body;

    public static PutTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PutTaskStatusResponse self = new PutTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public PutTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutTaskStatusResponse setBody(Task body) {
        this.body = body;
        return this;
    }
    public Task getBody() {
        return this.body;
    }

}
