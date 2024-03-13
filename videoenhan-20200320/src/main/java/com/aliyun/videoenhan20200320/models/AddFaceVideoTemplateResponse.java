// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFaceVideoTemplateResponseBody body;

    public static AddFaceVideoTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateResponse self = new AddFaceVideoTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceVideoTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceVideoTemplateResponse setBody(AddFaceVideoTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceVideoTemplateResponseBody getBody() {
        return this.body;
    }

}
