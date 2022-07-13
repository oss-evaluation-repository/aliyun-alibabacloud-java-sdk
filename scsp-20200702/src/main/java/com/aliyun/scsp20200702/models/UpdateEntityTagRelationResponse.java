// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateEntityTagRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEntityTagRelationResponseBody body;

    public static UpdateEntityTagRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityTagRelationResponse self = new UpdateEntityTagRelationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEntityTagRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEntityTagRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEntityTagRelationResponse setBody(UpdateEntityTagRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEntityTagRelationResponseBody getBody() {
        return this.body;
    }

}
