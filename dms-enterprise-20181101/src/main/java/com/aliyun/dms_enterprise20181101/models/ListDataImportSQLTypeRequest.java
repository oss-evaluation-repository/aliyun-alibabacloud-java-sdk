// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLTypeRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the [ListOrders](~~144643~~) operation to query the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The tenant ID. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDataImportSQLTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLTypeRequest self = new ListDataImportSQLTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLTypeRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListDataImportSQLTypeRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
