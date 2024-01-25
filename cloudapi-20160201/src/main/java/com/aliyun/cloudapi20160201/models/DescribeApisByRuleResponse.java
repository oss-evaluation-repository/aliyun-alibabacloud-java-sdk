// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApisByRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisByRuleResponseBody body;

    public static DescribeApisByRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByRuleResponse self = new DescribeApisByRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisByRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisByRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisByRuleResponse setBody(DescribeApisByRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisByRuleResponseBody getBody() {
        return this.body;
    }

}
