// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeDomainResolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainResolutionResponseBody body;

    public static DescribeDomainResolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolutionResponse self = new DescribeDomainResolutionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainResolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainResolutionResponse setBody(DescribeDomainResolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainResolutionResponseBody getBody() {
        return this.body;
    }

}
