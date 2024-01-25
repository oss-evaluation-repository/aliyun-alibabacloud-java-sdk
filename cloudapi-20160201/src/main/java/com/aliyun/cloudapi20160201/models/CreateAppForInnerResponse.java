// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateAppForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppForInnerResponseBody body;

    public static CreateAppForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppForInnerResponse self = new CreateAppForInnerResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppForInnerResponse setBody(CreateAppForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppForInnerResponseBody getBody() {
        return this.body;
    }

}
