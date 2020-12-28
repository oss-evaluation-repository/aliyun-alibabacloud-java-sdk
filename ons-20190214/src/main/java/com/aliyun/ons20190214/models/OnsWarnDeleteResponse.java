// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsWarnDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsWarnDeleteResponseBody body;

    public static OnsWarnDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsWarnDeleteResponse self = new OnsWarnDeleteResponse();
        return TeaModel.build(map, self);
    }

    public OnsWarnDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsWarnDeleteResponse setBody(OnsWarnDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsWarnDeleteResponseBody getBody() {
        return this.body;
    }

}
