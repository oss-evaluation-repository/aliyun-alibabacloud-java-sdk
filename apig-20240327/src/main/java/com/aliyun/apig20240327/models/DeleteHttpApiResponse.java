// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHttpApiResponseBody body;

    public static DeleteHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpApiResponse self = new DeleteHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHttpApiResponse setBody(DeleteHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHttpApiResponseBody getBody() {
        return this.body;
    }

}
