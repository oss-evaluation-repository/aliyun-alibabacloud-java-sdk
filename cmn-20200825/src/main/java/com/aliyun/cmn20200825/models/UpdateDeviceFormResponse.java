// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceFormResponseBody body;

    public static UpdateDeviceFormResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceFormResponse self = new UpdateDeviceFormResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceFormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceFormResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeviceFormResponse setBody(UpdateDeviceFormResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceFormResponseBody getBody() {
        return this.body;
    }

}
