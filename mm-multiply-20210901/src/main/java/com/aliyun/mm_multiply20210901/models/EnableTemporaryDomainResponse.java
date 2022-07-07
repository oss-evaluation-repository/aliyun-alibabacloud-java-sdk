// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class EnableTemporaryDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableTemporaryDomainResponseBody body;

    public static EnableTemporaryDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableTemporaryDomainResponse self = new EnableTemporaryDomainResponse();
        return TeaModel.build(map, self);
    }

    public EnableTemporaryDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableTemporaryDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableTemporaryDomainResponse setBody(EnableTemporaryDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableTemporaryDomainResponseBody getBody() {
        return this.body;
    }

}
