// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageResponseBody extends TeaModel {
    @NameInMap("DetectedLanguage")
    public String detectedLanguage;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectLanguageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageResponseBody self = new GetDetectLanguageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageResponseBody setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }
    public String getDetectedLanguage() {
        return this.detectedLanguage;
    }

    public GetDetectLanguageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
