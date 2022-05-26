// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterPrometheusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterPrometheusResponseBody body;

    public static DescribeClusterPrometheusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPrometheusResponse self = new DescribeClusterPrometheusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPrometheusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterPrometheusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterPrometheusResponse setBody(DescribeClusterPrometheusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterPrometheusResponseBody getBody() {
        return this.body;
    }

}
