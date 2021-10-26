// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceTagsResponseBody body;

    public static GetResourceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsResponse self = new GetResourceTagsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTagsResponse setBody(GetResourceTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTagsResponseBody getBody() {
        return this.body;
    }

}
