// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountResponseBody extends TeaModel {
    /**
     * <p>The number of assets that are in an abnormal state.</p>
     */
    @NameInMap("ExceptionIpCount")
    public Integer exceptionIpCount;

    /**
     * <p>The number of Anti-DDoS Origin instances that are about to expire.</p>
     */
    @NameInMap("ExpireTimeCount")
    public Integer expireTimeCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExcpetionCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountResponseBody self = new DescribeExcpetionCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExcpetionCountResponseBody setExceptionIpCount(Integer exceptionIpCount) {
        this.exceptionIpCount = exceptionIpCount;
        return this;
    }
    public Integer getExceptionIpCount() {
        return this.exceptionIpCount;
    }

    public DescribeExcpetionCountResponseBody setExpireTimeCount(Integer expireTimeCount) {
        this.expireTimeCount = expireTimeCount;
        return this;
    }
    public Integer getExpireTimeCount() {
        return this.expireTimeCount;
    }

    public DescribeExcpetionCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
