// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallLogstashPluginRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    public static UninstallLogstashPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallLogstashPluginRequest self = new UninstallLogstashPluginRequest();
        return TeaModel.build(map, self);
    }

    public UninstallLogstashPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UninstallLogstashPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
