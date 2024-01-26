// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesktopSpecResponseBody body;

    public static ModifyDesktopSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopSpecResponse self = new ModifyDesktopSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopSpecResponse setBody(ModifyDesktopSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopSpecResponseBody getBody() {
        return this.body;
    }

}
