// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Devices")
    public java.util.List<ListDevicesResponseBodyDevices> devices;

    public static ListDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponseBody self = new ListDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponseBody setDevices(java.util.List<ListDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<ListDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public static class ListDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("UsageType")
        public Integer usageType;

        @NameInMap("UsageTypeDesc")
        public String usageTypeDesc;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vin")
        public String vin;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("SoftwareId")
        public String softwareId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Status")
        public String status;

        public static ListDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDevices self = new ListDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDevicesResponseBodyDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDevicesResponseBodyDevices setUsageType(Integer usageType) {
            this.usageType = usageType;
            return this;
        }
        public Integer getUsageType() {
            return this.usageType;
        }

        public ListDevicesResponseBodyDevices setUsageTypeDesc(String usageTypeDesc) {
            this.usageTypeDesc = usageTypeDesc;
            return this;
        }
        public String getUsageTypeDesc() {
            return this.usageTypeDesc;
        }

        public ListDevicesResponseBodyDevices setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListDevicesResponseBodyDevices setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public ListDevicesResponseBodyDevices setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public ListDevicesResponseBodyDevices setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListDevicesResponseBodyDevices setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

        public ListDevicesResponseBodyDevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListDevicesResponseBodyDevices setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public ListDevicesResponseBodyDevices setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public ListDevicesResponseBodyDevices setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public ListDevicesResponseBodyDevices setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDevicesResponseBodyDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDevicesResponseBodyDevices setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDevicesResponseBodyDevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
