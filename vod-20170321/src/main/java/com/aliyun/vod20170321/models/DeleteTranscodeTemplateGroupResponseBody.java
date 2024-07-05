// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupResponseBody extends TeaModel {
    /**
     * <p>The IDs of transcoding templates that were not found.</p>
     */
    @NameInMap("NonExistTranscodeTemplateIds")
    public java.util.List<String> nonExistTranscodeTemplateIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplateGroupResponseBody self = new DeleteTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplateGroupResponseBody setNonExistTranscodeTemplateIds(java.util.List<String> nonExistTranscodeTemplateIds) {
        this.nonExistTranscodeTemplateIds = nonExistTranscodeTemplateIds;
        return this;
    }
    public java.util.List<String> getNonExistTranscodeTemplateIds() {
        return this.nonExistTranscodeTemplateIds;
    }

    public DeleteTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
