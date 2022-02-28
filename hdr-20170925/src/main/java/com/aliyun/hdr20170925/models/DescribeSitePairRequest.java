// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static DescribeSitePairRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairRequest self = new DescribeSitePairRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSitePairRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
