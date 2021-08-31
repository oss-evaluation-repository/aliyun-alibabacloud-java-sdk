// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetNamespaceResponseBody extends TeaModel {
    @NameInMap("DefaultRepoType")
    public String defaultRepoType;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("NamespaceStatus")
    public String namespaceStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AutoCreateRepo")
    public Boolean autoCreateRepo;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("NamespaceName")
    public String namespaceName;

    public static GetNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceResponseBody self = new GetNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNamespaceResponseBody setDefaultRepoType(String defaultRepoType) {
        this.defaultRepoType = defaultRepoType;
        return this;
    }
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public GetNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetNamespaceResponseBody setNamespaceStatus(String namespaceStatus) {
        this.namespaceStatus = namespaceStatus;
        return this;
    }
    public String getNamespaceStatus() {
        return this.namespaceStatus;
    }

    public GetNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNamespaceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNamespaceResponseBody setAutoCreateRepo(Boolean autoCreateRepo) {
        this.autoCreateRepo = autoCreateRepo;
        return this;
    }
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    public GetNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetNamespaceResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
