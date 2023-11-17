// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeFieldResponseBody extends TeaModel {
    @NameInMap("Fields")
    public String fields;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldResponseBody self = new DescribeFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFieldResponseBody setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public DescribeFieldResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
