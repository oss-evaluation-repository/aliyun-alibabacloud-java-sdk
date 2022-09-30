// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIProjectsResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<SearchOmsOpenAPIProjectsResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public SearchOmsOpenAPIProjectsResponseBodyErrorDetail errorDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchOmsOpenAPIProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIProjectsResponseBody self = new SearchOmsOpenAPIProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIProjectsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public SearchOmsOpenAPIProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchOmsOpenAPIProjectsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public SearchOmsOpenAPIProjectsResponseBody setData(java.util.List<SearchOmsOpenAPIProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchOmsOpenAPIProjectsResponseBodyData> getData() {
        return this.data;
    }

    public SearchOmsOpenAPIProjectsResponseBody setErrorDetail(SearchOmsOpenAPIProjectsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public SearchOmsOpenAPIProjectsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public SearchOmsOpenAPIProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchOmsOpenAPIProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchOmsOpenAPIProjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchOmsOpenAPIProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchOmsOpenAPIProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchOmsOpenAPIProjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataDestConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("MsgTags")
        public String msgTags;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("PartitionMode")
        public String partitionMode;

        @NameInMap("ProducerGroup")
        public String producerGroup;

        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        public String serializerType;

        @NameInMap("TopicType")
        public String topicType;

        public static SearchOmsOpenAPIProjectsResponseBodyDataDestConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataDestConfig self = new SearchOmsOpenAPIProjectsResponseBodyDataDestConfig();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataLabels extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static SearchOmsOpenAPIProjectsResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataLabels self = new SearchOmsOpenAPIProjectsResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataLabels setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataLabels setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("MsgTags")
        public String msgTags;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("PartitionMode")
        public String partitionMode;

        @NameInMap("ProducerGroup")
        public String producerGroup;

        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        public String serializerType;

        @NameInMap("TopicType")
        public String topicType;

        public static SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig self = new SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails self = new SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDetails")
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        @NameInMap("FailedTime")
        public String failedTime;

        public static SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo self = new SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo setErrorDetails(java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview extends TeaModel {
        @NameInMap("EstimatedRemainingTimeOfSec")
        public Long estimatedRemainingTimeOfSec;

        @NameInMap("EstimatedTotalCount")
        public Long estimatedTotalCount;

        @NameInMap("FinishedCount")
        public Long finishedCount;

        @NameInMap("Progress")
        public Integer progress;

        public static SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview self = new SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
            this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
            return this;
        }
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview setEstimatedTotalCount(Long estimatedTotalCount) {
            this.estimatedTotalCount = estimatedTotalCount;
            return this;
        }
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConnectorFullProgressOverview")
        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview connectorFullProgressOverview;

        @NameInMap("DeployId")
        public String deployId;

        @NameInMap("DstIops")
        public Long dstIops;

        @NameInMap("DstRps")
        public Long dstRps;

        @NameInMap("DstRpsRef")
        public Long dstRpsRef;

        @NameInMap("DstRt")
        public Long dstRt;

        @NameInMap("DstRtRef")
        public Long dstRtRef;

        @NameInMap("Gmt")
        public Long gmt;

        @NameInMap("Inconsistencies")
        public Long inconsistencies;

        @NameInMap("IncrTimestampCheckpoint")
        public Long incrTimestampCheckpoint;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProcessedRecords")
        public Long processedRecords;

        @NameInMap("Skipped")
        public Boolean skipped;

        @NameInMap("SrcIops")
        public Long srcIops;

        @NameInMap("SrcIopsRef")
        public Long srcIopsRef;

        @NameInMap("SrcRps")
        public Long srcRps;

        @NameInMap("SrcRpsRef")
        public Long srcRpsRef;

        @NameInMap("SrcRt")
        public Long srcRt;

        @NameInMap("SrcRtRef")
        public Long srcRtRef;

        @NameInMap("Validated")
        public Boolean validated;

        public static SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo self = new SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setConnectorFullProgressOverview(SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview connectorFullProgressOverview) {
            this.connectorFullProgressOverview = connectorFullProgressOverview;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfoConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setDeployId(String deployId) {
            this.deployId = deployId;
            return this;
        }
        public String getDeployId() {
            return this.deployId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setDstIops(Long dstIops) {
            this.dstIops = dstIops;
            return this;
        }
        public Long getDstIops() {
            return this.dstIops;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setDstRps(Long dstRps) {
            this.dstRps = dstRps;
            return this;
        }
        public Long getDstRps() {
            return this.dstRps;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setDstRpsRef(Long dstRpsRef) {
            this.dstRpsRef = dstRpsRef;
            return this;
        }
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setDstRt(Long dstRt) {
            this.dstRt = dstRt;
            return this;
        }
        public Long getDstRt() {
            return this.dstRt;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setDstRtRef(Long dstRtRef) {
            this.dstRtRef = dstRtRef;
            return this;
        }
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setInconsistencies(Long inconsistencies) {
            this.inconsistencies = inconsistencies;
            return this;
        }
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
            this.incrTimestampCheckpoint = incrTimestampCheckpoint;
            return this;
        }
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setProcessedRecords(Long processedRecords) {
            this.processedRecords = processedRecords;
            return this;
        }
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSkipped(Boolean skipped) {
            this.skipped = skipped;
            return this;
        }
        public Boolean getSkipped() {
            return this.skipped;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSrcIops(Long srcIops) {
            this.srcIops = srcIops;
            return this;
        }
        public Long getSrcIops() {
            return this.srcIops;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSrcIopsRef(Long srcIopsRef) {
            this.srcIopsRef = srcIopsRef;
            return this;
        }
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSrcRps(Long srcRps) {
            this.srcRps = srcRps;
            return this;
        }
        public Long getSrcRps() {
            return this.srcRps;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSrcRpsRef(Long srcRpsRef) {
            this.srcRpsRef = srcRpsRef;
            return this;
        }
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSrcRt(Long srcRt) {
            this.srcRt = srcRt;
            return this;
        }
        public Long getSrcRt() {
            return this.srcRt;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setSrcRtRef(Long srcRtRef) {
            this.srcRtRef = srcRtRef;
            return this;
        }
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo setValidated(Boolean validated) {
            this.validated = validated;
            return this;
        }
        public Boolean getValidated() {
            return this.validated;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataSteps extends TeaModel {
        @NameInMap("EstimatedRemainingSeconds")
        public Long estimatedRemainingSeconds;

        @NameInMap("ExtraInfo")
        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo extraInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Interactive")
        public Boolean interactive;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepDescription")
        public String stepDescription;

        @NameInMap("StepInfo")
        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo stepInfo;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("StepOrder")
        public Integer stepOrder;

        @NameInMap("StepProgress")
        public Integer stepProgress;

        @NameInMap("StepStatus")
        public String stepStatus;

        public static SearchOmsOpenAPIProjectsResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataSteps self = new SearchOmsOpenAPIProjectsResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
            this.estimatedRemainingSeconds = estimatedRemainingSeconds;
            return this;
        }
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setExtraInfo(SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataStepsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStepDescription(String stepDescription) {
            this.stepDescription = stepDescription;
            return this;
        }
        public String getStepDescription() {
            return this.stepDescription;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStepInfo(SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataStepsStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStepProgress(Integer stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema self = new SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Type")
        public String type;

        @NameInMap("WhereClause")
        public String whereClause;

        public static SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables self = new SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setAdbTableSchema(SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Tables")
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Type")
        public String type;

        public static SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases self = new SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases setTables(java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases> databases;

        @NameInMap("Mode")
        public String mode;

        public static SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping self = new SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping setDatabases(java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig extends TeaModel {
        @NameInMap("RecordTypeList")
        public java.util.List<String> recordTypeList;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        public Long storeLogKeptHour;

        @NameInMap("StoreTransactionEnabled")
        public Boolean storeTransactionEnabled;

        @NameInMap("TransferStepType")
        public String transferStepType;

        public static SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig self = new SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setRecordTypeList(java.util.List<String> recordTypeList) {
            this.recordTypeList = recordTypeList;
            return this;
        }
        public java.util.List<String> getRecordTypeList() {
            return this.recordTypeList;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStoreLogKeptHour(Long storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Long getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStoreTransactionEnabled(Boolean storeTransactionEnabled) {
            this.storeTransactionEnabled = storeTransactionEnabled;
            return this;
        }
        public Boolean getStoreTransactionEnabled() {
            return this.storeTransactionEnabled;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setTransferStepType(String transferStepType) {
            this.transferStepType = transferStepType;
            return this;
        }
        public String getTransferStepType() {
            return this.transferStepType;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig extends TeaModel {
        @NameInMap("EnableFullSync")
        public Boolean enableFullSync;

        @NameInMap("EnableIncrSync")
        public Boolean enableIncrSync;

        @NameInMap("EnableStructSync")
        public Boolean enableStructSync;

        @NameInMap("IncrSyncStepTransferConfig")
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig;

        public static SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig self = new SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig setEnableFullSync(Boolean enableFullSync) {
            this.enableFullSync = enableFullSync;
            return this;
        }
        public Boolean getEnableFullSync() {
            return this.enableFullSync;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig setEnableIncrSync(Boolean enableIncrSync) {
            this.enableIncrSync = enableIncrSync;
            return this;
        }
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig setEnableStructSync(Boolean enableStructSync) {
            this.enableStructSync = enableStructSync;
            return this;
        }
        public Boolean getEnableStructSync() {
            return this.enableStructSync;
        }

        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig setIncrSyncStepTransferConfig(SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig) {
            this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
            return this.incrSyncStepTransferConfig;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyData extends TeaModel {
        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("DestConfig")
        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig destConfig;

        @NameInMap("Labels")
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataLabels> labels;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectOwner")
        public String projectOwner;

        @NameInMap("SourceConfig")
        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig sourceConfig;

        @NameInMap("Steps")
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataSteps> steps;

        @NameInMap("TransferMapping")
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping transferMapping;

        @NameInMap("TransferStepConfig")
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig transferStepConfig;

        public static SearchOmsOpenAPIProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyData self = new SearchOmsOpenAPIProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setDestConfig(SearchOmsOpenAPIProjectsResponseBodyDataDestConfig destConfig) {
            this.destConfig = destConfig;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataDestConfig getDestConfig() {
            return this.destConfig;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setLabels(java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setProjectOwner(String projectOwner) {
            this.projectOwner = projectOwner;
            return this;
        }
        public String getProjectOwner() {
            return this.projectOwner;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setSourceConfig(SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataSourceConfig getSourceConfig() {
            return this.sourceConfig;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setSteps(java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<SearchOmsOpenAPIProjectsResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setTransferMapping(SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping transferMapping) {
            this.transferMapping = transferMapping;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        public SearchOmsOpenAPIProjectsResponseBodyData setTransferStepConfig(SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig transferStepConfig) {
            this.transferStepConfig = transferStepConfig;
            return this;
        }
        public SearchOmsOpenAPIProjectsResponseBodyDataTransferStepConfig getTransferStepConfig() {
            return this.transferStepConfig;
        }

    }

    public static class SearchOmsOpenAPIProjectsResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static SearchOmsOpenAPIProjectsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIProjectsResponseBodyErrorDetail self = new SearchOmsOpenAPIProjectsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIProjectsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SearchOmsOpenAPIProjectsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SearchOmsOpenAPIProjectsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SearchOmsOpenAPIProjectsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
