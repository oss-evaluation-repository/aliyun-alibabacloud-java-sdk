// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponseBody extends TeaModel {
    // The HTTP status code returned.
    // 
    // *   A code of OK indicates that the call is successful.
    // *   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The data returned.
    @NameInMap("Data")
    public CreateChatappTemplateResponseBodyData data;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateResponseBody self = new CreateChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatappTemplateResponseBody setData(CreateChatappTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatappTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateChatappTemplateResponseBodyData extends TeaModel {
        // The code of the message template.
        @NameInMap("TemplateCode")
        public String templateCode;

        // The name of the message template.
        @NameInMap("TemplateName")
        public String templateName;

        public static CreateChatappTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateResponseBodyData self = new CreateChatappTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateChatappTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
