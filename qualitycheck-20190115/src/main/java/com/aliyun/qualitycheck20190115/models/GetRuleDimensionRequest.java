// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDimensionRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetRuleDimensionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDimensionRequest self = new GetRuleDimensionRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleDimensionRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
