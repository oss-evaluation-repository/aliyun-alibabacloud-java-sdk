// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemovePropertyRequest extends TeaModel {
    /**
     * <p>The ID of the property. You can call the [ListProperty](~~410890~~) operation to query the property ID.</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    public static RemovePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePropertyRequest self = new RemovePropertyRequest();
        return TeaModel.build(map, self);
    }

    public RemovePropertyRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

}
