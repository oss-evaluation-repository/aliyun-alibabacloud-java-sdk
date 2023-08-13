// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotKeysRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraDB for Redis instance. You can call the [DescribeInstances](~~60933~~) operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard on the ApsaraDB for Redis instance. You can call the [DescribeRoleZoneInfo](~~190794~~) operation to query the data shard ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeHotKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotKeysRequest self = new DescribeHotKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHotKeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHotKeysRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
