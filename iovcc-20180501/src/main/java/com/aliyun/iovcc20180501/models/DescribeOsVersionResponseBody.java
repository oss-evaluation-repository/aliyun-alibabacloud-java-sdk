// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeOsVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OsVersion")
    public DescribeOsVersionResponseBodyOsVersion osVersion;

    public static DescribeOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOsVersionResponseBody self = new DescribeOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOsVersionResponseBody setOsVersion(DescribeOsVersionResponseBodyOsVersion osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public DescribeOsVersionResponseBodyOsVersion getOsVersion() {
        return this.osVersion;
    }

    public static class DescribeOsVersionResponseBodyOsVersionRomList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("BaseVersion")
        public String baseVersion;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("OriginalUrl")
        public String originalUrl;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Size")
        public String size;

        @NameInMap("SplitNum")
        public String splitNum;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        public static DescribeOsVersionResponseBodyOsVersionRomList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOsVersionResponseBodyOsVersionRomList self = new DescribeOsVersionResponseBodyOsVersionRomList();
            return TeaModel.build(map, self);
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setBaseVersion(String baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }
        public String getBaseVersion() {
            return this.baseVersion;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setOriginalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
            return this;
        }
        public String getOriginalUrl() {
            return this.originalUrl;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setSplitNum(String splitNum) {
            this.splitNum = splitNum;
            return this;
        }
        public String getSplitNum() {
            return this.splitNum;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOsVersionResponseBodyOsVersionRomList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

    }

    public static class DescribeOsVersionResponseBodyOsVersionNightUpgradeOption extends TeaModel {
        @NameInMap("DownloadType")
        public String downloadType;

        @NameInMap("IsShowTip")
        public String isShowTip;

        @NameInMap("IsAllowedCancel")
        public String isAllowedCancel;

        public static DescribeOsVersionResponseBodyOsVersionNightUpgradeOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeOsVersionResponseBodyOsVersionNightUpgradeOption self = new DescribeOsVersionResponseBodyOsVersionNightUpgradeOption();
            return TeaModel.build(map, self);
        }

        public DescribeOsVersionResponseBodyOsVersionNightUpgradeOption setDownloadType(String downloadType) {
            this.downloadType = downloadType;
            return this;
        }
        public String getDownloadType() {
            return this.downloadType;
        }

        public DescribeOsVersionResponseBodyOsVersionNightUpgradeOption setIsShowTip(String isShowTip) {
            this.isShowTip = isShowTip;
            return this;
        }
        public String getIsShowTip() {
            return this.isShowTip;
        }

        public DescribeOsVersionResponseBodyOsVersionNightUpgradeOption setIsAllowedCancel(String isAllowedCancel) {
            this.isAllowedCancel = isAllowedCancel;
            return this;
        }
        public String getIsAllowedCancel() {
            return this.isAllowedCancel;
        }

    }

    public static class DescribeOsVersionResponseBodyOsVersion extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("DeviceModelId")
        public String deviceModelId;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("BlackVersionList")
        public String blackVersionList;

        @NameInMap("WhiteVersionList")
        public String whiteVersionList;

        @NameInMap("MinClientVersion")
        public String minClientVersion;

        @NameInMap("MaxClientVersion")
        public String maxClientVersion;

        @NameInMap("IsMilestone")
        public String isMilestone;

        @NameInMap("IsForceUpgrade")
        public String isForceUpgrade;

        @NameInMap("IsForceNightUpgrade")
        public String isForceNightUpgrade;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("DeviceModelName")
        public String deviceModelName;

        @NameInMap("EnableMobileDownload")
        public String enableMobileDownload;

        @NameInMap("MobileDownloadMaxSize")
        public String mobileDownloadMaxSize;

        @NameInMap("RomList")
        public java.util.List<DescribeOsVersionResponseBodyOsVersionRomList> romList;

        @NameInMap("NightUpgradeOption")
        public DescribeOsVersionResponseBodyOsVersionNightUpgradeOption nightUpgradeOption;

        public static DescribeOsVersionResponseBodyOsVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeOsVersionResponseBodyOsVersion self = new DescribeOsVersionResponseBodyOsVersion();
            return TeaModel.build(map, self);
        }

        public DescribeOsVersionResponseBodyOsVersion setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeOsVersionResponseBodyOsVersion setDeviceModelId(String deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        public DescribeOsVersionResponseBodyOsVersion setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public DescribeOsVersionResponseBodyOsVersion setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeOsVersionResponseBodyOsVersion setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeOsVersionResponseBodyOsVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOsVersionResponseBodyOsVersion setBlackVersionList(String blackVersionList) {
            this.blackVersionList = blackVersionList;
            return this;
        }
        public String getBlackVersionList() {
            return this.blackVersionList;
        }

        public DescribeOsVersionResponseBodyOsVersion setWhiteVersionList(String whiteVersionList) {
            this.whiteVersionList = whiteVersionList;
            return this;
        }
        public String getWhiteVersionList() {
            return this.whiteVersionList;
        }

        public DescribeOsVersionResponseBodyOsVersion setMinClientVersion(String minClientVersion) {
            this.minClientVersion = minClientVersion;
            return this;
        }
        public String getMinClientVersion() {
            return this.minClientVersion;
        }

        public DescribeOsVersionResponseBodyOsVersion setMaxClientVersion(String maxClientVersion) {
            this.maxClientVersion = maxClientVersion;
            return this;
        }
        public String getMaxClientVersion() {
            return this.maxClientVersion;
        }

        public DescribeOsVersionResponseBodyOsVersion setIsMilestone(String isMilestone) {
            this.isMilestone = isMilestone;
            return this;
        }
        public String getIsMilestone() {
            return this.isMilestone;
        }

        public DescribeOsVersionResponseBodyOsVersion setIsForceUpgrade(String isForceUpgrade) {
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }
        public String getIsForceUpgrade() {
            return this.isForceUpgrade;
        }

        public DescribeOsVersionResponseBodyOsVersion setIsForceNightUpgrade(String isForceNightUpgrade) {
            this.isForceNightUpgrade = isForceNightUpgrade;
            return this;
        }
        public String getIsForceNightUpgrade() {
            return this.isForceNightUpgrade;
        }

        public DescribeOsVersionResponseBodyOsVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOsVersionResponseBodyOsVersion setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeOsVersionResponseBodyOsVersion setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeOsVersionResponseBodyOsVersion setDeviceModelName(String deviceModelName) {
            this.deviceModelName = deviceModelName;
            return this;
        }
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        public DescribeOsVersionResponseBodyOsVersion setEnableMobileDownload(String enableMobileDownload) {
            this.enableMobileDownload = enableMobileDownload;
            return this;
        }
        public String getEnableMobileDownload() {
            return this.enableMobileDownload;
        }

        public DescribeOsVersionResponseBodyOsVersion setMobileDownloadMaxSize(String mobileDownloadMaxSize) {
            this.mobileDownloadMaxSize = mobileDownloadMaxSize;
            return this;
        }
        public String getMobileDownloadMaxSize() {
            return this.mobileDownloadMaxSize;
        }

        public DescribeOsVersionResponseBodyOsVersion setRomList(java.util.List<DescribeOsVersionResponseBodyOsVersionRomList> romList) {
            this.romList = romList;
            return this;
        }
        public java.util.List<DescribeOsVersionResponseBodyOsVersionRomList> getRomList() {
            return this.romList;
        }

        public DescribeOsVersionResponseBodyOsVersion setNightUpgradeOption(DescribeOsVersionResponseBodyOsVersionNightUpgradeOption nightUpgradeOption) {
            this.nightUpgradeOption = nightUpgradeOption;
            return this;
        }
        public DescribeOsVersionResponseBodyOsVersionNightUpgradeOption getNightUpgradeOption() {
            return this.nightUpgradeOption;
        }

    }

}
