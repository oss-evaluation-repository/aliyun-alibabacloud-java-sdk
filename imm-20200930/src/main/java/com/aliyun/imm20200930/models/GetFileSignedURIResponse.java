// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileSignedURIResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileSignedURIResponseBody body;

    public static GetFileSignedURIResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileSignedURIResponse self = new GetFileSignedURIResponse();
        return TeaModel.build(map, self);
    }

    public GetFileSignedURIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileSignedURIResponse setBody(GetFileSignedURIResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileSignedURIResponseBody getBody() {
        return this.body;
    }

}
