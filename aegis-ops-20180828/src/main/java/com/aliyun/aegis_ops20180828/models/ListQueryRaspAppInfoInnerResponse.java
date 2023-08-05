// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueryRaspAppInfoInnerResponseBody body;

    public static ListQueryRaspAppInfoInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoInnerResponse self = new ListQueryRaspAppInfoInnerResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryRaspAppInfoInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueryRaspAppInfoInnerResponse setBody(ListQueryRaspAppInfoInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryRaspAppInfoInnerResponseBody getBody() {
        return this.body;
    }

}
