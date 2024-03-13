// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DeleteCostUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCostUnitResponseBody body;

    public static DeleteCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostUnitResponse self = new DeleteCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCostUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCostUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCostUnitResponse setBody(DeleteCostUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCostUnitResponseBody getBody() {
        return this.body;
    }

}
