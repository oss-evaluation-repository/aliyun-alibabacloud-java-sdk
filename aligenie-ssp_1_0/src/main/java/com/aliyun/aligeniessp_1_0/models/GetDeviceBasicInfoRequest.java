// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public GetDeviceBasicInfoRequestDeviceInfo deviceInfo;

    public static GetDeviceBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBasicInfoRequest self = new GetDeviceBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceBasicInfoRequest setDeviceInfo(GetDeviceBasicInfoRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceBasicInfoRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetDeviceBasicInfoRequestDeviceInfo extends TeaModel {
        // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，此处填写“PROJECT_ID”
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型  - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetDeviceBasicInfoRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceBasicInfoRequestDeviceInfo self = new GetDeviceBasicInfoRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceBasicInfoRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
