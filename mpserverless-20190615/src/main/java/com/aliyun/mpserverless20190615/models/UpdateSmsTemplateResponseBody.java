// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSmsTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsTemplateResponseBody self = new UpdateSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
