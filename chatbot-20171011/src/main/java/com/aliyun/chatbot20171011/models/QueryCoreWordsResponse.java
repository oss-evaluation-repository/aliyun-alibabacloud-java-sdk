// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryCoreWordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCoreWordsResponseBody body;

    public static QueryCoreWordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCoreWordsResponse self = new QueryCoreWordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryCoreWordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCoreWordsResponse setBody(QueryCoreWordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCoreWordsResponseBody getBody() {
        return this.body;
    }

}
