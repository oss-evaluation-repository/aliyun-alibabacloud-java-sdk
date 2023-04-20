// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ListPropertyValueRequest extends TeaModel {
    /**
     * <p>The ID of the property. You can call the [ListProperty](~~410890~~) operation to query the property ID.</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    public static ListPropertyValueRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPropertyValueRequest self = new ListPropertyValueRequest();
        return TeaModel.build(map, self);
    }

    public ListPropertyValueRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

}
