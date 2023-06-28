// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TagResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Tag body;

    public static TagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourceResponse self = new TagResourceResponse();
        return TeaModel.build(map, self);
    }

    public TagResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagResourceResponse setBody(Tag body) {
        this.body = body;
        return this;
    }
    public Tag getBody() {
        return this.body;
    }

}
