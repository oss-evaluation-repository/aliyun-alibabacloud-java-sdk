// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartApplicationQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static StartApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        StartApplicationQuery self = new StartApplicationQuery();
        return TeaModel.build(map, self);
    }

    public StartApplicationQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
