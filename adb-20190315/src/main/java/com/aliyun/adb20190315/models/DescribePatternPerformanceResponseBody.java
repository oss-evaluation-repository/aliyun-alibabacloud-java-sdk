// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Performances")
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances;

    public static DescribePatternPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternPerformanceResponseBody self = new DescribePatternPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePatternPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePatternPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePatternPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePatternPerformanceResponseBody setPerformances(java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public static class DescribePatternPerformanceResponseBodyPerformancesSeries extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        public static DescribePatternPerformanceResponseBodyPerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribePatternPerformanceResponseBodyPerformancesSeries self = new DescribePatternPerformanceResponseBodyPerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribePatternPerformanceResponseBodyPerformancesSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribePatternPerformanceResponseBodyPerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribePatternPerformanceResponseBodyPerformances extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Series")
        public java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> series;

        public static DescribePatternPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribePatternPerformanceResponseBodyPerformances self = new DescribePatternPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribePatternPerformanceResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePatternPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribePatternPerformanceResponseBodyPerformances setSeries(java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> getSeries() {
            return this.series;
        }

    }

}
