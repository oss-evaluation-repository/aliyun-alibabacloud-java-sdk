// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackId")
    public String stackId;

    public static CreateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStackResponseBody self = new CreateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class ContinueCreateStackResponseBodyDryRunResult extends TeaModel {
        @NameInMap("ParametersAllowedToBeModified")
        public java.util.List<String> parametersAllowedToBeModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        public java.util.List<String> parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersNotAllowedToBeModified")
        public java.util.List<String> parametersNotAllowedToBeModified;

        public static ContinueCreateStackResponseBodyDryRunResult build(java.util.Map<String, ?> map) throws Exception {
            ContinueCreateStackResponseBodyDryRunResult self = new ContinueCreateStackResponseBodyDryRunResult();
            return TeaModel.build(map, self);
        }

        public ContinueCreateStackResponseBodyDryRunResult setParametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
            this.parametersAllowedToBeModified = parametersAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        public ContinueCreateStackResponseBodyDryRunResult setParametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
            this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        public ContinueCreateStackResponseBodyDryRunResult setParametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
            this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
            return this;
        }
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

    }

}
