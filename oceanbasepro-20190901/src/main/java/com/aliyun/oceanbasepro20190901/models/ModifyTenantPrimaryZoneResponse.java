// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantPrimaryZoneResponseBody body;

    public static ModifyTenantPrimaryZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantPrimaryZoneResponse self = new ModifyTenantPrimaryZoneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantPrimaryZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantPrimaryZoneResponse setBody(ModifyTenantPrimaryZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantPrimaryZoneResponseBody getBody() {
        return this.body;
    }

}
