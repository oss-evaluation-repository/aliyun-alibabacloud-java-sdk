// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class HangupThirdCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HangupThirdCallResponseBody body;

    public static HangupThirdCallResponse build(java.util.Map<String, ?> map) throws Exception {
        HangupThirdCallResponse self = new HangupThirdCallResponse();
        return TeaModel.build(map, self);
    }

    public HangupThirdCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HangupThirdCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HangupThirdCallResponse setBody(HangupThirdCallResponseBody body) {
        this.body = body;
        return this;
    }
    public HangupThirdCallResponseBody getBody() {
        return this.body;
    }

}
