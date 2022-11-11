// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadDatasetResponseBody body;

    public static DownloadDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadDatasetResponse self = new DownloadDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DownloadDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadDatasetResponse setBody(DownloadDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDatasetResponseBody getBody() {
        return this.body;
    }

}
