// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried zones.</p>
     */
    @NameInMap("Zones")
    public DescribeZonesResponseBodyZones zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(DescribeZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesKVStoreZone extends TeaModel {
        /**
         * <p>Indicates whether ApsaraDB for Redis instances can be created in the current zone. Valid values:</p>
         * <br>
         * <p>*   **true**: ApsaraDB for Redis instances cannot be created in the current zone.</p>
         * <p>*   **false**: ApsaraDB for Redis instances can be created in the current zone.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Indicates whether the zone is managed by ApsaraDB RDS. The return value of this parameter is **true** in ApsaraDB for Redis.</p>
         */
        @NameInMap("IsRds")
        public Boolean isRds;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether the network type of the instance can be changed from the classic network to Virtual Private Cloud (VPC). Valid values:</p>
         * <br>
         * <p>*   **true**: The network type of the instance can be changed from the classic network to VPC.</p>
         * <p>*   **false**: The network type of the instance cannot be changed from the classic network to VPC.</p>
         */
        @NameInMap("SwitchNetwork")
        public Boolean switchNetwork;

        /**
         * <p>The ID of the zone within the specified region.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone within the specified region.</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeZonesResponseBodyZonesKVStoreZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesKVStoreZone self = new DescribeZonesResponseBodyZonesKVStoreZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setIsRds(Boolean isRds) {
            this.isRds = isRds;
            return this;
        }
        public Boolean getIsRds() {
            return this.isRds;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setSwitchNetwork(Boolean switchNetwork) {
            this.switchNetwork = switchNetwork;
            return this;
        }
        public Boolean getSwitchNetwork() {
            return this.switchNetwork;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("KVStoreZone")
        public java.util.List<DescribeZonesResponseBodyZonesKVStoreZone> KVStoreZone;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setKVStoreZone(java.util.List<DescribeZonesResponseBodyZonesKVStoreZone> KVStoreZone) {
            this.KVStoreZone = KVStoreZone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesKVStoreZone> getKVStoreZone() {
            return this.KVStoreZone;
        }

    }

}
