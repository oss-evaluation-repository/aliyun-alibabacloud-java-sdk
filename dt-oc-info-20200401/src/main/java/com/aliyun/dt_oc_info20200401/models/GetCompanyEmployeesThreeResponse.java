// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyEmployeesThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyEmployeesThreeResponseBody body;

    public static GetCompanyEmployeesThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyEmployeesThreeResponse self = new GetCompanyEmployeesThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyEmployeesThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyEmployeesThreeResponse setBody(GetCompanyEmployeesThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyEmployeesThreeResponseBody getBody() {
        return this.body;
    }

}
