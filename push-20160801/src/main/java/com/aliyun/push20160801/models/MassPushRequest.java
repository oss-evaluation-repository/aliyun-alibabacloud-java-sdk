// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("PushTask")
    public java.util.List<MassPushRequestPushTask> pushTask;

    public static MassPushRequest build(java.util.Map<String, ?> map) throws Exception {
        MassPushRequest self = new MassPushRequest();
        return TeaModel.build(map, self);
    }

    public MassPushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public MassPushRequest setPushTask(java.util.List<MassPushRequestPushTask> pushTask) {
        this.pushTask = pushTask;
        return this;
    }
    public java.util.List<MassPushRequestPushTask> getPushTask() {
        return this.pushTask;
    }

    public static class MassPushRequestPushTask extends TeaModel {
        @NameInMap("JobKey")
        public String jobKey;

        @NameInMap("iOSNotificationCollapseId")
        public String iOSNotificationCollapseId;

        @NameInMap("iOSSilentNotification")
        public Boolean iOSSilentNotification;

        @NameInMap("StoreOffline")
        public Boolean storeOffline;

        @NameInMap("iOSNotificationCategory")
        public String iOSNotificationCategory;

        @NameInMap("iOSSubtitle")
        public String iOSSubtitle;

        @NameInMap("AndroidNotificationChannel")
        public String androidNotificationChannel;

        @NameInMap("AndroidNotificationHuaweiChannel")
        public String androidNotificationHuaweiChannel;

        @NameInMap("iOSApnsEnv")
        public String iOSApnsEnv;

        @NameInMap("iOSBadgeAutoIncrement")
        public Boolean iOSBadgeAutoIncrement;

        @NameInMap("AndroidXiaoMiNotifyTitle")
        public String androidXiaoMiNotifyTitle;

        @NameInMap("AndroidNotificationXiaomiChannel")
        public String androidNotificationXiaomiChannel;

        @NameInMap("AndroidXiaoMiActivity")
        public String androidXiaoMiActivity;

        @NameInMap("AndroidPopupTitle")
        public String androidPopupTitle;

        @NameInMap("iOSRemindBody")
        public String iOSRemindBody;

        @NameInMap("AndroidActivity")
        public String androidActivity;

        @NameInMap("AndroidNotifyType")
        public String androidNotifyType;

        @NameInMap("iOSMutableContent")
        public Boolean iOSMutableContent;

        @NameInMap("Target")
        public String target;

        @NameInMap("AndroidOpenUrl")
        public String androidOpenUrl;

        @NameInMap("AndroidNotificationNotifyId")
        public Integer androidNotificationNotifyId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("AndroidNotificationVivoChannel")
        public String androidNotificationVivoChannel;

        @NameInMap("AndroidOpenType")
        public String androidOpenType;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("AndroidPopupActivity")
        public String androidPopupActivity;

        @NameInMap("AndroidRemind")
        public Boolean androidRemind;

        @NameInMap("AndroidPopupBody")
        public String androidPopupBody;

        @NameInMap("AndroidExtParameters")
        public String androidExtParameters;

        @NameInMap("iOSExtParameters")
        public String iOSExtParameters;

        @NameInMap("AndroidXiaoMiNotifyBody")
        public String androidXiaoMiNotifyBody;

        @NameInMap("Body")
        public String body;

        @NameInMap("AndroidNotificationBarType")
        public Integer androidNotificationBarType;

        @NameInMap("AndroidNotificationBarPriority")
        public Integer androidNotificationBarPriority;

        @NameInMap("TargetValue")
        public String targetValue;

        @NameInMap("iOSMusic")
        public String iOSMusic;

        @NameInMap("iOSRemind")
        public Boolean iOSRemind;

        @NameInMap("PushType")
        public String pushType;

        @NameInMap("iOSBadge")
        public Integer iOSBadge;

        @NameInMap("SendSpeed")
        public Integer sendSpeed;

        @NameInMap("Title")
        public String title;

        @NameInMap("PushTime")
        public String pushTime;

        @NameInMap("AndroidMusic")
        public String androidMusic;

        public static MassPushRequestPushTask build(java.util.Map<String, ?> map) throws Exception {
            MassPushRequestPushTask self = new MassPushRequestPushTask();
            return TeaModel.build(map, self);
        }

        public MassPushRequestPushTask setJobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }
        public String getJobKey() {
            return this.jobKey;
        }

        public MassPushRequestPushTask setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
            this.iOSNotificationCollapseId = iOSNotificationCollapseId;
            return this;
        }
        public String getIOSNotificationCollapseId() {
            return this.iOSNotificationCollapseId;
        }

        public MassPushRequestPushTask setIOSSilentNotification(Boolean iOSSilentNotification) {
            this.iOSSilentNotification = iOSSilentNotification;
            return this;
        }
        public Boolean getIOSSilentNotification() {
            return this.iOSSilentNotification;
        }

        public MassPushRequestPushTask setStoreOffline(Boolean storeOffline) {
            this.storeOffline = storeOffline;
            return this;
        }
        public Boolean getStoreOffline() {
            return this.storeOffline;
        }

        public MassPushRequestPushTask setIOSNotificationCategory(String iOSNotificationCategory) {
            this.iOSNotificationCategory = iOSNotificationCategory;
            return this;
        }
        public String getIOSNotificationCategory() {
            return this.iOSNotificationCategory;
        }

        public MassPushRequestPushTask setIOSSubtitle(String iOSSubtitle) {
            this.iOSSubtitle = iOSSubtitle;
            return this;
        }
        public String getIOSSubtitle() {
            return this.iOSSubtitle;
        }

        public MassPushRequestPushTask setAndroidNotificationChannel(String androidNotificationChannel) {
            this.androidNotificationChannel = androidNotificationChannel;
            return this;
        }
        public String getAndroidNotificationChannel() {
            return this.androidNotificationChannel;
        }

        public MassPushRequestPushTask setAndroidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
            this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
            return this;
        }
        public String getAndroidNotificationHuaweiChannel() {
            return this.androidNotificationHuaweiChannel;
        }

        public MassPushRequestPushTask setIOSApnsEnv(String iOSApnsEnv) {
            this.iOSApnsEnv = iOSApnsEnv;
            return this;
        }
        public String getIOSApnsEnv() {
            return this.iOSApnsEnv;
        }

        public MassPushRequestPushTask setIOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
            this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
            return this;
        }
        public Boolean getIOSBadgeAutoIncrement() {
            return this.iOSBadgeAutoIncrement;
        }

        public MassPushRequestPushTask setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
            this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
            return this;
        }
        public String getAndroidXiaoMiNotifyTitle() {
            return this.androidXiaoMiNotifyTitle;
        }

        public MassPushRequestPushTask setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
            this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
            return this;
        }
        public String getAndroidNotificationXiaomiChannel() {
            return this.androidNotificationXiaomiChannel;
        }

        public MassPushRequestPushTask setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
            this.androidXiaoMiActivity = androidXiaoMiActivity;
            return this;
        }
        public String getAndroidXiaoMiActivity() {
            return this.androidXiaoMiActivity;
        }

        public MassPushRequestPushTask setAndroidPopupTitle(String androidPopupTitle) {
            this.androidPopupTitle = androidPopupTitle;
            return this;
        }
        public String getAndroidPopupTitle() {
            return this.androidPopupTitle;
        }

        public MassPushRequestPushTask setIOSRemindBody(String iOSRemindBody) {
            this.iOSRemindBody = iOSRemindBody;
            return this;
        }
        public String getIOSRemindBody() {
            return this.iOSRemindBody;
        }

        public MassPushRequestPushTask setAndroidActivity(String androidActivity) {
            this.androidActivity = androidActivity;
            return this;
        }
        public String getAndroidActivity() {
            return this.androidActivity;
        }

        public MassPushRequestPushTask setAndroidNotifyType(String androidNotifyType) {
            this.androidNotifyType = androidNotifyType;
            return this;
        }
        public String getAndroidNotifyType() {
            return this.androidNotifyType;
        }

        public MassPushRequestPushTask setIOSMutableContent(Boolean iOSMutableContent) {
            this.iOSMutableContent = iOSMutableContent;
            return this;
        }
        public Boolean getIOSMutableContent() {
            return this.iOSMutableContent;
        }

        public MassPushRequestPushTask setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public MassPushRequestPushTask setAndroidOpenUrl(String androidOpenUrl) {
            this.androidOpenUrl = androidOpenUrl;
            return this;
        }
        public String getAndroidOpenUrl() {
            return this.androidOpenUrl;
        }

        public MassPushRequestPushTask setAndroidNotificationNotifyId(Integer androidNotificationNotifyId) {
            this.androidNotificationNotifyId = androidNotificationNotifyId;
            return this;
        }
        public Integer getAndroidNotificationNotifyId() {
            return this.androidNotificationNotifyId;
        }

        public MassPushRequestPushTask setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public MassPushRequestPushTask setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
            this.androidNotificationVivoChannel = androidNotificationVivoChannel;
            return this;
        }
        public String getAndroidNotificationVivoChannel() {
            return this.androidNotificationVivoChannel;
        }

        public MassPushRequestPushTask setAndroidOpenType(String androidOpenType) {
            this.androidOpenType = androidOpenType;
            return this;
        }
        public String getAndroidOpenType() {
            return this.androidOpenType;
        }

        public MassPushRequestPushTask setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public MassPushRequestPushTask setAndroidPopupActivity(String androidPopupActivity) {
            this.androidPopupActivity = androidPopupActivity;
            return this;
        }
        public String getAndroidPopupActivity() {
            return this.androidPopupActivity;
        }

        public MassPushRequestPushTask setAndroidRemind(Boolean androidRemind) {
            this.androidRemind = androidRemind;
            return this;
        }
        public Boolean getAndroidRemind() {
            return this.androidRemind;
        }

        public MassPushRequestPushTask setAndroidPopupBody(String androidPopupBody) {
            this.androidPopupBody = androidPopupBody;
            return this;
        }
        public String getAndroidPopupBody() {
            return this.androidPopupBody;
        }

        public MassPushRequestPushTask setAndroidExtParameters(String androidExtParameters) {
            this.androidExtParameters = androidExtParameters;
            return this;
        }
        public String getAndroidExtParameters() {
            return this.androidExtParameters;
        }

        public MassPushRequestPushTask setIOSExtParameters(String iOSExtParameters) {
            this.iOSExtParameters = iOSExtParameters;
            return this;
        }
        public String getIOSExtParameters() {
            return this.iOSExtParameters;
        }

        public MassPushRequestPushTask setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
            this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
            return this;
        }
        public String getAndroidXiaoMiNotifyBody() {
            return this.androidXiaoMiNotifyBody;
        }

        public MassPushRequestPushTask setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public MassPushRequestPushTask setAndroidNotificationBarType(Integer androidNotificationBarType) {
            this.androidNotificationBarType = androidNotificationBarType;
            return this;
        }
        public Integer getAndroidNotificationBarType() {
            return this.androidNotificationBarType;
        }

        public MassPushRequestPushTask setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
            this.androidNotificationBarPriority = androidNotificationBarPriority;
            return this;
        }
        public Integer getAndroidNotificationBarPriority() {
            return this.androidNotificationBarPriority;
        }

        public MassPushRequestPushTask setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

        public MassPushRequestPushTask setIOSMusic(String iOSMusic) {
            this.iOSMusic = iOSMusic;
            return this;
        }
        public String getIOSMusic() {
            return this.iOSMusic;
        }

        public MassPushRequestPushTask setIOSRemind(Boolean iOSRemind) {
            this.iOSRemind = iOSRemind;
            return this;
        }
        public Boolean getIOSRemind() {
            return this.iOSRemind;
        }

        public MassPushRequestPushTask setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

        public MassPushRequestPushTask setIOSBadge(Integer iOSBadge) {
            this.iOSBadge = iOSBadge;
            return this;
        }
        public Integer getIOSBadge() {
            return this.iOSBadge;
        }

        public MassPushRequestPushTask setSendSpeed(Integer sendSpeed) {
            this.sendSpeed = sendSpeed;
            return this;
        }
        public Integer getSendSpeed() {
            return this.sendSpeed;
        }

        public MassPushRequestPushTask setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public MassPushRequestPushTask setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public MassPushRequestPushTask setAndroidMusic(String androidMusic) {
            this.androidMusic = androidMusic;
            return this;
        }
        public String getAndroidMusic() {
            return this.androidMusic;
        }

    }

}
