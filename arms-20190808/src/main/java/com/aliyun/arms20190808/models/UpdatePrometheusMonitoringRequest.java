// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusMonitoringRequest extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ConfigYaml")
    public String configYaml;

    @NameInMap("MonitoringName")
    public String monitoringName;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static UpdatePrometheusMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusMonitoringRequest self = new UpdatePrometheusMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusMonitoringRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusMonitoringRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public UpdatePrometheusMonitoringRequest setMonitoringName(String monitoringName) {
        this.monitoringName = monitoringName;
        return this;
    }
    public String getMonitoringName() {
        return this.monitoringName;
    }

    public UpdatePrometheusMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePrometheusMonitoringRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
