// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskFlowResponseBody body;

    public static ListTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowResponse self = new ListTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowResponse setBody(ListTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowResponseBody getBody() {
        return this.body;
    }

}
