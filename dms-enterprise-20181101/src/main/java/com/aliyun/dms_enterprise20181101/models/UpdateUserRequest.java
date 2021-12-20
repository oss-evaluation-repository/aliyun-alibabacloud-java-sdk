// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("MaxExecuteCount")
    public Long maxExecuteCount;

    @NameInMap("MaxResultCount")
    public Long maxResultCount;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleNames")
    public String roleNames;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("Uid")
    public Long uid;

    @NameInMap("UserNick")
    public String userNick;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setMaxExecuteCount(Long maxExecuteCount) {
        this.maxExecuteCount = maxExecuteCount;
        return this;
    }
    public Long getMaxExecuteCount() {
        return this.maxExecuteCount;
    }

    public UpdateUserRequest setMaxResultCount(Long maxResultCount) {
        this.maxResultCount = maxResultCount;
        return this;
    }
    public Long getMaxResultCount() {
        return this.maxResultCount;
    }

    public UpdateUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateUserRequest setRoleNames(String roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public String getRoleNames() {
        return this.roleNames;
    }

    public UpdateUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateUserRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public UpdateUserRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
