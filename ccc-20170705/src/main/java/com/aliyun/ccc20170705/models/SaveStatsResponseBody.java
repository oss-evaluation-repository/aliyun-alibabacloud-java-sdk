// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SaveStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RowCount")
    public Long rowCount;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SaveStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveStatsResponseBody self = new SaveStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveStatsResponseBody setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public SaveStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
