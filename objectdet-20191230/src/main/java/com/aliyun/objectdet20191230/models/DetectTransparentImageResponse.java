// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectTransparentImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectTransparentImageResponseBody body;

    public static DetectTransparentImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectTransparentImageResponse self = new DetectTransparentImageResponse();
        return TeaModel.build(map, self);
    }

    public DetectTransparentImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectTransparentImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectTransparentImageResponse setBody(DetectTransparentImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectTransparentImageResponseBody getBody() {
        return this.body;
    }

}
