// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDiskReplicaPairResponseBody body;

    public static ModifyDiskReplicaPairResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaPairResponse self = new ModifyDiskReplicaPairResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskReplicaPairResponse setBody(ModifyDiskReplicaPairResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

}
