// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackSourceCidrResponseBody body;

    public static DescribeBackSourceCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrResponse self = new DescribeBackSourceCidrResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackSourceCidrResponse setBody(DescribeBackSourceCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackSourceCidrResponseBody getBody() {
        return this.body;
    }

}
