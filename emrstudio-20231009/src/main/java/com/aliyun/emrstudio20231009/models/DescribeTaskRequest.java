// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeTaskRequest extends TeaModel {
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DescribeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskRequest self = new DescribeTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
