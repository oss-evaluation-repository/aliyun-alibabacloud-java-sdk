// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the service was created.</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the service.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to allow functions to access the Internet. Valid values:</p>
     * <br>
     * <p>*   **true**: allows functions in the specified service to access the Internet.</p>
     * <p>*   **false**: does not allow functions to access the Internet.</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    /**
     * <p>The time when the service was last modified.</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The log configuration, which specifies a Logstore to store function execution logs.</p>
     */
    @NameInMap("logConfig")
    public LogConfig logConfig;

    /**
     * <p>The configurations of the NAS file system. The configuration allows functions in the specified service in Function Compute to access the NAS file system.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The OSS mount configurations.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The RAM role that is used to grant required permissions to Function Compute. Scenarios:</p>
     * <br>
     * <p>*   Sends function execution logs to your Logstore.</p>
     * <p>*   Generates a token for a function to access other cloud resources during function execution.</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The unique ID generated by the system for the service.</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The configuration of Tracing Analysis. After you configure Tracing Analysis for a service in Function Compute, you can record the execution duration of a request, view the amount of cold start time for a function, and record the execution duration of a function. For more information, see [Overview](~~189804~~).</p>
     */
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    /**
     * <p>The VPC configuration. The configuration allows a function to access the specified VPC.</p>
     */
    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetServiceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetServiceResponseBody setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public GetServiceResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetServiceResponseBody setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public GetServiceResponseBody setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public GetServiceResponseBody setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public GetServiceResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceResponseBody setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public GetServiceResponseBody setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
