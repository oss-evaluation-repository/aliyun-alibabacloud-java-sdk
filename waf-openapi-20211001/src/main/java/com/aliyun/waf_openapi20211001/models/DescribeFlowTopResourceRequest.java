// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowTopResourceRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeFlowTopResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTopResourceRequest self = new DescribeFlowTopResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTopResourceRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeFlowTopResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFlowTopResourceRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
