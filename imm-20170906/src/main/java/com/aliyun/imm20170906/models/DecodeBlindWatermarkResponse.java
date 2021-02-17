// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DecodeBlindWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DecodeBlindWatermarkResponseBody body;

    public static DecodeBlindWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        DecodeBlindWatermarkResponse self = new DecodeBlindWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public DecodeBlindWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecodeBlindWatermarkResponse setBody(DecodeBlindWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public DecodeBlindWatermarkResponseBody getBody() {
        return this.body;
    }

}
