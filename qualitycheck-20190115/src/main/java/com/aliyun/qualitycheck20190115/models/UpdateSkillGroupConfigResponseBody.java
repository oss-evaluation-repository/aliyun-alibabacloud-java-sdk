// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSkillGroupConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupConfigResponseBody self = new UpdateSkillGroupConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSkillGroupConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSkillGroupConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSkillGroupConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
