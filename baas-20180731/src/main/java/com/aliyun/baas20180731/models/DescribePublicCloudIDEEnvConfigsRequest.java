// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicCloudIDEEnvConfigsRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribePublicCloudIDEEnvConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicCloudIDEEnvConfigsRequest self = new DescribePublicCloudIDEEnvConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePublicCloudIDEEnvConfigsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
