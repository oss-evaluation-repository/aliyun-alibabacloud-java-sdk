// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteInstanceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteInstanceHeadersAccountContext accountContext;

    public static DeleteInstanceHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceHeaders self = new DeleteInstanceHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteInstanceHeaders setAccountContext(DeleteInstanceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteInstanceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteInstanceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteInstanceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteInstanceHeadersAccountContext self = new DeleteInstanceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteInstanceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
