// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListOutboundPhoneNumberOfUserResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("NumberList")
    public ListOutboundPhoneNumberOfUserResponseBodyNumberList numberList;

    @NameInMap("Code")
    public String code;

    @NameInMap("OutboundPhoneNumbers")
    public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers outboundPhoneNumbers;

    @NameInMap("Success")
    public Boolean success;

    public static ListOutboundPhoneNumberOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundPhoneNumberOfUserResponseBody self = new ListOutboundPhoneNumberOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutboundPhoneNumberOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutboundPhoneNumberOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOutboundPhoneNumberOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOutboundPhoneNumberOfUserResponseBody setNumberList(ListOutboundPhoneNumberOfUserResponseBodyNumberList numberList) {
        this.numberList = numberList;
        return this;
    }
    public ListOutboundPhoneNumberOfUserResponseBodyNumberList getNumberList() {
        return this.numberList;
    }

    public ListOutboundPhoneNumberOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOutboundPhoneNumberOfUserResponseBody setOutboundPhoneNumbers(ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers outboundPhoneNumbers) {
        this.outboundPhoneNumbers = outboundPhoneNumbers;
        return this;
    }
    public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers getOutboundPhoneNumbers() {
        return this.outboundPhoneNumbers;
    }

    public ListOutboundPhoneNumberOfUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOutboundPhoneNumberOfUserResponseBodyNumberList extends TeaModel {
        @NameInMap("Number")
        public java.util.List<String> number;

        public static ListOutboundPhoneNumberOfUserResponseBodyNumberList build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundPhoneNumberOfUserResponseBodyNumberList self = new ListOutboundPhoneNumberOfUserResponseBodyNumberList();
            return TeaModel.build(map, self);
        }

        public ListOutboundPhoneNumberOfUserResponseBodyNumberList setNumber(java.util.List<String> number) {
            this.number = number;
            return this;
        }
        public java.util.List<String> getNumber() {
            return this.number;
        }

    }

    public static class ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber extends TeaModel {
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

        public static ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber self = new ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber();
            return TeaModel.build(map, self);
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setPoolId(String poolId) {
            this.poolId = poolId;
            return this;
        }
        public String getPoolId() {
            return this.poolId;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setRegionNameCity(String regionNameCity) {
            this.regionNameCity = regionNameCity;
            return this;
        }
        public String getRegionNameCity() {
            return this.regionNameCity;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

    public static class ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber extends TeaModel {
        @NameInMap("PrivateFlag")
        public Boolean privateFlag;

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

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        @NameInMap("Trunks")
        public Integer trunks;

        @NameInMap("Number")
        public String number;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("PrivacyNumber")
        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber privacyNumber;

        @NameInMap("Province")
        public String province;

        public static ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber self = new ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber();
            return TeaModel.build(map, self);
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setPrivateFlag(Boolean privateFlag) {
            this.privateFlag = privateFlag;
            return this;
        }
        public Boolean getPrivateFlag() {
            return this.privateFlag;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setTestOnly(Boolean testOnly) {
            this.testOnly = testOnly;
            return this;
        }
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setSipTelX(String sipTelX) {
            this.sipTelX = sipTelX;
            return this;
        }
        public String getSipTelX() {
            return this.sipTelX;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setAllowOutbound(Boolean allowOutbound) {
            this.allowOutbound = allowOutbound;
            return this;
        }
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setTrunks(Integer trunks) {
            this.trunks = trunks;
            return this;
        }
        public Integer getTrunks() {
            return this.trunks;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setPrivacyNumber(ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber privacyNumber) {
            this.privacyNumber = privacyNumber;
            return this;
        }
        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumberPrivacyNumber getPrivacyNumber() {
            return this.privacyNumber;
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public java.util.List<ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber> phoneNumber;

        public static ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers self = new ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbers setPhoneNumber(java.util.List<ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public java.util.List<ListOutboundPhoneNumberOfUserResponseBodyOutboundPhoneNumbersPhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
