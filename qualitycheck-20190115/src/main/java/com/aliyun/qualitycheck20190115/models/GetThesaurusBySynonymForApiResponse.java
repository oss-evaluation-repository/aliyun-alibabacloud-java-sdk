// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetThesaurusBySynonymForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThesaurusBySynonymForApiResponseBody body;

    public static GetThesaurusBySynonymForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThesaurusBySynonymForApiResponse self = new GetThesaurusBySynonymForApiResponse();
        return TeaModel.build(map, self);
    }

    public GetThesaurusBySynonymForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThesaurusBySynonymForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThesaurusBySynonymForApiResponse setBody(GetThesaurusBySynonymForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThesaurusBySynonymForApiResponseBody getBody() {
        return this.body;
    }

}
