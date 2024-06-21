// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyRequest extends TeaModel {
    /**
     * <p>The type of operation N for which you want to generate the policy information.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CreateStack: creates a stack by calling the CreateStack operation.</li>
     * <li>UpdateStack: updates a stack by calling the UpdateStack operation.</li>
     * <li>DeleteStack: deletes a stack by calling the DeleteStack operation.</li>
     * <li>DetectStackDrift: detects drifts on a stack by calling the DelectStackDrift operation.</li>
     * <li>ListStackOperationRisks: lists the risks of a deletion operation on a stack by setting the OperationType parameter to DeleteStack in the ListStackOperationRisks operation.</li>
     * <li>GetTemplateEstimateCost: queries the estimated prices of resources that you want to use in the template by calling the GetTemplateEstimateCost operation.</li>
     * <li>GetTemplateParameterConstraints: queries the values of parameters in the template by calling the GetTemplateParameterConstraints operation.</li>
     * <li>ImportResourcesToStack: imports resources to a stack by setting the ChangeSetType parameter to IMPORT in the CreateChangeSet operation.</li>
     * <li>SignalResource: sends a signal to a stack.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is the combination of all valid values.</p>
     * </blockquote>
     */
    @NameInMap("OperationTypes")
    public java.util.List<String> operationTypes;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.</p>
     * <p>If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared templates and private templates.</p>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <blockquote>
     * <p> If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * </blockquote>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * <p>The URL can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template. This parameter takes effect only when the TemplateId parameter is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GenerateTemplatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplatePolicyRequest self = new GenerateTemplatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTemplatePolicyRequest setOperationTypes(java.util.List<String> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }
    public java.util.List<String> getOperationTypes() {
        return this.operationTypes;
    }

    public GenerateTemplatePolicyRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GenerateTemplatePolicyRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GenerateTemplatePolicyRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public GenerateTemplatePolicyRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
