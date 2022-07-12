// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class BatchUpdateEtlMetaRequest extends TeaModel {
    @NameInMap("etlMetaList")
    public BatchUpdateEtlMetaRequestEtlMetaList etlMetaList;

    public static BatchUpdateEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateEtlMetaRequest self = new BatchUpdateEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateEtlMetaRequest setEtlMetaList(BatchUpdateEtlMetaRequestEtlMetaList etlMetaList) {
        this.etlMetaList = etlMetaList;
        return this;
    }
    public BatchUpdateEtlMetaRequestEtlMetaList getEtlMetaList() {
        return this.etlMetaList;
    }

    public static class BatchUpdateEtlMetaRequestEtlMetaList extends TeaModel {
        // 是否启用。etlMetaTag、etlMetaValue、enable 至少需要存在一个。
        @NameInMap("enable")
        public Boolean enable;

        // key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,255]之间。
        @NameInMap("etlMetaKey")
        public String etlMetaKey;

        // 名字。由数字、大小写字母、下划线_、连字符-组成，长度需要在[2,64]之间。
        @NameInMap("etlMetaName")
        public String etlMetaName;

        // key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,128]之间。
        @NameInMap("etlMetaTag")
        public String etlMetaTag;

        @NameInMap("etlMetaValue")
        public java.util.Map<String, ?> etlMetaValue;

        public static BatchUpdateEtlMetaRequestEtlMetaList build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateEtlMetaRequestEtlMetaList self = new BatchUpdateEtlMetaRequestEtlMetaList();
            return TeaModel.build(map, self);
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaKey(String etlMetaKey) {
            this.etlMetaKey = etlMetaKey;
            return this;
        }
        public String getEtlMetaKey() {
            return this.etlMetaKey;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaName(String etlMetaName) {
            this.etlMetaName = etlMetaName;
            return this;
        }
        public String getEtlMetaName() {
            return this.etlMetaName;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaTag(String etlMetaTag) {
            this.etlMetaTag = etlMetaTag;
            return this;
        }
        public String getEtlMetaTag() {
            return this.etlMetaTag;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaValue(java.util.Map<String, ?> etlMetaValue) {
            this.etlMetaValue = etlMetaValue;
            return this;
        }
        public java.util.Map<String, ?> getEtlMetaValue() {
            return this.etlMetaValue;
        }

    }

}
