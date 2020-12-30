// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupSummaryReportsByIntervalRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupIds")
    public String skillGroupIds;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSkillGroupSummaryReportsByIntervalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupSummaryReportsByIntervalRequest self = new ListSkillGroupSummaryReportsByIntervalRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setSkillGroupIds(String skillGroupIds) {
        this.skillGroupIds = skillGroupIds;
        return this;
    }
    public String getSkillGroupIds() {
        return this.skillGroupIds;
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillGroupSummaryReportsByIntervalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
