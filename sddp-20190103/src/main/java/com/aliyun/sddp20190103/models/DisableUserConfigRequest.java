// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DisableUserConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Code")
    public String code;

    public static DisableUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableUserConfigRequest self = new DisableUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public DisableUserConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DisableUserConfigRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
