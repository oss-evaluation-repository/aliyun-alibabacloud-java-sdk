// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRealtimeLogDeliveryResponseBody body;

    public static ModifyRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRealtimeLogDeliveryResponse self = new ModifyRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRealtimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRealtimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRealtimeLogDeliveryResponse setBody(ModifyRealtimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
