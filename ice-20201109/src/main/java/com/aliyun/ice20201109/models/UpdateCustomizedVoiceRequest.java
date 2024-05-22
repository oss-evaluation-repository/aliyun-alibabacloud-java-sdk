// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateCustomizedVoiceRequest extends TeaModel {
    @NameInMap("DemoAudioMediaId")
    public String demoAudioMediaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    public static UpdateCustomizedVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizedVoiceRequest self = new UpdateCustomizedVoiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizedVoiceRequest setDemoAudioMediaId(String demoAudioMediaId) {
        this.demoAudioMediaId = demoAudioMediaId;
        return this;
    }
    public String getDemoAudioMediaId() {
        return this.demoAudioMediaId;
    }

    public UpdateCustomizedVoiceRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
