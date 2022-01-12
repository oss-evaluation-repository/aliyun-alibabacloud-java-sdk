// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupAndAgentStatusSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSkillGroupAndAgentStatusSummaryResponseBody body;

    public static GetSkillGroupAndAgentStatusSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAndAgentStatusSummaryResponse self = new GetSkillGroupAndAgentStatusSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAndAgentStatusSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillGroupAndAgentStatusSummaryResponse setBody(GetSkillGroupAndAgentStatusSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillGroupAndAgentStatusSummaryResponseBody getBody() {
        return this.body;
    }

}
