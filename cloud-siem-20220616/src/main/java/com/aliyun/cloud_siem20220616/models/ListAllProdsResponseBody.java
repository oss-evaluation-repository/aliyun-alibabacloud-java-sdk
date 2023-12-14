// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAllProdsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAllProdsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAllProdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllProdsResponseBody self = new ListAllProdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllProdsResponseBody setData(ListAllProdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAllProdsResponseBodyData getData() {
        return this.data;
    }

    public ListAllProdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAllProdsResponseBodyDataProdList extends TeaModel {
        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("ImportedLogCount")
        public Integer importedLogCount;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("TotalLogCount")
        public Integer totalLogCount;

        public static ListAllProdsResponseBodyDataProdList build(java.util.Map<String, ?> map) throws Exception {
            ListAllProdsResponseBodyDataProdList self = new ListAllProdsResponseBodyDataProdList();
            return TeaModel.build(map, self);
        }

        public ListAllProdsResponseBodyDataProdList setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListAllProdsResponseBodyDataProdList setImportedLogCount(Integer importedLogCount) {
            this.importedLogCount = importedLogCount;
            return this;
        }
        public Integer getImportedLogCount() {
            return this.importedLogCount;
        }

        public ListAllProdsResponseBodyDataProdList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAllProdsResponseBodyDataProdList setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public ListAllProdsResponseBodyDataProdList setTotalLogCount(Integer totalLogCount) {
            this.totalLogCount = totalLogCount;
            return this;
        }
        public Integer getTotalLogCount() {
            return this.totalLogCount;
        }

    }

    public static class ListAllProdsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ProdList")
        public java.util.List<ListAllProdsResponseBodyDataProdList> prodList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAllProdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllProdsResponseBodyData self = new ListAllProdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllProdsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAllProdsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAllProdsResponseBodyData setProdList(java.util.List<ListAllProdsResponseBodyDataProdList> prodList) {
            this.prodList = prodList;
            return this;
        }
        public java.util.List<ListAllProdsResponseBodyDataProdList> getProdList() {
            return this.prodList;
        }

        public ListAllProdsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
