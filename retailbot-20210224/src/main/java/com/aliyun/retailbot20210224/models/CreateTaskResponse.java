// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTaskResponseBody body;

    public static CreateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponse self = new CreateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskResponse setBody(CreateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskResponseBody getBody() {
        return this.body;
    }

}
