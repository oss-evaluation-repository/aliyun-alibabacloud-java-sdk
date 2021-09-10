// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBaselineConfigsResponseBody body;

    public static ListBaselineConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineConfigsResponse self = new ListBaselineConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListBaselineConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaselineConfigsResponse setBody(ListBaselineConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaselineConfigsResponseBody getBody() {
        return this.body;
    }

}
