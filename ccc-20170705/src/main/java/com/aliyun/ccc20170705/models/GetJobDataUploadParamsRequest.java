// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobDataUploadParamsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("FileName")
    public String fileName;

    public static GetJobDataUploadParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobDataUploadParamsRequest self = new GetJobDataUploadParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobDataUploadParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetJobDataUploadParamsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
