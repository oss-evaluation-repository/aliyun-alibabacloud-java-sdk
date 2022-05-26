// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomerCategoryResponseBody body;

    public static GetCustomerCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerCategoryResponse self = new GetCustomerCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerCategoryResponse setBody(GetCustomerCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerCategoryResponseBody getBody() {
        return this.body;
    }

}
