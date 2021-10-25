// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGadInstancesResponseBody body;

    public static DescribeGadInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesResponse self = new DescribeGadInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGadInstancesResponse setBody(DescribeGadInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGadInstancesResponseBody getBody() {
        return this.body;
    }

}
