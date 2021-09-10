// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectionsResponseBody body;

    public static ListConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponse self = new ListConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectionsResponse setBody(ListConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectionsResponseBody getBody() {
        return this.body;
    }

}
