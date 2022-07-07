// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListContractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListContractResponseBody body;

    public static ListContractResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContractResponse self = new ListContractResponse();
        return TeaModel.build(map, self);
    }

    public ListContractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContractResponse setBody(ListContractResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContractResponseBody getBody() {
        return this.body;
    }

}
