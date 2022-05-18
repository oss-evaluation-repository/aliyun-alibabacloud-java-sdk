// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotChatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotChatResponseBody body;

    public static XspaceNextbotChatResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotChatResponse self = new XspaceNextbotChatResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public XspaceNextbotChatResponse setBody(XspaceNextbotChatResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotChatResponseBody getBody() {
        return this.body;
    }

}
