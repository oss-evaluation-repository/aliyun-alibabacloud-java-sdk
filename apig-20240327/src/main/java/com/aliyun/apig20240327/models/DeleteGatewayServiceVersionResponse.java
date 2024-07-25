// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteGatewayServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayServiceVersionResponseBody body;

    public static DeleteGatewayServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayServiceVersionResponse self = new DeleteGatewayServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayServiceVersionResponse setBody(DeleteGatewayServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayServiceVersionResponseBody getBody() {
        return this.body;
    }

}
