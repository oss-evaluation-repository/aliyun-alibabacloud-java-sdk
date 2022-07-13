// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentHotlinePhoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentHotlinePhoneResponseBody body;

    public static GetAgentHotlinePhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentHotlinePhoneResponse self = new GetAgentHotlinePhoneResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentHotlinePhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentHotlinePhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentHotlinePhoneResponse setBody(GetAgentHotlinePhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentHotlinePhoneResponseBody getBody() {
        return this.body;
    }

}
