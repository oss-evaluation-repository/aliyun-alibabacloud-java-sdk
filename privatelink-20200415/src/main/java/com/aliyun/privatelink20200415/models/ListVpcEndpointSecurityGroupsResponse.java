// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointSecurityGroupsResponseBody body;

    public static ListVpcEndpointSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointSecurityGroupsResponse self = new ListVpcEndpointSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointSecurityGroupsResponse setBody(ListVpcEndpointSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
