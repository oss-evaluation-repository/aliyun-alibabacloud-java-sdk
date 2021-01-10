// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsSignStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmsSignStatusResponseBody body;

    public static DescribeSmsSignStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsSignStatusResponse self = new DescribeSmsSignStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsSignStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmsSignStatusResponse setBody(DescribeSmsSignStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmsSignStatusResponseBody getBody() {
        return this.body;
    }

}
