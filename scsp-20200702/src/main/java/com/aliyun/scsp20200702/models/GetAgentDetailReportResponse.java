// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentDetailReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentDetailReportResponseBody body;

    public static GetAgentDetailReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDetailReportResponse self = new GetAgentDetailReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentDetailReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDetailReportResponse setBody(GetAgentDetailReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDetailReportResponseBody getBody() {
        return this.body;
    }

}
