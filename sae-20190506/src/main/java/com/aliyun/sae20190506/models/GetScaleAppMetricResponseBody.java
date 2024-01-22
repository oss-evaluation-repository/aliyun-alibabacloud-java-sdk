// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetScaleAppMetricResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The following limits are imposed on the ID:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of applications.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetScaleAppMetricResponseBodyData> data;

    /**
     * <p>The additional information that is returned. The following limits are imposed on the ID:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the microservice list was obtained. The following limits are imposed on the ID:</p>
     * <br>
     * <p>*   **true**: The namespaces were obtained.</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScaleAppMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScaleAppMetricResponseBody self = new GetScaleAppMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScaleAppMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScaleAppMetricResponseBody setData(java.util.List<GetScaleAppMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetScaleAppMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetScaleAppMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScaleAppMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScaleAppMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScaleAppMetricResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The maximum number of instances.</p>
         */
        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The current number of instances.</p>
         */
        @NameInMap("Runnings")
        public Long runnings;

        public static GetScaleAppMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScaleAppMetricResponseBodyData self = new GetScaleAppMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScaleAppMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetScaleAppMetricResponseBodyData setMaxReplicas(Long maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        public GetScaleAppMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScaleAppMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetScaleAppMetricResponseBodyData setRunnings(Long runnings) {
            this.runnings = runnings;
            return this;
        }
        public Long getRunnings() {
            return this.runnings;
        }

    }

}
