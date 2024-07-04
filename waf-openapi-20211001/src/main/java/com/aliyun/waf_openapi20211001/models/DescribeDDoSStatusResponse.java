// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDDoSStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSStatusResponseBody body;

    public static DescribeDDoSStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSStatusResponse self = new DescribeDDoSStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSStatusResponse setBody(DescribeDDoSStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSStatusResponseBody getBody() {
        return this.body;
    }

}
