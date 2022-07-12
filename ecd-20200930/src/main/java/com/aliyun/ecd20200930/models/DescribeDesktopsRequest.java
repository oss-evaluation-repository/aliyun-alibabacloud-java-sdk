// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("DesktopName")
    public String desktopName;

    @NameInMap("DesktopStatus")
    public String desktopStatus;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    @NameInMap("ExcludedEndUserId")
    public java.util.List<String> excludedEndUserId;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("FilterDesktopGroup")
    public Boolean filterDesktopGroup;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ManagementFlag")
    public String managementFlag;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeDesktopsRequestTag> tag;

    @NameInMap("UserName")
    public String userName;

    public static DescribeDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsRequest self = new DescribeDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeDesktopsRequest setDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    public DescribeDesktopsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDesktopsRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public DescribeDesktopsRequest setExcludedEndUserId(java.util.List<String> excludedEndUserId) {
        this.excludedEndUserId = excludedEndUserId;
        return this;
    }
    public java.util.List<String> getExcludedEndUserId() {
        return this.excludedEndUserId;
    }

    public DescribeDesktopsRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDesktopsRequest setFilterDesktopGroup(Boolean filterDesktopGroup) {
        this.filterDesktopGroup = filterDesktopGroup;
        return this;
    }
    public Boolean getFilterDesktopGroup() {
        return this.filterDesktopGroup;
    }

    public DescribeDesktopsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDesktopsRequest setManagementFlag(String managementFlag) {
        this.managementFlag = managementFlag;
        return this;
    }
    public String getManagementFlag() {
        return this.managementFlag;
    }

    public DescribeDesktopsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopsRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public DescribeDesktopsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeDesktopsRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDesktopsRequest setQueryFotaUpdate(Boolean queryFotaUpdate) {
        this.queryFotaUpdate = queryFotaUpdate;
        return this;
    }
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
    }

    public DescribeDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopsRequest setTag(java.util.List<DescribeDesktopsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDesktopsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDesktopsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class DescribeDesktopsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDesktopsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopsRequestTag self = new DescribeDesktopsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
