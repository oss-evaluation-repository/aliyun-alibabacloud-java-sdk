// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAcceleratorsRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **init**: The GA instance is being initialized.</p>
     * <p>*   **active**: The GA instance is available.</p>
     * <p>*   **configuring**: The GA instance is being configured.</p>
     * <p>*   **binding**: The GA instance is being associated.</p>
     * <p>*   **unbinding**: The GA instance is being disassociated.</p>
     * <p>*   **deleting**: The GA instance is being deleted.</p>
     * <p>*   **finacialLocked**: The GA instance is locked due to overdue payments.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tags of the GA instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAcceleratorsRequestTag> tag;

    public static ListAcceleratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAcceleratorsRequest self = new ListAcceleratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAcceleratorsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListAcceleratorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAcceleratorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAcceleratorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAcceleratorsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAcceleratorsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListAcceleratorsRequest setTag(java.util.List<ListAcceleratorsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAcceleratorsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAcceleratorsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the GA resource. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the GA resource. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag values.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAcceleratorsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsRequestTag self = new ListAcceleratorsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAcceleratorsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
