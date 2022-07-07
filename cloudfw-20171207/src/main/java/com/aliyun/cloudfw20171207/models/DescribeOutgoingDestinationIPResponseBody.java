// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    // 外联IP列表
    @NameInMap("DstIPList")
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList;

    @NameInMap("RequestId")
    public String requestId;

    // 总数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingDestinationIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPResponseBody self = new DescribeOutgoingDestinationIPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPResponseBody setDstIPList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> dstIPList) {
        this.dstIPList = dstIPList;
        return this;
    }
    public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPList> getDstIPList() {
        return this.dstIPList;
    }

    public DescribeOutgoingDestinationIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDestinationIPResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList extends TeaModel {
        // 应用名
        @NameInMap("ApplicationName")
        public String applicationName;

        // 端口
        @NameInMap("Port")
        public Integer port;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList self = new DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPListTagList extends TeaModel {
        // 风险等级
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        // 标签描述
        @NameInMap("TagDescribe")
        public String tagDescribe;

        // 标签ID
        @NameInMap("TagId")
        public String tagId;

        // 标签名
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPListTagList self = new DescribeOutgoingDestinationIPResponseBodyDstIPListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class DescribeOutgoingDestinationIPResponseBodyDstIPList extends TeaModel {
        // ACL覆盖
        @NameInMap("AclCoverage")
        public String aclCoverage;

        // ACL推荐内容
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        // ACL状态
        @NameInMap("AclStatus")
        public String aclStatus;

        // 地址簿名称
        @NameInMap("AddressGroupName")
        public String addressGroupName;

        // 地址簿UUID
        @NameInMap("AddressGroupUUID")
        public String addressGroupUUID;

        @NameInMap("ApplicationPortList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList;

        // 分类ID
        @NameInMap("CategoryId")
        public String categoryId;

        // 分类名称
        @NameInMap("CategoryName")
        public String categoryName;

        // 目的IP
        @NameInMap("DstIP")
        public String dstIP;

        // 规则中的组名称
        @NameInMap("GroupName")
        public String groupName;

        // 是否有推荐ACL
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        // 入方向流量
        @NameInMap("InBytes")
        public Long inBytes;

        // 是否正常
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        // 出流量
        @NameInMap("OutBytes")
        public Long outBytes;

        // 规则UUID
        @NameInMap("RuleId")
        public String ruleId;

        // 规则名称
        @NameInMap("RuleName")
        public String ruleName;

        // 安全建议
        @NameInMap("SecuritySuggest")
        public String securitySuggest;

        // 会话数
        @NameInMap("SessionCount")
        public Long sessionCount;

        // 标签列表
        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList;

        public static DescribeOutgoingDestinationIPResponseBodyDstIPList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationIPResponseBodyDstIPList self = new DescribeOutgoingDestinationIPResponseBodyDstIPList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAclCoverage(String aclCoverage) {
            this.aclCoverage = aclCoverage;
            return this;
        }
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAclRecommendDetail(String aclRecommendDetail) {
            this.aclRecommendDetail = aclRecommendDetail;
            return this;
        }
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAddressGroupName(String addressGroupName) {
            this.addressGroupName = addressGroupName;
            return this;
        }
        public String getAddressGroupName() {
            return this.addressGroupName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setAddressGroupUUID(String addressGroupUUID) {
            this.addressGroupUUID = addressGroupUUID;
            return this;
        }
        public String getAddressGroupUUID() {
            return this.addressGroupUUID;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setApplicationPortList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> applicationPortList) {
            this.applicationPortList = applicationPortList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListApplicationPortList> getApplicationPortList() {
            return this.applicationPortList;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setHasAclRecommend(Boolean hasAclRecommend) {
            this.hasAclRecommend = hasAclRecommend;
            return this;
        }
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setIsMarkNormal(Boolean isMarkNormal) {
            this.isMarkNormal = isMarkNormal;
            return this;
        }
        public Boolean getIsMarkNormal() {
            return this.isMarkNormal;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setSecuritySuggest(String securitySuggest) {
            this.securitySuggest = securitySuggest;
            return this;
        }
        public String getSecuritySuggest() {
            return this.securitySuggest;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingDestinationIPResponseBodyDstIPList setTagList(java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationIPResponseBodyDstIPListTagList> getTagList() {
            return this.tagList;
        }

    }

}
