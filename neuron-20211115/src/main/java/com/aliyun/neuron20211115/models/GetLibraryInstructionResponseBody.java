// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryInstructionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryInstruction result;

    public static GetLibraryInstructionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryInstructionResponseBody self = new GetLibraryInstructionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryInstructionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryInstructionResponseBody setResult(LibraryInstruction result) {
        this.result = result;
        return this;
    }
    public LibraryInstruction getResult() {
        return this.result;
    }

}
