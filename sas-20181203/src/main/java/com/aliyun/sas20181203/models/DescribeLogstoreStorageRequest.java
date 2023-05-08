// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageRequest extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The purchased log storage capacity, in GB.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeLogstoreStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstoreStorageRequest self = new DescribeLogstoreStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogstoreStorageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeLogstoreStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
