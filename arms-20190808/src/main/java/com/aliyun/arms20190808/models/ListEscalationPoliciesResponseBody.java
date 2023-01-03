// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEscalationPoliciesResponseBody extends TeaModel {
    // The objects that were returned.
    @NameInMap("PageBean")
    public ListEscalationPoliciesResponseBodyPageBean pageBean;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListEscalationPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPoliciesResponseBody self = new ListEscalationPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEscalationPoliciesResponseBody setPageBean(ListEscalationPoliciesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListEscalationPoliciesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListEscalationPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies extends TeaModel {
        // The ID of the escalation policy.
        @NameInMap("Id")
        public Long id;

        // The name of the escalation policy.
        @NameInMap("Name")
        public String name;

        public static ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies self = new ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies();
            return TeaModel.build(map, self);
        }

        public ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEscalationPoliciesResponseBodyPageBean extends TeaModel {
        // The list of escalation policies.
        @NameInMap("EscalationPolicies")
        public java.util.List<ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies> escalationPolicies;

        // The page number of the returned page.
        @NameInMap("Page")
        public Long page;

        // The number of entries returned per page.
        @NameInMap("Size")
        public Long size;

        // The total number of returned entries.
        @NameInMap("Total")
        public Long total;

        public static ListEscalationPoliciesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPoliciesResponseBodyPageBean self = new ListEscalationPoliciesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListEscalationPoliciesResponseBodyPageBean setEscalationPolicies(java.util.List<ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies> escalationPolicies) {
            this.escalationPolicies = escalationPolicies;
            return this;
        }
        public java.util.List<ListEscalationPoliciesResponseBodyPageBeanEscalationPolicies> getEscalationPolicies() {
            return this.escalationPolicies;
        }

        public ListEscalationPoliciesResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListEscalationPoliciesResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListEscalationPoliciesResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
