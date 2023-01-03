// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesRequest extends TeaModel {
    // The ID of the alert rule. You can call the SearchAlertRules operation and view the `Id` parameter in the response. For more information, see [SearchAlertRules](~~175825~~).
    @NameInMap("AlertId")
    public Long alertId;

    // The type of the alert rule. Valid values:
    // 
    // *   `1`: custom alert rules to monitor drill-down data sets
    // *   `3`: custom alert rules to monitor tiled data sets
    // *   `4`: alert rules to monitor the frontend, including the default frontend alert rules
    // *   `5`: alert rules to monitor applications, including the default application alert rules
    // *   `6`: the default frontend alert rules
    // *   `7`: the default application alert rules
    // *   `8`: Tracing Analysis alert rules
    // *   `101`: Prometheus alert rules
    @NameInMap("AlertType")
    public Integer alertType;

    // The number of the page to return. Default value: `1`.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The end of the time range to query. Specify a UNIX timestamp of the LONG data type, in milliseconds. The default value is the current time.
    @NameInMap("EndTime")
    public Long endTime;

    // The number of entries to return on each page. Default value: `10`.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region. Default value: `cn-hangzhou`.
    @NameInMap("RegionId")
    public String regionId;

    // The beginning of the time range to query. Specify a UNIX timestamp of the LONG data type, in milliseconds. The default value is 10 minutes before the current time.
    @NameInMap("StartTime")
    public Long startTime;

    public static SearchAlertHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistoriesRequest self = new SearchAlertHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertHistoriesRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public SearchAlertHistoriesRequest setAlertType(Integer alertType) {
        this.alertType = alertType;
        return this;
    }
    public Integer getAlertType() {
        return this.alertType;
    }

    public SearchAlertHistoriesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchAlertHistoriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchAlertHistoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAlertHistoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchAlertHistoriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
