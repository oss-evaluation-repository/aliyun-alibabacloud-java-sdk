// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLogicTableRouteConfigRequest extends TeaModel {
    /**
     * <p>The unique key of the routing algorithm. You can call the [ListLogicTableRouteConfig](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictablerouteconfig) operation to query the unique key.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteKey")
    public String routeKey;

    /**
     * <p>The ID of the logical table. You can call the [ListLogicTables](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictables) operation to query the ID of the logical table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableId")
    public Long tableId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteLogicTableRouteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicTableRouteConfigRequest self = new DeleteLogicTableRouteConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogicTableRouteConfigRequest setRouteKey(String routeKey) {
        this.routeKey = routeKey;
        return this;
    }
    public String getRouteKey() {
        return this.routeKey;
    }

    public DeleteLogicTableRouteConfigRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

    public DeleteLogicTableRouteConfigRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
