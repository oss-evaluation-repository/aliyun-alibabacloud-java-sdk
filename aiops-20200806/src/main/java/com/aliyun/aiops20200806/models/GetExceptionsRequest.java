// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetExceptionsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetExceptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExceptionsRequest self = new GetExceptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetExceptionsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
