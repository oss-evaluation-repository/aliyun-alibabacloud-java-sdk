// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteDistributeUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDistributeUserResponseBody body;

    public static DeleteDistributeUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDistributeUserResponse self = new DeleteDistributeUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDistributeUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDistributeUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDistributeUserResponse setBody(DeleteDistributeUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDistributeUserResponseBody getBody() {
        return this.body;
    }

}
