// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDownloadUrlResponseBody body;

    public static QueryDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDownloadUrlResponse self = new QueryDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDownloadUrlResponse setBody(QueryDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
