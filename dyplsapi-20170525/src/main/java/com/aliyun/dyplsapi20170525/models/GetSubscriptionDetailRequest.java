// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSubscriptionDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    @NameInMap("SubsId")
    public Long subsId;

    public static GetSubscriptionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionDetailRequest self = new GetSubscriptionDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSubscriptionDetailRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public GetSubscriptionDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetSubscriptionDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetSubscriptionDetailRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public GetSubscriptionDetailRequest setSubsId(Long subsId) {
        this.subsId = subsId;
        return this;
    }
    public Long getSubsId() {
        return this.subsId;
    }

}
