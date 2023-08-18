// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCustomizedVoiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomizedVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceResponseBody self = new GetCustomizedVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceResponseBody setData(GetCustomizedVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomizedVoiceResponseBodyData getData() {
        return this.data;
    }

    public GetCustomizedVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomizedVoiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomizedVoiceResponseBodyDataCustomizedVoice extends TeaModel {
        @NameInMap("DemoAudioMediaId")
        public String demoAudioMediaId;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("Scenario")
        public String scenario;

        @NameInMap("VoiceDesc")
        public String voiceDesc;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceName")
        public String voiceName;

        public static GetCustomizedVoiceResponseBodyDataCustomizedVoice build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceResponseBodyDataCustomizedVoice self = new GetCustomizedVoiceResponseBodyDataCustomizedVoice();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setDemoAudioMediaId(String demoAudioMediaId) {
            this.demoAudioMediaId = demoAudioMediaId;
            return this;
        }
        public String getDemoAudioMediaId() {
            return this.demoAudioMediaId;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setVoiceDesc(String voiceDesc) {
            this.voiceDesc = voiceDesc;
            return this;
        }
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setVoiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }
        public String getVoiceName() {
            return this.voiceName;
        }

    }

    public static class GetCustomizedVoiceResponseBodyData extends TeaModel {
        @NameInMap("CustomizedVoice")
        public GetCustomizedVoiceResponseBodyDataCustomizedVoice customizedVoice;

        public static GetCustomizedVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceResponseBodyData self = new GetCustomizedVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceResponseBodyData setCustomizedVoice(GetCustomizedVoiceResponseBodyDataCustomizedVoice customizedVoice) {
            this.customizedVoice = customizedVoice;
            return this;
        }
        public GetCustomizedVoiceResponseBodyDataCustomizedVoice getCustomizedVoice() {
            return this.customizedVoice;
        }

    }

}
