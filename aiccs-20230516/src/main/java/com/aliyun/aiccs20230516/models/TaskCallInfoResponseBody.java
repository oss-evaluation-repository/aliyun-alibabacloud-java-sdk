// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public TaskCallInfoResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static TaskCallInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskCallInfoResponseBody self = new TaskCallInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskCallInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TaskCallInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskCallInfoResponseBody setModel(TaskCallInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public TaskCallInfoResponseBodyModel getModel() {
        return this.model;
    }

    public TaskCallInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskCallInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TaskCallInfoResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class TaskCallInfoResponseBodyModel extends TeaModel {
        @NameInMap("FinishTotal")
        public Long finishTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("UnCallTotal")
        public Long unCallTotal;

        public static TaskCallInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            TaskCallInfoResponseBodyModel self = new TaskCallInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public TaskCallInfoResponseBodyModel setFinishTotal(Long finishTotal) {
            this.finishTotal = finishTotal;
            return this;
        }
        public Long getFinishTotal() {
            return this.finishTotal;
        }

        public TaskCallInfoResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public TaskCallInfoResponseBodyModel setUnCallTotal(Long unCallTotal) {
            this.unCallTotal = unCallTotal;
            return this;
        }
        public Long getUnCallTotal() {
            return this.unCallTotal;
        }

    }

}
