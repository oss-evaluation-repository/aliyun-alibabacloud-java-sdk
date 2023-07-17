// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAlertContactResponseBody body;

    public static SearchAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactResponse self = new SearchAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAlertContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAlertContactResponse setBody(SearchAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAlertContactResponseBody getBody() {
        return this.body;
    }

}
