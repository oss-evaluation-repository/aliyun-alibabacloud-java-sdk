// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOfflineMessagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OfflineMessages")
    public ListOfflineMessagesResponseBodyOfflineMessages offlineMessages;

    public static ListOfflineMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineMessagesResponseBody self = new ListOfflineMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfflineMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfflineMessagesResponseBody setOfflineMessages(ListOfflineMessagesResponseBodyOfflineMessages offlineMessages) {
        this.offlineMessages = offlineMessages;
        return this;
    }
    public ListOfflineMessagesResponseBodyOfflineMessages getOfflineMessages() {
        return this.offlineMessages;
    }

    public static class ListOfflineMessagesResponseBodyOfflineMessagesList extends TeaModel {
        @NameInMap("Mid")
        public Long mid;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        public static ListOfflineMessagesResponseBodyOfflineMessagesList build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineMessagesResponseBodyOfflineMessagesList self = new ListOfflineMessagesResponseBodyOfflineMessagesList();
            return TeaModel.build(map, self);
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesList setMid(Long mid) {
            this.mid = mid;
            return this;
        }
        public Long getMid() {
            return this.mid;
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesList setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

    }

    public static class ListOfflineMessagesResponseBodyOfflineMessagesPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListOfflineMessagesResponseBodyOfflineMessagesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineMessagesResponseBodyOfflineMessagesPagination self = new ListOfflineMessagesResponseBodyOfflineMessagesPagination();
            return TeaModel.build(map, self);
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListOfflineMessagesResponseBodyOfflineMessagesPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListOfflineMessagesResponseBodyOfflineMessages extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListOfflineMessagesResponseBodyOfflineMessagesList> list;

        @NameInMap("Pagination")
        public ListOfflineMessagesResponseBodyOfflineMessagesPagination pagination;

        public static ListOfflineMessagesResponseBodyOfflineMessages build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineMessagesResponseBodyOfflineMessages self = new ListOfflineMessagesResponseBodyOfflineMessages();
            return TeaModel.build(map, self);
        }

        public ListOfflineMessagesResponseBodyOfflineMessages setList(java.util.List<ListOfflineMessagesResponseBodyOfflineMessagesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListOfflineMessagesResponseBodyOfflineMessagesList> getList() {
            return this.list;
        }

        public ListOfflineMessagesResponseBodyOfflineMessages setPagination(ListOfflineMessagesResponseBodyOfflineMessagesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListOfflineMessagesResponseBodyOfflineMessagesPagination getPagination() {
            return this.pagination;
        }

    }

}
