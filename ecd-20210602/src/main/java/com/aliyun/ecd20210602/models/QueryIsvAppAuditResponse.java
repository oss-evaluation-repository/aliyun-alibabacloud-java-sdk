// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryIsvAppAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIsvAppAuditResponseBody body;

    public static QueryIsvAppAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIsvAppAuditResponse self = new QueryIsvAppAuditResponse();
        return TeaModel.build(map, self);
    }

    public QueryIsvAppAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIsvAppAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIsvAppAuditResponse setBody(QueryIsvAppAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIsvAppAuditResponseBody getBody() {
        return this.body;
    }

}
