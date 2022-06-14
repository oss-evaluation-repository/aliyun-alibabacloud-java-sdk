// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class UntagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UntagResourcesResponseBody body;

    public static UntagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponse self = new UntagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagResourcesResponse setBody(UntagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagResourcesResponseBody getBody() {
        return this.body;
    }

}
