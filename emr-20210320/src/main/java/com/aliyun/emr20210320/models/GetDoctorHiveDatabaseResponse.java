// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHiveDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHiveDatabaseResponseBody body;

    public static GetDoctorHiveDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHiveDatabaseResponse self = new GetDoctorHiveDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHiveDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHiveDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHiveDatabaseResponse setBody(GetDoctorHiveDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHiveDatabaseResponseBody getBody() {
        return this.body;
    }

}
