// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>174F6032-AA26-470D-B90E-36F0EB205BEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about tasks.</p>
     */
    @NameInMap("Tasks")
    public DescribeRefreshTasksResponseBodyTasks tasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTasksResponseBody self = new DescribeRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRefreshTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRefreshTasksResponseBody setTasks(DescribeRefreshTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeRefreshTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeRefreshTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRefreshTasksResponseBodyTasksCDNTask extends TeaModel {
        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-11-27T08:23:22Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of the error returned when the refresh or prefetch task failed. Valid values:</p>
         * <ul>
         * <li><strong>InternalError</strong>: An internal error occurred.</li>
         * <li><strong>OriginTimeout</strong>: The response from the origin server timed out.</li>
         * <li><strong>OriginReturnStatusCode 5XX</strong>: The origin server returned a 5XX error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the object refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/1.txt">http://example.com/1.txt</a></p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task.</p>
         * <ul>
         * <li><strong>file</strong>: refreshes one or more files.</li>
         * <li><strong>directory</strong>: refreshes files in the specified directories.</li>
         * <li><strong>regex</strong>: refreshes content based on a regular expression.</li>
         * <li><strong>preload</strong>: prefetches one or more files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The progress of the task, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Complete</strong>: The task has completed.</li>
         * <li><strong>Refreshing</strong>: The task is in progress.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>704225667</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeRefreshTasksResponseBodyTasksCDNTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshTasksResponseBodyTasksCDNTask self = new DescribeRefreshTasksResponseBodyTasksCDNTask();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeRefreshTasksResponseBodyTasks extends TeaModel {
        @NameInMap("CDNTask")
        public java.util.List<DescribeRefreshTasksResponseBodyTasksCDNTask> CDNTask;

        public static DescribeRefreshTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshTasksResponseBodyTasks self = new DescribeRefreshTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshTasksResponseBodyTasks setCDNTask(java.util.List<DescribeRefreshTasksResponseBodyTasksCDNTask> CDNTask) {
            this.CDNTask = CDNTask;
            return this;
        }
        public java.util.List<DescribeRefreshTasksResponseBodyTasksCDNTask> getCDNTask() {
            return this.CDNTask;
        }

    }

}
