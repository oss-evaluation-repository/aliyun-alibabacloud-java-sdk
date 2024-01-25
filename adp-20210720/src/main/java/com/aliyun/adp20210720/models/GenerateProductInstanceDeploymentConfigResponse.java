// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GenerateProductInstanceDeploymentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateProductInstanceDeploymentConfigResponseBody body;

    public static GenerateProductInstanceDeploymentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductInstanceDeploymentConfigResponse self = new GenerateProductInstanceDeploymentConfigResponse();
        return TeaModel.build(map, self);
    }

    public GenerateProductInstanceDeploymentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateProductInstanceDeploymentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateProductInstanceDeploymentConfigResponse setBody(GenerateProductInstanceDeploymentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateProductInstanceDeploymentConfigResponseBody getBody() {
        return this.body;
    }

}
