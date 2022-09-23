// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryNoDistributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNoDistributeResponseBody body;

    public static QueryNoDistributeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNoDistributeResponse self = new QueryNoDistributeResponse();
        return TeaModel.build(map, self);
    }

    public QueryNoDistributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNoDistributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNoDistributeResponse setBody(QueryNoDistributeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNoDistributeResponseBody getBody() {
        return this.body;
    }

}
