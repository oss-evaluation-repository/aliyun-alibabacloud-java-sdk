// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TransferEnterpriseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Enterprise body;

    public static TransferEnterpriseResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferEnterpriseResponse self = new TransferEnterpriseResponse();
        return TeaModel.build(map, self);
    }

    public TransferEnterpriseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferEnterpriseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferEnterpriseResponse setBody(Enterprise body) {
        this.body = body;
        return this;
    }
    public Enterprise getBody() {
        return this.body;
    }

}
