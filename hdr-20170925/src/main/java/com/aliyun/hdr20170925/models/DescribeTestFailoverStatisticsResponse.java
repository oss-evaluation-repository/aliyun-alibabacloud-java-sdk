// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeTestFailoverStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTestFailoverStatisticsResponseBody body;

    public static DescribeTestFailoverStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTestFailoverStatisticsResponse self = new DescribeTestFailoverStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTestFailoverStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTestFailoverStatisticsResponse setBody(DescribeTestFailoverStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTestFailoverStatisticsResponseBody getBody() {
        return this.body;
    }

}
