// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeDataMaskingRunHistoryResponseBodyItems> items;

    public static DescribeDataMaskingRunHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingRunHistoryResponseBody self = new DescribeDataMaskingRunHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingRunHistoryResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingRunHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataMaskingRunHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingRunHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDataMaskingRunHistoryResponseBody setItems(java.util.List<DescribeDataMaskingRunHistoryResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataMaskingRunHistoryResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeDataMaskingRunHistoryResponseBodyItems extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("SrcType")
        public Integer srcType;

        @NameInMap("SrcTableName")
        public String srcTableName;

        @NameInMap("MaskingCount")
        public Long maskingCount;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("DstType")
        public Integer dstType;

        @NameInMap("FailMsg")
        public String failMsg;

        @NameInMap("FailCode")
        public String failCode;

        @NameInMap("ConflictCount")
        public Long conflictCount;

        @NameInMap("DstTypeCode")
        public String dstTypeCode;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("RunIndex")
        public Integer runIndex;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("HasSubProcess")
        public Integer hasSubProcess;

        @NameInMap("HasDownloadFile")
        public Integer hasDownloadFile;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("SrcTypeCode")
        public String srcTypeCode;

        @NameInMap("Id")
        public Long id;

        public static DescribeDataMaskingRunHistoryResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataMaskingRunHistoryResponseBodyItems self = new DescribeDataMaskingRunHistoryResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setSrcTableName(String srcTableName) {
            this.srcTableName = srcTableName;
            return this;
        }
        public String getSrcTableName() {
            return this.srcTableName;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setMaskingCount(Long maskingCount) {
            this.maskingCount = maskingCount;
            return this;
        }
        public Long getMaskingCount() {
            return this.maskingCount;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setDstType(Integer dstType) {
            this.dstType = dstType;
            return this;
        }
        public Integer getDstType() {
            return this.dstType;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setConflictCount(Long conflictCount) {
            this.conflictCount = conflictCount;
            return this;
        }
        public Long getConflictCount() {
            return this.conflictCount;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setDstTypeCode(String dstTypeCode) {
            this.dstTypeCode = dstTypeCode;
            return this;
        }
        public String getDstTypeCode() {
            return this.dstTypeCode;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setRunIndex(Integer runIndex) {
            this.runIndex = runIndex;
            return this;
        }
        public Integer getRunIndex() {
            return this.runIndex;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setHasSubProcess(Integer hasSubProcess) {
            this.hasSubProcess = hasSubProcess;
            return this;
        }
        public Integer getHasSubProcess() {
            return this.hasSubProcess;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setHasDownloadFile(Integer hasDownloadFile) {
            this.hasDownloadFile = hasDownloadFile;
            return this;
        }
        public Integer getHasDownloadFile() {
            return this.hasDownloadFile;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setSrcTypeCode(String srcTypeCode) {
            this.srcTypeCode = srcTypeCode;
            return this;
        }
        public String getSrcTypeCode() {
            return this.srcTypeCode;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
