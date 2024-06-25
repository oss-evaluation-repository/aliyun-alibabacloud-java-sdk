// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpamScopeResponseBody body;

    public static DeleteIpamScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamScopeResponse self = new DeleteIpamScopeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpamScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpamScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpamScopeResponse setBody(DeleteIpamScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpamScopeResponseBody getBody() {
        return this.body;
    }

}
