// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RequestLoginInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoginInfo")
    public RequestLoginInfoResponseBodyLoginInfo loginInfo;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static RequestLoginInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestLoginInfoResponseBody self = new RequestLoginInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestLoginInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RequestLoginInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestLoginInfoResponseBody setLoginInfo(RequestLoginInfoResponseBodyLoginInfo loginInfo) {
        this.loginInfo = loginInfo;
        return this;
    }
    public RequestLoginInfoResponseBodyLoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    public RequestLoginInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RequestLoginInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RequestLoginInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestLoginInfoResponseBodyLoginInfoRolesRole extends TeaModel {
        @NameInMap("RoleDescription")
        public String roleDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleId")
        public String roleId;

        public static RequestLoginInfoResponseBodyLoginInfoRolesRole build(java.util.Map<String, ?> map) throws Exception {
            RequestLoginInfoResponseBodyLoginInfoRolesRole self = new RequestLoginInfoResponseBodyLoginInfoRolesRole();
            return TeaModel.build(map, self);
        }

        public RequestLoginInfoResponseBodyLoginInfoRolesRole setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public String getRoleDescription() {
            return this.roleDescription;
        }

        public RequestLoginInfoResponseBodyLoginInfoRolesRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RequestLoginInfoResponseBodyLoginInfoRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public RequestLoginInfoResponseBodyLoginInfoRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class RequestLoginInfoResponseBodyLoginInfoRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<RequestLoginInfoResponseBodyLoginInfoRolesRole> role;

        public static RequestLoginInfoResponseBodyLoginInfoRoles build(java.util.Map<String, ?> map) throws Exception {
            RequestLoginInfoResponseBodyLoginInfoRoles self = new RequestLoginInfoResponseBodyLoginInfoRoles();
            return TeaModel.build(map, self);
        }

        public RequestLoginInfoResponseBodyLoginInfoRoles setRole(java.util.List<RequestLoginInfoResponseBodyLoginInfoRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<RequestLoginInfoResponseBodyLoginInfoRolesRole> getRole() {
            return this.role;
        }

    }

    public static class RequestLoginInfoResponseBodyLoginInfo extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("SignData")
        public String signData;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Region")
        public String region;

        @NameInMap("AgentServerUrl")
        public String agentServerUrl;

        @NameInMap("Roles")
        public RequestLoginInfoResponseBodyLoginInfoRoles roles;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WebRtcUrl")
        public String webRtcUrl;

        @NameInMap("TenantId")
        public String tenantId;

        public static RequestLoginInfoResponseBodyLoginInfo build(java.util.Map<String, ?> map) throws Exception {
            RequestLoginInfoResponseBodyLoginInfo self = new RequestLoginInfoResponseBodyLoginInfo();
            return TeaModel.build(map, self);
        }

        public RequestLoginInfoResponseBodyLoginInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RequestLoginInfoResponseBodyLoginInfo setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public RequestLoginInfoResponseBodyLoginInfo setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public RequestLoginInfoResponseBodyLoginInfo setSignData(String signData) {
            this.signData = signData;
            return this;
        }
        public String getSignData() {
            return this.signData;
        }

        public RequestLoginInfoResponseBodyLoginInfo setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public RequestLoginInfoResponseBodyLoginInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public RequestLoginInfoResponseBodyLoginInfo setAgentServerUrl(String agentServerUrl) {
            this.agentServerUrl = agentServerUrl;
            return this;
        }
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        public RequestLoginInfoResponseBodyLoginInfo setRoles(RequestLoginInfoResponseBodyLoginInfoRoles roles) {
            this.roles = roles;
            return this;
        }
        public RequestLoginInfoResponseBodyLoginInfoRoles getRoles() {
            return this.roles;
        }

        public RequestLoginInfoResponseBodyLoginInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public RequestLoginInfoResponseBodyLoginInfo setWebRtcUrl(String webRtcUrl) {
            this.webRtcUrl = webRtcUrl;
            return this;
        }
        public String getWebRtcUrl() {
            return this.webRtcUrl;
        }

        public RequestLoginInfoResponseBodyLoginInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
