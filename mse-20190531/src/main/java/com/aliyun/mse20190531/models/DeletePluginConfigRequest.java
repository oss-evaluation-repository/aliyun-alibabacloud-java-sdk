// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeletePluginConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PluginConfigId")
    public Long pluginConfigId;

    public static DeletePluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginConfigRequest self = new DeletePluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeletePluginConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeletePluginConfigRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeletePluginConfigRequest setPluginConfigId(Long pluginConfigId) {
        this.pluginConfigId = pluginConfigId;
        return this;
    }
    public Long getPluginConfigId() {
        return this.pluginConfigId;
    }

}
