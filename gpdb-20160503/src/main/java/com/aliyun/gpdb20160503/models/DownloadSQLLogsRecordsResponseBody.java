// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadSQLLogsRecordsResponseBody extends TeaModel {
    @NameInMap("DownloadId")
    public Long downloadId;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadSQLLogsRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSQLLogsRecordsResponseBody self = new DownloadSQLLogsRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSQLLogsRecordsResponseBody setDownloadId(Long downloadId) {
        this.downloadId = downloadId;
        return this;
    }
    public Long getDownloadId() {
        return this.downloadId;
    }

    public DownloadSQLLogsRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
