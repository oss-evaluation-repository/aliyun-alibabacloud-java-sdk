// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobScheduleTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccJobScheduleTypesResponseBody body;

    public static ListCsccJobScheduleTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobScheduleTypesResponse self = new ListCsccJobScheduleTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccJobScheduleTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccJobScheduleTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccJobScheduleTypesResponse setBody(ListCsccJobScheduleTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccJobScheduleTypesResponseBody getBody() {
        return this.body;
    }

}
