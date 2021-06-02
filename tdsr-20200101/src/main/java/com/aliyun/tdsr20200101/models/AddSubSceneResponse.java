// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSubSceneResponseBody body;

    public static AddSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSubSceneResponse self = new AddSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public AddSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSubSceneResponse setBody(AddSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSubSceneResponseBody getBody() {
        return this.body;
    }

}
