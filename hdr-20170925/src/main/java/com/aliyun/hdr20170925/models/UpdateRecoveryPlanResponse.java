// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRecoveryPlanResponseBody body;

    public static UpdateRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecoveryPlanResponse self = new UpdateRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecoveryPlanResponse setBody(UpdateRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
