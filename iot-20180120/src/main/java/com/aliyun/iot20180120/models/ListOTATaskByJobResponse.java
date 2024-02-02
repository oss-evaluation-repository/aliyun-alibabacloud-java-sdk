// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOTATaskByJobResponseBody body;

    public static ListOTATaskByJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTATaskByJobResponse self = new ListOTATaskByJobResponse();
        return TeaModel.build(map, self);
    }

    public ListOTATaskByJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTATaskByJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOTATaskByJobResponse setBody(ListOTATaskByJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTATaskByJobResponseBody getBody() {
        return this.body;
    }

}
