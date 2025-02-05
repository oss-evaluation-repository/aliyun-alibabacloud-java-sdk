// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801;

import com.aliyun.tea.*;
import com.aliyun.aimiaobi20230801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aimiaobi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>取消异步任务</p>
     * 
     * @param request CancelAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAsyncTaskResponse
     */
    public CancelAsyncTaskResponse cancelAsyncTaskWithOptions(CancelAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAsyncTask"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消异步任务</p>
     * 
     * @param request CancelAsyncTaskRequest
     * @return CancelAsyncTaskResponse
     */
    public CancelAsyncTaskResponse cancelAsyncTask(CancelAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清除所有干预内容</p>
     * 
     * @param request ClearIntervenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearIntervenesResponse
     */
    public ClearIntervenesResponse clearIntervenesWithOptions(ClearIntervenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearIntervenes"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearIntervenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清除所有干预内容</p>
     * 
     * @param request ClearIntervenesRequest
     * @return ClearIntervenesResponse
     */
    public ClearIntervenesResponse clearIntervenes(ClearIntervenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearIntervenesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-创建</p>
     * 
     * @param tmpReq CreateGeneratedContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGeneratedContentResponse
     */
    public CreateGeneratedContentResponse createGeneratedContentWithOptions(CreateGeneratedContentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateGeneratedContentShrinkRequest request = new CreateGeneratedContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keywords)) {
            request.keywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keywords, "Keywords", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentDomain)) {
            body.put("ContentDomain", request.contentDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentText)) {
            body.put("ContentText", request.contentText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordsShrink)) {
            body.put("Keywords", request.keywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGeneratedContent"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGeneratedContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-创建</p>
     * 
     * @param request CreateGeneratedContentRequest
     * @return CreateGeneratedContentResponse
     */
    public CreateGeneratedContentResponse createGeneratedContent(CreateGeneratedContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGeneratedContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权token</p>
     * 
     * @param request CreateTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTokenResponse
     */
    public CreateTokenResponse createTokenWithOptions(CreateTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateToken"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权token</p>
     * 
     * @param request CreateTokenRequest
     * @return CreateTokenResponse
     */
    public CreateTokenResponse createToken(CreateTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义文本</p>
     * 
     * @param request DeleteCustomTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomTextResponse
     */
    public DeleteCustomTextResponse deleteCustomTextWithOptions(DeleteCustomTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomText"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义文本</p>
     * 
     * @param request DeleteCustomTextRequest
     * @return DeleteCustomTextResponse
     */
    public DeleteCustomTextResponse deleteCustomText(DeleteCustomTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-删除。</p>
     * 
     * @param request DeleteGeneratedContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGeneratedContentResponse
     */
    public DeleteGeneratedContentResponse deleteGeneratedContentWithOptions(DeleteGeneratedContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGeneratedContent"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGeneratedContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-删除。</p>
     * 
     * @param request DeleteGeneratedContentRequest
     * @return DeleteGeneratedContentResponse
     */
    public DeleteGeneratedContentResponse deleteGeneratedContent(DeleteGeneratedContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGeneratedContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除干预规则</p>
     * 
     * @param request DeleteInterveneRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInterveneRuleResponse
     */
    public DeleteInterveneRuleResponse deleteInterveneRuleWithOptions(DeleteInterveneRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInterveneRule"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInterveneRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除干预规则</p>
     * 
     * @param request DeleteInterveneRuleRequest
     * @return DeleteInterveneRuleResponse
     */
    public DeleteInterveneRuleResponse deleteInterveneRule(DeleteInterveneRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInterveneRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID删除素材</p>
     * 
     * @param request DeleteMaterialByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaterialByIdResponse
     */
    public DeleteMaterialByIdResponse deleteMaterialByIdWithOptions(DeleteMaterialByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterialById"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterialByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID删除素材</p>
     * 
     * @param request DeleteMaterialByIdRequest
     * @return DeleteMaterialByIdResponse
     */
    public DeleteMaterialByIdResponse deleteMaterialById(DeleteMaterialByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMaterialByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从链接中提取文档内容</p>
     * 
     * @param tmpReq DocumentExtractionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DocumentExtractionResponse
     */
    public DocumentExtractionResponse documentExtractionWithOptions(DocumentExtractionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DocumentExtractionShrinkRequest request = new DocumentExtractionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.urls)) {
            request.urlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.urls, "Urls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.urlsShrink)) {
            body.put("Urls", request.urlsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DocumentExtraction"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DocumentExtractionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从链接中提取文档内容</p>
     * 
     * @param request DocumentExtractionRequest
     * @return DocumentExtractionResponse
     */
    public DocumentExtractionResponse documentExtraction(DocumentExtractionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.documentExtractionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-导出。</p>
     * 
     * @param request ExportGeneratedContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportGeneratedContentResponse
     */
    public ExportGeneratedContentResponse exportGeneratedContentWithOptions(ExportGeneratedContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportGeneratedContent"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportGeneratedContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-导出。</p>
     * 
     * @param request ExportGeneratedContentRequest
     * @return ExportGeneratedContentResponse
     */
    public ExportGeneratedContentResponse exportGeneratedContent(ExportGeneratedContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportGeneratedContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出所有干预内容</p>
     * 
     * @param request ExportIntervenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportIntervenesResponse
     */
    public ExportIntervenesResponse exportIntervenesWithOptions(ExportIntervenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportIntervenes"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportIntervenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出所有干预内容</p>
     * 
     * @param request ExportIntervenesRequest
     * @return ExportIntervenesResponse
     */
    public ExportIntervenesResponse exportIntervenes(ExportIntervenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportIntervenesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>反馈某次生成的结果</p>
     * 
     * @param tmpReq FeedbackDialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FeedbackDialogueResponse
     */
    public FeedbackDialogueResponse feedbackDialogueWithOptions(FeedbackDialogueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FeedbackDialogueShrinkRequest request = new FeedbackDialogueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ratingTags)) {
            request.ratingTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ratingTags, "RatingTags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerResponse)) {
            body.put("CustomerResponse", request.customerResponse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodText)) {
            body.put("GoodText", request.goodText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedResponse)) {
            body.put("ModifiedResponse", request.modifiedResponse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rating)) {
            body.put("Rating", request.rating);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratingTagsShrink)) {
            body.put("RatingTags", request.ratingTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FeedbackDialogue"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>反馈某次生成的结果</p>
     * 
     * @param request FeedbackDialogueRequest
     * @return FeedbackDialogueResponse
     */
    public FeedbackDialogueResponse feedbackDialogue(FeedbackDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.feedbackDialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片任务执行结果</p>
     * 
     * @param tmpReq FetchImageTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchImageTaskResponse
     */
    public FetchImageTaskResponse fetchImageTaskWithOptions(FetchImageTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FetchImageTaskShrinkRequest request = new FetchImageTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIdList)) {
            request.taskIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIdList, "TaskIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.articleTaskId)) {
            body.put("ArticleTaskId", request.articleTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdListShrink)) {
            body.put("TaskIdList", request.taskIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchImageTask"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchImageTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片任务执行结果</p>
     * 
     * @param request FetchImageTaskRequest
     * @return FetchImageTaskResponse
     */
    public FetchImageTaskResponse fetchImageTask(FetchImageTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchImageTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成临时可访问的公开url</p>
     * 
     * @param request GenerateFileUrlByKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateFileUrlByKeyResponse
     */
    public GenerateFileUrlByKeyResponse generateFileUrlByKeyWithOptions(GenerateFileUrlByKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("FileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateFileUrlByKey"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateFileUrlByKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成临时可访问的公开url</p>
     * 
     * @param request GenerateFileUrlByKeyRequest
     * @return GenerateFileUrlByKeyResponse
     */
    public GenerateFileUrlByKeyResponse generateFileUrlByKey(GenerateFileUrlByKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateFileUrlByKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能配图，图片生成任务</p>
     * 
     * @param tmpReq GenerateImageTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateImageTaskResponse
     */
    public GenerateImageTaskResponse generateImageTaskWithOptions(GenerateImageTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateImageTaskShrinkRequest request = new GenerateImageTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.paragraphList)) {
            request.paragraphListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.paragraphList, "ParagraphList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.articleTaskId)) {
            body.put("ArticleTaskId", request.articleTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paragraphListShrink)) {
            body.put("ParagraphList", request.paragraphListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.style)) {
            body.put("Style", request.style);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateImageTask"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateImageTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能配图，图片生成任务</p>
     * 
     * @param request GenerateImageTaskRequest
     * @return GenerateImageTaskResponse
     */
    public GenerateImageTaskResponse generateImageTask(GenerateImageTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateImageTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成上传配置</p>
     * 
     * @param request GenerateUploadConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUploadConfigResponse
     */
    public GenerateUploadConfigResponse generateUploadConfigWithOptions(GenerateUploadConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDir)) {
            body.put("ParentDir", request.parentDir);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadConfig"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成上传配置</p>
     * 
     * @param request GenerateUploadConfigRequest
     * @return GenerateUploadConfigResponse
     */
    public GenerateUploadConfigResponse generateUploadConfig(GenerateUploadConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视角生成</p>
     * 
     * @param tmpReq GenerateViewPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateViewPointResponse
     */
    public GenerateViewPointResponse generateViewPointWithOptions(GenerateViewPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateViewPointShrinkRequest request = new GenerateViewPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.referenceData)) {
            request.referenceDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.referenceData, "ReferenceData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.referenceDataShrink)) {
            body.put("ReferenceData", request.referenceDataShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateViewPoint"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateViewPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视角生成</p>
     * 
     * @param request GenerateViewPointRequest
     * @return GenerateViewPointResponse
     */
    public GenerateViewPointResponse generateViewPoint(GenerateViewPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateViewPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义文本</p>
     * 
     * @param request GetCustomTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomTextResponse
     */
    public GetCustomTextResponse getCustomTextWithOptions(GetCustomTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomText"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义文本</p>
     * 
     * @param request GetCustomTextRequest
     * @return GetCustomTextResponse
     */
    public GetCustomTextResponse getCustomText(GetCustomTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统数据源配置和个人配置</p>
     * 
     * @param request GetDataSourceOrderConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceOrderConfigResponse
     */
    public GetDataSourceOrderConfigResponse getDataSourceOrderConfigWithOptions(GetDataSourceOrderConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSourceOrderConfig"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceOrderConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统数据源配置和个人配置</p>
     * 
     * @param request GetDataSourceOrderConfigRequest
     * @return GetDataSourceOrderConfigResponse
     */
    public GetDataSourceOrderConfigResponse getDataSourceOrderConfig(GetDataSourceOrderConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceOrderConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-查询详情。</p>
     * 
     * @param request GetGeneratedContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGeneratedContentResponse
     */
    public GetGeneratedContentResponse getGeneratedContentWithOptions(GetGeneratedContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGeneratedContent"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGeneratedContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-查询详情。</p>
     * 
     * @param request GetGeneratedContentRequest
     * @return GetGeneratedContentResponse
     */
    public GetGeneratedContentResponse getGeneratedContent(GetGeneratedContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGeneratedContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预全局回复</p>
     * 
     * @param request GetInterveneGlobalReplyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInterveneGlobalReplyResponse
     */
    public GetInterveneGlobalReplyResponse getInterveneGlobalReplyWithOptions(GetInterveneGlobalReplyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInterveneGlobalReply"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInterveneGlobalReplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预全局回复</p>
     * 
     * @param request GetInterveneGlobalReplyRequest
     * @return GetInterveneGlobalReplyResponse
     */
    public GetInterveneGlobalReplyResponse getInterveneGlobalReply(GetInterveneGlobalReplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInterveneGlobalReplyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得导入任务信息</p>
     * 
     * @param request GetInterveneImportTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInterveneImportTaskInfoResponse
     */
    public GetInterveneImportTaskInfoResponse getInterveneImportTaskInfoWithOptions(GetInterveneImportTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInterveneImportTaskInfo"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInterveneImportTaskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得导入任务信息</p>
     * 
     * @param request GetInterveneImportTaskInfoRequest
     * @return GetInterveneImportTaskInfoResponse
     */
    public GetInterveneImportTaskInfoResponse getInterveneImportTaskInfo(GetInterveneImportTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInterveneImportTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预项规则详情</p>
     * 
     * @param request GetInterveneRuleDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInterveneRuleDetailResponse
     */
    public GetInterveneRuleDetailResponse getInterveneRuleDetailWithOptions(GetInterveneRuleDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInterveneRuleDetail"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInterveneRuleDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预项规则详情</p>
     * 
     * @param request GetInterveneRuleDetailRequest
     * @return GetInterveneRuleDetailResponse
     */
    public GetInterveneRuleDetailResponse getInterveneRuleDetail(GetInterveneRuleDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInterveneRuleDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预导入模版文件下载地址</p>
     * 
     * @param request GetInterveneTemplateFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInterveneTemplateFileUrlResponse
     */
    public GetInterveneTemplateFileUrlResponse getInterveneTemplateFileUrlWithOptions(GetInterveneTemplateFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInterveneTemplateFileUrl"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInterveneTemplateFileUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预导入模版文件下载地址</p>
     * 
     * @param request GetInterveneTemplateFileUrlRequest
     * @return GetInterveneTemplateFileUrlResponse
     */
    public GetInterveneTemplateFileUrlResponse getInterveneTemplateFileUrl(GetInterveneTemplateFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInterveneTemplateFileUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID获取素材内容</p>
     * 
     * @param request GetMaterialByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMaterialByIdResponse
     */
    public GetMaterialByIdResponse getMaterialByIdWithOptions(GetMaterialByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMaterialById"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMaterialByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID获取素材内容</p>
     * 
     * @param request GetMaterialByIdRequest
     * @return GetMaterialByIdResponse
     */
    public GetMaterialByIdResponse getMaterialById(GetMaterialByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMaterialByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前用户的配置</p>
     * 
     * @param request GetPropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPropertiesResponse
     */
    public GetPropertiesResponse getPropertiesWithOptions(GetPropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProperties"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPropertiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前用户的配置</p>
     * 
     * @param request GetPropertiesRequest
     * @return GetPropertiesResponse
     */
    public GetPropertiesResponse getProperties(GetPropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPropertiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入干预文件</p>
     * 
     * @param request ImportInterveneFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportInterveneFileResponse
     */
    public ImportInterveneFileResponse importInterveneFileWithOptions(ImportInterveneFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            body.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("FileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportInterveneFile"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportInterveneFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入干预文件</p>
     * 
     * @param request ImportInterveneFileRequest
     * @return ImportInterveneFileResponse
     */
    public ImportInterveneFileResponse importInterveneFile(ImportInterveneFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importInterveneFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步导入干预文件</p>
     * 
     * @param request ImportInterveneFileAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportInterveneFileAsyncResponse
     */
    public ImportInterveneFileAsyncResponse importInterveneFileAsyncWithOptions(ImportInterveneFileAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docName)) {
            body.put("DocName", request.docName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("FileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportInterveneFileAsync"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportInterveneFileAsyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步导入干预文件</p>
     * 
     * @param request ImportInterveneFileAsyncRequest
     * @return ImportInterveneFileAsyncResponse
     */
    public ImportInterveneFileAsyncResponse importInterveneFileAsync(ImportInterveneFileAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importInterveneFileAsyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置干预全局回复</p>
     * 
     * @param tmpReq InsertInterveneGlobalReplyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertInterveneGlobalReplyResponse
     */
    public InsertInterveneGlobalReplyResponse insertInterveneGlobalReplyWithOptions(InsertInterveneGlobalReplyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertInterveneGlobalReplyShrinkRequest request = new InsertInterveneGlobalReplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.replyMessagList)) {
            request.replyMessagListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.replyMessagList, "ReplyMessagList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replyMessagListShrink)) {
            body.put("ReplyMessagList", request.replyMessagListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertInterveneGlobalReply"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertInterveneGlobalReplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置干预全局回复</p>
     * 
     * @param request InsertInterveneGlobalReplyRequest
     * @return InsertInterveneGlobalReplyResponse
     */
    public InsertInterveneGlobalReplyResponse insertInterveneGlobalReply(InsertInterveneGlobalReplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertInterveneGlobalReplyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插入干预规则</p>
     * 
     * @param tmpReq InsertInterveneRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertInterveneRuleResponse
     */
    public InsertInterveneRuleResponse insertInterveneRuleWithOptions(InsertInterveneRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertInterveneRuleShrinkRequest request = new InsertInterveneRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interveneRuleConfig)) {
            request.interveneRuleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interveneRuleConfig, "InterveneRuleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.interveneRuleConfigShrink)) {
            body.put("InterveneRuleConfig", request.interveneRuleConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertInterveneRule"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertInterveneRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>插入干预规则</p>
     * 
     * @param request InsertInterveneRuleRequest
     * @return InsertInterveneRuleResponse
     */
    public InsertInterveneRuleResponse insertInterveneRule(InsertInterveneRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertInterveneRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param tmpReq ListAsyncTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAsyncTasksResponse
     */
    public ListAsyncTasksResponse listAsyncTasksWithOptions(ListAsyncTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAsyncTasksShrinkRequest request = new ListAsyncTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskStatusList)) {
            request.taskStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskStatusList, "TaskStatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskTypeList)) {
            request.taskTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskTypeList, "TaskTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCode)) {
            body.put("TaskCode", request.taskCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatusListShrink)) {
            body.put("TaskStatusList", request.taskStatusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTypeListShrink)) {
            body.put("TaskTypeList", request.taskTypeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAsyncTasks"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAsyncTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    public ListAsyncTasksResponse listAsyncTasks(ListAsyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAsyncTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统自定义预设</p>
     * 
     * @param request ListBuildConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBuildConfigsResponse
     */
    public ListBuildConfigsResponse listBuildConfigsWithOptions(ListBuildConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBuildConfigs"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBuildConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统自定义预设</p>
     * 
     * @param request ListBuildConfigsRequest
     * @return ListBuildConfigsResponse
     */
    public ListBuildConfigsResponse listBuildConfigs(ListBuildConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBuildConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义文本列表</p>
     * 
     * @param request ListCustomTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomTextResponse
     */
    public ListCustomTextResponse listCustomTextWithOptions(ListCustomTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomText"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义文本列表</p>
     * 
     * @param request ListCustomTextRequest
     * @return ListCustomTextResponse
     */
    public ListCustomTextResponse listCustomText(ListCustomTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成历史列表</p>
     * 
     * @param request ListDialoguesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDialoguesResponse
     */
    public ListDialoguesResponse listDialoguesWithOptions(ListDialoguesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogueType)) {
            body.put("DialogueType", request.dialogueType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDialogues"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDialoguesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成历史列表</p>
     * 
     * @param request ListDialoguesRequest
     * @return ListDialoguesResponse
     */
    public ListDialoguesResponse listDialogues(ListDialoguesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDialoguesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-列表。</p>
     * 
     * @param request ListGeneratedContentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGeneratedContentsResponse
     */
    public ListGeneratedContentsResponse listGeneratedContentsWithOptions(ListGeneratedContentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentDomain)) {
            body.put("ContentDomain", request.contentDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGeneratedContents"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGeneratedContentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-列表。</p>
     * 
     * @param request ListGeneratedContentsRequest
     * @return ListGeneratedContentsResponse
     */
    public ListGeneratedContentsResponse listGeneratedContents(ListGeneratedContentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGeneratedContentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取分类的热点新闻</p>
     * 
     * @param tmpReq ListHotNewsWithTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotNewsWithTypeResponse
     */
    public ListHotNewsWithTypeResponse listHotNewsWithTypeWithOptions(ListHotNewsWithTypeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotNewsWithTypeShrinkRequest request = new ListHotNewsWithTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.newsTypes)) {
            request.newsTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.newsTypes, "NewsTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newsType)) {
            body.put("NewsType", request.newsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newsTypesShrink)) {
            body.put("NewsTypes", request.newsTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotNewsWithType"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotNewsWithTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取分类的热点新闻</p>
     * 
     * @param request ListHotNewsWithTypeRequest
     * @return ListHotNewsWithTypeResponse
     */
    public ListHotNewsWithTypeResponse listHotNewsWithType(ListHotNewsWithTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHotNewsWithTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预项目数量列表</p>
     * 
     * @param request ListInterveneCntRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterveneCntResponse
     */
    public ListInterveneCntResponse listInterveneCntWithOptions(ListInterveneCntRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterveneCnt"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterveneCntResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预项目数量列表</p>
     * 
     * @param request ListInterveneCntRequest
     * @return ListInterveneCntResponse
     */
    public ListInterveneCntResponse listInterveneCnt(ListInterveneCntRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInterveneCntWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得导入任务列表</p>
     * 
     * @param request ListInterveneImportTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterveneImportTasksResponse
     */
    public ListInterveneImportTasksResponse listInterveneImportTasksWithOptions(ListInterveneImportTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterveneImportTasks"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterveneImportTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得导入任务列表</p>
     * 
     * @param request ListInterveneImportTasksRequest
     * @return ListInterveneImportTasksResponse
     */
    public ListInterveneImportTasksResponse listInterveneImportTasks(ListInterveneImportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInterveneImportTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预规则列表</p>
     * 
     * @param request ListInterveneRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInterveneRulesResponse
     */
    public ListInterveneRulesResponse listInterveneRulesWithOptions(ListInterveneRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInterveneRules"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInterveneRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预规则列表</p>
     * 
     * @param request ListInterveneRulesRequest
     * @return ListInterveneRulesResponse
     */
    public ListInterveneRulesResponse listInterveneRules(ListInterveneRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInterveneRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预项列表</p>
     * 
     * @param request ListIntervenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntervenesResponse
     */
    public ListIntervenesResponse listIntervenesWithOptions(ListIntervenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.interveneType)) {
            body.put("InterveneType", request.interveneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntervenes"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntervenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得干预项列表</p>
     * 
     * @param request ListIntervenesRequest
     * @return ListIntervenesResponse
     */
    public ListIntervenesResponse listIntervenes(ListIntervenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervenesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材列表</p>
     * 
     * @param tmpReq ListMaterialDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMaterialDocumentsResponse
     */
    public ListMaterialDocumentsResponse listMaterialDocumentsWithOptions(ListMaterialDocumentsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMaterialDocumentsShrinkRequest request = new ListMaterialDocumentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.docTypeList)) {
            request.docTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.docTypeList, "DocTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keywords)) {
            request.keywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keywords, "Keywords", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docTypeListShrink)) {
            body.put("DocTypeList", request.docTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generatePublicUrl)) {
            body.put("GeneratePublicUrl", request.generatePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordsShrink)) {
            body.put("Keywords", request.keywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareAttr)) {
            body.put("ShareAttr", request.shareAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimeEnd)) {
            body.put("UpdateTimeEnd", request.updateTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimeStart)) {
            body.put("UpdateTimeStart", request.updateTimeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMaterialDocuments"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMaterialDocumentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材列表</p>
     * 
     * @param request ListMaterialDocumentsRequest
     * @return ListMaterialDocumentsResponse
     */
    public ListMaterialDocumentsResponse listMaterialDocuments(ListMaterialDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMaterialDocumentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统所有实例信息</p>
     * 
     * @param request ListVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVersionsResponse
     */
    public ListVersionsResponse listVersionsWithOptions(ListVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVersions"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取系统所有实例信息</p>
     * 
     * @param request ListVersionsRequest
     * @return ListVersionsResponse
     */
    public ListVersionsResponse listVersions(ListVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据taskId查询异步任务状态</p>
     * 
     * @param request QueryAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAsyncTaskResponse
     */
    public QueryAsyncTaskResponse queryAsyncTaskWithOptions(QueryAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAsyncTask"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据taskId查询异步任务状态</p>
     * 
     * @param request QueryAsyncTaskRequest
     * @return QueryAsyncTaskResponse
     */
    public QueryAsyncTaskResponse queryAsyncTask(QueryAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存自定义文本</p>
     * 
     * @param request SaveCustomTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveCustomTextResponse
     */
    public SaveCustomTextResponse saveCustomTextWithOptions(SaveCustomTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveCustomText"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveCustomTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存自定义文本</p>
     * 
     * @param request SaveCustomTextRequest
     * @return SaveCustomTextResponse
     */
    public SaveCustomTextResponse saveCustomText(SaveCustomTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveCustomTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存用户的信源配置</p>
     * 
     * @param tmpReq SaveDataSourceOrderConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveDataSourceOrderConfigResponse
     */
    public SaveDataSourceOrderConfigResponse saveDataSourceOrderConfigWithOptions(SaveDataSourceOrderConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveDataSourceOrderConfigShrinkRequest request = new SaveDataSourceOrderConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userConfigDataSourceList)) {
            request.userConfigDataSourceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userConfigDataSourceList, "UserConfigDataSourceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConfigDataSourceListShrink)) {
            body.put("UserConfigDataSourceList", request.userConfigDataSourceListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveDataSourceOrderConfig"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveDataSourceOrderConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存用户的信源配置</p>
     * 
     * @param request SaveDataSourceOrderConfigRequest
     * @return SaveDataSourceOrderConfigResponse
     */
    public SaveDataSourceOrderConfigResponse saveDataSourceOrderConfig(SaveDataSourceOrderConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveDataSourceOrderConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存素材</p>
     * 
     * @param tmpReq SaveMaterialDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveMaterialDocumentResponse
     */
    public SaveMaterialDocumentResponse saveMaterialDocumentWithOptions(SaveMaterialDocumentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveMaterialDocumentShrinkRequest request = new SaveMaterialDocumentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.docKeywords)) {
            request.docKeywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.docKeywords, "DocKeywords", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.author)) {
            body.put("Author", request.author);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bothSavePrivateAndShare)) {
            body.put("BothSavePrivateAndShare", request.bothSavePrivateAndShare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docKeywordsShrink)) {
            body.put("DocKeywords", request.docKeywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUrl)) {
            body.put("ExternalUrl", request.externalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.htmlContent)) {
            body.put("HtmlContent", request.htmlContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubTime)) {
            body.put("PubTime", request.pubTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareAttr)) {
            body.put("ShareAttr", request.shareAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcFrom)) {
            body.put("SrcFrom", request.srcFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            body.put("Summary", request.summary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textContent)) {
            body.put("TextContent", request.textContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveMaterialDocument"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveMaterialDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存素材</p>
     * 
     * @param request SaveMaterialDocumentRequest
     * @return SaveMaterialDocumentResponse
     */
    public SaveMaterialDocumentResponse saveMaterialDocument(SaveMaterialDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveMaterialDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新闻检索</p>
     * 
     * @param tmpReq SearchNewsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchNewsResponse
     */
    public SearchNewsResponse searchNewsWithOptions(SearchNewsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchNewsShrinkRequest request = new SearchNewsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchSources)) {
            request.searchSourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchSources, "SearchSources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterNotNull)) {
            body.put("FilterNotNull", request.filterNotNull);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeContent)) {
            body.put("IncludeContent", request.includeContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchSourcesShrink)) {
            body.put("SearchSources", request.searchSourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchNews"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchNewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新闻检索</p>
     * 
     * @param request SearchNewsRequest
     * @return SearchNewsResponse
     */
    public SearchNewsResponse searchNews(SearchNewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchNewsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步任务</p>
     * 
     * @param request SubmitAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAsyncTaskResponse
     */
    public SubmitAsyncTaskResponse submitAsyncTaskWithOptions(SubmitAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskCode)) {
            body.put("TaskCode", request.taskCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecuteTime)) {
            body.put("TaskExecuteTime", request.taskExecuteTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            body.put("TaskParam", request.taskParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAsyncTask"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步任务</p>
     * 
     * @param request SubmitAsyncTaskRequest
     * @return SubmitAsyncTaskResponse
     */
    public SubmitAsyncTaskResponse submitAsyncTask(SubmitAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义文本</p>
     * 
     * @param request UpdateCustomTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomTextResponse
     */
    public UpdateCustomTextResponse updateCustomTextWithOptions(UpdateCustomTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomText"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义文本</p>
     * 
     * @param request UpdateCustomTextRequest
     * @return UpdateCustomTextResponse
     */
    public UpdateCustomTextResponse updateCustomText(UpdateCustomTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-更新。</p>
     * 
     * @param tmpReq UpdateGeneratedContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGeneratedContentResponse
     */
    public UpdateGeneratedContentResponse updateGeneratedContentWithOptions(UpdateGeneratedContentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGeneratedContentShrinkRequest request = new UpdateGeneratedContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keywords)) {
            request.keywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keywords, "Keywords", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentText)) {
            body.put("ContentText", request.contentText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordsShrink)) {
            body.put("Keywords", request.keywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGeneratedContent"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGeneratedContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档管理-更新。</p>
     * 
     * @param request UpdateGeneratedContentRequest
     * @return UpdateGeneratedContentResponse
     */
    public UpdateGeneratedContentResponse updateGeneratedContent(UpdateGeneratedContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGeneratedContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID更新素材</p>
     * 
     * @param tmpReq UpdateMaterialDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMaterialDocumentResponse
     */
    public UpdateMaterialDocumentResponse updateMaterialDocumentWithOptions(UpdateMaterialDocumentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMaterialDocumentShrinkRequest request = new UpdateMaterialDocumentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.docKeywords)) {
            request.docKeywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.docKeywords, "DocKeywords", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentKey)) {
            query.put("AgentKey", request.agentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.author)) {
            body.put("Author", request.author);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docKeywordsShrink)) {
            body.put("DocKeywords", request.docKeywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUrl)) {
            body.put("ExternalUrl", request.externalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.htmlContent)) {
            body.put("HtmlContent", request.htmlContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubTime)) {
            body.put("PubTime", request.pubTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareAttr)) {
            body.put("ShareAttr", request.shareAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcFrom)) {
            body.put("SrcFrom", request.srcFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            body.put("Summary", request.summary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textContent)) {
            body.put("TextContent", request.textContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMaterialDocument"),
            new TeaPair("version", "2023-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMaterialDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID更新素材</p>
     * 
     * @param request UpdateMaterialDocumentRequest
     * @return UpdateMaterialDocumentResponse
     */
    public UpdateMaterialDocumentResponse updateMaterialDocument(UpdateMaterialDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMaterialDocumentWithOptions(request, runtime);
    }
}
