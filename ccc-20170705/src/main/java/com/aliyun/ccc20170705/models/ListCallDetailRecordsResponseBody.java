// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CallDetailRecords")
    public ListCallDetailRecordsResponseBodyCallDetailRecords callDetailRecords;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListCallDetailRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsResponseBody self = new ListCallDetailRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallDetailRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallDetailRecordsResponseBody setCallDetailRecords(ListCallDetailRecordsResponseBodyCallDetailRecords callDetailRecords) {
        this.callDetailRecords = callDetailRecords;
        return this;
    }
    public ListCallDetailRecordsResponseBodyCallDetailRecords getCallDetailRecords() {
        return this.callDetailRecords;
    }

    public ListCallDetailRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallDetailRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallDetailRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("QualityCheckTaskId")
        public String qualityCheckTaskId;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("FileDescription")
        public String fileDescription;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("QualityCheckTid")
        public String qualityCheckTid;

        public static ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording self = new ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setQualityCheckTaskId(String qualityCheckTaskId) {
            this.qualityCheckTaskId = qualityCheckTaskId;
            return this;
        }
        public String getQualityCheckTaskId() {
            return this.qualityCheckTaskId;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setQualityCheckTid(String qualityCheckTid) {
            this.qualityCheckTid = qualityCheckTid;
            return this;
        }
        public String getQualityCheckTid() {
            return this.qualityCheckTid;
        }

    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings extends TeaModel {
        @NameInMap("Recording")
        public java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording> recording;

        public static ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings self = new ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings setRecording(java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording> recording) {
            this.recording = recording;
            return this;
        }
        public java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording> getRecording() {
            return this.recording;
        }

    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent extends TeaModel {
        @NameInMap("Satisfaction")
        public String satisfaction;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("Feedback")
        public String feedback;

        public static ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent self = new ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setSatisfaction(String satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public String getSatisfaction() {
            return this.satisfaction;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents extends TeaModel {
        @NameInMap("CallDetailAgent")
        public java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent> callDetailAgent;

        public static ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents self = new ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents setCallDetailAgent(java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent> callDetailAgent) {
            this.callDetailAgent = callDetailAgent;
            return this;
        }
        public java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent> getCallDetailAgent() {
            return this.callDetailAgent;
        }

    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord extends TeaModel {
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupIdList")
        public String skillGroupIdList;

        @NameInMap("Recordings")
        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings recordings;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("Satisfaction")
        public Integer satisfaction;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Agents")
        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents agents;

        @NameInMap("SatisfactionDesc")
        public String satisfactionDesc;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("Feedback")
        public String feedback;

        public static ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord self = new ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSkillGroupIdList(String skillGroupIdList) {
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }
        public String getSkillGroupIdList() {
            return this.skillGroupIdList;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setRecordings(ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings recordings) {
            this.recordings = recordings;
            return this;
        }
        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings getRecordings() {
            return this.recordings;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSatisfaction(Integer satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setAgents(ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents agents) {
            this.agents = agents;
            return this;
        }
        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents getAgents() {
            return this.agents;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSatisfactionDesc(String satisfactionDesc) {
            this.satisfactionDesc = satisfactionDesc;
            return this;
        }
        public String getSatisfactionDesc() {
            return this.satisfactionDesc;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecordsList extends TeaModel {
        @NameInMap("CallDetailRecord")
        public java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord> callDetailRecord;

        public static ListCallDetailRecordsResponseBodyCallDetailRecordsList build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecordsList self = new ListCallDetailRecordsResponseBodyCallDetailRecordsList();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecordsList setCallDetailRecord(java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord> callDetailRecord) {
            this.callDetailRecord = callDetailRecord;
            return this;
        }
        public java.util.List<ListCallDetailRecordsResponseBodyCallDetailRecordsListCallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

    }

    public static class ListCallDetailRecordsResponseBodyCallDetailRecords extends TeaModel {
        @NameInMap("List")
        public ListCallDetailRecordsResponseBodyCallDetailRecordsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCallDetailRecordsResponseBodyCallDetailRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyCallDetailRecords self = new ListCallDetailRecordsResponseBodyCallDetailRecords();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecords setList(ListCallDetailRecordsResponseBodyCallDetailRecordsList list) {
            this.list = list;
            return this;
        }
        public ListCallDetailRecordsResponseBodyCallDetailRecordsList getList() {
            return this.list;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecords setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecords setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCallDetailRecordsResponseBodyCallDetailRecords setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
