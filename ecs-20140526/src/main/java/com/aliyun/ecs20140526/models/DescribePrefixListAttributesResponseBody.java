// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListAttributesResponseBody extends TeaModel {
    @NameInMap("AddressFamily")
    public String addressFamily;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Entries")
    public DescribePrefixListAttributesResponseBodyEntries entries;

    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("PrefixListName")
    public String prefixListName;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrefixListAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListAttributesResponseBody self = new DescribePrefixListAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListAttributesResponseBody setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }
    public String getAddressFamily() {
        return this.addressFamily;
    }

    public DescribePrefixListAttributesResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribePrefixListAttributesResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePrefixListAttributesResponseBody setEntries(DescribePrefixListAttributesResponseBodyEntries entries) {
        this.entries = entries;
        return this;
    }
    public DescribePrefixListAttributesResponseBodyEntries getEntries() {
        return this.entries;
    }

    public DescribePrefixListAttributesResponseBody setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
        return this;
    }
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public DescribePrefixListAttributesResponseBody setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public DescribePrefixListAttributesResponseBody setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public DescribePrefixListAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrefixListAttributesResponseBodyEntriesEntry extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Description")
        public String description;

        public static DescribePrefixListAttributesResponseBodyEntriesEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListAttributesResponseBodyEntriesEntry self = new DescribePrefixListAttributesResponseBodyEntriesEntry();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListAttributesResponseBodyEntriesEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public DescribePrefixListAttributesResponseBodyEntriesEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePrefixListAttributesResponseBodyEntries extends TeaModel {
        @NameInMap("Entry")
        public java.util.List<DescribePrefixListAttributesResponseBodyEntriesEntry> entry;

        public static DescribePrefixListAttributesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribePrefixListAttributesResponseBodyEntries self = new DescribePrefixListAttributesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public DescribePrefixListAttributesResponseBodyEntries setEntry(java.util.List<DescribePrefixListAttributesResponseBodyEntriesEntry> entry) {
            this.entry = entry;
            return this;
        }
        public java.util.List<DescribePrefixListAttributesResponseBodyEntriesEntry> getEntry() {
            return this.entry;
        }

    }

}
