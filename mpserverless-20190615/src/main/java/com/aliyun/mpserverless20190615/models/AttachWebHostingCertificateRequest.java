// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachWebHostingCertificateRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("ServerCertificate")
    public String serverCertificate;

    @NameInMap("PrivateKey")
    public String privateKey;

    public static AttachWebHostingCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachWebHostingCertificateRequest self = new AttachWebHostingCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AttachWebHostingCertificateRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AttachWebHostingCertificateRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AttachWebHostingCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public AttachWebHostingCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AttachWebHostingCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public AttachWebHostingCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
