// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of team spaces.</p>
     */
    @NameInMap("CloudDriveGroups")
    public java.util.List<DescribeCloudDriveGroupsResponseBodyCloudDriveGroups> cloudDriveGroups;

    /**
     * <p>The total number of entries that is returned.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The token that is used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudDriveGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveGroupsResponseBody self = new DescribeCloudDriveGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveGroupsResponseBody setCloudDriveGroups(java.util.List<DescribeCloudDriveGroupsResponseBodyCloudDriveGroups> cloudDriveGroups) {
        this.cloudDriveGroups = cloudDriveGroups;
        return this;
    }
    public java.util.List<DescribeCloudDriveGroupsResponseBodyCloudDriveGroups> getCloudDriveGroups() {
        return this.cloudDriveGroups;
    }

    public DescribeCloudDriveGroupsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeCloudDriveGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDriveGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudDriveGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudDriveGroupsResponseBodyCloudDriveGroups extends TeaModel {
        /**
         * <p>The time when the team space was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The ID of the team space.</p>
         */
        @NameInMap("DriveId")
        public String driveId;

        /**
         * <p>The ID of the team.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the team space.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The status of the team space. Default value: enabled. Valid values:</p>
         * <br>
         * <p>*   Enabled: available</p>
         * <p>*   disabled: unavailable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total capacity of the team space.</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <p>The space that is used. Unit: bytes.</p>
         */
        @NameInMap("UsedSize")
        public String usedSize;

        public static DescribeCloudDriveGroupsResponseBodyCloudDriveGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDriveGroupsResponseBodyCloudDriveGroups self = new DescribeCloudDriveGroupsResponseBodyCloudDriveGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeCloudDriveGroupsResponseBodyCloudDriveGroups setUsedSize(String usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public String getUsedSize() {
            return this.usedSize;
        }

    }

}
