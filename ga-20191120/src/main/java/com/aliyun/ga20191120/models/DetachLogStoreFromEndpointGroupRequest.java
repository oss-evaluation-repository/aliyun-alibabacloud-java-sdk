// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachLogStoreFromEndpointGroupRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointGroupIds")
    public java.util.List<String> endpointGroupIds;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DetachLogStoreFromEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachLogStoreFromEndpointGroupRequest self = new DetachLogStoreFromEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public DetachLogStoreFromEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DetachLogStoreFromEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachLogStoreFromEndpointGroupRequest setEndpointGroupIds(java.util.List<String> endpointGroupIds) {
        this.endpointGroupIds = endpointGroupIds;
        return this;
    }
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    public DetachLogStoreFromEndpointGroupRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DetachLogStoreFromEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
