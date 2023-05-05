// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictClassifierModelRequest extends TeaModel {
    @NameInMap("AutoPrediction")
    public Boolean autoPrediction;

    @NameInMap("BinaryToText")
    public Boolean binaryToText;

    @NameInMap("Body")
    public String body;

    @NameInMap("ClassifierId")
    public Long classifierId;

    @NameInMap("Content")
    public String content;

    public static PredictClassifierModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictClassifierModelRequest self = new PredictClassifierModelRequest();
        return TeaModel.build(map, self);
    }

    public PredictClassifierModelRequest setAutoPrediction(Boolean autoPrediction) {
        this.autoPrediction = autoPrediction;
        return this;
    }
    public Boolean getAutoPrediction() {
        return this.autoPrediction;
    }

    public PredictClassifierModelRequest setBinaryToText(Boolean binaryToText) {
        this.binaryToText = binaryToText;
        return this;
    }
    public Boolean getBinaryToText() {
        return this.binaryToText;
    }

    public PredictClassifierModelRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PredictClassifierModelRequest setClassifierId(Long classifierId) {
        this.classifierId = classifierId;
        return this;
    }
    public Long getClassifierId() {
        return this.classifierId;
    }

    public PredictClassifierModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
