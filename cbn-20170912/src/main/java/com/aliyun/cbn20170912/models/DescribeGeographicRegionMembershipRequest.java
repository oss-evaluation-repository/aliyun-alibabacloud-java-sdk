// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipRequest extends TeaModel {
    /**
     * <p>The ID of the area that you want to query. Valid values:</p>
     * <br>
     * <p>*   **china**: the Chinese mainland</p>
     * <p>*   **asia-pacific**: Asia Pacific</p>
     * <p>*   **europe**: Europe</p>
     * <p>*   **australia**: Australia</p>
     * <p>*   **north-america**: North America</p>
     */
    @NameInMap("GeographicRegionId")
    public String geographicRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Default value: **10**. Valid values: **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeGeographicRegionMembershipRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeographicRegionMembershipRequest self = new DescribeGeographicRegionMembershipRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGeographicRegionMembershipRequest setGeographicRegionId(String geographicRegionId) {
        this.geographicRegionId = geographicRegionId;
        return this;
    }
    public String getGeographicRegionId() {
        return this.geographicRegionId;
    }

    public DescribeGeographicRegionMembershipRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeGeographicRegionMembershipRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGeographicRegionMembershipRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGeographicRegionMembershipRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGeographicRegionMembershipRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeGeographicRegionMembershipRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
