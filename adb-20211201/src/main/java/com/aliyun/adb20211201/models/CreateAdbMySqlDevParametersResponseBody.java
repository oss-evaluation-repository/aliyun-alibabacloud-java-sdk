// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAdbMySqlDevParametersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAdbMySqlDevParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdbMySqlDevParametersResponseBody self = new CreateAdbMySqlDevParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdbMySqlDevParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAdbMySqlDevParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAdbMySqlDevParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
