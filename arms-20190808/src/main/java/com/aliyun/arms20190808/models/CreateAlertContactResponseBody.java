// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactResponseBody extends TeaModel {
    // The ID of the alert contact.
    @NameInMap("ContactId")
    public String contactId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactResponseBody self = new CreateAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
