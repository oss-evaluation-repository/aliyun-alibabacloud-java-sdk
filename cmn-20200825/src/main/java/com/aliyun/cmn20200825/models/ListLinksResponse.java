// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLinksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinksResponseBody body;

    public static ListLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinksResponse self = new ListLinksResponse();
        return TeaModel.build(map, self);
    }

    public ListLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLinksResponse setBody(ListLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinksResponseBody getBody() {
        return this.body;
    }

}
