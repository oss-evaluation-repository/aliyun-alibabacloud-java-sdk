// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("auto_pay")
    public Boolean autoPay;

    @NameInMap("auto_renew")
    public Boolean autoRenew;

    @NameInMap("code")
    public String code;

    @NameInMap("instance_id")
    public String instanceId;

    @NameInMap("order_type")
    public String orderType;

    @NameInMap("package")
    public String _package;

    @NameInMap("period")
    public Long period;

    @NameInMap("period_unit")
    public String periodUnit;

    @NameInMap("total_size")
    public Long totalSize;

    @NameInMap("user_count")
    public Long userCount;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateOrderRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateOrderRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateOrderRequest set_package(String _package) {
        this._package = _package;
        return this;
    }
    public String get_package() {
        return this._package;
    }

    public CreateOrderRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateOrderRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public CreateOrderRequest setUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }
    public Long getUserCount() {
        return this.userCount;
    }

}
