// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainResponseBody body;

    public static DescribeDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResponse self = new DescribeDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainResponse setBody(DescribeDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainResponseBody getBody() {
        return this.body;
    }

}
