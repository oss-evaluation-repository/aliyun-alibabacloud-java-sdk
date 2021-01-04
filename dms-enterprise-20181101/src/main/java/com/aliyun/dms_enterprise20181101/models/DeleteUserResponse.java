// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserResponseBody body;

    public static DeleteUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserResponse self = new DeleteUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserResponse setBody(DeleteUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserResponseBody getBody() {
        return this.body;
    }

}
