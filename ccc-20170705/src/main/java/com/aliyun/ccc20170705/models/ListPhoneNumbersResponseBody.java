// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersResponseBody extends TeaModel {
    @NameInMap("PhoneNumbers")
    public ListPhoneNumbersResponseBodyPhoneNumbers phoneNumbers;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListPhoneNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersResponseBody self = new ListPhoneNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersResponseBody setPhoneNumbers(ListPhoneNumbersResponseBodyPhoneNumbers phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public ListPhoneNumbersResponseBodyPhoneNumbers getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public ListPhoneNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhoneNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhoneNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPhoneNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhoneNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup extends TeaModel {
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup self = new ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup> skillGroup;

        public static ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups self = new ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups setSkillGroup(java.util.List<ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroupsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ContactFlowDescription")
        public String contactFlowDescription;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        public static ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow self = new ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setContactFlowDescription(String contactFlowDescription) {
            this.contactFlowDescription = contactFlowDescription;
            return this;
        }
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

    }

    public static class ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("PoolId")
        public String poolId;

        @NameInMap("SubId")
        public String subId;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("PoolName")
        public String poolName;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("RegionNameCity")
        public String regionNameCity;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("TelX")
        public String telX;

        public static ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber self = new ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setPoolId(String poolId) {
            this.poolId = poolId;
            return this;
        }
        public String getPoolId() {
            return this.poolId;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setRegionNameCity(String regionNameCity) {
            this.regionNameCity = regionNameCity;
            return this;
        }
        public String getRegionNameCity() {
            return this.regionNameCity;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

    public static class ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("TestOnly")
        public Boolean testOnly;

        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("SipTelX")
        public String sipTelX;

        @NameInMap("City")
        public String city;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("AllowOutbound")
        public Boolean allowOutbound;

        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        @NameInMap("SkillGroups")
        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups skillGroups;

        @NameInMap("Trunks")
        public Integer trunks;

        @NameInMap("Number")
        public String number;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("ContactFlow")
        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow contactFlow;

        @NameInMap("NumberCommodityStatus")
        public Integer numberCommodityStatus;

        @NameInMap("PrivacyNumber")
        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber privacyNumber;

        @NameInMap("Province")
        public String province;

        public static ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber self = new ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setSipTelX(String sipTelX) {
            this.sipTelX = sipTelX;
            return this;
        }
        public String getSipTelX() {
            return this.sipTelX;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setSkillGroups(ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberSkillGroups getSkillGroups() {
            return this.skillGroups;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setContactFlow(ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow contactFlow) {
            this.contactFlow = contactFlow;
            return this;
        }
        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberContactFlow getContactFlow() {
            return this.contactFlow;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setNumberCommodityStatus(Integer numberCommodityStatus) {
            this.numberCommodityStatus = numberCommodityStatus;
            return this;
        }
        public Integer getNumberCommodityStatus() {
            return this.numberCommodityStatus;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setPrivacyNumber(ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber privacyNumber) {
            this.privacyNumber = privacyNumber;
            return this;
        }
        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumberPrivacyNumber getPrivacyNumber() {
            return this.privacyNumber;
        }

        public ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListPhoneNumbersResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber> phoneNumber;

        public static ListPhoneNumbersResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyPhoneNumbers self = new ListPhoneNumbersResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyPhoneNumbers setPhoneNumber(java.util.List<ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListPhoneNumbersResponseBodyPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
