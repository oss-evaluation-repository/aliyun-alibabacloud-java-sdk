// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that are used to filter SQL statements involved in the ticket.</p>
     */
    @NameInMap("OrderActionDetail")
    public String orderActionDetailShrink;

    /**
     * <p>The ID of the ticket for the SQL review. You can call the [CreateSQLReviewOrder](https://help.aliyun.com/document_detail/257777.html) operation to query the ID of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/465818.html) operation to query the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListSQLReviewOriginSQLShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLShrinkRequest self = new ListSQLReviewOriginSQLShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLShrinkRequest setOrderActionDetailShrink(String orderActionDetailShrink) {
        this.orderActionDetailShrink = orderActionDetailShrink;
        return this;
    }
    public String getOrderActionDetailShrink() {
        return this.orderActionDetailShrink;
    }

    public ListSQLReviewOriginSQLShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListSQLReviewOriginSQLShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
