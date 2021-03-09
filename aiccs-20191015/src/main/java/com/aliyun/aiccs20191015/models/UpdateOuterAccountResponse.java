// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateOuterAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOuterAccountResponseBody body;

    public static UpdateOuterAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOuterAccountResponse self = new UpdateOuterAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOuterAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOuterAccountResponse setBody(UpdateOuterAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOuterAccountResponseBody getBody() {
        return this.body;
    }

}
