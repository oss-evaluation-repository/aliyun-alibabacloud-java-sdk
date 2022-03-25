// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class TestPopParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestPopParamsResponseBody body;

    public static TestPopParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        TestPopParamsResponse self = new TestPopParamsResponse();
        return TeaModel.build(map, self);
    }

    public TestPopParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestPopParamsResponse setBody(TestPopParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public TestPopParamsResponseBody getBody() {
        return this.body;
    }

}
