// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2018-01-23T03:15Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>5808</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <strong>example:</strong>
     * <p>test record</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>2018-01-24T06:35Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>Zone ID。</p>
     * 
     * <strong>example:</strong>
     * <p>CAgICA1OA_58</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeZoneRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneRecordResponseBody self = new DescribeZoneRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZoneRecordResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeZoneRecordResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeZoneRecordResponseBody setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeZoneRecordResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DescribeZoneRecordResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public DescribeZoneRecordResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeZoneRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZoneRecordResponseBody setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public DescribeZoneRecordResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeZoneRecordResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeZoneRecordResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeZoneRecordResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeZoneRecordResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeZoneRecordResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DescribeZoneRecordResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public DescribeZoneRecordResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
