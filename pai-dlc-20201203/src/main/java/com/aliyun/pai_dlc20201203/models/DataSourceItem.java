// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DataSourceItem extends TeaModel {
    // 数据源Id
    @NameInMap("DataSourceId")
    public String dataSourceId;

    // 数据源类型
    @NameInMap("DataSourceType")
    public String dataSourceType;

    // 数据源描述
    @NameInMap("Description")
    public String description;

    // 数据源显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 阿里云OSS文件系统服务端点
    @NameInMap("Endpoint")
    public String endpoint;

    // 阿里云NAS文件系统Id
    @NameInMap("FileSystemId")
    public String fileSystemId;

    // 创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间（UTC）
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    // 本地挂载目录
    @NameInMap("MountPath")
    public String mountPath;

    // 阿里云OSS文件系统配置选项
    @NameInMap("Options")
    public String options;

    // 阿里云OSS文件系统路径
    @NameInMap("Path")
    public String path;

    // 创建人Id
    @NameInMap("UserId")
    public String userId;

    public static DataSourceItem build(java.util.Map<String, ?> map) throws Exception {
        DataSourceItem self = new DataSourceItem();
        return TeaModel.build(map, self);
    }

    public DataSourceItem setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DataSourceItem setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DataSourceItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataSourceItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DataSourceItem setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DataSourceItem setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DataSourceItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DataSourceItem setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public DataSourceItem setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public DataSourceItem setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public DataSourceItem setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DataSourceItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
