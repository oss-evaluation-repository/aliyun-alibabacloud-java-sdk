// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoAnalyseTaskResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateVideoAnalyseTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoAnalyseTaskResponseBody self = new CreateVideoAnalyseTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoAnalyseTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateVideoAnalyseTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoAnalyseTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
