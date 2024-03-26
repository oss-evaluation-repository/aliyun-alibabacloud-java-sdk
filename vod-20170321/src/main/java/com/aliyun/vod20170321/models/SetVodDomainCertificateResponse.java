// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetVodDomainCertificateResponseBody body;

    public static SetVodDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainCertificateResponse self = new SetVodDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetVodDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVodDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVodDomainCertificateResponse setBody(SetVodDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVodDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
