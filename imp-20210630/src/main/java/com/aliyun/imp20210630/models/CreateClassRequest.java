// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateClassRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 课堂标题
    @NameInMap("Title")
    public String title;

    // 创建人用户ID。
    @NameInMap("CreateUserId")
    public String createUserId;

    // 创建人用户昵称。
    @NameInMap("CreateNickname")
    public String createNickname;

    public static CreateClassRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClassRequest self = new CreateClassRequest();
        return TeaModel.build(map, self);
    }

    public CreateClassRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateClassRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateClassRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public CreateClassRequest setCreateNickname(String createNickname) {
        this.createNickname = createNickname;
        return this;
    }
    public String getCreateNickname() {
        return this.createNickname;
    }

}
