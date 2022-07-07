// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpShelfItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpShelfItemsResponseBody body;

    public static UpShelfItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpShelfItemsResponse self = new UpShelfItemsResponse();
        return TeaModel.build(map, self);
    }

    public UpShelfItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpShelfItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpShelfItemsResponse setBody(UpShelfItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpShelfItemsResponseBody getBody() {
        return this.body;
    }

}
