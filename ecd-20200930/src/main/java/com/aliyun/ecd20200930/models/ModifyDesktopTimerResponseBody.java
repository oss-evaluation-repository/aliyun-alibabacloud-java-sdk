// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopTimerResponseBody extends TeaModel {
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopTimerResponseBody self = new ModifyDesktopTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopTimerResponseBody setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public ModifyDesktopTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
