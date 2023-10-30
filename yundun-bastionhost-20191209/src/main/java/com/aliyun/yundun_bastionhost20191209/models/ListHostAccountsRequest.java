// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsRequest extends TeaModel {
    /**
     * <p>Indicates whether a password is configured for the host account.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: A password is configured for the host account.</p>
     * <p>*   false: No passwords are configured for the host account.</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The protocol used by the host whose accounts you want to query.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   SSH</p>
     * <p>*   RDP</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The ID of the shared key.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operation that you want to perform.</p>
     * <br>
     * <p>Set the value to **ListHostAccounts**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The name of the host account that you want to query. The name can be up to 128 characters in length. Only exact match is supported.</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The ID of the specified host whose accounts you want to query.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListHostAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsRequest self = new ListHostAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public ListHostAccountsRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListHostAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostAccountsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostAccountsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostAccountsRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public ListHostAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
