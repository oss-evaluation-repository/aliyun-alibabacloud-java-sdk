// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the event-triggered task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
     */
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DeleteAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmRequest self = new DeleteAlarmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmRequest setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public DeleteAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAlarmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
