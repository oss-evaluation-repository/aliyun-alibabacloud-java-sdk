// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteOTAFirmwareRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("FirmwareId")
    public String firmwareId;

    public static DeleteOTAFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOTAFirmwareRequest self = new DeleteOTAFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOTAFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteOTAFirmwareRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

}
