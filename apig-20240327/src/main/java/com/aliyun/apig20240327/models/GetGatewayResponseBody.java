// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetGatewayResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0F138FFC-6E2B-56C1-9BAB-A67462E339D1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResponseBody self = new GetGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayResponseBody setData(GetGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayResponseBodyDataEnvironments extends TeaModel {
        @NameInMap("alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>env-cp9uhudlht***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <strong>example:</strong>
         * <p>default-gw-cp9ugg5***</p>
         */
        @NameInMap("name")
        public String name;

        public static GetGatewayResponseBodyDataEnvironments build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataEnvironments self = new GetGatewayResponseBodyDataEnvironments();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataEnvironments setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetGatewayResponseBodyDataEnvironments setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetGatewayResponseBodyDataEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetGatewayResponseBodyDataLoadBalancersPorts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static GetGatewayResponseBodyDataLoadBalancersPorts build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataLoadBalancersPorts self = new GetGatewayResponseBodyDataLoadBalancersPorts();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataLoadBalancersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetGatewayResponseBodyDataLoadBalancersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class GetGatewayResponseBodyDataLoadBalancers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nlb-xoh3pghr***.cn-hangzhou.nlb.aliyuncs.com</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("addressIpVersion")
        public String addressIpVersion;

        /**
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("addressType")
        public String addressType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("gatewayDefault")
        public Boolean gatewayDefault;

        /**
         * <strong>example:</strong>
         * <p>nlb-xoh3pghru7c***</p>
         */
        @NameInMap("loadBalancerId")
        public String loadBalancerId;

        /**
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("mode")
        public String mode;

        @NameInMap("ports")
        public java.util.List<GetGatewayResponseBodyDataLoadBalancersPorts> ports;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("type")
        public String type;

        public static GetGatewayResponseBodyDataLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataLoadBalancers self = new GetGatewayResponseBodyDataLoadBalancers();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataLoadBalancers setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetGatewayResponseBodyDataLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public GetGatewayResponseBodyDataLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetGatewayResponseBodyDataLoadBalancers setGatewayDefault(Boolean gatewayDefault) {
            this.gatewayDefault = gatewayDefault;
            return this;
        }
        public Boolean getGatewayDefault() {
            return this.gatewayDefault;
        }

        public GetGatewayResponseBodyDataLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public GetGatewayResponseBodyDataLoadBalancers setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetGatewayResponseBodyDataLoadBalancers setPorts(java.util.List<GetGatewayResponseBodyDataLoadBalancersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataLoadBalancersPorts> getPorts() {
            return this.ports;
        }

        public GetGatewayResponseBodyDataLoadBalancers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayResponseBodyDataLoadBalancers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGatewayResponseBodyDataSecurityGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>APIG-sg-gw-cq7ke5ll***</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>sg-bp16tafq9***</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        public static GetGatewayResponseBodyDataSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataSecurityGroup self = new GetGatewayResponseBodyDataSecurityGroup();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataSecurityGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class GetGatewayResponseBodyDataVSwitch extends TeaModel {
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1c7ggkj***</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static GetGatewayResponseBodyDataVSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataVSwitch self = new GetGatewayResponseBodyDataVSwitch();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataVSwitch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class GetGatewayResponseBodyDataVpc extends TeaModel {
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1llj52lvj6xc***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetGatewayResponseBodyDataVpc build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataVpc self = new GetGatewayResponseBodyDataVpc();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataVpc setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetGatewayResponseBodyDataZonesVSwitch extends TeaModel {
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1c7ggkj***</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static GetGatewayResponseBodyDataZonesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataZonesVSwitch self = new GetGatewayResponseBodyDataZonesVSwitch();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataZonesVSwitch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataZonesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class GetGatewayResponseBodyDataZones extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("vSwitch")
        public GetGatewayResponseBodyDataZonesVSwitch vSwitch;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static GetGatewayResponseBodyDataZones build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataZones self = new GetGatewayResponseBodyDataZones();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataZones setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyDataZones setVSwitch(GetGatewayResponseBodyDataZonesVSwitch vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public GetGatewayResponseBodyDataZonesVSwitch getVSwitch() {
            return this.vSwitch;
        }

        public GetGatewayResponseBodyDataZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetGatewayResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>Console</p>
         */
        @NameInMap("createFrom")
        public String createFrom;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("environments")
        public java.util.List<GetGatewayResponseBodyDataEnvironments> environments;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("expireTimestamp")
        public Long expireTimestamp;

        /**
         * <strong>example:</strong>
         * <p>gw-cq2vundlhtg***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("loadBalancers")
        public java.util.List<GetGatewayResponseBodyDataLoadBalancers> loadBalancers;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-gateway</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replicas")
        public String replicas;

        @NameInMap("securityGroup")
        public GetGatewayResponseBodyDataSecurityGroup securityGroup;

        /**
         * <strong>example:</strong>
         * <p>apigw.small.x1</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        @NameInMap("vSwitch")
        public GetGatewayResponseBodyDataVSwitch vSwitch;

        /**
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("version")
        public String version;

        @NameInMap("vpc")
        public GetGatewayResponseBodyDataVpc vpc;

        @NameInMap("zones")
        public java.util.List<GetGatewayResponseBodyDataZones> zones;

        public static GetGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyData self = new GetGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetGatewayResponseBodyData setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public GetGatewayResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetGatewayResponseBodyData setEnvironments(java.util.List<GetGatewayResponseBodyDataEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataEnvironments> getEnvironments() {
            return this.environments;
        }

        public GetGatewayResponseBodyData setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public GetGatewayResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayResponseBodyData setLoadBalancers(java.util.List<GetGatewayResponseBodyDataLoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataLoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

        public GetGatewayResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyData setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public GetGatewayResponseBodyData setSecurityGroup(GetGatewayResponseBodyDataSecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public GetGatewayResponseBodyDataSecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

        public GetGatewayResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetGatewayResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayResponseBodyData setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public GetGatewayResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public GetGatewayResponseBodyData setVSwitch(GetGatewayResponseBodyDataVSwitch vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public GetGatewayResponseBodyDataVSwitch getVSwitch() {
            return this.vSwitch;
        }

        public GetGatewayResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetGatewayResponseBodyData setVpc(GetGatewayResponseBodyDataVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public GetGatewayResponseBodyDataVpc getVpc() {
            return this.vpc;
        }

        public GetGatewayResponseBodyData setZones(java.util.List<GetGatewayResponseBodyDataZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataZones> getZones() {
            return this.zones;
        }

    }

}
