// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeInvoiceResponseBody body;

    public static RecognizeInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInvoiceResponse self = new RecognizeInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeInvoiceResponse setBody(RecognizeInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeInvoiceResponseBody getBody() {
        return this.body;
    }

}
