// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchInnerGroupsResponseBody extends TeaModel {
    @NameInMap("groupInfos")
    public java.util.List<SearchInnerGroupsResponseBodyGroupInfos> groupInfos;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static SearchInnerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchInnerGroupsResponseBody self = new SearchInnerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchInnerGroupsResponseBody setGroupInfos(java.util.List<SearchInnerGroupsResponseBodyGroupInfos> groupInfos) {
        this.groupInfos = groupInfos;
        return this;
    }
    public java.util.List<SearchInnerGroupsResponseBodyGroupInfos> getGroupInfos() {
        return this.groupInfos;
    }

    public SearchInnerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchInnerGroupsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public SearchInnerGroupsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class SearchInnerGroupsResponseBodyGroupInfos extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("MemberAmount")
        public String memberAmount;

        @NameInMap("OpenConversationId")
        public String openConversationId;

        @NameInMap("Title")
        public String title;

        public static SearchInnerGroupsResponseBodyGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchInnerGroupsResponseBodyGroupInfos self = new SearchInnerGroupsResponseBodyGroupInfos();
            return TeaModel.build(map, self);
        }

        public SearchInnerGroupsResponseBodyGroupInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public SearchInnerGroupsResponseBodyGroupInfos setMemberAmount(String memberAmount) {
            this.memberAmount = memberAmount;
            return this;
        }
        public String getMemberAmount() {
            return this.memberAmount;
        }

        public SearchInnerGroupsResponseBodyGroupInfos setOpenConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }
        public String getOpenConversationId() {
            return this.openConversationId;
        }

        public SearchInnerGroupsResponseBodyGroupInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
