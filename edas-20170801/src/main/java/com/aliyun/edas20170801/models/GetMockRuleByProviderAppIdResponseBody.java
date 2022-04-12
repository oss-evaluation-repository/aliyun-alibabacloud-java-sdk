// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByProviderAppIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetMockRuleByProviderAppIdResponseBodyData> data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMockRuleByProviderAppIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByProviderAppIdResponseBody self = new GetMockRuleByProviderAppIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByProviderAppIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMockRuleByProviderAppIdResponseBody setData(java.util.List<GetMockRuleByProviderAppIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMockRuleByProviderAppIdResponseBodyData> getData() {
        return this.data;
    }

    public GetMockRuleByProviderAppIdResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetMockRuleByProviderAppIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMockRuleByProviderAppIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMockRuleByProviderAppIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMockRuleByProviderAppIdResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("ExtraJson")
        public String extraJson;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ProviderAppId")
        public String providerAppId;

        @NameInMap("ProviderAppName")
        public String providerAppName;

        @NameInMap("Region")
        public String region;

        @NameInMap("ScMockItemJson")
        public String scMockItemJson;

        @NameInMap("Source")
        public String source;

        public static GetMockRuleByProviderAppIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMockRuleByProviderAppIdResponseBodyData self = new GetMockRuleByProviderAppIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMockRuleByProviderAppIdResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setExtraJson(String extraJson) {
            this.extraJson = extraJson;
            return this;
        }
        public String getExtraJson() {
            return this.extraJson;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setProviderAppId(String providerAppId) {
            this.providerAppId = providerAppId;
            return this;
        }
        public String getProviderAppId() {
            return this.providerAppId;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setProviderAppName(String providerAppName) {
            this.providerAppName = providerAppName;
            return this;
        }
        public String getProviderAppName() {
            return this.providerAppName;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setScMockItemJson(String scMockItemJson) {
            this.scMockItemJson = scMockItemJson;
            return this;
        }
        public String getScMockItemJson() {
            return this.scMockItemJson;
        }

        public GetMockRuleByProviderAppIdResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
