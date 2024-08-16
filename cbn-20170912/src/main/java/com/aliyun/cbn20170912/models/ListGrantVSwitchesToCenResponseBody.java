// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchesToCenResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A9288C78-881A-5D30-A8A9-68E05EE0A086</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of vSwitches.</p>
     */
    @NameInMap("VSwitches")
    public java.util.List<ListGrantVSwitchesToCenResponseBodyVSwitches> vSwitches;

    public static ListGrantVSwitchesToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchesToCenResponseBody self = new ListGrantVSwitchesToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchesToCenResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGrantVSwitchesToCenResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGrantVSwitchesToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrantVSwitchesToCenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListGrantVSwitchesToCenResponseBody setVSwitches(java.util.List<ListGrantVSwitchesToCenResponseBodyVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<ListGrantVSwitchesToCenResponseBodyVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static class ListGrantVSwitchesToCenResponseBodyVSwitches extends TeaModel {
        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1194lh263wx1gsk****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <p>The ID of the VPC to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp12ge2tq5gzdc915****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListGrantVSwitchesToCenResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            ListGrantVSwitchesToCenResponseBodyVSwitches self = new ListGrantVSwitchesToCenResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGrantVSwitchesToCenResponseBodyVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
