// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataServiceFoldersResponseBody body;

    public static ListDataServiceFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersResponse self = new ListDataServiceFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceFoldersResponse setBody(ListDataServiceFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceFoldersResponseBody getBody() {
        return this.body;
    }

}
