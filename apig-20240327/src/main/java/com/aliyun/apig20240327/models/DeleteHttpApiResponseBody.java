// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteHttpApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5B626361-070A-56A7-B127-ADAC8F3655DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpApiResponseBody self = new DeleteHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
