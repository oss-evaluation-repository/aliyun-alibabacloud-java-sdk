// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListNotAuthorizedUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("List")
    public java.util.List<Long> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static ListNotAuthorizedUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotAuthorizedUidResponseBody self = new ListNotAuthorizedUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotAuthorizedUidResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNotAuthorizedUidResponseBody setList(java.util.List<Long> list) {
        this.list = list;
        return this;
    }
    public java.util.List<Long> getList() {
        return this.list;
    }

    public ListNotAuthorizedUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNotAuthorizedUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotAuthorizedUidResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
