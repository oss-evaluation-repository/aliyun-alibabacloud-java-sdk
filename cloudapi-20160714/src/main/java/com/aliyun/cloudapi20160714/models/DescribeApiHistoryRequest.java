// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc6e17ee3120404c839bbcd7622ab6ed</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>3013a55c0c44483f984d26df27120513</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies the version number that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20211122155403834</p>
     */
    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>TEST</strong>: the test environment</li>
     * <li><strong>PRE</strong>: the pre-release environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribeApiHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiHistoryRequest self = new DescribeApiHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiHistoryRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiHistoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiHistoryRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public DescribeApiHistoryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiHistoryRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
