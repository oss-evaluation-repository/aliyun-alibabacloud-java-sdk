// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnCredentialsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTurnCredentialsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTurnCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTurnCredentialsResponseBody self = new GetTurnCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTurnCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTurnCredentialsResponseBody setData(GetTurnCredentialsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTurnCredentialsResponseBodyData getData() {
        return this.data;
    }

    public GetTurnCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTurnCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTurnCredentialsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetTurnCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTurnCredentialsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M0NQNG/uRUrfIxW7er/S9gKX****</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>1602585817:****</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetTurnCredentialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTurnCredentialsResponseBodyData self = new GetTurnCredentialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTurnCredentialsResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetTurnCredentialsResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
