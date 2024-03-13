// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSavingsPlansUsageDetailResponseBody body;

    public static DescribeSavingsPlansUsageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageDetailResponse self = new DescribeSavingsPlansUsageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSavingsPlansUsageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSavingsPlansUsageDetailResponse setBody(DescribeSavingsPlansUsageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSavingsPlansUsageDetailResponseBody getBody() {
        return this.body;
    }

}
