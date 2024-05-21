// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeesToCustomRoleHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static AddEmployeesToCustomRoleHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeesToCustomRoleHeaders self = new AddEmployeesToCustomRoleHeaders();
        return TeaModel.build(map, self);
    }

    public AddEmployeesToCustomRoleHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddEmployeesToCustomRoleHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
