// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForUserRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>当前查询的列表页码，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>当前查询的列表页码，默认为20。</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>账户ID。</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListGroupsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserRequest self = new ListGroupsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupsForUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupsForUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListGroupsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
