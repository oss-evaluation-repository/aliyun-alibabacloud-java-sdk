// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailResponseBody extends TeaModel {
    /**
     * <p>The end of the time range in which the coverage details were queried.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the account for which you want to query coverage details. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
     */
    @NameInMap("Data")
    public DescribeResourceCoverageDetailResponseBodyData data;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The amount of the bill.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceCoverageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageDetailResponseBody self = new DescribeResourceCoverageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceCoverageDetailResponseBody setData(DescribeResourceCoverageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceCoverageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceCoverageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceCoverageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceCoverageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceCoverageDetailResponseBodyDataItems extends TeaModel {
        /**
         * <p>The type of deduction plans whose coverage details are queried. Valid values: RI and SCU.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The time granularity at which coverage details are queried. Valid values: MONTH, DAY, and HOUR.</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        /**
         * <p>The specifications of a deduction plan.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The unit that is used to measure the resources deducted from deduction plans.</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The beginning of the time range in which the coverage details were queried.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The code of the service.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The coverage rate of a deduction plan.</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The region.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The token that is used to retrieve the next page of results. You do not need to set this parameter if you query coverage details within a specific time range for the first time. The response returns a token that you can use to query coverage details that are displayed on the next page. If a null value is returned for the NextToken parameter, no more coverage details can be queried.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The username of the account.</p>
         */
        @NameInMap("TotalQuantity")
        public Float totalQuantity;

        /**
         * <p>The code of the zone.</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Zone")
        public String zone;

        /**
         * <p>The currency in which deduction plans were priced.</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeResourceCoverageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageDetailResponseBodyDataItems self = new DescribeResourceCoverageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setTotalQuantity(Float totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeResourceCoverageDetailResponseBodyData extends TeaModel {
        /**
         * <p>The code of the region.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeResourceCoverageDetailResponseBodyDataItems> items;

        /**
         * <p>The data entries.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The beginning of the time range to query.</p>
         * <br>
         * <p>The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The ID of a pay-as-you-go instance.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeResourceCoverageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageDetailResponseBodyData self = new DescribeResourceCoverageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageDetailResponseBodyData setItems(java.util.List<DescribeResourceCoverageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeResourceCoverageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeResourceCoverageDetailResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeResourceCoverageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeResourceCoverageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
