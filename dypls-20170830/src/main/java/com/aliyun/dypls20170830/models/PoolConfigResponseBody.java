// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class PoolConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static PoolConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PoolConfigResponseBody self = new PoolConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PoolConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PoolConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PoolConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
