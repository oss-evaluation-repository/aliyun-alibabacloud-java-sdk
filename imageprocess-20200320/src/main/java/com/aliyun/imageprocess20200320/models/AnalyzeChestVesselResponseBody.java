// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class AnalyzeChestVesselResponseBody extends TeaModel {
    @NameInMap("Data")
    public AnalyzeChestVesselResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AnalyzeChestVesselResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeChestVesselResponseBody self = new AnalyzeChestVesselResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeChestVesselResponseBody setData(AnalyzeChestVesselResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AnalyzeChestVesselResponseBodyData getData() {
        return this.data;
    }

    public AnalyzeChestVesselResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AnalyzeChestVesselResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AnalyzeChestVesselResponseBodyDataAortaInfo extends TeaModel {
        @NameInMap("Area")
        public java.util.List<Float> area;

        @NameInMap("Coordinates")
        public java.util.List<java.util.List<Float>> coordinates;

        @NameInMap("LabelValue")
        public Long labelValue;

        @NameInMap("MaxArea")
        public Float maxArea;

        @NameInMap("MaxAreaIndex")
        public Long maxAreaIndex;

        @NameInMap("MaxDiameter")
        public Float maxDiameter;

        public static AnalyzeChestVesselResponseBodyDataAortaInfo build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeChestVesselResponseBodyDataAortaInfo self = new AnalyzeChestVesselResponseBodyDataAortaInfo();
            return TeaModel.build(map, self);
        }

        public AnalyzeChestVesselResponseBodyDataAortaInfo setArea(java.util.List<Float> area) {
            this.area = area;
            return this;
        }
        public java.util.List<Float> getArea() {
            return this.area;
        }

        public AnalyzeChestVesselResponseBodyDataAortaInfo setCoordinates(java.util.List<java.util.List<Float>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<java.util.List<Float>> getCoordinates() {
            return this.coordinates;
        }

        public AnalyzeChestVesselResponseBodyDataAortaInfo setLabelValue(Long labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public Long getLabelValue() {
            return this.labelValue;
        }

        public AnalyzeChestVesselResponseBodyDataAortaInfo setMaxArea(Float maxArea) {
            this.maxArea = maxArea;
            return this;
        }
        public Float getMaxArea() {
            return this.maxArea;
        }

        public AnalyzeChestVesselResponseBodyDataAortaInfo setMaxAreaIndex(Long maxAreaIndex) {
            this.maxAreaIndex = maxAreaIndex;
            return this;
        }
        public Long getMaxAreaIndex() {
            return this.maxAreaIndex;
        }

        public AnalyzeChestVesselResponseBodyDataAortaInfo setMaxDiameter(Float maxDiameter) {
            this.maxDiameter = maxDiameter;
            return this;
        }
        public Float getMaxDiameter() {
            return this.maxDiameter;
        }

    }

    public static class AnalyzeChestVesselResponseBodyDataPulmonaryInfo extends TeaModel {
        @NameInMap("Area")
        public java.util.List<Float> area;

        @NameInMap("Coordinates")
        public java.util.List<java.util.List<Float>> coordinates;

        @NameInMap("LabelValue")
        public Long labelValue;

        @NameInMap("MaxArea")
        public Float maxArea;

        @NameInMap("MaxAreaIndex")
        public Long maxAreaIndex;

        @NameInMap("MaxDiameter")
        public Float maxDiameter;

        @NameInMap("NearestAortaArea")
        public Float nearestAortaArea;

        public static AnalyzeChestVesselResponseBodyDataPulmonaryInfo build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeChestVesselResponseBodyDataPulmonaryInfo self = new AnalyzeChestVesselResponseBodyDataPulmonaryInfo();
            return TeaModel.build(map, self);
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setArea(java.util.List<Float> area) {
            this.area = area;
            return this;
        }
        public java.util.List<Float> getArea() {
            return this.area;
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setCoordinates(java.util.List<java.util.List<Float>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<java.util.List<Float>> getCoordinates() {
            return this.coordinates;
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setLabelValue(Long labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public Long getLabelValue() {
            return this.labelValue;
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setMaxArea(Float maxArea) {
            this.maxArea = maxArea;
            return this;
        }
        public Float getMaxArea() {
            return this.maxArea;
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setMaxAreaIndex(Long maxAreaIndex) {
            this.maxAreaIndex = maxAreaIndex;
            return this;
        }
        public Long getMaxAreaIndex() {
            return this.maxAreaIndex;
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setMaxDiameter(Float maxDiameter) {
            this.maxDiameter = maxDiameter;
            return this;
        }
        public Float getMaxDiameter() {
            return this.maxDiameter;
        }

        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo setNearestAortaArea(Float nearestAortaArea) {
            this.nearestAortaArea = nearestAortaArea;
            return this;
        }
        public Float getNearestAortaArea() {
            return this.nearestAortaArea;
        }

    }

    public static class AnalyzeChestVesselResponseBodyData extends TeaModel {
        @NameInMap("AortaInfo")
        public AnalyzeChestVesselResponseBodyDataAortaInfo aortaInfo;

        @NameInMap("PulmonaryInfo")
        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo pulmonaryInfo;

        @NameInMap("ResultURL")
        public String resultURL;

        public static AnalyzeChestVesselResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeChestVesselResponseBodyData self = new AnalyzeChestVesselResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AnalyzeChestVesselResponseBodyData setAortaInfo(AnalyzeChestVesselResponseBodyDataAortaInfo aortaInfo) {
            this.aortaInfo = aortaInfo;
            return this;
        }
        public AnalyzeChestVesselResponseBodyDataAortaInfo getAortaInfo() {
            return this.aortaInfo;
        }

        public AnalyzeChestVesselResponseBodyData setPulmonaryInfo(AnalyzeChestVesselResponseBodyDataPulmonaryInfo pulmonaryInfo) {
            this.pulmonaryInfo = pulmonaryInfo;
            return this;
        }
        public AnalyzeChestVesselResponseBodyDataPulmonaryInfo getPulmonaryInfo() {
            return this.pulmonaryInfo;
        }

        public AnalyzeChestVesselResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
