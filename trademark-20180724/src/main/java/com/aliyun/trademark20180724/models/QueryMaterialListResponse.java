// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMaterialListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialListResponseBody body;

    public static QueryMaterialListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialListResponse self = new QueryMaterialListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialListResponse setBody(QueryMaterialListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialListResponseBody getBody() {
        return this.body;
    }

}
