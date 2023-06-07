// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TaskInvocation extends TeaModel {
    @NameInMap("instanceID")
    public String instanceID;

    @NameInMap("invocationID")
    public String invocationID;

    @NameInMap("invocationTarget")
    public String invocationTarget;

    @NameInMap("output")
    public String output;

    @NameInMap("requestID")
    public String requestID;

    @NameInMap("status")
    public String status;

    public static TaskInvocation build(java.util.Map<String, ?> map) throws Exception {
        TaskInvocation self = new TaskInvocation();
        return TeaModel.build(map, self);
    }

    public TaskInvocation setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public TaskInvocation setInvocationID(String invocationID) {
        this.invocationID = invocationID;
        return this;
    }
    public String getInvocationID() {
        return this.invocationID;
    }

    public TaskInvocation setInvocationTarget(String invocationTarget) {
        this.invocationTarget = invocationTarget;
        return this;
    }
    public String getInvocationTarget() {
        return this.invocationTarget;
    }

    public TaskInvocation setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public TaskInvocation setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public TaskInvocation setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
