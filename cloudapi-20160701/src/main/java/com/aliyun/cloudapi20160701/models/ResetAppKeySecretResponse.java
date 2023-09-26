// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ResetAppKeySecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetAppKeySecretResponseBody body;

    public static ResetAppKeySecretResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppKeySecretResponse self = new ResetAppKeySecretResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppKeySecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppKeySecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAppKeySecretResponse setBody(ResetAppKeySecretResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppKeySecretResponseBody getBody() {
        return this.body;
    }

}
