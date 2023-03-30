// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayAuthConsumerResponseBody body;

    public static UpdateGatewayAuthConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResponse self = new UpdateGatewayAuthConsumerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayAuthConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayAuthConsumerResponse setBody(UpdateGatewayAuthConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayAuthConsumerResponseBody getBody() {
        return this.body;
    }

}
