// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingGraphShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AssetName")
    public String assetName;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxId")
    public Long maxId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UniqueInfoList")
    public String uniqueInfoListShrink;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeSuspEventTracingGraphShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingGraphShrinkRequest self = new DescribeSuspEventTracingGraphShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingGraphShrinkRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setMaxId(Long maxId) {
        this.maxId = maxId;
        return this;
    }
    public Long getMaxId() {
        return this.maxId;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setUniqueInfoListShrink(String uniqueInfoListShrink) {
        this.uniqueInfoListShrink = uniqueInfoListShrink;
        return this;
    }
    public String getUniqueInfoListShrink() {
        return this.uniqueInfoListShrink;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingGraphShrinkRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
