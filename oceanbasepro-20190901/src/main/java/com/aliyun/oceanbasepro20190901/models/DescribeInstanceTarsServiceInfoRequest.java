// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTarsServiceInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceTarsServiceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTarsServiceInfoRequest self = new DescribeInstanceTarsServiceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTarsServiceInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
