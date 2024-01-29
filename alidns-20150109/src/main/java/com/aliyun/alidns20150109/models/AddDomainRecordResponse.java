// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDomainRecordResponseBody body;

    public static AddDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordResponse self = new AddDomainRecordResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDomainRecordResponse setBody(AddDomainRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainRecordResponseBody getBody() {
        return this.body;
    }

}
