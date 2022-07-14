// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaWorkflowListResponseBody body;

    public static QueryMediaWorkflowListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowListResponse self = new QueryMediaWorkflowListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaWorkflowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaWorkflowListResponse setBody(QueryMediaWorkflowListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaWorkflowListResponseBody getBody() {
        return this.body;
    }

}
