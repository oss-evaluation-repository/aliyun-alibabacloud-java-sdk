// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnetorBackhaulRouteRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteIoTCloudConnetorBackhaulRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnetorBackhaulRouteRequest self = new DeleteIoTCloudConnetorBackhaulRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnetorBackhaulRouteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIoTCloudConnetorBackhaulRouteRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteIoTCloudConnetorBackhaulRouteRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public DeleteIoTCloudConnetorBackhaulRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
