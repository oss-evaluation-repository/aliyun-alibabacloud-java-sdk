// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetProvisionConfigRequest extends TeaModel {
    // 预留的目标资源个数
    @NameInMap("target")
    public Long target;

    // 别名名称
    @NameInMap("qualifier")
    public String qualifier;

    public static GetProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigRequest self = new GetProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigRequest setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public GetProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
