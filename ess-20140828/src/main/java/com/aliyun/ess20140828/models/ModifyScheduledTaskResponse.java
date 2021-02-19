// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScheduledTaskResponseBody body;

    public static ModifyScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskResponse self = new ModifyScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScheduledTaskResponse setBody(ModifyScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
