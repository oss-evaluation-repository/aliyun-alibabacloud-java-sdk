// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AddWebhookRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static AddWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWebhookRequest self = new AddWebhookRequest();
        return TeaModel.build(map, self);
    }

    public AddWebhookRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AddWebhookRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
