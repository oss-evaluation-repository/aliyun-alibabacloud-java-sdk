// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIMRobotResponseBody extends TeaModel {
    // Indicates whether the IM bot was successfully deleted.
    // 
    // *   `true`: The specified data is deleted.
    // *   `false`: The specified data fails to be deleted.
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIMRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIMRobotResponseBody self = new DeleteIMRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIMRobotResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteIMRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
