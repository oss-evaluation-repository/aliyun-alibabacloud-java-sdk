// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SendTokenCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendTokenCodeResponseBody body;

    public static SendTokenCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTokenCodeResponse self = new SendTokenCodeResponse();
        return TeaModel.build(map, self);
    }

    public SendTokenCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTokenCodeResponse setBody(SendTokenCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTokenCodeResponseBody getBody() {
        return this.body;
    }

}
