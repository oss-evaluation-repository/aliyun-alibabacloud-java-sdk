// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterV2UserKubeconfigRequest extends TeaModel {
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    public static DescribeClusterV2UserKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2UserKubeconfigRequest self = new DescribeClusterV2UserKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterV2UserKubeconfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

}
