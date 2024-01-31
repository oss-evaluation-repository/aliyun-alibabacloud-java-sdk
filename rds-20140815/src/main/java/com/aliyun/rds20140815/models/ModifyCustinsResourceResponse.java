// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCustinsResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustinsResourceResponseBody body;

    public static ModifyCustinsResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustinsResourceResponse self = new ModifyCustinsResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustinsResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustinsResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustinsResourceResponse setBody(ModifyCustinsResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustinsResourceResponseBody getBody() {
        return this.body;
    }

}
