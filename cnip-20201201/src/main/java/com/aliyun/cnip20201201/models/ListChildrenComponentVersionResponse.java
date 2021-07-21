// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListChildrenComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChildrenComponentVersionResponseBody body;

    public static ListChildrenComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChildrenComponentVersionResponse self = new ListChildrenComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListChildrenComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChildrenComponentVersionResponse setBody(ListChildrenComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChildrenComponentVersionResponseBody getBody() {
        return this.body;
    }

}
