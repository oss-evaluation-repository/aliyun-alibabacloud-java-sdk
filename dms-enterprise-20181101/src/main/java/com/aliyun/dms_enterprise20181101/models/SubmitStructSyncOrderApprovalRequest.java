// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SubmitStructSyncOrderApprovalRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    public static SubmitStructSyncOrderApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitStructSyncOrderApprovalRequest self = new SubmitStructSyncOrderApprovalRequest();
        return TeaModel.build(map, self);
    }

    public SubmitStructSyncOrderApprovalRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
