// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransferDomainsResponseBody body;

    public static DescribeTransferDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsResponse self = new DescribeTransferDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransferDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransferDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransferDomainsResponse setBody(DescribeTransferDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransferDomainsResponseBody getBody() {
        return this.body;
    }

}
