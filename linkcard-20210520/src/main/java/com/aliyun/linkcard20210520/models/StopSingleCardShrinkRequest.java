// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class StopSingleCardShrinkRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OptMsisdns")
    public String optMsisdnsShrink;

    public static StopSingleCardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSingleCardShrinkRequest self = new StopSingleCardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopSingleCardShrinkRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public StopSingleCardShrinkRequest setOptMsisdnsShrink(String optMsisdnsShrink) {
        this.optMsisdnsShrink = optMsisdnsShrink;
        return this;
    }
    public String getOptMsisdnsShrink() {
        return this.optMsisdnsShrink;
    }

}
