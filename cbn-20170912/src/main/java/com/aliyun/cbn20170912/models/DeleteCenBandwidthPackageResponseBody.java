// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenBandwidthPackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C0245BEF-52AC-44A8-A776-EF96FD26A5CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenBandwidthPackageResponseBody self = new DeleteCenBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
