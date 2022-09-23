// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QuerySimplePoolInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySimplePoolInfoListResponseBody body;

    public static QuerySimplePoolInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySimplePoolInfoListResponse self = new QuerySimplePoolInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySimplePoolInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySimplePoolInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySimplePoolInfoListResponse setBody(QuerySimplePoolInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySimplePoolInfoListResponseBody getBody() {
        return this.body;
    }

}
