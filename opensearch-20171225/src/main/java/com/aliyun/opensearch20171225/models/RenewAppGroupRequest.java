// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RenewAppGroupRequest extends TeaModel {
    @NameInMap("body")
    public PrepayOrderInfo body;

    /**
     * <p>Guaranteed request idempotence</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static RenewAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAppGroupRequest self = new RenewAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public RenewAppGroupRequest setBody(PrepayOrderInfo body) {
        this.body = body;
        return this;
    }
    public PrepayOrderInfo getBody() {
        return this.body;
    }

    public RenewAppGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
