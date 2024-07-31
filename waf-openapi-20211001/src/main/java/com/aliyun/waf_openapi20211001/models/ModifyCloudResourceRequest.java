// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public ModifyCloudResourceRequestListen listen;

    @NameInMap("Redirect")
    public ModifyCloudResourceRequestRedirect redirect;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyCloudResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceRequest self = new ModifyCloudResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCloudResourceRequest setListen(ModifyCloudResourceRequestListen listen) {
        this.listen = listen;
        return this;
    }
    public ModifyCloudResourceRequestListen getListen() {
        return this.listen;
    }

    public ModifyCloudResourceRequest setRedirect(ModifyCloudResourceRequestRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public ModifyCloudResourceRequestRedirect getRedirect() {
        return this.redirect;
    }

    public ModifyCloudResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudResourceRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class ModifyCloudResourceRequestListenCertificates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static ModifyCloudResourceRequestListenCertificates build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestListenCertificates self = new ModifyCloudResourceRequestListenCertificates();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestListenCertificates setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public ModifyCloudResourceRequestListenCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class ModifyCloudResourceRequestListen extends TeaModel {
        @NameInMap("Certificates")
        public java.util.List<ModifyCloudResourceRequestListenCertificates> certificates;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-***</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clb7</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <strong>example:</strong>
         * <p>tlsv1.2</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        public static ModifyCloudResourceRequestListen build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestListen self = new ModifyCloudResourceRequestListen();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestListen setCertificates(java.util.List<ModifyCloudResourceRequestListenCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ModifyCloudResourceRequestListenCertificates> getCertificates() {
            return this.certificates;
        }

        public ModifyCloudResourceRequestListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public ModifyCloudResourceRequestListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public ModifyCloudResourceRequestListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public ModifyCloudResourceRequestListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public ModifyCloudResourceRequestListen setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyCloudResourceRequestListen setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyCloudResourceRequestListen setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public ModifyCloudResourceRequestListen setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public ModifyCloudResourceRequestListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

    }

    public static class ModifyCloudResourceRequestRedirectRequestHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyCloudResourceRequestRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestRedirectRequestHeaders self = new ModifyCloudResourceRequestRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyCloudResourceRequestRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyCloudResourceRequestRedirect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<ModifyCloudResourceRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XffProto")
        public Boolean xffProto;

        public static ModifyCloudResourceRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceRequestRedirect self = new ModifyCloudResourceRequestRedirect();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceRequestRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public ModifyCloudResourceRequestRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public ModifyCloudResourceRequestRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public ModifyCloudResourceRequestRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public ModifyCloudResourceRequestRedirect setRequestHeaders(java.util.List<ModifyCloudResourceRequestRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<ModifyCloudResourceRequestRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public ModifyCloudResourceRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public ModifyCloudResourceRequestRedirect setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public ModifyCloudResourceRequestRedirect setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

        public ModifyCloudResourceRequestRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

}
