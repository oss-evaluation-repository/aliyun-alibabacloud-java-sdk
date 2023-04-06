// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationClientSecretRequest extends TeaModel {
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

    public static CreateApplicationClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationClientSecretRequest self = new CreateApplicationClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationClientSecretRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationClientSecretRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
