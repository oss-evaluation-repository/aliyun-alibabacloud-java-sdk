// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsRequest extends TeaModel {
    /**
     * <p>The ID of the video.</p>
     * <p>> The VideoId parameter is required.</p>
     */
    @NameInMap("EncryptConfig")
    public String encryptConfig;

    /**
     * <p>The transcoding jobs.</p>
     * <p>> This parameter is not returned for HLS packaging tasks. You must asynchronously receive the transcoding result.</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The priority of the current transcoding job in all queued jobs.</p>
     * <p>*   Valid values: **1** to **10**.</p>
     * <p>*   A value of **10** indicates the highest priority.</p>
     * <p>*   Default value: **6**.</p>
     * <p>> This parameter specifies the priority of only the current transcoding job in all queued jobs and does not affect the priorities of jobs that are running.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The encryption configurations. The value is a JSON-formatted string. This parameter is required only when HLS encryption is used.</p>
     * <p>> *   In the JSON-formatted string of the [EncryptConfig](~~86952~~) parameter, you must set the **CipherText** parameter to an AES-128 ciphertext key that is generated by calling the [GenerateDataKey](~~28948~~) operation. Otherwise, the transcoding job that uses HLS encryption fails. For more information about how to use HLS encryption, see [HLS encryption](~~68612~~).</p>
     * <p>> *   Regardless of whether HLS encryption or Alibaba Cloud proprietary cryptography is required, you must enable HLS encryption for the template group that is specified by the **TemplateGroupId** parameter. Otherwise, HLS encryption cannot be used.</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The parameters used for overriding. The value is a JSON-formatted string. You can set this parameter to override the watermark or subtitle that is associated with the transcoding template. You can override the file URL of an image watermark, the content of a text watermark, the URL of a subtitle file, and the encoding format of a subtitle file. For more information about the data structure, see the "OverrideParams" section of the [Media processing parameters](~~98618~~) topic.</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The detailed information of the job.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The operation that you want to perform. Set the value to **SubmitTranscodeJobs**.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsRequest self = new SubmitTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobsRequest setEncryptConfig(String encryptConfig) {
        this.encryptConfig = encryptConfig;
        return this;
    }
    public String getEncryptConfig() {
        return this.encryptConfig;
    }

    public SubmitTranscodeJobsRequest setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public SubmitTranscodeJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitTranscodeJobsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SubmitTranscodeJobsRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public SubmitTranscodeJobsRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitTranscodeJobsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
