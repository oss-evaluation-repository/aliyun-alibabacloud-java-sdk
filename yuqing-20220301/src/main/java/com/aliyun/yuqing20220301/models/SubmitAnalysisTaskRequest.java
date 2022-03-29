// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SubmitAnalysisTaskRequest extends TeaModel {
    // A short description of struct
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    public static SubmitAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisTaskRequest self = new SubmitAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAnalysisTaskRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

}
