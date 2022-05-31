// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class DownShelfDistributionItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownShelfDistributionItemResponseBody body;

    public static DownShelfDistributionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DownShelfDistributionItemResponse self = new DownShelfDistributionItemResponse();
        return TeaModel.build(map, self);
    }

    public DownShelfDistributionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownShelfDistributionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownShelfDistributionItemResponse setBody(DownShelfDistributionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DownShelfDistributionItemResponseBody getBody() {
        return this.body;
    }

}
