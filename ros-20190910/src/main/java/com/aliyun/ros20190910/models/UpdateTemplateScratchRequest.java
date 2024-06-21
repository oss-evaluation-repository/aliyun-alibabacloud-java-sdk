// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the scenario.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li>Async (default)</li>
     * <li>Sync</li>
     * </ul>
     * <blockquote>
     * <p>If you have a wide scope of resources, Sync takes longer. If you set ExecutionMode to Sync, we recommend that you specify ClientToken to prevent the execution timeout.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The policy based on which the logical ID is generated. Valid values:</p>
     * <ul>
     * <li>LongTypePrefixAndIndexSuffix: long-type prefix + index-type suffix</li>
     * <li>LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</li>
     * <li>ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</li>
     * </ul>
     * <blockquote>
     * <p> If you set TemplateScratchType to ArchitectureDetection, the default value of LogicalIdStrategy is LongTypePrefixAndHashSuffix. In other cases, the default value of LogicalIdStrategy is LongTypePrefixAndIndexSuffix.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LongTypePrefixAndIndexSuffix</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The preference parameters of the resource scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    /**
     * <p>The region ID of the scenario.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source resource group.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: SourceResources, SourceTag, and SourceResourceGroup.</p>
     * </blockquote>
     */
    @NameInMap("SourceResourceGroup")
    public UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup;

    /**
     * <p>The source resources.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: SourceResources, SourceTag, and SourceResourceGroup.</p>
     * </blockquote>
     */
    @NameInMap("SourceResources")
    public java.util.List<UpdateTemplateScratchRequestSourceResources> sourceResources;

    /**
     * <p>The source tag.</p>
     * <blockquote>
     * <p> You must specify only one of the following parameters: SourceResources, SourceTag, and SourceResourceGroup.</p>
     * </blockquote>
     */
    @NameInMap("SourceTag")
    public UpdateTemplateScratchRequestSourceTag sourceTag;

    /**
     * <p>The ID of the resource scenario.</p>
     * <p>The valid values of the ParameterKey and ParameterValue request parameters vary based on the IDs of different types of resource scenarios. For more information, see the &quot;Additional information about request parameters&quot; section of this topic.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/610832.html">ListTemplateScratches</a> operation to query the ID of a resource scenario.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ts-7f7a704cf71c49a6****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static UpdateTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateScratchRequest self = new UpdateTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateScratchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTemplateScratchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateScratchRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public UpdateTemplateScratchRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public UpdateTemplateScratchRequest setPreferenceParameters(java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters) {
        this.preferenceParameters = preferenceParameters;
        return this;
    }
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> getPreferenceParameters() {
        return this.preferenceParameters;
    }

    public UpdateTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateScratchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateTemplateScratchRequest setSourceResourceGroup(UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup) {
        this.sourceResourceGroup = sourceResourceGroup;
        return this;
    }
    public UpdateTemplateScratchRequestSourceResourceGroup getSourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    public UpdateTemplateScratchRequest setSourceResources(java.util.List<UpdateTemplateScratchRequestSourceResources> sourceResources) {
        this.sourceResources = sourceResources;
        return this;
    }
    public java.util.List<UpdateTemplateScratchRequestSourceResources> getSourceResources() {
        return this.sourceResources;
    }

    public UpdateTemplateScratchRequest setSourceTag(UpdateTemplateScratchRequestSourceTag sourceTag) {
        this.sourceTag = sourceTag;
        return this;
    }
    public UpdateTemplateScratchRequestSourceTag getSourceTag() {
        return this.sourceTag;
    }

    public UpdateTemplateScratchRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static class UpdateTemplateScratchRequestPreferenceParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * <p>For more information about the valid values of ParameterKey, see the &quot;<strong>Additional information about request parameters</strong>&quot; section of this topic.</p>
         * <blockquote>
         * <ul>
         * <li>PreferenceParameters is optional. If you specify PreferenceParameters, you must specify both ParameterKey and ParameterValue.</li>
         * <li>If you set TemplateScratchType to ResourceImport, you must set ParameterKey to DeletionPolicy.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DeletionPolicy</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The parameter value. The value of ParameterValue varies based on the value of ParameterKey.</p>
         * <p>For more information about the valid values of ParameterKey, see the &quot;<strong>Additional information about request parameters</strong>&quot; section of this topic.</p>
         * <blockquote>
         * <p> PreferenceParameters is optional. If you specify PreferenceParameters, you must specify both ParameterKey and ParameterValue.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateTemplateScratchRequestPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestPreferenceParameters self = new UpdateTemplateScratchRequestPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateTemplateScratchRequestPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateTemplateScratchRequestSourceResourceGroup extends TeaModel {
        /**
         * <p>The ID of the source resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource types for filtering resources.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static UpdateTemplateScratchRequestSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceResourceGroup self = new UpdateTemplateScratchRequestSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateTemplateScratchRequestSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class UpdateTemplateScratchRequestSourceResources extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1m6fww66xbntjyc****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static UpdateTemplateScratchRequestSourceResources build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceResources self = new UpdateTemplateScratchRequestSourceResources();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateTemplateScratchRequestSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class UpdateTemplateScratchRequestSourceTag extends TeaModel {
        /**
         * <p>The source tags. A tag contains a tag key and a tag value.</p>
         * <p>If you want to specify only the tag key, you must leave the tag value empty. Example: {&quot;TagKey&quot;: &quot;&quot;}.</p>
         * <p>If you set TemplateScratchType to ArchitectureDetection, you can add up to 5 source tags. In other cases, you can add up to 10 source tags.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;b&quot;}</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The resource types for filtering resources.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static UpdateTemplateScratchRequestSourceTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceTag self = new UpdateTemplateScratchRequestSourceTag();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public UpdateTemplateScratchRequestSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

}
