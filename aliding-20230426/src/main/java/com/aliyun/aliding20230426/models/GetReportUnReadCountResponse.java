// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportUnReadCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReportUnReadCountResponseBody body;

    public static GetReportUnReadCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportUnReadCountResponse self = new GetReportUnReadCountResponse();
        return TeaModel.build(map, self);
    }

    public GetReportUnReadCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportUnReadCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReportUnReadCountResponse setBody(GetReportUnReadCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportUnReadCountResponseBody getBody() {
        return this.body;
    }

}
