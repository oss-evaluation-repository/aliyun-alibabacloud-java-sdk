// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListDomainsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C61E30D3-579A-5B43-994E-31E02EDC9129</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDomainsResponseBody setData(ListDomainsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDomainsResponseBodyData getData() {
        return this.data;
    }

    public ListDomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDomainsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<DomainInfo> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyData self = new ListDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyData setItems(java.util.List<DomainInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DomainInfo> getItems() {
            return this.items;
        }

        public ListDomainsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDomainsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDomainsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
