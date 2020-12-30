// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadAllTypeRecordingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("Channel")
    public String channel;

    public static DownloadAllTypeRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadAllTypeRecordingRequest self = new DownloadAllTypeRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DownloadAllTypeRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadAllTypeRecordingRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public DownloadAllTypeRecordingRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
