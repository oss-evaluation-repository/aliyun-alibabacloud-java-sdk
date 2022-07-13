// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentServiceStatusResponseBody body;

    public static GetAgentServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentServiceStatusResponse self = new GetAgentServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentServiceStatusResponse setBody(GetAgentServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentServiceStatusResponseBody getBody() {
        return this.body;
    }

}
