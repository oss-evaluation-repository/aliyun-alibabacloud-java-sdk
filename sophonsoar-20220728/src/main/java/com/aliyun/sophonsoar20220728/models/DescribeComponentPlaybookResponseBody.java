// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentPlaybookResponseBody extends TeaModel {
    /**
     * <p>The information about the predefined components.</p>
     */
    @NameInMap("Playbooks")
    public java.util.List<DescribeComponentPlaybookResponseBodyPlaybooks> playbooks;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPlaybookResponseBody self = new DescribeComponentPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPlaybookResponseBody setPlaybooks(java.util.List<DescribeComponentPlaybookResponseBodyPlaybooks> playbooks) {
        this.playbooks = playbooks;
        return this;
    }
    public java.util.List<DescribeComponentPlaybookResponseBodyPlaybooks> getPlaybooks() {
        return this.playbooks;
    }

    public DescribeComponentPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComponentPlaybookResponseBodyPlaybooks extends TeaModel {
        /**
         * <p>The description of the predefined component.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the predefined component.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The input parameter configuration of the playbook. The value is a JSON array.</p>
         * <br>
         * <p>>  For more information, see [DescribePlaybookInputOutput](~~DescribePlaybookInputOutput~~).</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        public static DescribeComponentPlaybookResponseBodyPlaybooks build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentPlaybookResponseBodyPlaybooks self = new DescribeComponentPlaybookResponseBodyPlaybooks();
            return TeaModel.build(map, self);
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

    }

}
