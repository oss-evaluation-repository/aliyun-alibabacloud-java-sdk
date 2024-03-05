// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesResponseBody extends TeaModel {
    /**
     * <p>The detailed result of the request.</p>
     */
    @NameInMap("Detail")
    public String detail;

    @NameInMap("InstanceIds")
    public ApplyNodesResponseBodyInstanceIds instanceIds;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of the compute nodes that are created.</p>
     */
    @NameInMap("SatisfiedAmount")
    public Integer satisfiedAmount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ApplyNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyNodesResponseBody self = new ApplyNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyNodesResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public ApplyNodesResponseBody setInstanceIds(ApplyNodesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public ApplyNodesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public ApplyNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyNodesResponseBody setSatisfiedAmount(Integer satisfiedAmount) {
        this.satisfiedAmount = satisfiedAmount;
        return this;
    }
    public Integer getSatisfiedAmount() {
        return this.satisfiedAmount;
    }

    public ApplyNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class ApplyNodesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static ApplyNodesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesResponseBodyInstanceIds self = new ApplyNodesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public ApplyNodesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
