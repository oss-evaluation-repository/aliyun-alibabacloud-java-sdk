// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The total number of scaling configurations.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the scaling configurations.</p>
     */
    @NameInMap("ScalingConfigurations")
    public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations;

    /**
     * <p>Details of the scaling configurations.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigurationsResponseBody self = new DescribeScalingConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingConfigurationsResponseBody setScalingConfigurations(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
        return this;
    }
    public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurations> getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    public DescribeScalingConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks extends TeaModel {
        /**
         * <p>Indicates whether the data disk is released when the instance to which the data disk is attached is released. Valid values:</p>
         * <br>
         * <p>*   true: The data disk is released when the instance is released.</p>
         * <p>*   false: The data disk is retained when the instance is released.</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The tag key of the instance. Up to 20 tags are supported.</p>
         * <br>
         * <p>The tag key cannot be an empty string. The tag key must be 0 to 128 characters in length, and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>Indicates whether the burst feature is enabled for the data disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set the `DataDisk.Category` parameter to `cloud_auto`.</p>
         * <br>
         * <p>For more information, see [ESSD AutoPL disks](~~368372~~).</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>Indicates whether the data disk is encrypted. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The categories of the data disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk. The DeleteWithInstance attribute of a basic disk that is created together with the instance is set to true.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * <br>
         * <p>*   Valid values if you set the Category parameter to cloud: 5 to 2000.</p>
         * <p>*   Valid values if you set the Category parameter to cloud_efficiency: 20 to 32768.</p>
         * <p>*   Valid values if you set the Category parameter to cloud_ssd: 20 to 32768.</p>
         * <p>*   Valid values if you set the Category parameter to cloud_essd: 20 to 32768.</p>
         * <p>*   Valid values if you set the Category parameter to ephemeral_ssd: 5 to 800.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the automatic snapshot policy that is applied to the data disk.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the data disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The input/output operations per second (IOPS) metric that is preconfigured for the data disk.</p>
         * <br>
         * <p>> IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The categories of the data disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk. The DeleteWithInstance attribute of a basic disk that is created together with the instance is set to true.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The mount target of the data disk.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>Details of the tags.</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk. The DeleteWithInstance attribute of a basic disk that is created together with the instance is set to true.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   ephemeral_ssd: local standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         * <p>*   cloud_auto: ESSD AutoPL disk.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The name of the data disk.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos extends TeaModel {
        /**
         * <p>Instance types that are excluded. You can use wildcard characters such as an asterisk (\*) to exclude a single instance type or an instance family. Example:</p>
         * <br>
         * <p>*   ecs.c6.large: The ecs.c6.large instance type is excluded.</p>
         * <p>*   ecs.c6.\*: The c6 instance family is excluded.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>The categories of the system disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The architecture type to which the instance type belongs. Valid values:</p>
         * <br>
         * <p>*   X86: x86 architecture.</p>
         * <p>*   Heterogeneous: heterogeneous architecture, such as GPUs and FPGAs.</p>
         * <p>*   BareMetal: ECS Bare Metal Instance architecture.</p>
         * <p>*   Arm: ARM architecture.</p>
         * <p>*   SuperComputeCluster: Super Computing Cluster architecture.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The categories of the system disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>Indicates whether burstable instance types are included. Valid values:</p>
         * <br>
         * <p>*   Exclude: Burstable instance types are not included.</p>
         * <p>*   Include: Burstable instance types are included.</p>
         * <p>*   Required: Only burstable instance types are included.</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The level of the instance family.</p>
         * <br>
         * <p>*   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).</p>
         * <p>*   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see [Instance family](~~25378~~).</p>
         * <p>*   CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [What are burstable instances?](~~59977~~)</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The architecture type to which the instance type belongs. Valid values:</p>
         * <br>
         * <p>*   X86: x86 architecture.</p>
         * <p>*   Heterogeneous: heterogeneous architecture, such as GPUs and FPGAs.</p>
         * <p>*   BareMetal: ECS Bare Metal Instance architecture.</p>
         * <p>*   Arm: ARM architecture.</p>
         * <p>*   SuperComputeCluster: Super Computing Cluster architecture.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions extends TeaModel {
        /**
         * <p>The algorithm that is used to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   AES-256</p>
         * <p>*   SM4-128</p>
         */
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits extends TeaModel {
        /**
         * <p>Details of the intelligent configuration settings, which determines the available instance types.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price for pay-as-you-go instances or preemptible instances.</p>
         */
        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags extends TeaModel {
        /**
         * <p>Details of the preemptible instances.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The instance type of the preemptible instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurations extends TeaModel {
        @NameInMap("PrivatePoolOptions")
        @Validation(required = true)
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         */
        @NameInMap("Affinity")
        public String affinity;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: You are charged for the maximum available bandwidth that is specified by the InternetMaxBandwidthOut parameter.</p>
         * <p>*   PayByTraffic: You are charged for the actual traffic that you used. The InternetMaxBandwidthOut parameter specifies only the maximum available bandwidth.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The name of the scaling configuration.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Details of the data disks.</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The description of the data disk.</p>
         */
        @NameInMap("DataDisks")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> dataDisks;

        /**
         * <p>Indicates whether the password preconfigured in the image is used.</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The time when the scaling configuration was created.</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 100.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the image that is used by Auto Scaling to create instances.</p>
         */
        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        /**
         * <p>The hostname of the ECS instance.</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   ephemeral_ssd: local standard SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud_auto: ESSD AutoPL disk</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The interruption mode of the preemptible instance.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The performance level (PL) of the system disk of the ESSD category.</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The memory size. Unit: GiB.</p>
         * <br>
         * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set the Cpu parameter to 2 and the Memory parameter to 16 to specify the instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.</p>
         * <br>
         * <p>> You can specify CPU and memory specifications to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
         */
        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        /**
         * <p>The user data of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The number of vCPUs that is allocated to the instance type.</p>
         */
        @NameInMap("InstancePatternInfos")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> instancePatternInfos;

        /**
         * <p>The name of the RAM role that is associated with the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IDs of the security groups with which the ECS instance is associated. ECS instances that are associated with the same security group can access each other.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <br>
         * <p>*   Standard: standard mode. For more information, see the "Standard mode" section of [Burstable instances](~~59977~~).</p>
         * <p>*   Unlimited: unlimited mode. For more information, see the "Unlimited mode" section of [Burstable instances](~~59977~~).</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>Indicates whether the instance is an I/O optimized instance. Valid values:</p>
         * <br>
         * <p>*   none: The instance is not I/O optimized.</p>
         * <p>*   optimized: The instance is I/O optimized.</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The description of the ECS instance.</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>The number of vCPUs.</p>
         * <br>
         * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set the Cpu parameter to 2 and the Memory parameter to 16 to specify the instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.</p>
         * <br>
         * <p>> You can specify CPU and memory specifications to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The state of the scaling configuration in the scaling group. Valid values:</p>
         * <br>
         * <p>*   Active: The scaling configuration is active in the scaling group. Auto Scaling uses active scaling configurations to automatically create ECS instances.</p>
         * <p>*   Inactive: The scaling configuration is inactive in the scaling group. Auto Scaling does not use inactive scaling configurations to automatically create ECS instances. Inactive scaling configurations are retained in the scaling group.</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The ID of the security group with which the ECS instance is associated. ECS instances that are associated with the same security group can access each other.</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>Indicates whether security hardening is enabled. Valid values:</p>
         * <br>
         * <p>*   Active: Security hardening is enabled. This value is available only for public images.</p>
         * <p>*   Deactive: Security hardening is disabled. This value is available for all types of images.</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The name of the system disk.</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The weight of the ECS instance as a backend server. Valid values: 1 to 100.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The name of the image family. If you specify this parameter, the latest custom images that are available in the specified image family are returned. You can use the images to create instances. If you specify the ImageId parameter, you cannot specify the ImageFamily parameter.</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>The ID of the resource group to which the ECS instance belongs.</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The name of the image file.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Details of the data disks.</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The description of the system disk.</p>
         */
        @NameInMap("ScalingConfigurationName")
        public String scalingConfigurationName;

        /**
         * <p>Indicates whether the instance is created on a dedicated host. Valid values:</p>
         * <br>
         * <p>*   default: does not create the instance on a dedicated host.</p>
         * <p>*   host: creates the instance on a dedicated host. If you do not specify the DedicatedHostId parameter, the system selects a dedicated host for the instance that is created.</p>
         * <br>
         * <p>Default value: default.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The ID of the KMS key that is used to encrypt the system disk.</p>
         */
        @NameInMap("SchedulerOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions schedulerOptions;

        /**
         * <p>The ID of the dedicated host on which the ECS instance runs. You cannot create preemptible instances on dedicated hosts. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit parameters are ignored.</p>
         * <br>
         * <p>You can call the DescribeDedicatedHosts operation to query dedicated host IDs.</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of the automatic snapshot policy that you want to apply to the system disk.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The PL of the data disk of the ESSD category.</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The price limit of the preemptible instance.</p>
         */
        @NameInMap("SpotPriceLimits")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> spotPriceLimits;

        /**
         * <p>Indicates whether the instance on the dedicated host is associated with the dedicated host. Valid values:</p>
         * <br>
         * <p>*   default: The instance is not associated with the dedicated host. If you start an instance that was stopped in economical mode and the original dedicated host of the instance has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</p>
         * <p>*   host: The instance is associated with the dedicated host. If you start an instance that was stopped in economical mode, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the instance fails to start.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The ID of the scaling group in which the scaling configuration is created.</p>
         */
        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        public String systemDiskAutoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set the `SystemDisk.Category` parameter to `cloud_auto`.</p>
         * <br>
         * <p>For more information, see [ESSD AutoPL disks](~~368372~~).</p>
         */
        @NameInMap("SystemDiskBurstingEnabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The weight of the instance type. The weight of an instance type indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity.</p>
         */
        @NameInMap("SystemDiskCategories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
         * <br>
         * <p>*   Valid values if you set the InternetChargeType parameter to PayByBandwidth: 0 to 100. If this parameter is not specified, 0 is used as the value of this parameter.</p>
         * <p>*   Valid values if you set the InternetChargeType parameter to PayByTraffic: 0 to 100. If this parameter is not specified, an error is reported.</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The name of the key pair that is used to log on to the ECS instance.</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>auditing</p>
         */
        @NameInMap("SystemDiskEncryptAlgorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>The IOPS metric that is preconfigured for the system disk.</p>
         * <br>
         * <p>> IOPS measures the number of read and write operations that an EBS device can process per second.</p>
         */
        @NameInMap("SystemDiskEncrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>Indicates whether the burst feature is enabled for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set the SystemDisk.Category parameter to cloud_auto.</p>
         */
        @NameInMap("SystemDiskKMSKeyId")
        public String systemDiskKMSKeyId;

        /**
         * <p>The instance type of the ECS instance.</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The zone ID of the ECS instance. You can call the DescribeZones operation to query the most recent zone list.</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Queries scaling configurations.</p>
         */
        @NameInMap("SystemDiskProvisionedIops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The retention period of the preemptible instance. Unit: hours.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tag value of the instance. Up to 20 tags are supported.</p>
         * <br>
         * <p>The tag value can be an empty string. The tag value must be 0 to 128 characters in length, and cannot start with `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> tags;

        /**
         * <p>The number of randomly generated IPv6 addresses that are allocated to the elastic network interface (ENI).</p>
         */
        @NameInMap("Tenancy")
        public String tenancy;

        /**
         * <p>The generation of the ECS instance.</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>Details of the ECS instance types.</p>
         */
        @NameInMap("WeightedCapacities")
        public java.util.List<Integer> weightedCapacities;

        /**
         * <p>The ID of the scaling configuration.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurations self = new DescribeScalingConfigurationsResponseBodyScalingConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setPrivatePoolOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDataDisks(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstancePatternInfos(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> instancePatternInfos) {
            this.instancePatternInfos = instancePatternInfos;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> getInstancePatternInfos() {
            return this.instancePatternInfos;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingConfigurationName(String scalingConfigurationName) {
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSchedulerOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotPriceLimits(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> spotPriceLimits) {
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
            this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskAutoSnapshotPolicyId() {
            return this.systemDiskAutoSnapshotPolicyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskKMSKeyId(String systemDiskKMSKeyId) {
            this.systemDiskKMSKeyId = systemDiskKMSKeyId;
            return this;
        }
        public String getSystemDiskKMSKeyId() {
            return this.systemDiskKMSKeyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setTags(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> getTags() {
            return this.tags;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setWeightedCapacities(java.util.List<Integer> weightedCapacities) {
            this.weightedCapacities = weightedCapacities;
            return this;
        }
        public java.util.List<Integer> getWeightedCapacities() {
            return this.weightedCapacities;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
