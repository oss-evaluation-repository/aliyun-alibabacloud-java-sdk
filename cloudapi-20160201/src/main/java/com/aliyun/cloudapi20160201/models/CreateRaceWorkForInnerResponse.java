// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateRaceWorkForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRaceWorkForInnerResponseBody body;

    public static CreateRaceWorkForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRaceWorkForInnerResponse self = new CreateRaceWorkForInnerResponse();
        return TeaModel.build(map, self);
    }

    public CreateRaceWorkForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRaceWorkForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRaceWorkForInnerResponse setBody(CreateRaceWorkForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRaceWorkForInnerResponseBody getBody() {
        return this.body;
    }

}
