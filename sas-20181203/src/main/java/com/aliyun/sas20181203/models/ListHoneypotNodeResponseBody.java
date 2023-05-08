// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotNodeResponseBody extends TeaModel {
    /**
     * <p>Queries the information about management nodes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("HoneypotNodeList")
    public java.util.List<ListHoneypotNodeResponseBodyHoneypotNodeList> honeypotNodeList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>ListHoneypotNode</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>An array that consists of the allowed CIDR blocks.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotNodeResponseBodyPageInfo pageInfo;

    /**
     * <p>WB01224678</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotNodeResponseBody self = new ListHoneypotNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotNodeResponseBody setHoneypotNodeList(java.util.List<ListHoneypotNodeResponseBodyHoneypotNodeList> honeypotNodeList) {
        this.honeypotNodeList = honeypotNodeList;
        return this;
    }
    public java.util.List<ListHoneypotNodeResponseBodyHoneypotNodeList> getHoneypotNodeList() {
        return this.honeypotNodeList;
    }

    public ListHoneypotNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotNodeResponseBody setPageInfo(ListHoneypotNodeResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotNodeResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotNodeResponseBodyHoneypotNodeList extends TeaModel {
        /**
         * <p>The maximum number of probes that can be used.</p>
         */
        @NameInMap("AllowHoneypotAccessInternet")
        public Boolean allowHoneypotAccessInternet;

        /**
         * <p>The ID of the management node.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("DefaultNode")
        public Boolean defaultNode;

        /**
         * <p>The HTTP status code returned.</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The ID of the management node.</p>
         */
        @NameInMap("HoneypotTotalCount")
        public Integer honeypotTotalCount;

        /**
         * <p>The maximum number of honeypots that can be deployed on the management node.</p>
         */
        @NameInMap("HoneypotUsedCount")
        public Integer honeypotUsedCount;

        /**
         * <p>The name of the management node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The type of the management node. Default value: **false**. Valid values:</p>
         * <br>
         * <p>*   **false**: non-default type</p>
         * <p>*   **true**: default type</p>
         */
        @NameInMap("ProbeTotalCount")
        public Integer probeTotalCount;

        /**
         * <p>Indicates whether the honeypot is allowed to access the Internet.</p>
         * <br>
         * <p>*   **true**: The honeypot is allowed to access the Internet.</p>
         * <p>*   **false**: The honeypot is not allowed to access the Internet.</p>
         */
        @NameInMap("ProbeUsedCount")
        public Integer probeUsedCount;

        /**
         * <p>The status of the management node. Valid values:</p>
         * <br>
         * <p>*   **1**: normal</p>
         * <p>*   **2**: abnormal</p>
         */
        @NameInMap("SecurityGroupProbeIpList")
        public java.util.List<String> securityGroupProbeIpList;

        /**
         * <p>The number of honeypots that are deployed on the management node.</p>
         */
        @NameInMap("TotalStatus")
        public Integer totalStatus;

        /**
         * <p>Whether the node is upgradable. Valid values:</p>
         * <p>*   **false**: non-default type</p>
         * <p>*   **true**: default type</p>
         */
        @NameInMap("UpgradeAvailable")
        public Boolean upgradeAvailable;

        public static ListHoneypotNodeResponseBodyHoneypotNodeList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotNodeResponseBodyHoneypotNodeList self = new ListHoneypotNodeResponseBodyHoneypotNodeList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setAllowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
            this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
            return this;
        }
        public Boolean getAllowHoneypotAccessInternet() {
            return this.allowHoneypotAccessInternet;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setDefaultNode(Boolean defaultNode) {
            this.defaultNode = defaultNode;
            return this;
        }
        public Boolean getDefaultNode() {
            return this.defaultNode;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setHoneypotTotalCount(Integer honeypotTotalCount) {
            this.honeypotTotalCount = honeypotTotalCount;
            return this;
        }
        public Integer getHoneypotTotalCount() {
            return this.honeypotTotalCount;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setHoneypotUsedCount(Integer honeypotUsedCount) {
            this.honeypotUsedCount = honeypotUsedCount;
            return this;
        }
        public Integer getHoneypotUsedCount() {
            return this.honeypotUsedCount;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setProbeTotalCount(Integer probeTotalCount) {
            this.probeTotalCount = probeTotalCount;
            return this;
        }
        public Integer getProbeTotalCount() {
            return this.probeTotalCount;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setProbeUsedCount(Integer probeUsedCount) {
            this.probeUsedCount = probeUsedCount;
            return this;
        }
        public Integer getProbeUsedCount() {
            return this.probeUsedCount;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setSecurityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
            this.securityGroupProbeIpList = securityGroupProbeIpList;
            return this;
        }
        public java.util.List<String> getSecurityGroupProbeIpList() {
            return this.securityGroupProbeIpList;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setTotalStatus(Integer totalStatus) {
            this.totalStatus = totalStatus;
            return this;
        }
        public Integer getTotalStatus() {
            return this.totalStatus;
        }

        public ListHoneypotNodeResponseBodyHoneypotNodeList setUpgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

    }

    public static class ListHoneypotNodeResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The IP address of the management node.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The number of entries to return on each page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>An array that consists of the information about the management nodes.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotNodeResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotNodeResponseBodyPageInfo self = new ListHoneypotNodeResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotNodeResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotNodeResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotNodeResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotNodeResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
