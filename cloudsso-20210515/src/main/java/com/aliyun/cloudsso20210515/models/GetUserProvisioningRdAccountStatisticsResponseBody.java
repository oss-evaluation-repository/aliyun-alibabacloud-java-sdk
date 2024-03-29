// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningRdAccountStatisticsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of the RAM user provisioning.</p>
     */
    @NameInMap("UserProvisioningStatistics")
    public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics userProvisioningStatistics;

    public static GetUserProvisioningRdAccountStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningRdAccountStatisticsResponseBody self = new GetUserProvisioningRdAccountStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningRdAccountStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserProvisioningRdAccountStatisticsResponseBody setUserProvisioningStatistics(GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics userProvisioningStatistics) {
        this.userProvisioningStatistics = userProvisioningStatistics;
        return this;
    }
    public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics getUserProvisioningStatistics() {
        return this.userProvisioningStatistics;
    }

    public static class GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics extends TeaModel {
        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The entity ID, which is the ID of the member in the resource directory.</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The number of failed RAM user provisioning events.</p>
         */
        @NameInMap("FailedEventCount")
        public Long failedEventCount;

        /**
         * <p>The time when the RAM user provisioning was last performed.</p>
         */
        @NameInMap("LatestAsyncTime")
        public String latestAsyncTime;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource directory belongs.</p>
         */
        @NameInMap("OwnerPk")
        public String ownerPk;

        /**
         * <p>The entity type. The value is fixed as `RD Account`.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics self = new GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics();
            return TeaModel.build(map, self);
        }

        public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics setFailedEventCount(Long failedEventCount) {
            this.failedEventCount = failedEventCount;
            return this;
        }
        public Long getFailedEventCount() {
            return this.failedEventCount;
        }

        public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics setLatestAsyncTime(String latestAsyncTime) {
            this.latestAsyncTime = latestAsyncTime;
            return this;
        }
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public GetUserProvisioningRdAccountStatisticsResponseBodyUserProvisioningStatistics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
