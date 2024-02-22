// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorSLSGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridMonitorSLSGroupResponseBody body;

    public static CreateHybridMonitorSLSGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridMonitorSLSGroupResponse self = new CreateHybridMonitorSLSGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridMonitorSLSGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridMonitorSLSGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridMonitorSLSGroupResponse setBody(CreateHybridMonitorSLSGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridMonitorSLSGroupResponseBody getBody() {
        return this.body;
    }

}
