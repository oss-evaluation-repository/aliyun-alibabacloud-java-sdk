// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageModerationResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static ImageModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageModerationResponseBody self = new ImageModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageModerationResponseBody setData(ImageModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageModerationResponseBodyData getData() {
        return this.data;
    }

    public ImageModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ImageModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageModerationResponseBodyDataExtRecognition extends TeaModel {
        @NameInMap("Classification")
        public String classification;

        @NameInMap("Confidence")
        public Float confidence;

        public static ImageModerationResponseBodyDataExtRecognition build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtRecognition self = new ImageModerationResponseBodyDataExtRecognition();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtRecognition setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ImageModerationResponseBodyDataExtRecognition setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class ImageModerationResponseBodyDataExt extends TeaModel {
        @NameInMap("Recognition")
        public java.util.List<ImageModerationResponseBodyDataExtRecognition> recognition;

        public static ImageModerationResponseBodyDataExt build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExt self = new ImageModerationResponseBodyDataExt();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExt setRecognition(java.util.List<ImageModerationResponseBodyDataExtRecognition> recognition) {
            this.recognition = recognition;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtRecognition> getRecognition() {
            return this.recognition;
        }

    }

    public static class ImageModerationResponseBodyDataResult extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Label")
        public String label;

        public static ImageModerationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataResult self = new ImageModerationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ImageModerationResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Ext")
        public ImageModerationResponseBodyDataExt ext;

        @NameInMap("Result")
        public java.util.List<ImageModerationResponseBodyDataResult> result;

        public static ImageModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyData self = new ImageModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImageModerationResponseBodyData setExt(ImageModerationResponseBodyDataExt ext) {
            this.ext = ext;
            return this;
        }
        public ImageModerationResponseBodyDataExt getExt() {
            return this.ext;
        }

        public ImageModerationResponseBodyData setResult(java.util.List<ImageModerationResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
