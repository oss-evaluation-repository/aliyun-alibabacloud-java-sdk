// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileShareLinkResponseBody extends TeaModel {
    /**
     * <p>The modification result. The value success indicates that the modification is successful. If the modification failed, an error message is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data information.</p>
     */
    @NameInMap("Data")
    public CdsFileShareLinkModel data;

    /**
     * <p>The error message that is returned. This parameter is not returned if the value of Code is success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyCdsFileShareLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileShareLinkResponseBody self = new ModifyCdsFileShareLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileShareLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCdsFileShareLinkResponseBody setData(CdsFileShareLinkModel data) {
        this.data = data;
        return this;
    }
    public CdsFileShareLinkModel getData() {
        return this.data;
    }

    public ModifyCdsFileShareLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCdsFileShareLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCdsFileShareLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
