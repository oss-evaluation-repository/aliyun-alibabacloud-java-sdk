// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindLicenseDeviceResponseBody body;

    public static BindLicenseDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindLicenseDeviceResponse self = new BindLicenseDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindLicenseDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindLicenseDeviceResponse setBody(BindLicenseDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindLicenseDeviceResponseBody getBody() {
        return this.body;
    }

}
