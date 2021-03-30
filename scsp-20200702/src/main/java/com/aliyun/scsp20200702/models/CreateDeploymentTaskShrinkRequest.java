// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateDeploymentTaskShrinkRequest extends TeaModel {
    // 环境类型
    @NameInMap("EnvType")
    public String envType;

    // 部署code
    @NameInMap("DeploymentCode")
    public String deploymentCode;

    // 部署快照id
    @NameInMap("DeploymentArchiveId")
    public String deploymentArchiveId;

    // 应用快照id列表
    @NameInMap("AppArchiveIds")
    public String appArchiveIdsShrink;

    public static CreateDeploymentTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTaskShrinkRequest self = new CreateDeploymentTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTaskShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateDeploymentTaskShrinkRequest setDeploymentCode(String deploymentCode) {
        this.deploymentCode = deploymentCode;
        return this;
    }
    public String getDeploymentCode() {
        return this.deploymentCode;
    }

    public CreateDeploymentTaskShrinkRequest setDeploymentArchiveId(String deploymentArchiveId) {
        this.deploymentArchiveId = deploymentArchiveId;
        return this;
    }
    public String getDeploymentArchiveId() {
        return this.deploymentArchiveId;
    }

    public CreateDeploymentTaskShrinkRequest setAppArchiveIdsShrink(String appArchiveIdsShrink) {
        this.appArchiveIdsShrink = appArchiveIdsShrink;
        return this;
    }
    public String getAppArchiveIdsShrink() {
        return this.appArchiveIdsShrink;
    }

}
