// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SuspendOutboundTaskRequest extends TeaModel {
    @NameInMap("OutboundTaskId")
    public Long outboundTaskId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static SuspendOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendOutboundTaskRequest self = new SuspendOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public SuspendOutboundTaskRequest setOutboundTaskId(Long outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

    public SuspendOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
