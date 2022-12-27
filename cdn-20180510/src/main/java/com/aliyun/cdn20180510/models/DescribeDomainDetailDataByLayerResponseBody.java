// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailDataByLayerResponseBody extends TeaModel {
    // The detailed data of the accelerated domain names.
    @NameInMap("Data")
    public DescribeDomainDetailDataByLayerResponseBodyData data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainDetailDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailDataByLayerResponseBody self = new DescribeDomainDetailDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailDataByLayerResponseBody setData(DescribeDomainDetailDataByLayerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDomainDetailDataByLayerResponseBodyData getData() {
        return this.data;
    }

    public DescribeDomainDetailDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainDetailDataByLayerResponseBodyDataDataModule extends TeaModel {
        // The number of requests.
        @NameInMap("Acc")
        public Long acc;

        // The bandwidth. Unit: bit/s.
        @NameInMap("Bps")
        public Float bps;

        // The domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The proportions of HTTP status codes.
        @NameInMap("HttpCode")
        public String httpCode;

        // The number of IPv6 requests.
        @NameInMap("Ipv6Acc")
        public Long ipv6Acc;

        // The bandwidth of IPv6 requests. Unit: bit/s.
        @NameInMap("Ipv6Bps")
        public Float ipv6Bps;

        // The number of IPv6 requests per second.
        @NameInMap("Ipv6Qps")
        public Float ipv6Qps;

        // The amount of network traffic generated by IPv6 requests. Unit: bytes.
        @NameInMap("Ipv6Traf")
        public Long ipv6Traf;

        // The number of queries per second.
        @NameInMap("Qps")
        public Float qps;

        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The amount of network traffic. Unit: bytes.
        @NameInMap("Traf")
        public Long traf;

        public static DescribeDomainDetailDataByLayerResponseBodyDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailDataByLayerResponseBodyDataDataModule self = new DescribeDomainDetailDataByLayerResponseBodyDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setIpv6Acc(Long ipv6Acc) {
            this.ipv6Acc = ipv6Acc;
            return this;
        }
        public Long getIpv6Acc() {
            return this.ipv6Acc;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setIpv6Bps(Float ipv6Bps) {
            this.ipv6Bps = ipv6Bps;
            return this;
        }
        public Float getIpv6Bps() {
            return this.ipv6Bps;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setIpv6Qps(Float ipv6Qps) {
            this.ipv6Qps = ipv6Qps;
            return this;
        }
        public Float getIpv6Qps() {
            return this.ipv6Qps;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setIpv6Traf(Long ipv6Traf) {
            this.ipv6Traf = ipv6Traf;
            return this;
        }
        public Long getIpv6Traf() {
            return this.ipv6Traf;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainDetailDataByLayerResponseBodyDataDataModule setTraf(Long traf) {
            this.traf = traf;
            return this;
        }
        public Long getTraf() {
            return this.traf;
        }

    }

    public static class DescribeDomainDetailDataByLayerResponseBodyData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainDetailDataByLayerResponseBodyDataDataModule> dataModule;

        public static DescribeDomainDetailDataByLayerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailDataByLayerResponseBodyData self = new DescribeDomainDetailDataByLayerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailDataByLayerResponseBodyData setDataModule(java.util.List<DescribeDomainDetailDataByLayerResponseBodyDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainDetailDataByLayerResponseBodyDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
