// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponseBody extends TeaModel {
    /**
     * <p>The execution results.</p>
     */
    @NameInMap("Invocation")
    public DescribeInvocationResultsResponseBodyInvocation invocation;

    /**
     * <p>The total number of the commands.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvocationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsResponseBody self = new DescribeInvocationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsResponseBody setInvocation(DescribeInvocationResultsResponseBodyInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    public DescribeInvocationResultsResponseBodyInvocation getInvocation() {
        return this.invocation;
    }

    public DescribeInvocationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag self = new DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag> tag;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags self = new DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags setTag(java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult extends TeaModel {
        /**
         * <p>The time when the command stopped being run on the instance. If you called the `StopInvocation` operation to manually stop the execution, the value is the time when you called the operation.</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The error message returned when the command is not successfully sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command is run normally.</p>
         * <p>*   the specified instance does not exists: The specified instance does not exist is released.</p>
         * <p>*   the instance has released when create task: The instance was released while the command was being run on the instance.</p>
         * <p>*   the instance is not running when create task: The instance is not in the Running state while the command is being run.</p>
         * <p>*   the command is not applicable: The command is not applicable to the specified instance.</p>
         * <p>*   the specified account does not exists: The specified account does not exist.</p>
         * <p>*   the specified directory does not exists: The specified directory does not exist.</p>
         * <p>*   the cron job expression is invalid: The cron expression that specifies the execution time is invalid.</p>
         * <p>*   the aliyun service is not running on the instance: The Cloud Assistance client is not running.</p>
         * <p>*   the aliyun service in the instance does not response: The Cloud Assistant client is not responding.</p>
         * <p>*   the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</p>
         * <p>*   the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   the command delivery has been timeout: The request to send the command timed out.</p>
         * <p>*   the command execution has been timeout: The command execution timed out.</p>
         * <p>*   the command execution got an exception: An exception occurred while the command is being run.</p>
         * <p>*   the command execution has been interrupted: The command execution was interrupted.</p>
         * <p>*   the command execution exit code is not zero: The command execution is complete, but the exit code is not 0.</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The name of the user who ran the command on the instance.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The execution state of the command.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The end time of the execution. If an execution times out, the end time of the execution is subject to the value of the TimedOut parameter specified in the [CreateCommand](~~64844~~) operation.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The ID of the container.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The exit code of the command execution.</p>
         * <br>
         * <p>*   For Linux instances, the value is the exit code of the shell command.</p>
         * <p>*   For Windows instances, the value is the exit code of the batch or PowerShell command.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The command output.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The tags of the command execution.</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The time when the command started to be run on the instance.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The size of the text that is truncated and discarded when the `Output` value exceeds 24 KB in size.</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The ID of the command execution.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The error code returned when the command cannot be sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command is run normally.</p>
         * <p>*   InstanceNotExists: The specified instance does not exist is released.</p>
         * <p>*   InstanceReleased: The instance was released while the command was being run on the instance.</p>
         * <p>*   InstanceNotRunning: The instance is not in the Running state while the command is being run.</p>
         * <p>*   CommandNotApplicable: The command is not applicable to the specified instance.</p>
         * <p>*   AccountNotExists: The specified account does not exist.</p>
         * <p>*   DirectoryNotExists: The specified directory does not exist.</p>
         * <p>*   BadCronExpression: The cron expression used to specify the execution time is invalid.</p>
         * <p>*   ClientNotRunning: The Cloud Assistant client is not running.</p>
         * <p>*   ClientNotResponse: The Cloud Assistant client is not responding.</p>
         * <p>*   ClientIsUpgrading: The Cloud Assistant client is being upgraded.</p>
         * <p>*   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   DeliveryTimeout: The request to send the command timed out.</p>
         * <p>*   ExecutionTimeout: The command execution timed out.</p>
         * <p>*   ExecutionException: An exception occurred while the command was being run.</p>
         * <p>*   ExecutionInterrupted: The execution was interrupted.</p>
         * <p>*   ExitCodeNonzero: The command execution is complete, but the exit code is not 0.</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("Tags")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags;

        /**
         * <p>The information about the tag.</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult self = new DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setTags(DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags getTags() {
            return this.tags;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult> invocationResult;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResults self = new DescribeInvocationResultsResponseBodyInvocationInvocationResults();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResults setInvocationResult(java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult> invocationResult) {
            this.invocationResult = invocationResult;
            return this;
        }
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocation extends TeaModel {
        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InvocationResults")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults;

        /**
         * <p>The number of times that the command is run on the instance.</p>
         * <br>
         * <p>*   If the command is set to run only once on the instance, the value is 0 or 1.</p>
         * <p>*   If the command is set to run on a schedule on the instance, the value is the number of times that the command is run.</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The execution state on a single instance. Valid values:</p>
         * <br>
         * <p>*   Pending: The command is being verified or sent.</p>
         * <br>
         * <p>*   Invalid: The specified command type or parameter is invalid.</p>
         * <br>
         * <p>*   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</p>
         * <br>
         * <p>*   Running: The command is being run on the instance.</p>
         * <br>
         * <p>*   Success:</p>
         * <br>
         * <p>    *   Command that is set to run only once: The execution is complete, and the exit code is 0.</p>
         * <p>    *   Command that is set to run on a schedule: The last execution succeeds, the exit code is 0, and the specified cycle ends.</p>
         * <br>
         * <p>*   Failed:</p>
         * <br>
         * <p>    *   Command that is set to run only once: The execution is complete, but the exit code is not 0.</p>
         * <p>    *   Command that is set to run on a schedule: The last execution is complete, the exit code is not 0, and the specified cycle is about to end.</p>
         * <br>
         * <p>*   Error: The execution cannot proceed due to an exception.</p>
         * <br>
         * <p>*   Timeout: The execution times out.</p>
         * <br>
         * <p>*   Cancelled: The execution is canceled, and the command is not run.</p>
         * <br>
         * <p>*   Stopping: The running command is being stopped.</p>
         * <br>
         * <p>*   Terminated: The command is terminated while it is being run.</p>
         * <br>
         * <p>*   Scheduled:</p>
         * <br>
         * <p>    *   Command that is set to run only once: The command is not applicable.</p>
         * <p>    *   Command that is set to run on a schedule: The command is waiting to be run.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The ID of the command.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeInvocationResultsResponseBodyInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocation self = new DescribeInvocationResultsResponseBodyInvocation();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocation setInvocationResults(DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults) {
            this.invocationResults = invocationResults;
            return this;
        }
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults getInvocationResults() {
            return this.invocationResults;
        }

        public DescribeInvocationResultsResponseBodyInvocation setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeInvocationResultsResponseBodyInvocation setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeInvocationResultsResponseBodyInvocation setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
