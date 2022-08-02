// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceLinkedRoleResponseBody body;

    public static CheckServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponse self = new CheckServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceLinkedRoleResponse setBody(CheckServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
