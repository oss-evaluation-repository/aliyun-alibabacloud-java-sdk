// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMessageReceiversResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageReceivers")
    public ListMessageReceiversResponseBodyMessageReceivers messageReceivers;

    public static ListMessageReceiversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageReceiversResponseBody self = new ListMessageReceiversResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageReceiversResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageReceiversResponseBody setMessageReceivers(ListMessageReceiversResponseBodyMessageReceivers messageReceivers) {
        this.messageReceivers = messageReceivers;
        return this;
    }
    public ListMessageReceiversResponseBodyMessageReceivers getMessageReceivers() {
        return this.messageReceivers;
    }

    public static class ListMessageReceiversResponseBodyMessageReceiversList extends TeaModel {
        @NameInMap("Mid")
        public Long mid;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListMessageReceiversResponseBodyMessageReceiversList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageReceiversResponseBodyMessageReceiversList self = new ListMessageReceiversResponseBodyMessageReceiversList();
            return TeaModel.build(map, self);
        }

        public ListMessageReceiversResponseBodyMessageReceiversList setMid(Long mid) {
            this.mid = mid;
            return this;
        }
        public Long getMid() {
            return this.mid;
        }

        public ListMessageReceiversResponseBodyMessageReceiversList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMessageReceiversResponseBodyMessageReceiversList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMessageReceiversResponseBodyMessageReceiversPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListMessageReceiversResponseBodyMessageReceiversPagination build(java.util.Map<String, ?> map) throws Exception {
            ListMessageReceiversResponseBodyMessageReceiversPagination self = new ListMessageReceiversResponseBodyMessageReceiversPagination();
            return TeaModel.build(map, self);
        }

        public ListMessageReceiversResponseBodyMessageReceiversPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListMessageReceiversResponseBodyMessageReceiversPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListMessageReceiversResponseBodyMessageReceiversPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListMessageReceiversResponseBodyMessageReceiversPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListMessageReceiversResponseBodyMessageReceivers extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListMessageReceiversResponseBodyMessageReceiversList> list;

        @NameInMap("Pagination")
        public ListMessageReceiversResponseBodyMessageReceiversPagination pagination;

        public static ListMessageReceiversResponseBodyMessageReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListMessageReceiversResponseBodyMessageReceivers self = new ListMessageReceiversResponseBodyMessageReceivers();
            return TeaModel.build(map, self);
        }

        public ListMessageReceiversResponseBodyMessageReceivers setList(java.util.List<ListMessageReceiversResponseBodyMessageReceiversList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMessageReceiversResponseBodyMessageReceiversList> getList() {
            return this.list;
        }

        public ListMessageReceiversResponseBodyMessageReceivers setPagination(ListMessageReceiversResponseBodyMessageReceiversPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListMessageReceiversResponseBodyMessageReceiversPagination getPagination() {
            return this.pagination;
        }

    }

}
