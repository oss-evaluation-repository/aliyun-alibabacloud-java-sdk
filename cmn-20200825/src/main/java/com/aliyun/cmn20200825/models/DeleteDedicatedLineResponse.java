// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDedicatedLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDedicatedLineResponseBody body;

    public static DeleteDedicatedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedLineResponse self = new DeleteDedicatedLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDedicatedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDedicatedLineResponse setBody(DeleteDedicatedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDedicatedLineResponseBody getBody() {
        return this.body;
    }

}
