// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDispatchRuleRequest extends TeaModel {
    // The name of the notification policy to be queried. Fuzzy match is supported.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // *   The type of notification policies to be queried. Valid values: `false`: notification policies created in Application Real-Time Monitoring Service (ARMS). This is the default value.
    // 
    // *   `true`: notification policies created in an external system.
    // 
    // > You cannot use the ARMS console to modify the dispatch rules of a notification policy that is created in an external system.
    @NameInMap("System")
    public Boolean system;

    public static ListDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDispatchRuleRequest self = new ListDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListDispatchRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDispatchRuleRequest setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

}
