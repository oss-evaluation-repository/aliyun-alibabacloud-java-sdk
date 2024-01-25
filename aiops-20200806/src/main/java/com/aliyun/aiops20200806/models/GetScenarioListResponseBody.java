// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScenarioListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("PageTotal")
    public Long pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetScenarioListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioListResponseBody self = new GetScenarioListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenarioListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetScenarioListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetScenarioListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetScenarioListResponseBody setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Long getPageTotal() {
        return this.pageTotal;
    }

    public GetScenarioListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenarioListResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
