// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnit")
    public GetOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitResponseBody self = new GetOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnit(GetOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }
    public GetOrganizationalUnitResponseBodyOrganizationalUnit getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    public GetOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOrganizationalUnitResponseBodyOrganizationalUnit extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrganizationalUnitExternalId")
        public String organizationalUnitExternalId;

        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        @NameInMap("OrganizationalUnitSourceId")
        public String organizationalUnitSourceId;

        @NameInMap("OrganizationalUnitSourceType")
        public String organizationalUnitSourceType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetOrganizationalUnitResponseBodyOrganizationalUnit build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationalUnitResponseBodyOrganizationalUnit self = new GetOrganizationalUnitResponseBodyOrganizationalUnit();
            return TeaModel.build(map, self);
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
