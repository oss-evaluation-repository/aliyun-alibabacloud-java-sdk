// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesRequest extends TeaModel {
    /**
     * <p>The batch operation mode. Valid values:</p>
     * <br>
     * <p>*   AllTogether: In this mode, if all instances are restarted, a success message is returned. If an instance fails the verification, all instances fail to restart and an error message is returned.</p>
     * <p>*   SuccessFirst: In this mode, each instance is restarted separately. The response contains the operation results for each instance.</p>
     * <br>
     * <p>Default value: AllTogether.</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>- true: The validity of the request is checked but the request is not made. Check items include the request format, instance status, and whether the required parameters are specified. If the check fails, the corresponding error message is returned. If the check succeeds, `DRYRUN.SUCCESS` is returned.</p>
     * <p>    > If you set `BatchOptimization` to `SuccessFirst` and `DryRun` to true, only `DRYRUN.SUCCESS` is returned regardless of whether the check succeeds.</p>
     * <br>
     * <p>- false: The validity of the request is checked, and the request is made if the check succeeds.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcibly restart the instance. Valid values:</p>
     * <br>
     * <p>*   true: forcibly restarts the instance. This operation is equivalent to the typical power-off operation. Cache data that is not written to storage in the instance will be lost.</p>
     * <p>*   false: normally restarts the instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceReboot")
    public Boolean forceReboot;

    /**
     * <p>The list of instance ID. The list items up to 100.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RebootInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesRequest self = new RebootInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RebootInstancesRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public RebootInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RebootInstancesRequest setForceReboot(Boolean forceReboot) {
        this.forceReboot = forceReboot;
        return this;
    }
    public Boolean getForceReboot() {
        return this.forceReboot;
    }

    public RebootInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public RebootInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RebootInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RebootInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RebootInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RebootInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
