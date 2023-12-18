// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionResponseBody extends TeaModel {
    /**
     * <p>The port on which the HTTP server listens for the custom runtime or custom container runtime.</p>
     */
    @NameInMap("caPort")
    public Integer caPort;

    /**
     * <p>The CRC-64 value of the function code package.</p>
     */
    @NameInMap("codeChecksum")
    public String codeChecksum;

    /**
     * <p>The size of the function code package. Unit: byte.</p>
     */
    @NameInMap("codeSize")
    public Long codeSize;

    /**
     * <p>The number of vCPUs of the function. The value must be a multiple of 0.05.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The time when the function was created.</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The configurations of the custom container runtime. After you configure the custom container runtime, Function Compute can execute the function in a container created from a custom image.</p>
     */
    @NameInMap("customContainerConfig")
    public CustomContainerConfigInfo customContainerConfig;

    /**
     * <p>The custom DNS configurations of the function.</p>
     */
    @NameInMap("customDNS")
    public CustomDNS customDNS;

    /**
     * <p>The custom health check configuration of the function. This parameter is applicable only to custom runtimes and custom containers.</p>
     */
    @NameInMap("customHealthCheckConfig")
    public CustomHealthCheckConfig customHealthCheckConfig;

    /**
     * <p>The configurations of the custom runtime.</p>
     */
    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    /**
     * <p>The description of the function.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The disk size of the function. Unit: MB. Valid values: 512 and 10240.</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>The environment variables that are configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Environment variables](~~69777~~).</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The ID that is generated by the system for the function. Each function ID is unique in Function Compute.</p>
     */
    @NameInMap("functionId")
    public String functionId;

    /**
     * <p>The name of the function.</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The GPU memory capacity for the function. Unit: MB. The value is a multiple of 1,024.</p>
     */
    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    /**
     * <p>The handler of the function. For more information, see [Function handler](~~157704~~).</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The timeout period for the execution of the Initializer hook. Unit: seconds. Default value: 3. Valid values: 1 to 300. When this period ends, the execution of the Initializer hook is terminated.</p>
     */
    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    /**
     * <p>The handler of the Initializer hook. The format of the value is determined by the programming language that you use. For more information, see [Initializer hook](~~157704~~).</p>
     */
    @NameInMap("initializer")
    public String initializer;

    /**
     * <p>The number of requests that can be concurrently processed by a single instance.</p>
     */
    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    /**
     * <p>The lifecycle configurations of the instance.</p>
     */
    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    /**
     * <p>The soft concurrency of the instance. You can use this parameter to implement graceful scale-up of instances. If the number of concurrent requests on an instance is greater than the value of soft concurrency, an instance scale-up is triggered. For example, if your instance requires a long time to start, you can specify a suitable soft concurrency to start the instance in advance.</p>
     * <br>
     * <p>The value must be less than or equal to that of the **instanceConcurrency** parameter.</p>
     */
    @NameInMap("instanceSoftConcurrency")
    public Integer instanceSoftConcurrency;

    /**
     * <p>The instance type of the function. Valid values:</p>
     * <br>
     * <p>*   **e1**: elastic instance</p>
     * <p>*   **c1**: performance instance</p>
     * <p>*   **fc.gpu.tesla.1**: GPU-accelerated instance (Tesla T4)</p>
     * <p>*   **fc.gpu.ampere.1**: GPU-accelerated instance (Ampere A10)</p>
     * <p>*   **g1**: same as fc.gpu.tesla.1</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The time when the function was last modified.</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The layers (ARN V1 version).</p>
     * <br>
     * <p>> Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file that has the same name as a layer with a larger subscript.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Warning** This parameter is to be deprecated. Use layersArnV2.</p>
     */
    @NameInMap("layers")
    public java.util.List<String> layers;

    /**
     * <p>The list of layers (ARN V2 version).</p>
     * <br>
     * <p>> Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file that has the same name as a layer with a larger subscript.</p>
     */
    @NameInMap("layersArnV2")
    public java.util.List<String> layersArnV2;

    /**
     * <p>The memory size for the function. Unit: MB. The value must be a multiple of 64. The memory size varies based on the function instance type. For more information, see [Instance types](~~179379~~).</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <p>The runtime environment of the function. Valid values: **nodejs16**, **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore2.1**, **custom**, and **custom-container**.</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <p>The timeout period for the execution of the function. Unit: seconds. Default value: 60. Valid values: 1 to 600. When this period expires, the execution of the function is terminated.</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static GetFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponseBody self = new GetFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponseBody setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public GetFunctionResponseBody setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public GetFunctionResponseBody setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }
    public Long getCodeSize() {
        return this.codeSize;
    }

    public GetFunctionResponseBody setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public GetFunctionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetFunctionResponseBody setCustomContainerConfig(CustomContainerConfigInfo customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfigInfo getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public GetFunctionResponseBody setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public GetFunctionResponseBody setCustomHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
        this.customHealthCheckConfig = customHealthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    public GetFunctionResponseBody setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public GetFunctionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetFunctionResponseBody setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public GetFunctionResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public GetFunctionResponseBody setFunctionId(String functionId) {
        this.functionId = functionId;
        return this;
    }
    public String getFunctionId() {
        return this.functionId;
    }

    public GetFunctionResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public GetFunctionResponseBody setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    public GetFunctionResponseBody setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public GetFunctionResponseBody setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public GetFunctionResponseBody setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public GetFunctionResponseBody setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public GetFunctionResponseBody setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public GetFunctionResponseBody setInstanceSoftConcurrency(Integer instanceSoftConcurrency) {
        this.instanceSoftConcurrency = instanceSoftConcurrency;
        return this;
    }
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    public GetFunctionResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetFunctionResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetFunctionResponseBody setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public GetFunctionResponseBody setLayersArnV2(java.util.List<String> layersArnV2) {
        this.layersArnV2 = layersArnV2;
        return this;
    }
    public java.util.List<String> getLayersArnV2() {
        return this.layersArnV2;
    }

    public GetFunctionResponseBody setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public GetFunctionResponseBody setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public GetFunctionResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
