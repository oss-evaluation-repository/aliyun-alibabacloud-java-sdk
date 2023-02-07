// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultData")
    public ListHotlineRecordDetailResponseBodyResultData resultData;

    @NameInMap("Success")
    public Boolean success;

    public static ListHotlineRecordDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordDetailResponseBody self = new ListHotlineRecordDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineRecordDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotlineRecordDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineRecordDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotlineRecordDetailResponseBody setResultData(ListHotlineRecordDetailResponseBodyResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public ListHotlineRecordDetailResponseBodyResultData getResultData() {
        return this.resultData;
    }

    public ListHotlineRecordDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotlineRecordDetailResponseBodyResultDataData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListHotlineRecordDetailResponseBodyResultDataData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordDetailResponseBodyResultDataData self = new ListHotlineRecordDetailResponseBodyResultDataData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListHotlineRecordDetailResponseBodyResultData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Data")
        public java.util.List<ListHotlineRecordDetailResponseBodyResultDataData> data;

        @NameInMap("OnePageSize")
        public Long onePageSize;

        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("TotalResults")
        public Long totalResults;

        public static ListHotlineRecordDetailResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordDetailResponseBodyResultData self = new ListHotlineRecordDetailResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordDetailResponseBodyResultData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListHotlineRecordDetailResponseBodyResultData setData(java.util.List<ListHotlineRecordDetailResponseBodyResultDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHotlineRecordDetailResponseBodyResultDataData> getData() {
            return this.data;
        }

        public ListHotlineRecordDetailResponseBodyResultData setOnePageSize(Long onePageSize) {
            this.onePageSize = onePageSize;
            return this;
        }
        public Long getOnePageSize() {
            return this.onePageSize;
        }

        public ListHotlineRecordDetailResponseBodyResultData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListHotlineRecordDetailResponseBodyResultData setTotalResults(Long totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Long getTotalResults() {
            return this.totalResults;
        }

    }

}
