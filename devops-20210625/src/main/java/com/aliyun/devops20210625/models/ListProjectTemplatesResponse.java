// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectTemplatesResponseBody body;

    public static ListProjectTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectTemplatesResponse self = new ListProjectTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectTemplatesResponse setBody(ListProjectTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectTemplatesResponseBody getBody() {
        return this.body;
    }

}
