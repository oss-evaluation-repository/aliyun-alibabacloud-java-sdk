// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeTablesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeTablesResponseBodyItems> items;

    public static DescribeTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponseBody self = new DescribeTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTablesResponseBody setItems(java.util.List<DescribeTablesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTablesResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeTablesResponseBodyItemsRuleList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("Count")
        public Long count;

        public static DescribeTablesResponseBodyItemsRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyItemsRuleList self = new DescribeTablesResponseBodyItemsRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyItemsRuleList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeTablesResponseBodyItemsRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTablesResponseBodyItemsRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeTablesResponseBodyItemsRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeTablesResponseBodyItems extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("Name")
        public String name;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("RuleList")
        public java.util.List<DescribeTablesResponseBodyItemsRuleList> ruleList;

        public static DescribeTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyItems self = new DescribeTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeTablesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeTablesResponseBodyItems setSensitiveRatio(String sensitiveRatio) {
            this.sensitiveRatio = sensitiveRatio;
            return this;
        }
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        public DescribeTablesResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTablesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeTablesResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTablesResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeTablesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTablesResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeTablesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeTablesResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeTablesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeTablesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeTablesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeTablesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTablesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeTablesResponseBodyItems setRuleList(java.util.List<DescribeTablesResponseBodyItemsRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeTablesResponseBodyItemsRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
