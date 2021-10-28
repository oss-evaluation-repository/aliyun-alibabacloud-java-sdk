// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ValidateGatewayNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateGatewayNameResponseBody body;

    public static ValidateGatewayNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateGatewayNameResponse self = new ValidateGatewayNameResponse();
        return TeaModel.build(map, self);
    }

    public ValidateGatewayNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateGatewayNameResponse setBody(ValidateGatewayNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateGatewayNameResponseBody getBody() {
        return this.body;
    }

}
