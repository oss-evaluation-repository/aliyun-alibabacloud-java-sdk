// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryRepoMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLibraryRepoMetricsResponseBody body;

    public static GetLibraryRepoMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryRepoMetricsResponse self = new GetLibraryRepoMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetLibraryRepoMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLibraryRepoMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLibraryRepoMetricsResponse setBody(GetLibraryRepoMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLibraryRepoMetricsResponseBody getBody() {
        return this.body;
    }

}
