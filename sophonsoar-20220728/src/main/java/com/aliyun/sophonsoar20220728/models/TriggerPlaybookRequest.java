// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerPlaybookRequest extends TeaModel {
    @NameInMap("InputParam")
    public String inputParam;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static TriggerPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerPlaybookRequest self = new TriggerPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public TriggerPlaybookRequest setInputParam(String inputParam) {
        this.inputParam = inputParam;
        return this;
    }
    public String getInputParam() {
        return this.inputParam;
    }

    public TriggerPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
