// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceInventoryRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateResourceInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceInventoryRequest self = new GetAggregateResourceInventoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceInventoryRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
