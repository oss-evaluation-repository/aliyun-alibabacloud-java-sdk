// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetCapacityRequest extends TeaModel {
    // 按照 appId 来匹配
    @NameInMap("AppId")
    public String appId;

    // 按照 app 版本来匹配
    @NameInMap("AppVersion")
    public String appVersion;

    // 大区 id
    @NameInMap("DistrictId")
    public String districtId;

    // 第几页，默认从 1 开始
    @NameInMap("PageNum")
    public Integer pageNum;

    // 一页大小，默认 20，最大 100
    @NameInMap("PageSize")
    public Integer pageSize;

    // 项目 id
    @NameInMap("ProjectId")
    public String projectId;

    public static GetCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityRequest self = new GetCapacityRequest();
        return TeaModel.build(map, self);
    }

    public GetCapacityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCapacityRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetCapacityRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public GetCapacityRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetCapacityRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCapacityRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
