// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSmartJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("FEExtend")
    public String FEExtend;

    public static UpdateSmartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartJobRequest self = new UpdateSmartJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateSmartJobRequest setFEExtend(String FEExtend) {
        this.FEExtend = FEExtend;
        return this;
    }
    public String getFEExtend() {
        return this.FEExtend;
    }

}
