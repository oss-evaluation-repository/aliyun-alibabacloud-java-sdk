// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupResponse self = new DeleteAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
