// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateDatasetItemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5045****</p>
     */
    @NameInMap("DatasetItemId")
    public String datasetItemId;

    /**
     * <strong>example:</strong>
     * <p>8A5E2053-4D9F-5280-B7A9-D357********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetItemResponseBody self = new CreateDatasetItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetItemResponseBody setDatasetItemId(String datasetItemId) {
        this.datasetItemId = datasetItemId;
        return this;
    }
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    public CreateDatasetItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
