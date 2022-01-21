// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SuspendFlowRequest extends TeaModel {
    // 工作流实例ID。您可以调用ListFlowInstance查看工作流ID。
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 区域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static SuspendFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendFlowRequest self = new SuspendFlowRequest();
        return TeaModel.build(map, self);
    }

    public SuspendFlowRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public SuspendFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SuspendFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
