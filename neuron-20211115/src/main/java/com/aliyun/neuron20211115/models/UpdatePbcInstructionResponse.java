// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcInstructionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePbcInstructionResponseBody body;

    public static UpdatePbcInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcInstructionResponse self = new UpdatePbcInstructionResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePbcInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePbcInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePbcInstructionResponse setBody(UpdatePbcInstructionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePbcInstructionResponseBody getBody() {
        return this.body;
    }

}
