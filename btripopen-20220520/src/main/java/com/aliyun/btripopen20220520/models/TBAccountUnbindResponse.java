// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TBAccountUnbindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TBAccountUnbindResponseBody body;

    public static TBAccountUnbindResponse build(java.util.Map<String, ?> map) throws Exception {
        TBAccountUnbindResponse self = new TBAccountUnbindResponse();
        return TeaModel.build(map, self);
    }

    public TBAccountUnbindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TBAccountUnbindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TBAccountUnbindResponse setBody(TBAccountUnbindResponseBody body) {
        this.body = body;
        return this;
    }
    public TBAccountUnbindResponseBody getBody() {
        return this.body;
    }

}
