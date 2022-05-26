// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusResponseBody extends TeaModel {
    @NameInMap("ClusterStatus")
    public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus clusterStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshAdditionalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshAdditionalStatusResponseBody self = new DescribeServiceMeshAdditionalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshAdditionalStatusResponseBody setClusterStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus getClusterStatus() {
        return this.clusterStatus;
    }

    public DescribeServiceMeshAdditionalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus extends TeaModel {
        @NameInMap("Locked")
        public Boolean locked;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reused")
        public Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setSLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
            this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
            return this;
        }
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setSLBExistStatus(String SLBExistStatus) {
            this.SLBExistStatus = SLBExistStatus;
            return this;
        }
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("Valid")
        public Boolean valid;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus extends TeaModel {
        @NameInMap("Locked")
        public Boolean locked;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reused")
        public Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setSLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
            this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
            return this;
        }
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setSLBExistStatus(String SLBExistStatus) {
            this.SLBExistStatus = SLBExistStatus;
            return this;
        }
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus extends TeaModel {
        @NameInMap("AccessLogProjectStatus")
        public String accessLogProjectStatus;

        @NameInMap("ApiServerEIPStatus")
        public String apiServerEIPStatus;

        @NameInMap("ApiServerLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus apiServerLoadBalancerStatus;

        @NameInMap("AuditProjectStatus")
        public String auditProjectStatus;

        @NameInMap("ConfigSourceStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus configSourceStatus;

        @NameInMap("ControlPlaneProjectStatus")
        public String controlPlaneProjectStatus;

        @NameInMap("LogtailStatusRecord")
        public java.util.Map<String, ?> logtailStatusRecord;

        @NameInMap("PilotLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus pilotLoadBalancerStatus;

        @NameInMap("SgStatus")
        public String sgStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setAccessLogProjectStatus(String accessLogProjectStatus) {
            this.accessLogProjectStatus = accessLogProjectStatus;
            return this;
        }
        public String getAccessLogProjectStatus() {
            return this.accessLogProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setApiServerEIPStatus(String apiServerEIPStatus) {
            this.apiServerEIPStatus = apiServerEIPStatus;
            return this;
        }
        public String getApiServerEIPStatus() {
            return this.apiServerEIPStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setApiServerLoadBalancerStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus apiServerLoadBalancerStatus) {
            this.apiServerLoadBalancerStatus = apiServerLoadBalancerStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus getApiServerLoadBalancerStatus() {
            return this.apiServerLoadBalancerStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setAuditProjectStatus(String auditProjectStatus) {
            this.auditProjectStatus = auditProjectStatus;
            return this;
        }
        public String getAuditProjectStatus() {
            return this.auditProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setConfigSourceStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus configSourceStatus) {
            this.configSourceStatus = configSourceStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusConfigSourceStatus getConfigSourceStatus() {
            return this.configSourceStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setControlPlaneProjectStatus(String controlPlaneProjectStatus) {
            this.controlPlaneProjectStatus = controlPlaneProjectStatus;
            return this;
        }
        public String getControlPlaneProjectStatus() {
            return this.controlPlaneProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setLogtailStatusRecord(java.util.Map<String, ?> logtailStatusRecord) {
            this.logtailStatusRecord = logtailStatusRecord;
            return this;
        }
        public java.util.Map<String, ?> getLogtailStatusRecord() {
            return this.logtailStatusRecord;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setPilotLoadBalancerStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus pilotLoadBalancerStatus) {
            this.pilotLoadBalancerStatus = pilotLoadBalancerStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus getPilotLoadBalancerStatus() {
            return this.pilotLoadBalancerStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setSgStatus(String sgStatus) {
            this.sgStatus = sgStatus;
            return this;
        }
        public String getSgStatus() {
            return this.sgStatus;
        }

    }

}
