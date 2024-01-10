// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetOpsItemResponseBody extends TeaModel {
    /**
     * <p>The information about the O\&M item.</p>
     */
    @NameInMap("OpsItem")
    public GetOpsItemResponseBodyOpsItem opsItem;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOpsItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpsItemResponseBody self = new GetOpsItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpsItemResponseBody setOpsItem(GetOpsItemResponseBodyOpsItem opsItem) {
        this.opsItem = opsItem;
        return this;
    }
    public GetOpsItemResponseBodyOpsItem getOpsItem() {
        return this.opsItem;
    }

    public GetOpsItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOpsItemResponseBodyOpsItem extends TeaModel {
        /**
         * <p>The information about the attributes of the O\&M item.</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        /**
         * <p>The category of the O\&M item.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The user who created the O\&M item.</p>
         */
        @NameInMap("CreateBy")
        public String createBy;

        /**
         * <p>The time when the O\&M item was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user who last modified the O\&M item.</p>
         */
        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        /**
         * <p>The O\&M item ID.</p>
         */
        @NameInMap("OpsItemId")
        public String opsItemId;

        /**
         * <p>The priority of the O\&M item.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The Alibaba Cloud Resource Names (ARNs) of the associated resources.</p>
         */
        @NameInMap("Resources")
        public java.util.List<String> resources;

        /**
         * <p>The severity level of the O\&M item.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The solutions to the O\&M item.</p>
         */
        @NameInMap("Solutions")
        public java.util.List<java.util.Map<String, ?>> solutions;

        /**
         * <p>The source business of the O\&M item.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the O\&M item.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags attached to the O\&M item.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The title of the O\&M item.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the O\&M item was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetOpsItemResponseBodyOpsItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpsItemResponseBodyOpsItem self = new GetOpsItemResponseBodyOpsItem();
            return TeaModel.build(map, self);
        }

        public GetOpsItemResponseBodyOpsItem setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public GetOpsItemResponseBodyOpsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetOpsItemResponseBodyOpsItem setCreateBy(String createBy) {
            this.createBy = createBy;
            return this;
        }
        public String getCreateBy() {
            return this.createBy;
        }

        public GetOpsItemResponseBodyOpsItem setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetOpsItemResponseBodyOpsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOpsItemResponseBodyOpsItem setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public GetOpsItemResponseBodyOpsItem setOpsItemId(String opsItemId) {
            this.opsItemId = opsItemId;
            return this;
        }
        public String getOpsItemId() {
            return this.opsItemId;
        }

        public GetOpsItemResponseBodyOpsItem setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetOpsItemResponseBodyOpsItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetOpsItemResponseBodyOpsItem setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public GetOpsItemResponseBodyOpsItem setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetOpsItemResponseBodyOpsItem setSolutions(java.util.List<java.util.Map<String, ?>> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSolutions() {
            return this.solutions;
        }

        public GetOpsItemResponseBodyOpsItem setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetOpsItemResponseBodyOpsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetOpsItemResponseBodyOpsItem setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetOpsItemResponseBodyOpsItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetOpsItemResponseBodyOpsItem setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
