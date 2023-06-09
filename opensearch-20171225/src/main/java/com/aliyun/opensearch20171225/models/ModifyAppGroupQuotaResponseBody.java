// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("result")
    public ModifyAppGroupQuotaResponseBodyResult result;

    public static ModifyAppGroupQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupQuotaResponseBody self = new ModifyAppGroupQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppGroupQuotaResponseBody setResult(ModifyAppGroupQuotaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyAppGroupQuotaResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyAppGroupQuotaResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The computing resources. Unit: logical computing units (LCUs).</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications of the application. Valid values:</p>
         * <br>
         * <p>*   opensearch.share.junior: basic</p>
         * <p>*   opensearch.share.common: shared general-purpose</p>
         * <p>*   opensearch.share.compute: shared computing</p>
         * <p>*   opensearch.share.storage: shared storage</p>
         * <p>*   opensearch.private.common: exclusive general-purpose</p>
         * <p>*   opensearch.private.compute: exclusive computing</p>
         * <p>*   opensearch.private.storage: exclusive storage</p>
         */
        @NameInMap("spec")
        public String spec;

        public static ModifyAppGroupQuotaResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppGroupQuotaResponseBodyResultQuota self = new ModifyAppGroupQuotaResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ModifyAppGroupQuotaResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public ModifyAppGroupQuotaResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ModifyAppGroupQuotaResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ModifyAppGroupQuotaResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method of the application. Valid values:</p>
         * <br>
         * <p>*   POSTPAY: pay-as-you-go</p>
         * <p>*   PREPAY: subscription</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The billing model. Valid values:</p>
         * <br>
         * <p>*   1: computing resources</p>
         * <p>*   2: queries per second (QPS)</p>
         */
        @NameInMap("chargingWay")
        public Integer chargingWay;

        /**
         * <p>The code of the commodity.</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The timestamp when the application was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the current online version.</p>
         */
        @NameInMap("currentVersion")
        public String currentVersion;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The ID of the created rough sort expression.</p>
         */
        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        /**
         * <p>The approval status of the quotas. Valid values:</p>
         * <br>
         * <p>*   0: The quotas are approved.</p>
         * <p>*   1: The quotas are being approved.</p>
         */
        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   Unlock: The instance is not locked.</p>
         * <p>*   LockByExpiration: The instance is automatically locked after it expires.</p>
         * <p>*   ManualLock: The instance is manually locked.</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the fine sort expression that is being created.</p>
         */
        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        /**
         * <p>The ID of the order that is not complete for the instance. For example, an order is one that is initiated to create the instance or change the quotas or billing method.</p>
         */
        @NameInMap("processingOrderId")
        public String processingOrderId;

        /**
         * <p>Indicates whether the order is complete. Valid values:</p>
         * <br>
         * <p>*   0: The order is in progress.</p>
         * <p>*   1: The order is complete.</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>The name of the A/B test group.</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The information about the quotas of the application.</p>
         */
        @NameInMap("quota")
        public ModifyAppGroupQuotaResponseBodyResultQuota quota;

        /**
         * <p>The ID of the created fine sort expression.</p>
         */
        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        /**
         * <p>The status of the application. Valid values:</p>
         * <br>
         * <p>*   producing</p>
         * <p>*   review_pending</p>
         * <p>*   config_pending</p>
         * <p>*   normal</p>
         * <p>*   frozen</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The timestamp when the current online version was published.</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   standard: a standard application.</p>
         * <p>*   advance: an advanced application which is of an old application type. New applications cannot be of this type.</p>
         * <p>*   enhanced: an advanced application which is of a new application type.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last updated.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ModifyAppGroupQuotaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppGroupQuotaResponseBodyResult self = new ModifyAppGroupQuotaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyAppGroupQuotaResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyAppGroupQuotaResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public ModifyAppGroupQuotaResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ModifyAppGroupQuotaResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifyAppGroupQuotaResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ModifyAppGroupQuotaResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyAppGroupQuotaResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public ModifyAppGroupQuotaResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public ModifyAppGroupQuotaResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyAppGroupQuotaResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ModifyAppGroupQuotaResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public ModifyAppGroupQuotaResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppGroupQuotaResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public ModifyAppGroupQuotaResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setQuota(ModifyAppGroupQuotaResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ModifyAppGroupQuotaResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ModifyAppGroupQuotaResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppGroupQuotaResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public ModifyAppGroupQuotaResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyAppGroupQuotaResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
