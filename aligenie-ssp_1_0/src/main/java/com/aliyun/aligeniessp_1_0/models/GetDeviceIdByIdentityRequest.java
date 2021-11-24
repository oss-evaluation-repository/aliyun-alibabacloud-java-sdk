// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityRequest extends TeaModel {
    // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
    @NameInMap("EncodeKey")
    public String encodeKey;

    // 编码类型，此处填写“PROJECT_ID”
    @NameInMap("EncodeType")
    public String encodeType;

    // 认证标识，填写MAC地址或者SN的值。
    @NameInMap("IdentityId")
    public String identityId;

    // 填写设备认证类型，“MAC”或者“SN”
    @NameInMap("IdentityType")
    public String identityType;

    // 产品唯一标志符productKey，在天猫精灵AI平台中创建产品时，平台颁发的全局唯一标识。
    @NameInMap("ProductKey")
    public String productKey;

    public static GetDeviceIdByIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityRequest self = new GetDeviceIdByIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public GetDeviceIdByIdentityRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public GetDeviceIdByIdentityRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public GetDeviceIdByIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public GetDeviceIdByIdentityRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
