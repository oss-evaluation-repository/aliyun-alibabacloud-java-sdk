// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAssetSelectionTargetResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListAssetSelectionTargetResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAssetSelectionTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetSelectionTargetResponseBody self = new ListAssetSelectionTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetSelectionTargetResponseBody setData(java.util.List<ListAssetSelectionTargetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAssetSelectionTargetResponseBodyData> getData() {
        return this.data;
    }

    public ListAssetSelectionTargetResponseBody setPageInfo(ListAssetSelectionTargetResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAssetSelectionTargetResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAssetSelectionTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAssetSelectionTargetResponseBodyData extends TeaModel {
        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        public static ListAssetSelectionTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAssetSelectionTargetResponseBodyData self = new ListAssetSelectionTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAssetSelectionTargetResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAssetSelectionTargetResponseBodyData setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

    }

    public static class ListAssetSelectionTargetResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAssetSelectionTargetResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAssetSelectionTargetResponseBodyPageInfo self = new ListAssetSelectionTargetResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAssetSelectionTargetResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAssetSelectionTargetResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAssetSelectionTargetResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
