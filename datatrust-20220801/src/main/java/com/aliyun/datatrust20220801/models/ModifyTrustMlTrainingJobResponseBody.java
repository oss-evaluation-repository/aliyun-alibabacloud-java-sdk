// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustMlTrainingJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyTrustMlTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustMlTrainingJobResponseBody self = new ModifyTrustMlTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTrustMlTrainingJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ModifyTrustMlTrainingJobResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyTrustMlTrainingJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyTrustMlTrainingJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyTrustMlTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTrustMlTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
