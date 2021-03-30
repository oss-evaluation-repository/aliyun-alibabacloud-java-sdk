// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Nasid")
    public String nasid;

    @NameInMap("IgnoreWeakProbe")
    public Integer ignoreWeakProbe;

    @NameInMap("FourthAuthPort")
    public Integer fourthAuthPort;

    @NameInMap("CirType")
    public Integer cirType;

    @NameInMap("Ieee80211r")
    public Integer ieee80211r;

    @NameInMap("MobilityDomain")
    public String mobilityDomain;

    @NameInMap("DaePort")
    public Integer daePort;

    @NameInMap("FourthAuthServer")
    public String fourthAuthServer;

    @NameInMap("SecondaryAcctSecret")
    public String secondaryAcctSecret;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("FourthAuthSecret")
    public String fourthAuthSecret;

    @NameInMap("AcctStatusServerWork")
    public Integer acctStatusServerWork;

    @NameInMap("Ieee80211w")
    public String ieee80211w;

    @NameInMap("SsidLb")
    public Integer ssidLb;

    @NameInMap("AuthPort")
    public Integer authPort;

    @NameInMap("AuthServer")
    public String authServer;

    @NameInMap("DaeSecret")
    public String daeSecret;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CirStep")
    public Long cirStep;

    @NameInMap("AuthStatusServerWork")
    public Integer authStatusServerWork;

    @NameInMap("SecondaryAuthPort")
    public Integer secondaryAuthPort;

    @NameInMap("SecondaryAuthSecret")
    public String secondaryAuthSecret;

    @NameInMap("ShortPreamble")
    public String shortPreamble;

    @NameInMap("CirUl")
    public Long cirUl;

    @NameInMap("DaeClient")
    public String daeClient;

    @NameInMap("LiteEffect")
    public Boolean liteEffect;

    @NameInMap("ThirdAuthSecret")
    public String thirdAuthSecret;

    @NameInMap("ThirdAuthPort")
    public Integer thirdAuthPort;

    @NameInMap("AcctServer")
    public String acctServer;

    @NameInMap("SecondaryAuthServer")
    public String secondaryAuthServer;

    @NameInMap("EncKey")
    public String encKey;

    @NameInMap("AcctSecret")
    public String acctSecret;

    @NameInMap("AuthCache")
    public String authCache;

    @NameInMap("MulticastForward")
    public Integer multicastForward;

    @NameInMap("SecondaryAcctPort")
    public Integer secondaryAcctPort;

    @NameInMap("RadioIndex")
    public String radioIndex;

    @NameInMap("NdProxyWork")
    public Integer ndProxyWork;

    @NameInMap("Hidden")
    public String hidden;

    @NameInMap("MaxInactivity")
    public Integer maxInactivity;

    @NameInMap("ThirdAuthServer")
    public String thirdAuthServer;

    @NameInMap("SendConfigToAp")
    public Boolean sendConfigToAp;

    @NameInMap("Ssid")
    public String ssid;

    @NameInMap("Cir")
    public Long cir;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("Network")
    public Integer network;

    @NameInMap("Isolate")
    public String isolate;

    @NameInMap("DisassocWeakRssi")
    public Integer disassocWeakRssi;

    @NameInMap("ApAssetId")
    public Long apAssetId;

    @NameInMap("Encryption")
    public String encryption;

    @NameInMap("VlanDhcp")
    public Integer vlanDhcp;

    @NameInMap("Wmm")
    public String wmm;

    @NameInMap("DynamicVlan")
    public Integer dynamicVlan;

    @NameInMap("Disabled")
    public String disabled;

    @NameInMap("Maxassoc")
    public Integer maxassoc;

    @NameInMap("AcctPort")
    public Integer acctPort;

    @NameInMap("AuthSecret")
    public String authSecret;

    @NameInMap("FtOverDs")
    public Integer ftOverDs;

    @NameInMap("ArpProxyEnable")
    public Integer arpProxyEnable;

    @NameInMap("DisassocLowAck")
    public String disassocLowAck;

    @NameInMap("SecondaryAcctServer")
    public String secondaryAcctServer;

    @NameInMap("Ownip")
    public String ownip;

    public static SaveApSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApSsidConfigRequest self = new SaveApSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApSsidConfigRequest setNasid(String nasid) {
        this.nasid = nasid;
        return this;
    }
    public String getNasid() {
        return this.nasid;
    }

    public SaveApSsidConfigRequest setIgnoreWeakProbe(Integer ignoreWeakProbe) {
        this.ignoreWeakProbe = ignoreWeakProbe;
        return this;
    }
    public Integer getIgnoreWeakProbe() {
        return this.ignoreWeakProbe;
    }

    public SaveApSsidConfigRequest setFourthAuthPort(Integer fourthAuthPort) {
        this.fourthAuthPort = fourthAuthPort;
        return this;
    }
    public Integer getFourthAuthPort() {
        return this.fourthAuthPort;
    }

    public SaveApSsidConfigRequest setCirType(Integer cirType) {
        this.cirType = cirType;
        return this;
    }
    public Integer getCirType() {
        return this.cirType;
    }

    public SaveApSsidConfigRequest setIeee80211r(Integer ieee80211r) {
        this.ieee80211r = ieee80211r;
        return this;
    }
    public Integer getIeee80211r() {
        return this.ieee80211r;
    }

    public SaveApSsidConfigRequest setMobilityDomain(String mobilityDomain) {
        this.mobilityDomain = mobilityDomain;
        return this;
    }
    public String getMobilityDomain() {
        return this.mobilityDomain;
    }

    public SaveApSsidConfigRequest setDaePort(Integer daePort) {
        this.daePort = daePort;
        return this;
    }
    public Integer getDaePort() {
        return this.daePort;
    }

    public SaveApSsidConfigRequest setFourthAuthServer(String fourthAuthServer) {
        this.fourthAuthServer = fourthAuthServer;
        return this;
    }
    public String getFourthAuthServer() {
        return this.fourthAuthServer;
    }

    public SaveApSsidConfigRequest setSecondaryAcctSecret(String secondaryAcctSecret) {
        this.secondaryAcctSecret = secondaryAcctSecret;
        return this;
    }
    public String getSecondaryAcctSecret() {
        return this.secondaryAcctSecret;
    }

    public SaveApSsidConfigRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveApSsidConfigRequest setFourthAuthSecret(String fourthAuthSecret) {
        this.fourthAuthSecret = fourthAuthSecret;
        return this;
    }
    public String getFourthAuthSecret() {
        return this.fourthAuthSecret;
    }

    public SaveApSsidConfigRequest setAcctStatusServerWork(Integer acctStatusServerWork) {
        this.acctStatusServerWork = acctStatusServerWork;
        return this;
    }
    public Integer getAcctStatusServerWork() {
        return this.acctStatusServerWork;
    }

    public SaveApSsidConfigRequest setIeee80211w(String ieee80211w) {
        this.ieee80211w = ieee80211w;
        return this;
    }
    public String getIeee80211w() {
        return this.ieee80211w;
    }

    public SaveApSsidConfigRequest setSsidLb(Integer ssidLb) {
        this.ssidLb = ssidLb;
        return this;
    }
    public Integer getSsidLb() {
        return this.ssidLb;
    }

    public SaveApSsidConfigRequest setAuthPort(Integer authPort) {
        this.authPort = authPort;
        return this;
    }
    public Integer getAuthPort() {
        return this.authPort;
    }

    public SaveApSsidConfigRequest setAuthServer(String authServer) {
        this.authServer = authServer;
        return this;
    }
    public String getAuthServer() {
        return this.authServer;
    }

    public SaveApSsidConfigRequest setDaeSecret(String daeSecret) {
        this.daeSecret = daeSecret;
        return this;
    }
    public String getDaeSecret() {
        return this.daeSecret;
    }

    public SaveApSsidConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApSsidConfigRequest setCirStep(Long cirStep) {
        this.cirStep = cirStep;
        return this;
    }
    public Long getCirStep() {
        return this.cirStep;
    }

    public SaveApSsidConfigRequest setAuthStatusServerWork(Integer authStatusServerWork) {
        this.authStatusServerWork = authStatusServerWork;
        return this;
    }
    public Integer getAuthStatusServerWork() {
        return this.authStatusServerWork;
    }

    public SaveApSsidConfigRequest setSecondaryAuthPort(Integer secondaryAuthPort) {
        this.secondaryAuthPort = secondaryAuthPort;
        return this;
    }
    public Integer getSecondaryAuthPort() {
        return this.secondaryAuthPort;
    }

    public SaveApSsidConfigRequest setSecondaryAuthSecret(String secondaryAuthSecret) {
        this.secondaryAuthSecret = secondaryAuthSecret;
        return this;
    }
    public String getSecondaryAuthSecret() {
        return this.secondaryAuthSecret;
    }

    public SaveApSsidConfigRequest setShortPreamble(String shortPreamble) {
        this.shortPreamble = shortPreamble;
        return this;
    }
    public String getShortPreamble() {
        return this.shortPreamble;
    }

    public SaveApSsidConfigRequest setCirUl(Long cirUl) {
        this.cirUl = cirUl;
        return this;
    }
    public Long getCirUl() {
        return this.cirUl;
    }

    public SaveApSsidConfigRequest setDaeClient(String daeClient) {
        this.daeClient = daeClient;
        return this;
    }
    public String getDaeClient() {
        return this.daeClient;
    }

    public SaveApSsidConfigRequest setLiteEffect(Boolean liteEffect) {
        this.liteEffect = liteEffect;
        return this;
    }
    public Boolean getLiteEffect() {
        return this.liteEffect;
    }

    public SaveApSsidConfigRequest setThirdAuthSecret(String thirdAuthSecret) {
        this.thirdAuthSecret = thirdAuthSecret;
        return this;
    }
    public String getThirdAuthSecret() {
        return this.thirdAuthSecret;
    }

    public SaveApSsidConfigRequest setThirdAuthPort(Integer thirdAuthPort) {
        this.thirdAuthPort = thirdAuthPort;
        return this;
    }
    public Integer getThirdAuthPort() {
        return this.thirdAuthPort;
    }

    public SaveApSsidConfigRequest setAcctServer(String acctServer) {
        this.acctServer = acctServer;
        return this;
    }
    public String getAcctServer() {
        return this.acctServer;
    }

    public SaveApSsidConfigRequest setSecondaryAuthServer(String secondaryAuthServer) {
        this.secondaryAuthServer = secondaryAuthServer;
        return this;
    }
    public String getSecondaryAuthServer() {
        return this.secondaryAuthServer;
    }

    public SaveApSsidConfigRequest setEncKey(String encKey) {
        this.encKey = encKey;
        return this;
    }
    public String getEncKey() {
        return this.encKey;
    }

    public SaveApSsidConfigRequest setAcctSecret(String acctSecret) {
        this.acctSecret = acctSecret;
        return this;
    }
    public String getAcctSecret() {
        return this.acctSecret;
    }

    public SaveApSsidConfigRequest setAuthCache(String authCache) {
        this.authCache = authCache;
        return this;
    }
    public String getAuthCache() {
        return this.authCache;
    }

    public SaveApSsidConfigRequest setMulticastForward(Integer multicastForward) {
        this.multicastForward = multicastForward;
        return this;
    }
    public Integer getMulticastForward() {
        return this.multicastForward;
    }

    public SaveApSsidConfigRequest setSecondaryAcctPort(Integer secondaryAcctPort) {
        this.secondaryAcctPort = secondaryAcctPort;
        return this;
    }
    public Integer getSecondaryAcctPort() {
        return this.secondaryAcctPort;
    }

    public SaveApSsidConfigRequest setRadioIndex(String radioIndex) {
        this.radioIndex = radioIndex;
        return this;
    }
    public String getRadioIndex() {
        return this.radioIndex;
    }

    public SaveApSsidConfigRequest setNdProxyWork(Integer ndProxyWork) {
        this.ndProxyWork = ndProxyWork;
        return this;
    }
    public Integer getNdProxyWork() {
        return this.ndProxyWork;
    }

    public SaveApSsidConfigRequest setHidden(String hidden) {
        this.hidden = hidden;
        return this;
    }
    public String getHidden() {
        return this.hidden;
    }

    public SaveApSsidConfigRequest setMaxInactivity(Integer maxInactivity) {
        this.maxInactivity = maxInactivity;
        return this;
    }
    public Integer getMaxInactivity() {
        return this.maxInactivity;
    }

    public SaveApSsidConfigRequest setThirdAuthServer(String thirdAuthServer) {
        this.thirdAuthServer = thirdAuthServer;
        return this;
    }
    public String getThirdAuthServer() {
        return this.thirdAuthServer;
    }

    public SaveApSsidConfigRequest setSendConfigToAp(Boolean sendConfigToAp) {
        this.sendConfigToAp = sendConfigToAp;
        return this;
    }
    public Boolean getSendConfigToAp() {
        return this.sendConfigToAp;
    }

    public SaveApSsidConfigRequest setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

    public SaveApSsidConfigRequest setCir(Long cir) {
        this.cir = cir;
        return this;
    }
    public Long getCir() {
        return this.cir;
    }

    public SaveApSsidConfigRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public SaveApSsidConfigRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApSsidConfigRequest setIsolate(String isolate) {
        this.isolate = isolate;
        return this;
    }
    public String getIsolate() {
        return this.isolate;
    }

    public SaveApSsidConfigRequest setDisassocWeakRssi(Integer disassocWeakRssi) {
        this.disassocWeakRssi = disassocWeakRssi;
        return this;
    }
    public Integer getDisassocWeakRssi() {
        return this.disassocWeakRssi;
    }

    public SaveApSsidConfigRequest setApAssetId(Long apAssetId) {
        this.apAssetId = apAssetId;
        return this;
    }
    public Long getApAssetId() {
        return this.apAssetId;
    }

    public SaveApSsidConfigRequest setEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }
    public String getEncryption() {
        return this.encryption;
    }

    public SaveApSsidConfigRequest setVlanDhcp(Integer vlanDhcp) {
        this.vlanDhcp = vlanDhcp;
        return this;
    }
    public Integer getVlanDhcp() {
        return this.vlanDhcp;
    }

    public SaveApSsidConfigRequest setWmm(String wmm) {
        this.wmm = wmm;
        return this;
    }
    public String getWmm() {
        return this.wmm;
    }

    public SaveApSsidConfigRequest setDynamicVlan(Integer dynamicVlan) {
        this.dynamicVlan = dynamicVlan;
        return this;
    }
    public Integer getDynamicVlan() {
        return this.dynamicVlan;
    }

    public SaveApSsidConfigRequest setDisabled(String disabled) {
        this.disabled = disabled;
        return this;
    }
    public String getDisabled() {
        return this.disabled;
    }

    public SaveApSsidConfigRequest setMaxassoc(Integer maxassoc) {
        this.maxassoc = maxassoc;
        return this;
    }
    public Integer getMaxassoc() {
        return this.maxassoc;
    }

    public SaveApSsidConfigRequest setAcctPort(Integer acctPort) {
        this.acctPort = acctPort;
        return this;
    }
    public Integer getAcctPort() {
        return this.acctPort;
    }

    public SaveApSsidConfigRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApSsidConfigRequest setFtOverDs(Integer ftOverDs) {
        this.ftOverDs = ftOverDs;
        return this;
    }
    public Integer getFtOverDs() {
        return this.ftOverDs;
    }

    public SaveApSsidConfigRequest setArpProxyEnable(Integer arpProxyEnable) {
        this.arpProxyEnable = arpProxyEnable;
        return this;
    }
    public Integer getArpProxyEnable() {
        return this.arpProxyEnable;
    }

    public SaveApSsidConfigRequest setDisassocLowAck(String disassocLowAck) {
        this.disassocLowAck = disassocLowAck;
        return this;
    }
    public String getDisassocLowAck() {
        return this.disassocLowAck;
    }

    public SaveApSsidConfigRequest setSecondaryAcctServer(String secondaryAcctServer) {
        this.secondaryAcctServer = secondaryAcctServer;
        return this;
    }
    public String getSecondaryAcctServer() {
        return this.secondaryAcctServer;
    }

    public SaveApSsidConfigRequest setOwnip(String ownip) {
        this.ownip = ownip;
        return this;
    }
    public String getOwnip() {
        return this.ownip;
    }

}
