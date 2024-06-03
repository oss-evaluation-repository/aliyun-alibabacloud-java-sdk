// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigsRequest extends TeaModel {
    /**
     * <p>The application configurations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<UpdateApplicationConfig> applicationConfigs;

    /**
     * <p>The application name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The operation performed on configuration items. Valid values:</p>
     * <br>
     * <p>*   ADD</p>
     * <p>*   UPDATE</p>
     * <p>*   DELETE</p>
     */
    @NameInMap("ConfigAction")
    public String configAction;

    /**
     * <p>The operation scope. Valid values:</p>
     * <br>
     * <p>*   CLUSTER</p>
     * <p>*   NODE_GROUP</p>
     */
    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The node group ID.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The node ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateApplicationConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfigsRequest self = new UpdateApplicationConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfigsRequest setApplicationConfigs(java.util.List<UpdateApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<UpdateApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public UpdateApplicationConfigsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationConfigsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateApplicationConfigsRequest setConfigAction(String configAction) {
        this.configAction = configAction;
        return this;
    }
    public String getConfigAction() {
        return this.configAction;
    }

    public UpdateApplicationConfigsRequest setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public UpdateApplicationConfigsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationConfigsRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateApplicationConfigsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateApplicationConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
