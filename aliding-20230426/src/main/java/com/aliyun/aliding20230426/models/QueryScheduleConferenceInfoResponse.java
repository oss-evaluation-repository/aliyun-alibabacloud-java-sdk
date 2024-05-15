// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryScheduleConferenceInfoResponseBody body;

    public static QueryScheduleConferenceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceInfoResponse self = new QueryScheduleConferenceInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScheduleConferenceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScheduleConferenceInfoResponse setBody(QueryScheduleConferenceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScheduleConferenceInfoResponseBody getBody() {
        return this.body;
    }

}
