// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2ResponseBody extends TeaModel {
    @NameInMap("OssObjectDetail")
    public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail ossObjectDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOssObjectDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailV2ResponseBody self = new DescribeOssObjectDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailV2ResponseBody setOssObjectDetail(DescribeOssObjectDetailV2ResponseBodyOssObjectDetail ossObjectDetail) {
        this.ossObjectDetail = ossObjectDetail;
        return this;
    }
    public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail getOssObjectDetail() {
        return this.ossObjectDetail;
    }

    public DescribeOssObjectDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags self = new DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Count")
        public Long count;

        @NameInMap("ModelTags")
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags> modelTags;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList self = new DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setModelTags(java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class DescribeOssObjectDetailV2ResponseBodyOssObjectDetail extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleList")
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList> ruleList;

        public static DescribeOssObjectDetailV2ResponseBodyOssObjectDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailV2ResponseBodyOssObjectDetail self = new DescribeOssObjectDetailV2ResponseBodyOssObjectDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRuleList(java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
