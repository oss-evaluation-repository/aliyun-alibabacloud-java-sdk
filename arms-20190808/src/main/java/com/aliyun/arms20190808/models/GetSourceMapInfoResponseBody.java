// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSourceMapInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceMapList")
    public java.util.List<GetSourceMapInfoResponseBodySourceMapList> sourceMapList;

    public static GetSourceMapInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceMapInfoResponseBody self = new GetSourceMapInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceMapInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourceMapInfoResponseBody setSourceMapList(java.util.List<GetSourceMapInfoResponseBodySourceMapList> sourceMapList) {
        this.sourceMapList = sourceMapList;
        return this;
    }
    public java.util.List<GetSourceMapInfoResponseBodySourceMapList> getSourceMapList() {
        return this.sourceMapList;
    }

    public static class GetSourceMapInfoResponseBodySourceMapList extends TeaModel {
        @NameInMap("Fid")
        public String fid;

        /**
         * <strong>example:</strong>
         * <p>test.sourcemap.js</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>201223</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>1590657842000</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        /**
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetSourceMapInfoResponseBodySourceMapList build(java.util.Map<String, ?> map) throws Exception {
            GetSourceMapInfoResponseBodySourceMapList self = new GetSourceMapInfoResponseBodySourceMapList();
            return TeaModel.build(map, self);
        }

        public GetSourceMapInfoResponseBodySourceMapList setFid(String fid) {
            this.fid = fid;
            return this;
        }
        public String getFid() {
            return this.fid;
        }

        public GetSourceMapInfoResponseBodySourceMapList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSourceMapInfoResponseBodySourceMapList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public GetSourceMapInfoResponseBodySourceMapList setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public GetSourceMapInfoResponseBodySourceMapList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
