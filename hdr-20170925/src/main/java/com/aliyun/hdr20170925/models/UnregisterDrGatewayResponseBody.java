// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UnregisterDrGatewayResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    public static UnregisterDrGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDrGatewayResponseBody self = new UnregisterDrGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterDrGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnregisterDrGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnregisterDrGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnregisterDrGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UnregisterDrGatewayResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
