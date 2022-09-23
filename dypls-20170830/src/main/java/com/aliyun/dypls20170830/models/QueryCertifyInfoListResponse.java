// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryCertifyInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCertifyInfoListResponseBody body;

    public static QueryCertifyInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCertifyInfoListResponse self = new QueryCertifyInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCertifyInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCertifyInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCertifyInfoListResponse setBody(QueryCertifyInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCertifyInfoListResponseBody getBody() {
        return this.body;
    }

}
