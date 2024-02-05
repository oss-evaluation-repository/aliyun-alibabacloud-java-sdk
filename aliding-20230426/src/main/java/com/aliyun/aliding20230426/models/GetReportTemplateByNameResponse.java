// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportTemplateByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReportTemplateByNameResponseBody body;

    public static GetReportTemplateByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateByNameResponse self = new GetReportTemplateByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportTemplateByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReportTemplateByNameResponse setBody(GetReportTemplateByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportTemplateByNameResponseBody getBody() {
        return this.body;
    }

}
