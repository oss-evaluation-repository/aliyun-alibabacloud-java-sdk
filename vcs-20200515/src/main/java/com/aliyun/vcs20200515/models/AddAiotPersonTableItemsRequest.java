// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableItemsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTableId")
    public String personTableId;

    @NameInMap("PersonTableItemList")
    public java.util.List<AddAiotPersonTableItemsRequestPersonTableItemList> personTableItemList;

    public static AddAiotPersonTableItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableItemsRequest self = new AddAiotPersonTableItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableItemsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddAiotPersonTableItemsRequest setPersonTableId(String personTableId) {
        this.personTableId = personTableId;
        return this;
    }
    public String getPersonTableId() {
        return this.personTableId;
    }

    public AddAiotPersonTableItemsRequest setPersonTableItemList(java.util.List<AddAiotPersonTableItemsRequestPersonTableItemList> personTableItemList) {
        this.personTableItemList = personTableItemList;
        return this;
    }
    public java.util.List<AddAiotPersonTableItemsRequestPersonTableItemList> getPersonTableItemList() {
        return this.personTableItemList;
    }

    public static class AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList extends TeaModel {
        @NameInMap("Type")
        public Long type;

        @NameInMap("Number")
        public String number;

        public static AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList self = new AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo extends TeaModel {
        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("AlgorithmType")
        public String algorithmType;

        @NameInMap("TabIed")
        public String tabIed;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("FeatureData")
        public String featureData;

        public static AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo self = new AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setTabIed(String tabIed) {
            this.tabIed = tabIed;
            return this;
        }
        public String getTabIed() {
            return this.tabIed;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo setFeatureData(String featureData) {
            this.featureData = featureData;
            return this;
        }
        public String getFeatureData() {
            return this.featureData;
        }

    }

    public static class AddAiotPersonTableItemsRequestPersonTableItemListImageList extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("StoragePath")
        public String storagePath;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Type")
        public String type;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Data")
        public String data;

        @NameInMap("FeatureInfo")
        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo featureInfo;

        public static AddAiotPersonTableItemsRequestPersonTableItemListImageList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsRequestPersonTableItemListImageList self = new AddAiotPersonTableItemsRequestPersonTableItemListImageList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemListImageList setFeatureInfo(AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo featureInfo) {
            this.featureInfo = featureInfo;
            return this;
        }
        public AddAiotPersonTableItemsRequestPersonTableItemListImageListFeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

    }

    public static class AddAiotPersonTableItemsRequestPersonTableItemList extends TeaModel {
        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PersonCode")
        public String personCode;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("IdentificationNum")
        public Long identificationNum;

        @NameInMap("IdentificationList")
        public java.util.List<AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList> identificationList;

        @NameInMap("ImageNum")
        public Long imageNum;

        @NameInMap("ImageList")
        public java.util.List<AddAiotPersonTableItemsRequestPersonTableItemListImageList> imageList;

        public static AddAiotPersonTableItemsRequestPersonTableItemList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsRequestPersonTableItemList self = new AddAiotPersonTableItemsRequestPersonTableItemList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setPersonCode(String personCode) {
            this.personCode = personCode;
            return this;
        }
        public String getPersonCode() {
            return this.personCode;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setIdentificationNum(Long identificationNum) {
            this.identificationNum = identificationNum;
            return this;
        }
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setIdentificationList(java.util.List<AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList> identificationList) {
            this.identificationList = identificationList;
            return this;
        }
        public java.util.List<AddAiotPersonTableItemsRequestPersonTableItemListIdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
        }

        public AddAiotPersonTableItemsRequestPersonTableItemList setImageList(java.util.List<AddAiotPersonTableItemsRequestPersonTableItemListImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<AddAiotPersonTableItemsRequestPersonTableItemListImageList> getImageList() {
            return this.imageList;
        }

    }

}
