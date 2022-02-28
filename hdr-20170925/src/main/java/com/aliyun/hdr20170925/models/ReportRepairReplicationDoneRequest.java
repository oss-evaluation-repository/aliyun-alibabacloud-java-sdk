// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportRepairReplicationDoneRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportRepairReplicationDoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportRepairReplicationDoneRequest self = new ReportRepairReplicationDoneRequest();
        return TeaModel.build(map, self);
    }

    public ReportRepairReplicationDoneRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportRepairReplicationDoneRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportRepairReplicationDoneRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportRepairReplicationDoneRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
