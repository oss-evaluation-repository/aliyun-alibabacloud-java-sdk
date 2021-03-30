// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApgroupConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("ApGroupUUId")
    public String apGroupUUId;

    public static DeleteApgroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApgroupConfigRequest self = new DeleteApgroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApgroupConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteApgroupConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteApgroupConfigRequest setApGroupUUId(String apGroupUUId) {
        this.apGroupUUId = apGroupUUId;
        return this;
    }
    public String getApGroupUUId() {
        return this.apGroupUUId;
    }

}
