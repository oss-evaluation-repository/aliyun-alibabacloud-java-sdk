// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAssetGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>CreateOrUpdateAssetGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Modifies the mapping between an asset and an asset group. For example, you can call this operation to modify the server group to which the asset belongs or the asset list of the asset group.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static CreateOrUpdateAssetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAssetGroupRequest self = new CreateOrUpdateAssetGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAssetGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateAssetGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOrUpdateAssetGroupRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
