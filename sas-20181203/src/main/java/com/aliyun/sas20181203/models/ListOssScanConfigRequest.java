// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssScanConfigRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the config.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssScanConfigRequest self = new ListOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListOssScanConfigRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOssScanConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListOssScanConfigRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
