// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisQueryByDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StatisQueryByDayResponseBody body;

    public static StatisQueryByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        StatisQueryByDayResponse self = new StatisQueryByDayResponse();
        return TeaModel.build(map, self);
    }

    public StatisQueryByDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StatisQueryByDayResponse setBody(StatisQueryByDayResponseBody body) {
        this.body = body;
        return this;
    }
    public StatisQueryByDayResponseBody getBody() {
        return this.body;
    }

}
