// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that encompasses both the resource details and its tags, comprising elements like the resource ID, the resource type, the tag key, and the tag value.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<ListTagResourcesResponseBodyTagResources> tagResources;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(java.util.List<ListTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<ListTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        /**
         * <p>Indicates whether the tags of the scaling group can be propagated to instances. Valid values:</p>
         * <br>
         * <p>*   true: The tags of the scaling group can be propagated to only instances that are newly created.</p>
         * <p>*   false: The tags of the scaling group cannot be propagated to instances.</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key of the resource.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setPropagate(Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        public Boolean getPropagate() {
            return this.propagate;
        }

        public ListTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
