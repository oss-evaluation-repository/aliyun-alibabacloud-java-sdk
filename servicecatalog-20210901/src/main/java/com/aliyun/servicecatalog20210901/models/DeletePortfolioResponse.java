// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeletePortfolioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePortfolioResponseBody body;

    public static DeletePortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePortfolioResponse self = new DeletePortfolioResponse();
        return TeaModel.build(map, self);
    }

    public DeletePortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePortfolioResponse setBody(DeletePortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePortfolioResponseBody getBody() {
        return this.body;
    }

}
