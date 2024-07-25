// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DomainInfo extends TeaModel {
    @NameInMap("certIdentifier")
    public String certIdentifier;

    @NameInMap("createFrom")
    public String createFrom;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("domainId")
    public String domainId;

    @NameInMap("forceHttps")
    public Boolean forceHttps;

    @NameInMap("name")
    public String name;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("status")
    public String status;

    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static DomainInfo build(java.util.Map<String, ?> map) throws Exception {
        DomainInfo self = new DomainInfo();
        return TeaModel.build(map, self);
    }

    public DomainInfo setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DomainInfo setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
        return this;
    }
    public String getCreateFrom() {
        return this.createFrom;
    }

    public DomainInfo setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DomainInfo setForceHttps(Boolean forceHttps) {
        this.forceHttps = forceHttps;
        return this;
    }
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    public DomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DomainInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DomainInfo setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

}
