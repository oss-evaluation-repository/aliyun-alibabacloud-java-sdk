// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneSystemModelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Total")
    public Long total;

    public static DescribeSceneSystemModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneSystemModelResponseBody self = new DescribeSceneSystemModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneSystemModelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSceneSystemModelResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public DescribeSceneSystemModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSceneSystemModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneSystemModelResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSceneSystemModelResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
