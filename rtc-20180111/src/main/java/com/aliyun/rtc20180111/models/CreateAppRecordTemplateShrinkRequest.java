// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppRecordTemplateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordTemplate")
    public String recordTemplateShrink;

    public static CreateAppRecordTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRecordTemplateShrinkRequest self = new CreateAppRecordTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRecordTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppRecordTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRecordTemplateShrinkRequest setRecordTemplateShrink(String recordTemplateShrink) {
        this.recordTemplateShrink = recordTemplateShrink;
        return this;
    }
    public String getRecordTemplateShrink() {
        return this.recordTemplateShrink;
    }

}
