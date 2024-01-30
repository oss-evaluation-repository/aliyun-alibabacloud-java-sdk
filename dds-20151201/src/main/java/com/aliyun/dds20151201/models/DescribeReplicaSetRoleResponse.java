// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeReplicaSetRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReplicaSetRoleResponseBody body;

    public static DescribeReplicaSetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicaSetRoleResponse self = new DescribeReplicaSetRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicaSetRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicaSetRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReplicaSetRoleResponse setBody(DescribeReplicaSetRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicaSetRoleResponseBody getBody() {
        return this.body;
    }

}
