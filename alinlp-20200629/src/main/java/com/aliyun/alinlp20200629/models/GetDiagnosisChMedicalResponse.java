// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDiagnosisChMedicalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiagnosisChMedicalResponseBody body;

    public static GetDiagnosisChMedicalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisChMedicalResponse self = new GetDiagnosisChMedicalResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisChMedicalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagnosisChMedicalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiagnosisChMedicalResponse setBody(GetDiagnosisChMedicalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagnosisChMedicalResponseBody getBody() {
        return this.body;
    }

}
