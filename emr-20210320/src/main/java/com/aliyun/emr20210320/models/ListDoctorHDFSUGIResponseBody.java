// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHDFSUGIResponseBody extends TeaModel {
    /**
     * <p>The results of batch HDFS analysis.</p>
     */
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>The maximum number of entries that are returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorHDFSUGIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHDFSUGIResponseBody self = new ListDoctorHDFSUGIResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorHDFSUGIResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorHDFSUGIResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHDFSUGIResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHDFSUGIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorHDFSUGIResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class TotalDataSize extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TotalDataSize build(java.util.Map<String, ?> map) throws Exception {
            TotalDataSize self = new TotalDataSize();
            return TeaModel.build(map, self);
        }

        public TotalDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalDirCount extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TotalDirCount build(java.util.Map<String, ?> map) throws Exception {
            TotalDirCount self = new TotalDirCount();
            return TeaModel.build(map, self);
        }

        public TotalDirCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDirCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDirCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDirCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalFileCount extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         */
        @NameInMap("Value")
        public Long value;

        public static TotalFileCount build(java.util.Map<String, ?> map) throws Exception {
            TotalFileCount self = new TotalFileCount();
            return TeaModel.build(map, self);
        }

        public TotalFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        /**
         * <p>The total data size.</p>
         */
        @NameInMap("TotalDataSize")
        public TotalDataSize totalDataSize;

        /**
         * <p>The total number of directories.</p>
         */
        @NameInMap("TotalDirCount")
        public TotalDirCount totalDirCount;

        /**
         * <p>The total number of files.</p>
         */
        @NameInMap("TotalFileCount")
        public TotalFileCount totalFileCount;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setTotalDataSize(TotalDataSize totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        public Metrics setTotalDirCount(TotalDirCount totalDirCount) {
            this.totalDirCount = totalDirCount;
            return this;
        }
        public TotalDirCount getTotalDirCount() {
            return this.totalDirCount;
        }

        public Metrics setTotalFileCount(TotalFileCount totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }
        public TotalFileCount getTotalFileCount() {
            return this.totalFileCount;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>The metric information.</p>
         */
        @NameInMap("Metrics")
        public Metrics metrics;

        /**
         * <p>The actual name of the owner or group returned based on the value of Type.</p>
         */
        @NameInMap("Name")
        public String name;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

        public Data setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
