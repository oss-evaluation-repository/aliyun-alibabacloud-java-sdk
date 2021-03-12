// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageKnowledgesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPackageKnowledgesResponseBody body;

    public static ListPackageKnowledgesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackageKnowledgesResponse self = new ListPackageKnowledgesResponse();
        return TeaModel.build(map, self);
    }

    public ListPackageKnowledgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackageKnowledgesResponse setBody(ListPackageKnowledgesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackageKnowledgesResponseBody getBody() {
        return this.body;
    }

}
