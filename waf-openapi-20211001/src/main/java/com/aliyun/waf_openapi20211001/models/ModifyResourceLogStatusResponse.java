// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyResourceLogStatusResponseBody body;

    public static ModifyResourceLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogStatusResponse self = new ModifyResourceLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourceLogStatusResponse setBody(ModifyResourceLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceLogStatusResponseBody getBody() {
        return this.body;
    }

}
