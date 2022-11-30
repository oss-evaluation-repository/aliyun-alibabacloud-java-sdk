// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListReceiptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListReceiptResponseBody body;

    public static ListReceiptResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReceiptResponse self = new ListReceiptResponse();
        return TeaModel.build(map, self);
    }

    public ListReceiptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReceiptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReceiptResponse setBody(ListReceiptResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReceiptResponseBody getBody() {
        return this.body;
    }

}
