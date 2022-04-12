// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptGetServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AdaptGetServiceResponseBody body;

    public static AdaptGetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AdaptGetServiceResponse self = new AdaptGetServiceResponse();
        return TeaModel.build(map, self);
    }

    public AdaptGetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdaptGetServiceResponse setBody(AdaptGetServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AdaptGetServiceResponseBody getBody() {
        return this.body;
    }

}
