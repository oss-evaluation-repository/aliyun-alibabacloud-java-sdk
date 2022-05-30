// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowStatusRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 免流产品ID
    @NameInMap("FlowProductId")
    public String flowProductId;

    // C端手机号
    @NameInMap("MobileNumber")
    public String mobileNumber;

    // 网络类型，如3G、4G、5G
    @NameInMap("NetType")
    public String netType;

    // 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
    @NameInMap("Operator")
    public String operator;

    // 手机端私网ip地址
    @NameInMap("PrivateIP")
    public String privateIP;

    // C端手机在运营商侧端伪码，如："75D35971BD"
    @NameInMap("PseudoCode")
    public String pseudoCode;

    // 手机端公网ip地址
    @NameInMap("PublicIP")
    public String publicIP;

    // 通过云通信获取的token
    @NameInMap("Token")
    public String token;

    public static GetFreeFlowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowStatusRequest self = new GetFreeFlowStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowStatusRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetFreeFlowStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetFreeFlowStatusRequest setFlowProductId(String flowProductId) {
        this.flowProductId = flowProductId;
        return this;
    }
    public String getFlowProductId() {
        return this.flowProductId;
    }

    public GetFreeFlowStatusRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public GetFreeFlowStatusRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public GetFreeFlowStatusRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public GetFreeFlowStatusRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public GetFreeFlowStatusRequest setPseudoCode(String pseudoCode) {
        this.pseudoCode = pseudoCode;
        return this;
    }
    public String getPseudoCode() {
        return this.pseudoCode;
    }

    public GetFreeFlowStatusRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public GetFreeFlowStatusRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
