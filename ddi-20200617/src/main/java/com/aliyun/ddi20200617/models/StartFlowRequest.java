// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class StartFlowRequest extends TeaModel {
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static StartFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartFlowRequest self = new StartFlowRequest();
        return TeaModel.build(map, self);
    }

    public StartFlowRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public StartFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StartFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
