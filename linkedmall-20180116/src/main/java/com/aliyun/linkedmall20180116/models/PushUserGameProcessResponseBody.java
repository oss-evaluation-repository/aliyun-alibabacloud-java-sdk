// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class PushUserGameProcessResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public PushUserGameProcessResponseBodyModel model;

    public static PushUserGameProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushUserGameProcessResponseBody self = new PushUserGameProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public PushUserGameProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushUserGameProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushUserGameProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushUserGameProcessResponseBody setModel(PushUserGameProcessResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public PushUserGameProcessResponseBodyModel getModel() {
        return this.model;
    }

    public static class PushUserGameProcessResponseBodyModel extends TeaModel {
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Content")
        public String content;

        @NameInMap("Status")
        public String status;

        @NameInMap("CurrentStepStatus")
        public String currentStepStatus;

        @NameInMap("CurrentStepId")
        public String currentStepId;

        @NameInMap("GameCoinRecords")
        public String gameCoinRecords;

        @NameInMap("GameAwardRecords")
        public String gameAwardRecords;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("RouteId")
        public String routeId;

        public static PushUserGameProcessResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            PushUserGameProcessResponseBodyModel self = new PushUserGameProcessResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public PushUserGameProcessResponseBodyModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public PushUserGameProcessResponseBodyModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public PushUserGameProcessResponseBodyModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public PushUserGameProcessResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PushUserGameProcessResponseBodyModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PushUserGameProcessResponseBodyModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public PushUserGameProcessResponseBodyModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PushUserGameProcessResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PushUserGameProcessResponseBodyModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public PushUserGameProcessResponseBodyModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public PushUserGameProcessResponseBodyModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public PushUserGameProcessResponseBodyModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public PushUserGameProcessResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public PushUserGameProcessResponseBodyModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
