// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckConsortiumDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckConsortiumDomainResponseBody body;

    public static CheckConsortiumDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConsortiumDomainResponse self = new CheckConsortiumDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckConsortiumDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckConsortiumDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckConsortiumDomainResponse setBody(CheckConsortiumDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckConsortiumDomainResponseBody getBody() {
        return this.body;
    }

}
