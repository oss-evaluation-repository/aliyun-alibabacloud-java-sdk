// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetBeneficialInfoRequest extends TeaModel {
    @NameInMap("OneCompanyId")
    public String oneCompanyId;

    public static GetBeneficialInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBeneficialInfoRequest self = new GetBeneficialInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBeneficialInfoRequest setOneCompanyId(String oneCompanyId) {
        this.oneCompanyId = oneCompanyId;
        return this;
    }
    public String getOneCompanyId() {
        return this.oneCompanyId;
    }

}
