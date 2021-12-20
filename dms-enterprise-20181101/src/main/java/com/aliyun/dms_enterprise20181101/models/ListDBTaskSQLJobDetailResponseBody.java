// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobDetailResponseBody extends TeaModel {
    @NameInMap("DBTaskSQLJobDetailList")
    public java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> DBTaskSQLJobDetailList;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDBTaskSQLJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobDetailResponseBody self = new ListDBTaskSQLJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobDetailResponseBody setDBTaskSQLJobDetailList(java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> DBTaskSQLJobDetailList) {
        this.DBTaskSQLJobDetailList = DBTaskSQLJobDetailList;
        return this;
    }
    public java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> getDBTaskSQLJobDetailList() {
        return this.DBTaskSQLJobDetailList;
    }

    public ListDBTaskSQLJobDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDBTaskSQLJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDBTaskSQLJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDBTaskSQLJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDBTaskSQLJobDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList extends TeaModel {
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("CurrentSql")
        public String currentSql;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecuteCount")
        public Long executeCount;

        @NameInMap("JobDetailId")
        public Long jobDetailId;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("Log")
        public String log;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeDelay")
        public Long timeDelay;

        public static ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList self = new ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList();
            return TeaModel.build(map, self);
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setCurrentSql(String currentSql) {
            this.currentSql = currentSql;
            return this;
        }
        public String getCurrentSql() {
            return this.currentSql;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setExecuteCount(Long executeCount) {
            this.executeCount = executeCount;
            return this;
        }
        public Long getExecuteCount() {
            return this.executeCount;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setJobDetailId(Long jobDetailId) {
            this.jobDetailId = jobDetailId;
            return this;
        }
        public Long getJobDetailId() {
            return this.jobDetailId;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setTimeDelay(Long timeDelay) {
            this.timeDelay = timeDelay;
            return this;
        }
        public Long getTimeDelay() {
            return this.timeDelay;
        }

    }

}
