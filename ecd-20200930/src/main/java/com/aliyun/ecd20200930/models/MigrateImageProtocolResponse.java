// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateImageProtocolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateImageProtocolResponseBody body;

    public static MigrateImageProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateImageProtocolResponse self = new MigrateImageProtocolResponse();
        return TeaModel.build(map, self);
    }

    public MigrateImageProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateImageProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateImageProtocolResponse setBody(MigrateImageProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateImageProtocolResponseBody getBody() {
        return this.body;
    }

}
