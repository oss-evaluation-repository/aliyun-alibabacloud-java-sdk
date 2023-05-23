// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetScheduleResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public GetScheduleResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleResponseBody self = new GetScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleResponseBody setData(GetScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScheduleResponseBodyData getData() {
        return this.data;
    }

    public GetScheduleResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetScheduleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScheduleResponseBodyData extends TeaModel {
        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>终止时间（UTC+8）。</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>执行时间 (UTC+8)，为空立即执行。</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>人群ID。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>历史记录。</p>
         */
        @NameInMap("History")
        public String history;

        /**
         * <p>触达计划ID。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>触达计划名称。</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>重复周期，按重复周期与重复周期单位执行。</p>
         */
        @NameInMap("RepeatCycle")
        public Integer repeatCycle;

        /**
         * <p>重复周期单位，若指定执行时间，则重复周期生效。</p>
         * <p>- 0: 从不（默认）。</p>
         * <p>- 1: 小时。</p>
         * <p>- 2: 天。</p>
         * <p>- 3: 周。</p>
         * <p>- 4: 月。</p>
         */
        @NameInMap("RepeatCycleUnit")
        public Integer repeatCycleUnit;

        /**
         * <p>重复次数。</p>
         * <p>- 0: 不设终止时间（默认）。</p>
         * <p>- N: 重复N次后终止。</p>
         */
        @NameInMap("RepeatTimes")
        public Integer repeatTimes;

        /**
         * <p>签名。</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>签名ID，或指定签名。</p>
         */
        @NameInMap("SignatureId")
        public String signatureId;

        /**
         * <p>状态。</p>
         * <p>- 0: 检查中。</p>
         * <p>- 1: 检查成功。</p>
         * <p>- 2: 检查失败。</p>
         * <p>- 3: 发送中。</p>
         * <p>- 4: 发送成功。</p>
         * <p>- 5: 发送失败。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>模板Code。</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>模板ID，或指定模板Code。</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleResponseBodyData self = new GetScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScheduleResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetScheduleResponseBodyData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public GetScheduleResponseBodyData setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public GetScheduleResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetScheduleResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public GetScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduleResponseBodyData setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetScheduleResponseBodyData setRepeatCycle(Integer repeatCycle) {
            this.repeatCycle = repeatCycle;
            return this;
        }
        public Integer getRepeatCycle() {
            return this.repeatCycle;
        }

        public GetScheduleResponseBodyData setRepeatCycleUnit(Integer repeatCycleUnit) {
            this.repeatCycleUnit = repeatCycleUnit;
            return this;
        }
        public Integer getRepeatCycleUnit() {
            return this.repeatCycleUnit;
        }

        public GetScheduleResponseBodyData setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public GetScheduleResponseBodyData setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public GetScheduleResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public GetScheduleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetScheduleResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetScheduleResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetScheduleResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
