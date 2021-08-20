// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberWithInheritedRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static ListRepositoryMemberWithInheritedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberWithInheritedRequest self = new ListRepositoryMemberWithInheritedRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberWithInheritedRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryMemberWithInheritedRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
