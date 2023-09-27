// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoSourceCodeRepoResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRepoSourceCodeRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoSourceCodeRepoResponseBody self = new UpdateRepoSourceCodeRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRepoSourceCodeRepoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRepoSourceCodeRepoResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateRepoSourceCodeRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
