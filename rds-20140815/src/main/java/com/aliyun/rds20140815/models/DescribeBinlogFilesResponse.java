// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBinlogFilesResponseBody body;

    public static DescribeBinlogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinlogFilesResponse self = new DescribeBinlogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBinlogFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBinlogFilesResponse setBody(DescribeBinlogFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBinlogFilesResponseBody getBody() {
        return this.body;
    }

}
