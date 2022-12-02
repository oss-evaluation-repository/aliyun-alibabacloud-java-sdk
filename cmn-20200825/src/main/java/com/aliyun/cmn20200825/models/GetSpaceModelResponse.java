// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpaceModelResponseBody body;

    public static GetSpaceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelResponse self = new GetSpaceModelResponse();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpaceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpaceModelResponse setBody(GetSpaceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpaceModelResponseBody getBody() {
        return this.body;
    }

}
