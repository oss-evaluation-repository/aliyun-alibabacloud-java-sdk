// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetLabelDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetLabelDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLabelDetailRequest self = new GetLabelDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetLabelDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
