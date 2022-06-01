// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainingJobResponseBody body;

    public static GetTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobResponse self = new GetTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrainingJobResponse setBody(GetTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainingJobResponseBody getBody() {
        return this.body;
    }

}
