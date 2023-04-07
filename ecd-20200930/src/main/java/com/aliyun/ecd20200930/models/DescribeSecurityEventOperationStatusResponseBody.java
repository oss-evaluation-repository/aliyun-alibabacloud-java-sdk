// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the processing status of alerts.</p>
     */
    @NameInMap("SecurityEventOperationStatuses")
    public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses> securityEventOperationStatuses;

    /**
     * <p>The status of the task that handles the alerts. Valid values:</p>
     * <br>
     * <p>*   Processing: The task is being executed.</p>
     * <p>*   Success: The task is executed.</p>
     * <p>*   Failure: The task failed.</p>
     * <p>*   Pending: The task is waiting to be executed.</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static DescribeSecurityEventOperationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusResponseBody self = new DescribeSecurityEventOperationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationStatusResponseBody setSecurityEventOperationStatuses(java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses> securityEventOperationStatuses) {
        this.securityEventOperationStatuses = securityEventOperationStatuses;
        return this;
    }
    public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
        return this.securityEventOperationStatuses;
    }

    public DescribeSecurityEventOperationStatusResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static class DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses extends TeaModel {
        /**
         * <p>The code that indicates the processing result of the alert.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the alert.</p>
         */
        @NameInMap("SecurityEventId")
        public Long securityEventId;

        /**
         * <p>The processing status of the alert. Valid values:</p>
         * <br>
         * <p>*   Processing: The alert is being processed.</p>
         * <p>*   Success: The alert is processed.</p>
         * <p>*   Failed: The alert failed to be processed.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses self = new DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
