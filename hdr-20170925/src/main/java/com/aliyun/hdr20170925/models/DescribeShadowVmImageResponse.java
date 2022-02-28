// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeShadowVmImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeShadowVmImageResponseBody body;

    public static DescribeShadowVmImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShadowVmImageResponse self = new DescribeShadowVmImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShadowVmImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShadowVmImageResponse setBody(DescribeShadowVmImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShadowVmImageResponseBody getBody() {
        return this.body;
    }

}
