// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiJupyterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EaisType")
    public String eaisType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiJupyterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiJupyterRequest self = new CreateEaiJupyterRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiJupyterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiJupyterRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiJupyterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiJupyterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiJupyterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
