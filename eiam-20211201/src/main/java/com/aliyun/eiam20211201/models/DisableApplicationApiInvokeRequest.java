// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationApiInvokeRequest extends TeaModel {
    /**
     * <p>IDaaS的应用主键id</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>IDaaS EIAM的实例id</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableApplicationApiInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationApiInvokeRequest self = new DisableApplicationApiInvokeRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationApiInvokeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DisableApplicationApiInvokeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
