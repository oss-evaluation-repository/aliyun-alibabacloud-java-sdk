// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsEndpointShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CloudInstanceId")
    public String cloudInstanceId;

    @NameInMap("CloudInstanceRegionId")
    public String cloudInstanceRegionId;

    @NameInMap("CloudInstanceTenantId")
    public String cloudInstanceTenantId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DgInstanceId")
    public String dgInstanceId;

    @NameInMap("DomainParams")
    public String domainParamsShrink;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public String port;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("Username")
    public String username;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateOmsEndpointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsEndpointShrinkRequest self = new CreateOmsEndpointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsEndpointShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOmsEndpointShrinkRequest setCloudInstanceId(String cloudInstanceId) {
        this.cloudInstanceId = cloudInstanceId;
        return this;
    }
    public String getCloudInstanceId() {
        return this.cloudInstanceId;
    }

    public CreateOmsEndpointShrinkRequest setCloudInstanceRegionId(String cloudInstanceRegionId) {
        this.cloudInstanceRegionId = cloudInstanceRegionId;
        return this;
    }
    public String getCloudInstanceRegionId() {
        return this.cloudInstanceRegionId;
    }

    public CreateOmsEndpointShrinkRequest setCloudInstanceTenantId(String cloudInstanceTenantId) {
        this.cloudInstanceTenantId = cloudInstanceTenantId;
        return this;
    }
    public String getCloudInstanceTenantId() {
        return this.cloudInstanceTenantId;
    }

    public CreateOmsEndpointShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateOmsEndpointShrinkRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateOmsEndpointShrinkRequest setDgInstanceId(String dgInstanceId) {
        this.dgInstanceId = dgInstanceId;
        return this;
    }
    public String getDgInstanceId() {
        return this.dgInstanceId;
    }

    public CreateOmsEndpointShrinkRequest setDomainParamsShrink(String domainParamsShrink) {
        this.domainParamsShrink = domainParamsShrink;
        return this;
    }
    public String getDomainParamsShrink() {
        return this.domainParamsShrink;
    }

    public CreateOmsEndpointShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateOmsEndpointShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateOmsEndpointShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateOmsEndpointShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOmsEndpointShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateOmsEndpointShrinkRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public CreateOmsEndpointShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateOmsEndpointShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
