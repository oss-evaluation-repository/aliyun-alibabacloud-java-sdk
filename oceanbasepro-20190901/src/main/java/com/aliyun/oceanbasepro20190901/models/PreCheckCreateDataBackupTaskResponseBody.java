// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class PreCheckCreateDataBackupTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public PreCheckCreateDataBackupTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static PreCheckCreateDataBackupTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateDataBackupTaskResponseBody self = new PreCheckCreateDataBackupTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateDataBackupTaskResponseBody setData(PreCheckCreateDataBackupTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PreCheckCreateDataBackupTaskResponseBodyData getData() {
        return this.data;
    }

    public PreCheckCreateDataBackupTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreCheckCreateDataBackupTaskResponseBodyData extends TeaModel {
        @NameInMap("LogBackupCheck")
        public Boolean logBackupCheck;

        @NameInMap("MergeCheck")
        public Boolean mergeCheck;

        @NameInMap("RunningBackupCheck")
        public Boolean runningBackupCheck;

        @NameInMap("SameDataVersionBackupSetCheck")
        public Boolean sameDataVersionBackupSetCheck;

        public static PreCheckCreateDataBackupTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PreCheckCreateDataBackupTaskResponseBodyData self = new PreCheckCreateDataBackupTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PreCheckCreateDataBackupTaskResponseBodyData setLogBackupCheck(Boolean logBackupCheck) {
            this.logBackupCheck = logBackupCheck;
            return this;
        }
        public Boolean getLogBackupCheck() {
            return this.logBackupCheck;
        }

        public PreCheckCreateDataBackupTaskResponseBodyData setMergeCheck(Boolean mergeCheck) {
            this.mergeCheck = mergeCheck;
            return this;
        }
        public Boolean getMergeCheck() {
            return this.mergeCheck;
        }

        public PreCheckCreateDataBackupTaskResponseBodyData setRunningBackupCheck(Boolean runningBackupCheck) {
            this.runningBackupCheck = runningBackupCheck;
            return this;
        }
        public Boolean getRunningBackupCheck() {
            return this.runningBackupCheck;
        }

        public PreCheckCreateDataBackupTaskResponseBodyData setSameDataVersionBackupSetCheck(Boolean sameDataVersionBackupSetCheck) {
            this.sameDataVersionBackupSetCheck = sameDataVersionBackupSetCheck;
            return this;
        }
        public Boolean getSameDataVersionBackupSetCheck() {
            return this.sameDataVersionBackupSetCheck;
        }

    }

}
