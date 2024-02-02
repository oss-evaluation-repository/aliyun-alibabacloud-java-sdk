// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricDataResponseBody body;

    public static DescribeMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataResponse self = new DescribeMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricDataResponse setBody(DescribeMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricDataResponseBody getBody() {
        return this.body;
    }

}
