// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateBimProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBimProjectResponseBody body;

    public static CreateBimProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBimProjectResponse self = new CreateBimProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateBimProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBimProjectResponse setBody(CreateBimProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBimProjectResponseBody getBody() {
        return this.body;
    }

}
