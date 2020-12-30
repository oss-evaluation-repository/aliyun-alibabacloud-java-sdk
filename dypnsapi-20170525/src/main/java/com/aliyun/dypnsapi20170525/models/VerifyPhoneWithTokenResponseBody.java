// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyPhoneWithTokenResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GateVerify")
    public VerifyPhoneWithTokenResponseBodyGateVerify gateVerify;

    @NameInMap("Code")
    public String code;

    public static VerifyPhoneWithTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneWithTokenResponseBody self = new VerifyPhoneWithTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneWithTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyPhoneWithTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyPhoneWithTokenResponseBody setGateVerify(VerifyPhoneWithTokenResponseBodyGateVerify gateVerify) {
        this.gateVerify = gateVerify;
        return this;
    }
    public VerifyPhoneWithTokenResponseBodyGateVerify getGateVerify() {
        return this.gateVerify;
    }

    public VerifyPhoneWithTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class VerifyPhoneWithTokenResponseBodyGateVerify extends TeaModel {
        @NameInMap("VerifyResult")
        public String verifyResult;

        @NameInMap("VerifyId")
        public String verifyId;

        public static VerifyPhoneWithTokenResponseBodyGateVerify build(java.util.Map<String, ?> map) throws Exception {
            VerifyPhoneWithTokenResponseBodyGateVerify self = new VerifyPhoneWithTokenResponseBodyGateVerify();
            return TeaModel.build(map, self);
        }

        public VerifyPhoneWithTokenResponseBodyGateVerify setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public VerifyPhoneWithTokenResponseBodyGateVerify setVerifyId(String verifyId) {
            this.verifyId = verifyId;
            return this;
        }
        public String getVerifyId() {
            return this.verifyId;
        }

    }

}
