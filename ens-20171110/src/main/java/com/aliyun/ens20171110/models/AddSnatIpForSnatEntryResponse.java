// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddSnatIpForSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSnatIpForSnatEntryResponseBody body;

    public static AddSnatIpForSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSnatIpForSnatEntryResponse self = new AddSnatIpForSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public AddSnatIpForSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSnatIpForSnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSnatIpForSnatEntryResponse setBody(AddSnatIpForSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

}
