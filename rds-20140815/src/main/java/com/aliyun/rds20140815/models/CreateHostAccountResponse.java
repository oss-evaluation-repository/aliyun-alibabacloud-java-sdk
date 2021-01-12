// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHostAccountResponseBody body;

    public static CreateHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountResponse self = new CreateHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHostAccountResponse setBody(CreateHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHostAccountResponseBody getBody() {
        return this.body;
    }

}
