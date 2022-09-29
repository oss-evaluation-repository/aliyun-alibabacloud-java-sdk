// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryInstructionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLibraryInstructionResponseBody body;

    public static GetLibraryInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryInstructionResponse self = new GetLibraryInstructionResponse();
        return TeaModel.build(map, self);
    }

    public GetLibraryInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLibraryInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLibraryInstructionResponse setBody(GetLibraryInstructionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLibraryInstructionResponseBody getBody() {
        return this.body;
    }

}
