// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetQualificationCertificateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static GetQualificationCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationCertificateResponseBody self = new GetQualificationCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualificationCertificateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetQualificationCertificateResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetQualificationCertificateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualificationCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualificationCertificateResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
