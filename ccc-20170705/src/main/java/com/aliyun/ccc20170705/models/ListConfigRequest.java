// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConfigItem")
    public java.util.List<String> configItem;

    public static ListConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRequest self = new ListConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConfigRequest setConfigItem(java.util.List<String> configItem) {
        this.configItem = configItem;
        return this;
    }
    public java.util.List<String> getConfigItem() {
        return this.configItem;
    }

}
