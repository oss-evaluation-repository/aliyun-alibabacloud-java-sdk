// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageDetailResponseBody extends TeaModel {
    /**
     * <p>The equivalent of pay-as-you-go costs.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Data")
    public DescribeResourceUsageDetailResponseBodyData data;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeResourceUsageDetail.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The end of the time range in which the usage details were queried.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceUsageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageDetailResponseBody self = new DescribeResourceUsageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceUsageDetailResponseBody setData(DescribeResourceUsageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceUsageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceUsageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceUsageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceUsageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceUsageDetailResponseBodyDataItems extends TeaModel {
        /**
         * <p>The type of deduction plans whose usage details are queried. Valid values: RI and SCU.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The number of deduction plans.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The currency in which deduction plans were priced.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The status of the deduction plan.</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The fee of purchased deduction plans.</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The beginning of the time range in which the usage details were queried.</p>
         */
        @NameInMap("PostpaidCost")
        public String postpaidCost;

        /**
         * <p>The potential net savings.</p>
         */
        @NameInMap("PotentialSavedCost")
        public String potentialSavedCost;

        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The code of the zone.</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         */
        @NameInMap("ReservationCost")
        public String reservationCost;

        /**
         * <p>The region.</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The unit that is used to measure the resources deducted from deduction plans.</p>
         */
        @NameInMap("SavedCost")
        public String savedCost;

        /**
         * <p>The token that is used to retrieve the next page of results. You do not need to set this parameter if you query usage details within a specific time range for the first time. The response returns a token that you can use to query usage details that are displayed on the next page. If a null value is returned for the NextToken parameter, no more usage details can be queried.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The code of the region.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time granularity at which usage details are queried. Valid values: MONTH, DAY, and HOUR.</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The username of the account.</p>
         */
        @NameInMap("TotalQuantity")
        public Float totalQuantity;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        /**
         * <p>The net savings.</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Zone")
        public String zone;

        /**
         * <p>The specifications of a deduction plan.</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeResourceUsageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageDetailResponseBodyDataItems self = new DescribeResourceUsageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setPostpaidCost(String postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public String getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setPotentialSavedCost(String potentialSavedCost) {
            this.potentialSavedCost = potentialSavedCost;
            return this;
        }
        public String getPotentialSavedCost() {
            return this.potentialSavedCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setReservationCost(String reservationCost) {
            this.reservationCost = reservationCost;
            return this;
        }
        public String getReservationCost() {
            return this.reservationCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setSavedCost(String savedCost) {
            this.savedCost = savedCost;
            return this;
        }
        public String getSavedCost() {
            return this.savedCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setTotalQuantity(Float totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeResourceUsageDetailResponseBodyData extends TeaModel {
        /**
         * <p>The usage of deduction plans.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> items;

        /**
         * <p>The data entries.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The ID of a deduction plan.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeResourceUsageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageDetailResponseBodyData self = new DescribeResourceUsageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageDetailResponseBodyData setItems(java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeResourceUsageDetailResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeResourceUsageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeResourceUsageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
