// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSyncQualityCheckDataRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateSyncQualityCheckDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncQualityCheckDataRequest self = new UpdateSyncQualityCheckDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSyncQualityCheckDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
