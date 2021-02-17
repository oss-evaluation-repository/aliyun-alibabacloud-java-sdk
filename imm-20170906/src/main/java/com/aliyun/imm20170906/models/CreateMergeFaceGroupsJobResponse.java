// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateMergeFaceGroupsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMergeFaceGroupsJobResponseBody body;

    public static CreateMergeFaceGroupsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeFaceGroupsJobResponse self = new CreateMergeFaceGroupsJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateMergeFaceGroupsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMergeFaceGroupsJobResponse setBody(CreateMergeFaceGroupsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMergeFaceGroupsJobResponseBody getBody() {
        return this.body;
    }

}
