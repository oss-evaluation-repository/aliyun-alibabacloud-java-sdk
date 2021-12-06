// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachableEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    public java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDbfsAttachableEcsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachableEcsInstancesResponseBody self = new ListDbfsAttachableEcsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachableEcsInstancesResponseBody setEcsLabelInfo(java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo) {
        this.ecsLabelInfo = ecsLabelInfo;
        return this;
    }
    public java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> getEcsLabelInfo() {
        return this.ecsLabelInfo;
    }

    public ListDbfsAttachableEcsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo extends TeaModel {
        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        public static ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo self = new ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo();
            return TeaModel.build(map, self);
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
