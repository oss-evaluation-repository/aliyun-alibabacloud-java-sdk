// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteTenantAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTenantAppResponseBody body;

    public static DeleteTenantAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantAppResponse self = new DeleteTenantAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTenantAppResponse setBody(DeleteTenantAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantAppResponseBody getBody() {
        return this.body;
    }

}
