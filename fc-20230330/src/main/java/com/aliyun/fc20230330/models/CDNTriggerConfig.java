// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CDNTriggerConfig extends TeaModel {
    @NameInMap("eventName")
    public String eventName;

    @NameInMap("eventVersion")
    public String eventVersion;

    @NameInMap("filter")
    public java.util.Map<String, java.util.List<String>> filter;

    @NameInMap("notes")
    public String notes;

    public static CDNTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        CDNTriggerConfig self = new CDNTriggerConfig();
        return TeaModel.build(map, self);
    }

    public CDNTriggerConfig setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CDNTriggerConfig setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
        return this;
    }
    public String getEventVersion() {
        return this.eventVersion;
    }

    public CDNTriggerConfig setFilter(java.util.Map<String, java.util.List<String>> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getFilter() {
        return this.filter;
    }

    public CDNTriggerConfig setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

}
