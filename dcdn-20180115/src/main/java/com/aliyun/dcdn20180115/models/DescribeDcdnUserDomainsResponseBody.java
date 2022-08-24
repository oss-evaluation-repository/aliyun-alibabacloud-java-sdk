// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeDcdnUserDomainsResponseBodyDomains domains;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsResponseBody self = new DescribeDcdnUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsResponseBody setDomains(DescribeDcdnUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        public static DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources self = new DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnUserDomainsResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainId")
        public Long domainId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("Sources")
        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources sources;

        public static DescribeDcdnUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomainsPageData self = new DescribeDcdnUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setSources(DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

    }

    public static class DescribeDcdnUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomains self = new DescribeDcdnUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
