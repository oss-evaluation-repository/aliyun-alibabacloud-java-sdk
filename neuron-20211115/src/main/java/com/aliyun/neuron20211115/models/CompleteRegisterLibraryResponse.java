// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CompleteRegisterLibraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteRegisterLibraryResponseBody body;

    public static CompleteRegisterLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteRegisterLibraryResponse self = new CompleteRegisterLibraryResponse();
        return TeaModel.build(map, self);
    }

    public CompleteRegisterLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteRegisterLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteRegisterLibraryResponse setBody(CompleteRegisterLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteRegisterLibraryResponseBody getBody() {
        return this.body;
    }

}
