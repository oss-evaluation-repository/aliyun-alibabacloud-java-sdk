// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<DescribeImagesResponseBodyImages> images;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponseBody self = new DescribeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponseBody setImages(java.util.List<DescribeImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public DescribeImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImagesResponseBodyImages extends TeaModel {
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("GpuCategory")
        public Boolean gpuCategory;

        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("SessionType")
        public String sessionType;

        @NameInMap("SharedCount")
        public Integer sharedCount;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportedLanguages")
        public java.util.List<String> supportedLanguages;

        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static DescribeImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImages self = new DescribeImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImages setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeImagesResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseBodyImages setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseBodyImages setGpuCategory(Boolean gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Boolean getGpuCategory() {
            return this.gpuCategory;
        }

        public DescribeImagesResponseBodyImages setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public DescribeImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseBodyImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeImagesResponseBodyImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagesResponseBodyImages setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeImagesResponseBodyImages setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImages setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeImagesResponseBodyImages setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeImagesResponseBodyImages setSharedCount(Integer sharedCount) {
            this.sharedCount = sharedCount;
            return this;
        }
        public Integer getSharedCount() {
            return this.sharedCount;
        }

        public DescribeImagesResponseBodyImages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseBodyImages setSupportedLanguages(java.util.List<String> supportedLanguages) {
            this.supportedLanguages = supportedLanguages;
            return this;
        }
        public java.util.List<String> getSupportedLanguages() {
            return this.supportedLanguages;
        }

        public DescribeImagesResponseBodyImages setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeImagesResponseBodyImages setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
