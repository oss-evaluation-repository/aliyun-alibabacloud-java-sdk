// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("Tid")
    public Long tid;

    public static GetMetaTableColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnRequest self = new GetMetaTableColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMetaTableColumnRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableColumnRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
