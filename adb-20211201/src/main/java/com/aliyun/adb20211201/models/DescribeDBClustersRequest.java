// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClustersRequest extends TeaModel {
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeDBClustersRequestTag> tag;

    public static DescribeDBClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersRequest self = new DescribeDBClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClustersRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public DescribeDBClustersRequest setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClustersRequest setTag(java.util.List<DescribeDBClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBClustersRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersRequestTag self = new DescribeDBClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
