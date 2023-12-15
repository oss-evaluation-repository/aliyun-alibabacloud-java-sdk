// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TaobaoFilmGetSchedulesResponseBody body;

    public static TaobaoFilmGetSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSchedulesResponse self = new TaobaoFilmGetSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaobaoFilmGetSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaobaoFilmGetSchedulesResponse setBody(TaobaoFilmGetSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public TaobaoFilmGetSchedulesResponseBody getBody() {
        return this.body;
    }

}
