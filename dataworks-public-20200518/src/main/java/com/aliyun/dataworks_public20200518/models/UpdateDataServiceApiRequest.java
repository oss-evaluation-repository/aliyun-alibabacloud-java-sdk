// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDataServiceApiRequest extends TeaModel {
    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("ApiDescription")
    public String apiDescription;

    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The path of the API.</p>
     */
    @NameInMap("ApiPath")
    public String apiPath;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS. You can specify multiple protocols. Separate multiple protocols with commas (,).</p>
     */
    @NameInMap("Protocols")
    public String protocols;

    /**
     * <p>The details of the API generated by registration. For more information, see the RegistrationDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.</p>
     */
    @NameInMap("RegistrationDetails")
    public String registrationDetails;

    /**
     * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method. The value 1 indicates the POST method. The value 2 indicates the PUT method. The value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
     */
    @NameInMap("RequestMethod")
    public Integer requestMethod;

    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
     */
    @NameInMap("ResponseContentType")
    public Integer responseContentType;

    /**
     * <p>The details of the API generated in script mode. For more information, see the ScriptDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.</p>
     */
    @NameInMap("ScriptDetails")
    public String scriptDetails;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>The timeout period of the API request. Unit: milliseconds. Valid values: (0,30000].</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible within the workspace. The value 1 indicates that the API is visible only to its owner.</p>
     */
    @NameInMap("VisibleRange")
    public Integer visibleRange;

    /**
     * <p>The details of the API generated in wizard mode. For more information, see the WizardDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.</p>
     */
    @NameInMap("WizardDetails")
    public String wizardDetails;

    public static UpdateDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceApiRequest self = new UpdateDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceApiRequest setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
        return this;
    }
    public String getApiDescription() {
        return this.apiDescription;
    }

    public UpdateDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public UpdateDataServiceApiRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public UpdateDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataServiceApiRequest setProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }
    public String getProtocols() {
        return this.protocols;
    }

    public UpdateDataServiceApiRequest setRegistrationDetails(String registrationDetails) {
        this.registrationDetails = registrationDetails;
        return this;
    }
    public String getRegistrationDetails() {
        return this.registrationDetails;
    }

    public UpdateDataServiceApiRequest setRequestMethod(Integer requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public Integer getRequestMethod() {
        return this.requestMethod;
    }

    public UpdateDataServiceApiRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateDataServiceApiRequest setResponseContentType(Integer responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public Integer getResponseContentType() {
        return this.responseContentType;
    }

    public UpdateDataServiceApiRequest setScriptDetails(String scriptDetails) {
        this.scriptDetails = scriptDetails;
        return this;
    }
    public String getScriptDetails() {
        return this.scriptDetails;
    }

    public UpdateDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UpdateDataServiceApiRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateDataServiceApiRequest setVisibleRange(Integer visibleRange) {
        this.visibleRange = visibleRange;
        return this;
    }
    public Integer getVisibleRange() {
        return this.visibleRange;
    }

    public UpdateDataServiceApiRequest setWizardDetails(String wizardDetails) {
        this.wizardDetails = wizardDetails;
        return this;
    }
    public String getWizardDetails() {
        return this.wizardDetails;
    }

}
