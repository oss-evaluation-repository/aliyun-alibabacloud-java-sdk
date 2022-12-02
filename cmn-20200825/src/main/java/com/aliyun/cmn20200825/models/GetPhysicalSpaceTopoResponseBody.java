// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetPhysicalSpaceTopoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TopoData")
    public GetPhysicalSpaceTopoResponseBodyTopoData topoData;

    public static GetPhysicalSpaceTopoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalSpaceTopoResponseBody self = new GetPhysicalSpaceTopoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalSpaceTopoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalSpaceTopoResponseBody setTopoData(GetPhysicalSpaceTopoResponseBodyTopoData topoData) {
        this.topoData = topoData;
        return this;
    }
    public GetPhysicalSpaceTopoResponseBodyTopoData getTopoData() {
        return this.topoData;
    }

    public static class GetPhysicalSpaceTopoResponseBodyTopoDataDevices extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceRole")
        public String deviceRole;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Ip")
        public String ip;

        public static GetPhysicalSpaceTopoResponseBodyTopoDataDevices build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalSpaceTopoResponseBodyTopoDataDevices self = new GetPhysicalSpaceTopoResponseBodyTopoDataDevices();
            return TeaModel.build(map, self);
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataDevices setDeviceRole(String deviceRole) {
            this.deviceRole = deviceRole;
            return this;
        }
        public String getDeviceRole() {
            return this.deviceRole;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataDevices setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataDevices setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class GetPhysicalSpaceTopoResponseBodyTopoDataLinks extends TeaModel {
        @NameInMap("SourceDeviceId")
        public String sourceDeviceId;

        @NameInMap("SourceDeviceName")
        public String sourceDeviceName;

        @NameInMap("SourcePort")
        public String sourcePort;

        @NameInMap("TargetDeviceId")
        public String targetDeviceId;

        @NameInMap("TargetDeviceName")
        public String targetDeviceName;

        @NameInMap("TargetPort")
        public String targetPort;

        public static GetPhysicalSpaceTopoResponseBodyTopoDataLinks build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalSpaceTopoResponseBodyTopoDataLinks self = new GetPhysicalSpaceTopoResponseBodyTopoDataLinks();
            return TeaModel.build(map, self);
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataLinks setSourceDeviceId(String sourceDeviceId) {
            this.sourceDeviceId = sourceDeviceId;
            return this;
        }
        public String getSourceDeviceId() {
            return this.sourceDeviceId;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataLinks setSourceDeviceName(String sourceDeviceName) {
            this.sourceDeviceName = sourceDeviceName;
            return this;
        }
        public String getSourceDeviceName() {
            return this.sourceDeviceName;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataLinks setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataLinks setTargetDeviceId(String targetDeviceId) {
            this.targetDeviceId = targetDeviceId;
            return this;
        }
        public String getTargetDeviceId() {
            return this.targetDeviceId;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataLinks setTargetDeviceName(String targetDeviceName) {
            this.targetDeviceName = targetDeviceName;
            return this;
        }
        public String getTargetDeviceName() {
            return this.targetDeviceName;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoDataLinks setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

    public static class GetPhysicalSpaceTopoResponseBodyTopoData extends TeaModel {
        @NameInMap("Devices")
        public java.util.List<GetPhysicalSpaceTopoResponseBodyTopoDataDevices> devices;

        @NameInMap("Links")
        public java.util.List<GetPhysicalSpaceTopoResponseBodyTopoDataLinks> links;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetPhysicalSpaceTopoResponseBodyTopoData build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalSpaceTopoResponseBodyTopoData self = new GetPhysicalSpaceTopoResponseBodyTopoData();
            return TeaModel.build(map, self);
        }

        public GetPhysicalSpaceTopoResponseBodyTopoData setDevices(java.util.List<GetPhysicalSpaceTopoResponseBodyTopoDataDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<GetPhysicalSpaceTopoResponseBodyTopoDataDevices> getDevices() {
            return this.devices;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoData setLinks(java.util.List<GetPhysicalSpaceTopoResponseBodyTopoDataLinks> links) {
            this.links = links;
            return this;
        }
        public java.util.List<GetPhysicalSpaceTopoResponseBodyTopoDataLinks> getLinks() {
            return this.links;
        }

        public GetPhysicalSpaceTopoResponseBodyTopoData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
