// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDefaultDriveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Drive body;

    public static GetDefaultDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultDriveResponse self = new GetDefaultDriveResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultDriveResponse setBody(Drive body) {
        this.body = body;
        return this;
    }
    public Drive getBody() {
        return this.body;
    }

}
