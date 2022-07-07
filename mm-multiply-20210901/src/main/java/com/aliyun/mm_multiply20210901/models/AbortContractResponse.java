// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class AbortContractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AbortContractResponseBody body;

    public static AbortContractResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortContractResponse self = new AbortContractResponse();
        return TeaModel.build(map, self);
    }

    public AbortContractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortContractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortContractResponse setBody(AbortContractResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortContractResponseBody getBody() {
        return this.body;
    }

}
