// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("DTCSetResult")
    public String DTCSetResult;

    public static ModifyDTCSecurityIpHostsForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerResponseBody self = new ModifyDTCSecurityIpHostsForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setDTCSetResult(String DTCSetResult) {
        this.DTCSetResult = DTCSetResult;
        return this;
    }
    public String getDTCSetResult() {
        return this.DTCSetResult;
    }

}
