// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Files")
    public java.util.List<File> files;

    public static BatchGetFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFileMetaResponseBody self = new BatchGetFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetFileMetaResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

}
