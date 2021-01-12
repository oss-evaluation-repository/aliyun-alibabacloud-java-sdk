// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCreateDdrDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCreateDdrDBInstanceResponseBody body;

    public static CheckCreateDdrDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDdrDBInstanceResponse self = new CheckCreateDdrDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateDdrDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreateDdrDBInstanceResponse setBody(CheckCreateDdrDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateDdrDBInstanceResponseBody getBody() {
        return this.body;
    }

}
