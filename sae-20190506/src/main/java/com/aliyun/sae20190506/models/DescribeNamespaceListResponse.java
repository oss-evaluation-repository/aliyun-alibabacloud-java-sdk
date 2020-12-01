// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNamespaceListResponseBody body;

    public static DescribeNamespaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListResponse self = new DescribeNamespaceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceListResponse setBody(DescribeNamespaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespaceListResponseBody getBody() {
        return this.body;
    }

}
