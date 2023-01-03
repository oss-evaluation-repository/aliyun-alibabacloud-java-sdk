// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationRequest extends TeaModel {
    // The name of the alert integration.
    @NameInMap("IntegrationName")
    public String integrationName;

    // The service of the alert integration. Valid values:
    // 
    // *   CLOUD_MONITOR: CloudMonitor
    // *   LOG_SERVICE: Log Service
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    // Specifies whether to display the details of each alert integration:
    // 
    // *   true
    // *   false
    @NameInMap("IsDetail")
    public Boolean isDetail;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    // The number of alert integrations to return on each page.
    @NameInMap("Size")
    public Long size;

    public static ListIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationRequest self = new ListIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationRequest setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
        return this;
    }
    public String getIntegrationName() {
        return this.integrationName;
    }

    public ListIntegrationRequest setIntegrationProductType(String integrationProductType) {
        this.integrationProductType = integrationProductType;
        return this;
    }
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    public ListIntegrationRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public ListIntegrationRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListIntegrationRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
