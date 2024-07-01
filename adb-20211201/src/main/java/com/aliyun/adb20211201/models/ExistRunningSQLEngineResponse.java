// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExistRunningSQLEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExistRunningSQLEngineResponseBody body;

    public static ExistRunningSQLEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistRunningSQLEngineResponse self = new ExistRunningSQLEngineResponse();
        return TeaModel.build(map, self);
    }

    public ExistRunningSQLEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistRunningSQLEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExistRunningSQLEngineResponse setBody(ExistRunningSQLEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistRunningSQLEngineResponseBody getBody() {
        return this.body;
    }

}
