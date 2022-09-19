// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskFlowEdgesByConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTaskFlowEdgesByConditionResponseBody body;

    public static DeleteTaskFlowEdgesByConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskFlowEdgesByConditionResponse self = new DeleteTaskFlowEdgesByConditionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTaskFlowEdgesByConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTaskFlowEdgesByConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTaskFlowEdgesByConditionResponse setBody(DeleteTaskFlowEdgesByConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskFlowEdgesByConditionResponseBody getBody() {
        return this.body;
    }

}
