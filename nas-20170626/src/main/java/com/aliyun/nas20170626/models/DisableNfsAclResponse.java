// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableNfsAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableNfsAclResponseBody body;

    public static DisableNfsAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableNfsAclResponse self = new DisableNfsAclResponse();
        return TeaModel.build(map, self);
    }

    public DisableNfsAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableNfsAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableNfsAclResponse setBody(DisableNfsAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableNfsAclResponseBody getBody() {
        return this.body;
    }

}
