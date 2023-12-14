// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateUserAvatarHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateUserAvatarHeadersAccountContext accountContext;

    public static UpdateUserAvatarHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAvatarHeaders self = new UpdateUserAvatarHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateUserAvatarHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateUserAvatarHeaders setAccountContext(UpdateUserAvatarHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateUserAvatarHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateUserAvatarHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UpdateUserAvatarHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserAvatarHeadersAccountContext self = new UpdateUserAvatarHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateUserAvatarHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
