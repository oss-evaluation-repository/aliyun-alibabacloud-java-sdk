// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnFullDomainsBlockIPConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnFullDomainsBlockIPConfigResponseBody body;

    public static DescribeCdnFullDomainsBlockIPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnFullDomainsBlockIPConfigResponse self = new DescribeCdnFullDomainsBlockIPConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnFullDomainsBlockIPConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnFullDomainsBlockIPConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnFullDomainsBlockIPConfigResponse setBody(DescribeCdnFullDomainsBlockIPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnFullDomainsBlockIPConfigResponseBody getBody() {
        return this.body;
    }

}
