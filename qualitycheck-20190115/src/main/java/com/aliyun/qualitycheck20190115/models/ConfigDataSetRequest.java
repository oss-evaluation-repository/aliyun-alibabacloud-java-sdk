// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ConfigDataSetRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ConfigDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigDataSetRequest self = new ConfigDataSetRequest();
        return TeaModel.build(map, self);
    }

    public ConfigDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
