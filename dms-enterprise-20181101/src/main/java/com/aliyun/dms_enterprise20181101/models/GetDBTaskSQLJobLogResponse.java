// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTaskSQLJobLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDBTaskSQLJobLogResponseBody body;

    public static GetDBTaskSQLJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBTaskSQLJobLogResponse self = new GetDBTaskSQLJobLogResponse();
        return TeaModel.build(map, self);
    }

    public GetDBTaskSQLJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBTaskSQLJobLogResponse setBody(GetDBTaskSQLJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBTaskSQLJobLogResponseBody getBody() {
        return this.body;
    }

}
