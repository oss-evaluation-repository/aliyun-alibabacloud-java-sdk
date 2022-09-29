// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CompleteRegisterLibraryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CatalogCommonResult result;

    public static CompleteRegisterLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteRegisterLibraryResponseBody self = new CompleteRegisterLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteRegisterLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteRegisterLibraryResponseBody setResult(CatalogCommonResult result) {
        this.result = result;
        return this;
    }
    public CatalogCommonResult getResult() {
        return this.result;
    }

}
