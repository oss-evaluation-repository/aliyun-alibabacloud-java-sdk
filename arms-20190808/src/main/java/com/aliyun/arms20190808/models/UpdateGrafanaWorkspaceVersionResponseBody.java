// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceVersionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <ul>
     * <li><code>2XX</code>: The request is successful.</li>
     * <li><code>3XX</code>: A redirection message is returned.</li>
     * <li><code>4XX</code>: The request is invalid.</li>
     * <li><code>5XX</code>: A server error occurs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the update is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2A0CEDF1-06FE-44AC-8E21-21A5BE65****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>eac0a8048716731735000007137d000b</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UpdateGrafanaWorkspaceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceVersionResponseBody self = new UpdateGrafanaWorkspaceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceVersionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateGrafanaWorkspaceVersionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateGrafanaWorkspaceVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGrafanaWorkspaceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGrafanaWorkspaceVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateGrafanaWorkspaceVersionResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
