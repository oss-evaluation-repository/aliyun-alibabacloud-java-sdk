// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109;

import com.aliyun.tea.*;
import com.aliyun.ice20201109.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ice.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ice.aliyuncs.com"),
            new TeaPair("ap-south-1", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ice.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ice.aliyuncs.com"),
            new TeaPair("cn-fujian", "ice.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ice.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ice.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ice.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ice.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ice.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ice.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ice.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ice.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ice.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ice.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ice.aliyuncs.com"),
            new TeaPair("eu-central-1", "ice.aliyuncs.com"),
            new TeaPair("eu-west-1", "ice.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ice.aliyuncs.com"),
            new TeaPair("me-east-1", "ice.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ice.aliyuncs.com"),
            new TeaPair("us-east-1", "ice.aliyuncs.com"),
            new TeaPair("us-west-1", "ice.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建媒资分类</p>
     * 
     * @param request AddCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateName)) {
            query.put("CateName", request.cateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCategory"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建媒资分类</p>
     * 
     * @param request AddCategoryRequest
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>剪辑工程增加素材</p>
     * 
     * @param request AddEditingProjectMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEditingProjectMaterialsResponse
     */
    public AddEditingProjectMaterialsResponse addEditingProjectMaterialsWithOptions(AddEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialMaps)) {
            query.put("MaterialMaps", request.materialMaps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEditingProjectMaterials"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEditingProjectMaterialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>剪辑工程增加素材</p>
     * 
     * @param request AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    public AddEditingProjectMaterialsResponse addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>收藏公共媒资</p>
     * 
     * @param request AddFavoritePublicMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFavoritePublicMediaResponse
     */
    public AddFavoritePublicMediaResponse addFavoritePublicMediaWithOptions(AddFavoritePublicMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFavoritePublicMedia"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFavoritePublicMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>收藏公共媒资</p>
     * 
     * @param request AddFavoritePublicMediaRequest
     * @return AddFavoritePublicMediaResponse
     */
    public AddFavoritePublicMediaResponse addFavoritePublicMedia(AddFavoritePublicMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFavoritePublicMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为媒资增加标注信息</p>
     * 
     * @param request AddMediaMarksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMediaMarksResponse
     */
    public AddMediaMarksResponse addMediaMarksWithOptions(AddMediaMarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMarks)) {
            query.put("MediaMarks", request.mediaMarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMediaMarks"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMediaMarksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为媒资增加标注信息</p>
     * 
     * @param request AddMediaMarksRequest
     * @return AddMediaMarksResponse
     */
    public AddMediaMarksResponse addMediaMarks(AddMediaMarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMediaMarksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AddTemplate</p>
     * 
     * @param request AddTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTemplateResponse
     */
    public AddTemplateResponse addTemplateWithOptions(AddTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            query.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewMedia)) {
            query.put("PreviewMedia", request.previewMedia);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedMediaids)) {
            query.put("RelatedMediaids", request.relatedMediaids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>AddTemplate</p>
     * 
     * @param request AddTemplateRequest
     * @return AddTemplateResponse
     */
    public AddTemplateResponse addTemplate(AddTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新搜索索引</p>
     * 
     * @param request AlterSearchIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AlterSearchIndexResponse
     */
    public AlterSearchIndexResponse alterSearchIndexWithOptions(AlterSearchIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexConfig)) {
            query.put("IndexConfig", request.indexConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexStatus)) {
            query.put("IndexStatus", request.indexStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexType)) {
            query.put("IndexType", request.indexType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlterSearchIndex"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlterSearchIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新搜索索引</p>
     * 
     * @param request AlterSearchIndexRequest
     * @return AlterSearchIndexResponse
     */
    public AlterSearchIndexResponse alterSearchIndex(AlterSearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.alterSearchIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取媒资信息</p>
     * 
     * @param request BatchGetMediaInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetMediaInfosResponse
     */
    public BatchGetMediaInfosResponse batchGetMediaInfosWithOptions(BatchGetMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionType)) {
            query.put("AdditionType", request.additionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetMediaInfos"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetMediaInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取媒资信息</p>
     * 
     * @param request BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    public BatchGetMediaInfosResponse batchGetMediaInfos(BatchGetMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetMediaInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消DNA作业</p>
     * 
     * @param request CancelDNAJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDNAJobResponse
     */
    public CancelDNAJobResponse cancelDNAJobWithOptions(CancelDNAJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDNAJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDNAJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消DNA作业</p>
     * 
     * @param request CancelDNAJobRequest
     * @return CancelDNAJobResponse
     */
    public CancelDNAJobResponse cancelDNAJob(CancelDNAJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDNAJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消收藏公共媒资</p>
     * 
     * @param request CancelFavoritePublicMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelFavoritePublicMediaResponse
     */
    public CancelFavoritePublicMediaResponse cancelFavoritePublicMediaWithOptions(CancelFavoritePublicMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelFavoritePublicMedia"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelFavoritePublicMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消收藏公共媒资</p>
     * 
     * @param request CancelFavoritePublicMediaRequest
     * @return CancelFavoritePublicMediaResponse
     */
    public CancelFavoritePublicMediaResponse cancelFavoritePublicMedia(CancelFavoritePublicMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelFavoritePublicMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交人工审核</p>
     * 
     * @param request CreateAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuditResponse
     */
    public CreateAuditResponse createAuditWithOptions(CreateAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditContent)) {
            query.put("AuditContent", request.auditContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAudit"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交人工审核</p>
     * 
     * @param request CreateAuditRequest
     * @return CreateAuditResponse
     */
    public CreateAuditResponse createAudit(CreateAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数字人训练任务</p>
     * 
     * @param request CreateAvatarTrainingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAvatarTrainingJobResponse
     */
    public CreateAvatarTrainingJobResponse createAvatarTrainingJobWithOptions(CreateAvatarTrainingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarDescription)) {
            query.put("AvatarDescription", request.avatarDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarName)) {
            query.put("AvatarName", request.avatarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarType)) {
            query.put("AvatarType", request.avatarType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portrait)) {
            query.put("Portrait", request.portrait);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnail)) {
            query.put("Thumbnail", request.thumbnail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparent)) {
            query.put("Transparent", request.transparent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAvatarTrainingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAvatarTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数字人训练任务</p>
     * 
     * @param request CreateAvatarTrainingJobRequest
     * @return CreateAvatarTrainingJobResponse
     */
    public CreateAvatarTrainingJobResponse createAvatarTrainingJob(CreateAvatarTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAvatarTrainingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建媒体处理自定义模板</p>
     * 
     * @param request CreateCustomTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomTemplateResponse
     */
    public CreateCustomTemplateResponse createCustomTemplateWithOptions(CreateCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtype)) {
            query.put("Subtype", request.subtype);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfig)) {
            query.put("TemplateConfig", request.templateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建媒体处理自定义模板</p>
     * 
     * @param request CreateCustomTemplateRequest
     * @return CreateCustomTemplateResponse
     */
    public CreateCustomTemplateResponse createCustomTemplate(CreateCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建人声克隆任务</p>
     * 
     * @param request CreateCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomizedVoiceJobResponse
     */
    public CreateCustomizedVoiceJobResponse createCustomizedVoiceJobWithOptions(CreateCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            query.put("Scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceDesc)) {
            query.put("VoiceDesc", request.voiceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceId)) {
            query.put("VoiceId", request.voiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceName)) {
            query.put("VoiceName", request.voiceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建人声克隆任务</p>
     * 
     * @param request CreateCustomizedVoiceJobRequest
     * @return CreateCustomizedVoiceJobResponse
     */
    public CreateCustomizedVoiceJobResponse createCustomizedVoiceJob(CreateCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建指纹库</p>
     * 
     * @param request CreateDNADBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDNADBResponse
     */
    public CreateDNADBResponse createDNADBWithOptions(CreateDNADBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDNADB"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDNADBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建指纹库</p>
     * 
     * @param request CreateDNADBRequest
     * @return CreateDNADBResponse
     */
    public CreateDNADBResponse createDNADB(CreateDNADBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDNADBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建云剪辑工程</p>
     * 
     * @param request CreateEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEditingProjectResponse
     */
    public CreateEditingProjectResponse createEditingProjectWithOptions(CreateEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessConfig)) {
            query.put("BusinessConfig", request.businessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipsParam)) {
            query.put("ClipsParam", request.clipsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialMaps)) {
            query.put("MaterialMaps", request.materialMaps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            query.put("ProjectType", request.projectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timeline)) {
            body.put("Timeline", request.timeline);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEditingProject"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEditingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建云剪辑工程</p>
     * 
     * @param request CreateEditingProjectRequest
     * @return CreateEditingProjectResponse
     */
    public CreateEditingProjectResponse createEditingProject(CreateEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建直播录制模板</p>
     * 
     * @param tmpReq CreateLiveRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLiveRecordTemplateResponse
     */
    public CreateLiveRecordTemplateResponse createLiveRecordTemplateWithOptions(CreateLiveRecordTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLiveRecordTemplateShrinkRequest request = new CreateLiveRecordTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordFormat)) {
            request.recordFormatShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordFormat, "RecordFormat", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordFormatShrink)) {
            body.put("RecordFormat", request.recordFormatShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLiveRecordTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLiveRecordTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建直播录制模板</p>
     * 
     * @param request CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     */
    public CreateLiveRecordTemplateResponse createLiveRecordTemplate(CreateLiveRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建直播截图模板</p>
     * 
     * @param request CreateLiveSnapshotTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLiveSnapshotTemplateResponse
     */
    public CreateLiveSnapshotTemplateResponse createLiveSnapshotTemplateWithOptions(CreateLiveSnapshotTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.overwriteFormat)) {
            body.put("OverwriteFormat", request.overwriteFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceFormat)) {
            body.put("SequenceFormat", request.sequenceFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeInterval)) {
            body.put("TimeInterval", request.timeInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLiveSnapshotTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLiveSnapshotTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建直播截图模板</p>
     * 
     * @param request CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     */
    public CreateLiveSnapshotTemplateResponse createLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveSnapshotTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建转码模版</p>
     * 
     * @param tmpReq CreateLiveTranscodeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLiveTranscodeTemplateResponse
     */
    public CreateLiveTranscodeTemplateResponse createLiveTranscodeTemplateWithOptions(CreateLiveTranscodeTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLiveTranscodeTemplateShrinkRequest request = new CreateLiveTranscodeTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateConfig)) {
            request.templateConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateConfig, "TemplateConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfigShrink)) {
            query.put("TemplateConfig", request.templateConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLiveTranscodeTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLiveTranscodeTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建转码模版</p>
     * 
     * @param request CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     */
    public CreateLiveTranscodeTemplateResponse createLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveTranscodeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户管道配置</p>
     * 
     * @param request CreatePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipelineWithOptions(CreatePipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipeline"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户管道配置</p>
     * 
     * @param request CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建搜索索引</p>
     * 
     * @param request CreateSearchIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSearchIndexResponse
     */
    public CreateSearchIndexResponse createSearchIndexWithOptions(CreateSearchIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexConfig)) {
            query.put("IndexConfig", request.indexConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexStatus)) {
            query.put("IndexStatus", request.indexStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexType)) {
            query.put("IndexType", request.indexType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSearchIndex"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建搜索索引</p>
     * 
     * @param request CreateSearchIndexRequest
     * @return CreateSearchIndexResponse
     */
    public CreateSearchIndexResponse createSearchIndex(CreateSearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSearchIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建库</p>
     * 
     * @param request CreateSearchLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSearchLibResponse
     */
    public CreateSearchLibResponse createSearchLibWithOptions(CreateSearchLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSearchLib"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建库</p>
     * 
     * @param request CreateSearchLibRequest
     * @return CreateSearchLibResponse
     */
    public CreateSearchLibResponse createSearchLib(CreateSearchLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSearchLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>本地媒资上传</p>
     * 
     * @param request CreateUploadMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUploadMediaResponse
     */
    public CreateUploadMediaResponse createUploadMediaWithOptions(CreateUploadMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileInfo)) {
            query.put("FileInfo", request.fileInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMetaData)) {
            query.put("MediaMetaData", request.mediaMetaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postProcessConfig)) {
            query.put("PostProcessConfig", request.postProcessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadTargetConfig)) {
            query.put("UploadTargetConfig", request.uploadTargetConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadMedia"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>本地媒资上传</p>
     * 
     * @param request CreateUploadMediaRequest
     * @return CreateUploadMediaResponse
     */
    public CreateUploadMediaResponse createUploadMedia(CreateUploadMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>本地上传媒体流</p>
     * 
     * @param request CreateUploadStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUploadStreamResponse
     */
    public CreateUploadStreamResponse createUploadStreamWithOptions(CreateUploadStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            query.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileExtension)) {
            query.put("FileExtension", request.fileExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HDRType)) {
            query.put("HDRType", request.HDRType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadStream"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>本地上传媒体流</p>
     * 
     * @param request CreateUploadStreamRequest
     * @return CreateUploadStreamResponse
     */
    public CreateUploadStreamResponse createUploadStream(CreateUploadStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解密KMS密钥DataKey</p>
     * 
     * @param request DecryptKMSDataKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DecryptKMSDataKeyResponse
     */
    public DecryptKMSDataKeyResponse decryptKMSDataKeyWithOptions(DecryptKMSDataKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecryptKMSDataKey"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecryptKMSDataKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解密KMS密钥DataKey</p>
     * 
     * @param request DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    public DecryptKMSDataKeyResponse decryptKMSDataKey(DecryptKMSDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptKMSDataKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数字人训练任务信息</p>
     * 
     * @param request DeleteAvatarTrainingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAvatarTrainingJobResponse
     */
    public DeleteAvatarTrainingJobResponse deleteAvatarTrainingJobWithOptions(DeleteAvatarTrainingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAvatarTrainingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAvatarTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数字人训练任务信息</p>
     * 
     * @param request DeleteAvatarTrainingJobRequest
     * @return DeleteAvatarTrainingJobResponse
     */
    public DeleteAvatarTrainingJobResponse deleteAvatarTrainingJob(DeleteAvatarTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAvatarTrainingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资分类</p>
     * 
     * @param request DeleteCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCategory"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资分类</p>
     * 
     * @param request DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒体处理自定义模板</p>
     * 
     * @param request DeleteCustomTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomTemplateResponse
     */
    public DeleteCustomTemplateResponse deleteCustomTemplateWithOptions(DeleteCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒体处理自定义模板</p>
     * 
     * @param request DeleteCustomTemplateRequest
     * @return DeleteCustomTemplateResponse
     */
    public DeleteCustomTemplateResponse deleteCustomTemplate(DeleteCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户的专属人声任务</p>
     * 
     * @param request DeleteCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomizedVoiceJobResponse
     */
    public DeleteCustomizedVoiceJobResponse deleteCustomizedVoiceJobWithOptions(DeleteCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户的专属人声任务</p>
     * 
     * @param request DeleteCustomizedVoiceJobRequest
     * @return DeleteCustomizedVoiceJobResponse
     */
    public DeleteCustomizedVoiceJobResponse deleteCustomizedVoiceJob(DeleteCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除DNA库</p>
     * 
     * @param request DeleteDNADBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDNADBResponse
     */
    public DeleteDNADBResponse deleteDNADBWithOptions(DeleteDNADBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBId)) {
            query.put("DBId", request.DBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDNADB"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDNADBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除DNA库</p>
     * 
     * @param request DeleteDNADBRequest
     * @return DeleteDNADBResponse
     */
    public DeleteDNADBResponse deleteDNADB(DeleteDNADBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDNADBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除DNA文件</p>
     * 
     * @param request DeleteDNAFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDNAFilesResponse
     */
    public DeleteDNAFilesResponse deleteDNAFilesWithOptions(DeleteDNAFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBId)) {
            query.put("DBId", request.DBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKeys)) {
            query.put("PrimaryKeys", request.primaryKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDNAFiles"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDNAFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除DNA文件</p>
     * 
     * @param request DeleteDNAFilesRequest
     * @return DeleteDNAFilesResponse
     */
    public DeleteDNAFilesResponse deleteDNAFiles(DeleteDNAFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDNAFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除剪辑工程关联素材</p>
     * 
     * @param request DeleteEditingProjectMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEditingProjectMaterialsResponse
     */
    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterialsWithOptions(DeleteEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialIds)) {
            query.put("MaterialIds", request.materialIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            query.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEditingProjectMaterials"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEditingProjectMaterialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除剪辑工程关联素材</p>
     * 
     * @param request DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除云剪辑工程</p>
     * 
     * @param request DeleteEditingProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEditingProjectsResponse
     */
    public DeleteEditingProjectsResponse deleteEditingProjectsWithOptions(DeleteEditingProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("ProjectIds", request.projectIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEditingProjects"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEditingProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除云剪辑工程</p>
     * 
     * @param request DeleteEditingProjectsRequest
     * @return DeleteEditingProjectsResponse
     */
    public DeleteEditingProjectsResponse deleteEditingProjects(DeleteEditingProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实时媒体服务-删除录制文件</p>
     * 
     * @param request DeleteLiveRecordFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveRecordFilesResponse
     */
    public DeleteLiveRecordFilesResponse deleteLiveRecordFilesWithOptions(DeleteLiveRecordFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordIds)) {
            query.put("RecordIds", request.recordIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeFile)) {
            query.put("RemoveFile", request.removeFile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveRecordFiles"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveRecordFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实时媒体服务-删除录制文件</p>
     * 
     * @param request DeleteLiveRecordFilesRequest
     * @return DeleteLiveRecordFilesResponse
     */
    public DeleteLiveRecordFilesResponse deleteLiveRecordFiles(DeleteLiveRecordFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveRecordFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除直播录制模板</p>
     * 
     * @param request DeleteLiveRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveRecordTemplateResponse
     */
    public DeleteLiveRecordTemplateResponse deleteLiveRecordTemplateWithOptions(DeleteLiveRecordTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveRecordTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveRecordTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除直播录制模板</p>
     * 
     * @param request DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     */
    public DeleteLiveRecordTemplateResponse deleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除直播截图文件</p>
     * 
     * @param tmpReq DeleteLiveSnapshotFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveSnapshotFilesResponse
     */
    public DeleteLiveSnapshotFilesResponse deleteLiveSnapshotFilesWithOptions(DeleteLiveSnapshotFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteLiveSnapshotFilesShrinkRequest request = new DeleteLiveSnapshotFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createTimestampList)) {
            request.createTimestampListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createTimestampList, "CreateTimestampList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimestampListShrink)) {
            query.put("CreateTimestampList", request.createTimestampListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteOriginalFile)) {
            query.put("DeleteOriginalFile", request.deleteOriginalFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveSnapshotFiles"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveSnapshotFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除直播截图文件</p>
     * 
     * @param request DeleteLiveSnapshotFilesRequest
     * @return DeleteLiveSnapshotFilesResponse
     */
    public DeleteLiveSnapshotFilesResponse deleteLiveSnapshotFiles(DeleteLiveSnapshotFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveSnapshotFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除直播截图模板</p>
     * 
     * @param request DeleteLiveSnapshotTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveSnapshotTemplateResponse
     */
    public DeleteLiveSnapshotTemplateResponse deleteLiveSnapshotTemplateWithOptions(DeleteLiveSnapshotTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveSnapshotTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveSnapshotTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除直播截图模板</p>
     * 
     * @param request DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     */
    public DeleteLiveSnapshotTemplateResponse deleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveSnapshotTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定转码任务</p>
     * 
     * @param request DeleteLiveTranscodeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveTranscodeJobResponse
     */
    public DeleteLiveTranscodeJobResponse deleteLiveTranscodeJobWithOptions(DeleteLiveTranscodeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveTranscodeJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveTranscodeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定转码任务</p>
     * 
     * @param request DeleteLiveTranscodeJobRequest
     * @return DeleteLiveTranscodeJobResponse
     */
    public DeleteLiveTranscodeJobResponse deleteLiveTranscodeJob(DeleteLiveTranscodeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveTranscodeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定转码模版</p>
     * 
     * @param request DeleteLiveTranscodeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveTranscodeTemplateResponse
     */
    public DeleteLiveTranscodeTemplateResponse deleteLiveTranscodeTemplateWithOptions(DeleteLiveTranscodeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveTranscodeTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveTranscodeTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定转码模版</p>
     * 
     * @param request DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     */
    public DeleteLiveTranscodeTemplateResponse deleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveTranscodeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资从搜索</p>
     * 
     * @param request DeleteMediaFromSearchLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaFromSearchLibResponse
     */
    public DeleteMediaFromSearchLibResponse deleteMediaFromSearchLibWithOptions(DeleteMediaFromSearchLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgBody)) {
            query.put("MsgBody", request.msgBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMediaFromSearchLib"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaFromSearchLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资从搜索</p>
     * 
     * @param request DeleteMediaFromSearchLibRequest
     * @return DeleteMediaFromSearchLibResponse
     */
    public DeleteMediaFromSearchLibResponse deleteMediaFromSearchLib(DeleteMediaFromSearchLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaFromSearchLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资信息</p>
     * 
     * @param request DeleteMediaInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaInfosResponse
     */
    public DeleteMediaInfosResponse deleteMediaInfosWithOptions(DeleteMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletePhysicalFiles)) {
            query.put("DeletePhysicalFiles", request.deletePhysicalFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURLs)) {
            query.put("InputURLs", request.inputURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMediaInfos"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资信息</p>
     * 
     * @param request DeleteMediaInfosRequest
     * @return DeleteMediaInfosResponse
     */
    public DeleteMediaInfosResponse deleteMediaInfos(DeleteMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资标注信息</p>
     * 
     * @param request DeleteMediaMarksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaMarksResponse
     */
    public DeleteMediaMarksResponse deleteMediaMarksWithOptions(DeleteMediaMarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMarkIds)) {
            query.put("MediaMarkIds", request.mediaMarkIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMediaMarks"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaMarksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资标注信息</p>
     * 
     * @param request DeleteMediaMarksRequest
     * @return DeleteMediaMarksResponse
     */
    public DeleteMediaMarksResponse deleteMediaMarks(DeleteMediaMarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaMarksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除管道配置</p>
     * 
     * @param request DeletePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipelineWithOptions(DeletePipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipeline"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除管道配置</p>
     * 
     * @param request DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除播放信息</p>
     * 
     * @param request DeletePlayInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePlayInfoResponse
     */
    public DeletePlayInfoResponse deletePlayInfoWithOptions(DeletePlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletePhysicalFiles)) {
            query.put("DeletePhysicalFiles", request.deletePhysicalFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileURLs)) {
            query.put("FileURLs", request.fileURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePlayInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePlayInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除播放信息</p>
     * 
     * @param request DeletePlayInfoRequest
     * @return DeletePlayInfoResponse
     */
    public DeletePlayInfoResponse deletePlayInfo(DeletePlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePlayInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteSmartJob</p>
     * 
     * @param request DeleteSmartJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmartJobResponse
     */
    public DeleteSmartJobResponse deleteSmartJobWithOptions(DeleteSmartJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmartJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmartJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteSmartJob</p>
     * 
     * @param request DeleteSmartJobRequest
     * @return DeleteSmartJobResponse
     */
    public DeleteSmartJobResponse deleteSmartJob(DeleteSmartJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmartJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteTemplate</p>
     * 
     * @param request DeleteTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteTemplate</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMeterImsEditUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeterImsEditUsageResponse
     */
    public DescribeMeterImsEditUsageResponse describeMeterImsEditUsageWithOptions(DescribeMeterImsEditUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterImsEditUsage"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterImsEditUsageResponse());
    }

    /**
     * @param request DescribeMeterImsEditUsageRequest
     * @return DescribeMeterImsEditUsageResponse
     */
    public DescribeMeterImsEditUsageResponse describeMeterImsEditUsage(DescribeMeterImsEditUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeterImsEditUsageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMeterImsMediaConvertUHDUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeterImsMediaConvertUHDUsageResponse
     */
    public DescribeMeterImsMediaConvertUHDUsageResponse describeMeterImsMediaConvertUHDUsageWithOptions(DescribeMeterImsMediaConvertUHDUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterImsMediaConvertUHDUsage"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterImsMediaConvertUHDUsageResponse());
    }

    /**
     * @param request DescribeMeterImsMediaConvertUHDUsageRequest
     * @return DescribeMeterImsMediaConvertUHDUsageResponse
     */
    public DescribeMeterImsMediaConvertUHDUsageResponse describeMeterImsMediaConvertUHDUsage(DescribeMeterImsMediaConvertUHDUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeterImsMediaConvertUHDUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能媒体服务点播转码用量</p>
     * 
     * @param request DescribeMeterImsMediaConvertUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeterImsMediaConvertUsageResponse
     */
    public DescribeMeterImsMediaConvertUsageResponse describeMeterImsMediaConvertUsageWithOptions(DescribeMeterImsMediaConvertUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterImsMediaConvertUsage"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterImsMediaConvertUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能媒体服务点播转码用量</p>
     * 
     * @param request DescribeMeterImsMediaConvertUsageRequest
     * @return DescribeMeterImsMediaConvertUsageResponse
     */
    public DescribeMeterImsMediaConvertUsageResponse describeMeterImsMediaConvertUsage(DescribeMeterImsMediaConvertUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeterImsMediaConvertUsageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMeterImsMpsAiUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeterImsMpsAiUsageResponse
     */
    public DescribeMeterImsMpsAiUsageResponse describeMeterImsMpsAiUsageWithOptions(DescribeMeterImsMpsAiUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterImsMpsAiUsage"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterImsMpsAiUsageResponse());
    }

    /**
     * @param request DescribeMeterImsMpsAiUsageRequest
     * @return DescribeMeterImsMpsAiUsageResponse
     */
    public DescribeMeterImsMpsAiUsageResponse describeMeterImsMpsAiUsage(DescribeMeterImsMpsAiUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeterImsMpsAiUsageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMeterImsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeterImsSummaryResponse
     */
    public DescribeMeterImsSummaryResponse describeMeterImsSummaryWithOptions(DescribeMeterImsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterImsSummary"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterImsSummaryResponse());
    }

    /**
     * @param request DescribeMeterImsSummaryRequest
     * @return DescribeMeterImsSummaryResponse
     */
    public DescribeMeterImsSummaryResponse describeMeterImsSummary(DescribeMeterImsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeterImsSummaryWithOptions(request, runtime);
    }

    /**
     * @param request DescribePlayListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlayListResponse
     */
    public DescribePlayListResponse describePlayListWithOptions(DescribePlayListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTs)) {
            query.put("BeginTs", request.beginTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderName)) {
            query.put("OrderName", request.orderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playType)) {
            query.put("PlayType", request.playType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlayList"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlayListResponse());
    }

    /**
     * @param request DescribePlayListRequest
     * @return DescribePlayListResponse
     */
    public DescribePlayListResponse describePlayList(DescribePlayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>本接口用来检测用户的朗读是否有明显的发音错误、嘈杂的环境等</p>
     * 
     * @param request DetectAudioForCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectAudioForCustomizedVoiceJobResponse
     */
    public DetectAudioForCustomizedVoiceJobResponse detectAudioForCustomizedVoiceJobWithOptions(DetectAudioForCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioRecordId)) {
            query.put("AudioRecordId", request.audioRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordUrl)) {
            query.put("RecordUrl", request.recordUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceId)) {
            query.put("VoiceId", request.voiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectAudioForCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectAudioForCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>本接口用来检测用户的朗读是否有明显的发音错误、嘈杂的环境等</p>
     * 
     * @param request DetectAudioForCustomizedVoiceJobRequest
     * @return DetectAudioForCustomizedVoiceJobResponse
     */
    public DetectAudioForCustomizedVoiceJobResponse detectAudioForCustomizedVoiceJob(DetectAudioForCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectAudioForCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除搜索索引</p>
     * 
     * @param request DropSearchIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropSearchIndexResponse
     */
    public DropSearchIndexResponse dropSearchIndexWithOptions(DropSearchIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexType)) {
            query.put("IndexType", request.indexType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropSearchIndex"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropSearchIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除搜索索引</p>
     * 
     * @param request DropSearchIndexRequest
     * @return DropSearchIndexResponse
     */
    public DropSearchIndexResponse dropSearchIndex(DropSearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropSearchIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除库</p>
     * 
     * @param request DropSearchLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropSearchLibResponse
     */
    public DropSearchLibResponse dropSearchLibWithOptions(DropSearchLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropSearchLib"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropSearchLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除库</p>
     * 
     * @param request DropSearchLibRequest
     * @return DropSearchLibResponse
     */
    public DropSearchLibResponse dropSearchLib(DropSearchLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dropSearchLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成KMS密钥DataKey</p>
     * 
     * @param request GenerateKMSDataKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateKMSDataKeyResponse
     */
    public GenerateKMSDataKeyResponse generateKMSDataKeyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateKMSDataKey"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateKMSDataKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成KMS密钥DataKey</p>
     * @return GenerateKMSDataKeyResponse
     */
    public GenerateKMSDataKeyResponse generateKMSDataKey() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateKMSDataKeyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数字人</p>
     * 
     * @param request GetAvatarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAvatarResponse
     */
    public GetAvatarResponse getAvatarWithOptions(GetAvatarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarId)) {
            query.put("AvatarId", request.avatarId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAvatar"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAvatarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数字人</p>
     * 
     * @param request GetAvatarRequest
     * @return GetAvatarResponse
     */
    public GetAvatarResponse getAvatar(GetAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAvatarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数字人训练任务</p>
     * 
     * @param request GetAvatarTrainingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAvatarTrainingJobResponse
     */
    public GetAvatarTrainingJobResponse getAvatarTrainingJobWithOptions(GetAvatarTrainingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAvatarTrainingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAvatarTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个数字人训练任务</p>
     * 
     * @param request GetAvatarTrainingJobRequest
     * @return GetAvatarTrainingJobResponse
     */
    public GetAvatarTrainingJobResponse getAvatarTrainingJob(GetAvatarTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAvatarTrainingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>一键成片-批量获取剪辑任务</p>
     * 
     * @param request GetBatchMediaProducingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchMediaProducingJobResponse
     */
    public GetBatchMediaProducingJobResponse getBatchMediaProducingJobWithOptions(GetBatchMediaProducingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchMediaProducingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchMediaProducingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>一键成片-批量获取剪辑任务</p>
     * 
     * @param request GetBatchMediaProducingJobRequest
     * @return GetBatchMediaProducingJobResponse
     */
    public GetBatchMediaProducingJobResponse getBatchMediaProducingJob(GetBatchMediaProducingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchMediaProducingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询媒资分类</p>
     * 
     * @param request GetCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCategoriesResponse
     */
    public GetCategoriesResponse getCategoriesWithOptions(GetCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCategories"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询媒资分类</p>
     * 
     * @param request GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    public GetCategoriesResponse getCategories(GetCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取内容分析搜索配置</p>
     * 
     * @param request GetContentAnalyzeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContentAnalyzeConfigResponse
     */
    public GetContentAnalyzeConfigResponse getContentAnalyzeConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContentAnalyzeConfig"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContentAnalyzeConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取内容分析搜索配置</p>
     * @return GetContentAnalyzeConfigResponse
     */
    public GetContentAnalyzeConfigResponse getContentAnalyzeConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContentAnalyzeConfigWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个媒体处理自定义模板</p>
     * 
     * @param request GetCustomTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomTemplateResponse
     */
    public GetCustomTemplateResponse getCustomTemplateWithOptions(GetCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subtype)) {
            query.put("Subtype", request.subtype);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个媒体处理自定义模板</p>
     * 
     * @param request GetCustomTemplateRequest
     * @return GetCustomTemplateResponse
     */
    public GetCustomTemplateResponse getCustomTemplate(GetCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的专属人声</p>
     * 
     * @param request GetCustomizedVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomizedVoiceResponse
     */
    public GetCustomizedVoiceResponse getCustomizedVoiceWithOptions(GetCustomizedVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.voiceId)) {
            query.put("VoiceId", request.voiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomizedVoice"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomizedVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的专属人声</p>
     * 
     * @param request GetCustomizedVoiceRequest
     * @return GetCustomizedVoiceResponse
     */
    public GetCustomizedVoiceResponse getCustomizedVoice(GetCustomizedVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomizedVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个人声克隆训练任务</p>
     * 
     * @param request GetCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomizedVoiceJobResponse
     */
    public GetCustomizedVoiceJobResponse getCustomizedVoiceJobWithOptions(GetCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个人声克隆训练任务</p>
     * 
     * @param request GetCustomizedVoiceJobRequest
     * @return GetCustomizedVoiceJobResponse
     */
    public GetCustomizedVoiceJobResponse getCustomizedVoiceJob(GetCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户默认存储地址</p>
     * 
     * @param request GetDefaultStorageLocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDefaultStorageLocationResponse
     */
    public GetDefaultStorageLocationResponse getDefaultStorageLocationWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultStorageLocation"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultStorageLocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户默认存储地址</p>
     * @return GetDefaultStorageLocationResponse
     */
    public GetDefaultStorageLocationResponse getDefaultStorageLocation() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultStorageLocationWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过本接口来获取需要给用户朗读的文本及示例音频</p>
     * 
     * @param request GetDemonstrationForCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDemonstrationForCustomizedVoiceJobResponse
     */
    public GetDemonstrationForCustomizedVoiceJobResponse getDemonstrationForCustomizedVoiceJobWithOptions(GetDemonstrationForCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            query.put("Scenario", request.scenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDemonstrationForCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDemonstrationForCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过本接口来获取需要给用户朗读的文本及示例音频</p>
     * 
     * @param request GetDemonstrationForCustomizedVoiceJobRequest
     * @return GetDemonstrationForCustomizedVoiceJobResponse
     */
    public GetDemonstrationForCustomizedVoiceJobResponse getDemonstrationForCustomizedVoiceJob(GetDemonstrationForCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDemonstrationForCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询动图任务详情接口</p>
     * 
     * @param request GetDynamicImageJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDynamicImageJobResponse
     */
    public GetDynamicImageJobResponse getDynamicImageJobWithOptions(GetDynamicImageJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDynamicImageJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDynamicImageJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询动图任务详情接口</p>
     * 
     * @param request GetDynamicImageJobRequest
     * @return GetDynamicImageJobResponse
     */
    public GetDynamicImageJobResponse getDynamicImageJob(GetDynamicImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDynamicImageJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个云剪辑工程</p>
     * 
     * @param request GetEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEditingProjectResponse
     */
    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSource)) {
            query.put("RequestSource", request.requestSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEditingProject"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEditingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个云剪辑工程</p>
     * 
     * @param request GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取剪辑工程关联素材</p>
     * 
     * @param request GetEditingProjectMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEditingProjectMaterialsResponse
     */
    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEditingProjectMaterials"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEditingProjectMaterialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取剪辑工程关联素材</p>
     * 
     * @param request GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件回调地址</p>
     * 
     * @param request GetEventCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventCallbackResponse
     */
    public GetEventCallbackResponse getEventCallbackWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEventCallback"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取事件回调地址</p>
     * @return GetEventCallbackResponse
     */
    public GetEventCallbackResponse getEventCallback() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventCallbackWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取直播剪辑m3u8索引文件</p>
     * 
     * @param request GetLiveEditingIndexFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveEditingIndexFileResponse
     */
    public GetLiveEditingIndexFileResponse getLiveEditingIndexFileWithOptions(GetLiveEditingIndexFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveEditingIndexFile"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveEditingIndexFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取直播剪辑m3u8索引文件</p>
     * 
     * @param request GetLiveEditingIndexFileRequest
     * @return GetLiveEditingIndexFileResponse
     */
    public GetLiveEditingIndexFileResponse getLiveEditingIndexFile(GetLiveEditingIndexFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveEditingIndexFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取直播剪辑任务</p>
     * 
     * @param request GetLiveEditingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveEditingJobResponse
     */
    public GetLiveEditingJobResponse getLiveEditingJobWithOptions(GetLiveEditingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveEditingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveEditingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取直播剪辑任务</p>
     * 
     * @param request GetLiveEditingJobRequest
     * @return GetLiveEditingJobResponse
     */
    public GetLiveEditingJobResponse getLiveEditingJob(GetLiveEditingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveEditingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制任务明细</p>
     * 
     * @param request GetLiveRecordJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveRecordJobResponse
     */
    public GetLiveRecordJobResponse getLiveRecordJobWithOptions(GetLiveRecordJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveRecordJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveRecordJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制任务明细</p>
     * 
     * @param request GetLiveRecordJobRequest
     * @return GetLiveRecordJobResponse
     */
    public GetLiveRecordJobResponse getLiveRecordJob(GetLiveRecordJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveRecordJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播录制模板详情</p>
     * 
     * @param request GetLiveRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveRecordTemplateResponse
     */
    public GetLiveRecordTemplateResponse getLiveRecordTemplateWithOptions(GetLiveRecordTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveRecordTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveRecordTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播录制模板详情</p>
     * 
     * @param request GetLiveRecordTemplateRequest
     * @return GetLiveRecordTemplateResponse
     */
    public GetLiveRecordTemplateResponse getLiveRecordTemplate(GetLiveRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图任务</p>
     * 
     * @param request GetLiveSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveSnapshotJobResponse
     */
    public GetLiveSnapshotJobResponse getLiveSnapshotJobWithOptions(GetLiveSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveSnapshotJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveSnapshotJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图任务</p>
     * 
     * @param request GetLiveSnapshotJobRequest
     * @return GetLiveSnapshotJobResponse
     */
    public GetLiveSnapshotJobResponse getLiveSnapshotJob(GetLiveSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图模板</p>
     * 
     * @param request GetLiveSnapshotTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveSnapshotTemplateResponse
     */
    public GetLiveSnapshotTemplateResponse getLiveSnapshotTemplateWithOptions(GetLiveSnapshotTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveSnapshotTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveSnapshotTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图模板</p>
     * 
     * @param request GetLiveSnapshotTemplateRequest
     * @return GetLiveSnapshotTemplateResponse
     */
    public GetLiveSnapshotTemplateResponse getLiveSnapshotTemplate(GetLiveSnapshotTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveSnapshotTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码任务详情</p>
     * 
     * @param request GetLiveTranscodeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveTranscodeJobResponse
     */
    public GetLiveTranscodeJobResponse getLiveTranscodeJobWithOptions(GetLiveTranscodeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveTranscodeJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveTranscodeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码任务详情</p>
     * 
     * @param request GetLiveTranscodeJobRequest
     * @return GetLiveTranscodeJobResponse
     */
    public GetLiveTranscodeJobResponse getLiveTranscodeJob(GetLiveTranscodeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveTranscodeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码模版详情</p>
     * 
     * @param request GetLiveTranscodeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveTranscodeTemplateResponse
     */
    public GetLiveTranscodeTemplateResponse getLiveTranscodeTemplateWithOptions(GetLiveTranscodeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveTranscodeTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveTranscodeTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码模版详情</p>
     * 
     * @param request GetLiveTranscodeTemplateRequest
     * @return GetLiveTranscodeTemplateResponse
     */
    public GetLiveTranscodeTemplateResponse getLiveTranscodeTemplate(GetLiveTranscodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLiveTranscodeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资内容信息</p>
     * 
     * @param request GetMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaInfoResponse
     */
    public GetMediaInfoResponse getMediaInfoWithOptions(GetMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnDetailedInfo)) {
            query.put("ReturnDetailedInfo", request.returnDetailedInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资内容信息</p>
     * 
     * @param request GetMediaInfoRequest
     * @return GetMediaInfoResponse
     */
    public GetMediaInfoResponse getMediaInfo(GetMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetMediaInfoJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaInfoJobResponse
     */
    public GetMediaInfoJobResponse getMediaInfoJobWithOptions(GetMediaInfoJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaInfoJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaInfoJobResponse());
    }

    /**
     * @param request GetMediaInfoJobRequest
     * @return GetMediaInfoJobResponse
     */
    public GetMediaInfoJobResponse getMediaInfoJob(GetMediaInfoJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaInfoJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资标注信息</p>
     * 
     * @param request GetMediaMarksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaMarksResponse
     */
    public GetMediaMarksResponse getMediaMarksWithOptions(GetMediaMarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMarkIds)) {
            query.put("MediaMarkIds", request.mediaMarkIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaMarks"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaMarksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资标注信息</p>
     * 
     * @param request GetMediaMarksRequest
     * @return GetMediaMarksResponse
     */
    public GetMediaMarksResponse getMediaMarks(GetMediaMarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaMarksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetMediaProducingJob</p>
     * 
     * @param request GetMediaProducingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaProducingJobResponse
     */
    public GetMediaProducingJobResponse getMediaProducingJobWithOptions(GetMediaProducingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaProducingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaProducingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetMediaProducingJob</p>
     * 
     * @param request GetMediaProducingJobRequest
     * @return GetMediaProducingJobResponse
     */
    public GetMediaProducingJobResponse getMediaProducingJob(GetMediaProducingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaProducingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个打包任务信息</p>
     * 
     * @param request GetPackageJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPackageJobResponse
     */
    public GetPackageJobResponse getPackageJobWithOptions(GetPackageJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPackageJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackageJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个打包任务信息</p>
     * 
     * @param request GetPackageJobRequest
     * @return GetPackageJobResponse
     */
    public GetPackageJobResponse getPackageJob(GetPackageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPackageJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个管道配置</p>
     * 
     * @param request GetPipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipelineWithOptions(GetPipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipeline"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个管道配置</p>
     * 
     * @param request GetPipelineRequest
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipeline(GetPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取播放信息</p>
     * 
     * @param request GetPlayInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPlayInfoResponse
     */
    public GetPlayInfoResponse getPlayInfoWithOptions(GetPlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlayInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPlayInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取播放信息</p>
     * 
     * @param request GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取公共媒资内容信息</p>
     * 
     * @param request GetPublicMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicMediaInfoResponse
     */
    public GetPublicMediaInfoResponse getPublicMediaInfoWithOptions(GetPublicMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicMediaInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取公共媒资内容信息</p>
     * 
     * @param request GetPublicMediaInfoRequest
     * @return GetPublicMediaInfoResponse
     */
    public GetPublicMediaInfoResponse getPublicMediaInfo(GetPublicMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetSmartHandleJob</p>
     * 
     * @param request GetSmartHandleJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmartHandleJobResponse
     */
    public GetSmartHandleJobResponse getSmartHandleJobWithOptions(GetSmartHandleJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmartHandleJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmartHandleJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetSmartHandleJob</p>
     * 
     * @param request GetSmartHandleJobRequest
     * @return GetSmartHandleJobResponse
     */
    public GetSmartHandleJobResponse getSmartHandleJob(GetSmartHandleJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmartHandleJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个截图任务</p>
     * 
     * @param request GetSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSnapshotJobResponse
     */
    public GetSnapshotJobResponse getSnapshotJobWithOptions(GetSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSnapshotJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSnapshotJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个截图任务</p>
     * 
     * @param request GetSnapshotJobRequest
     * @return GetSnapshotJobResponse
     */
    public GetSnapshotJobResponse getSnapshotJob(GetSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取截图文件URL</p>
     * 
     * @param request GetSnapshotUrlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSnapshotUrlsResponse
     */
    public GetSnapshotUrlsResponse getSnapshotUrlsWithOptions(GetSnapshotUrlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSnapshotUrls"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSnapshotUrlsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取截图文件URL</p>
     * 
     * @param request GetSnapshotUrlsRequest
     * @return GetSnapshotUrlsResponse
     */
    public GetSnapshotUrlsResponse getSnapshotUrls(GetSnapshotUrlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSnapshotUrlsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取存储地址列表</p>
     * 
     * @param request GetStorageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageListResponse
     */
    public GetStorageListResponse getStorageListWithOptions(GetStorageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageList"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取存储地址列表</p>
     * 
     * @param request GetStorageListRequest
     * @return GetStorageListResponse
     */
    public GetStorageListResponse getStorageList(GetStorageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个媒体处理系统模板</p>
     * 
     * @param request GetSystemTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSystemTemplateResponse
     */
    public GetSystemTemplateResponse getSystemTemplateWithOptions(GetSystemTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSystemTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSystemTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个媒体处理系统模板</p>
     * 
     * @param request GetSystemTemplateRequest
     * @return GetSystemTemplateResponse
     */
    public GetSystemTemplateResponse getSystemTemplate(GetSystemTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSystemTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTemplate</p>
     * 
     * @param request GetTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relatedMediaidFlag)) {
            query.put("RelatedMediaidFlag", request.relatedMediaidFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTemplate</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模板关联素材信息</p>
     * 
     * @param request GetTemplateMaterialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateMaterialsResponse
     */
    public GetTemplateMaterialsResponse getTemplateMaterialsWithOptions(GetTemplateMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileList)) {
            query.put("FileList", request.fileList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateMaterials"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateMaterialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模板关联素材信息</p>
     * 
     * @param request GetTemplateMaterialsRequest
     * @return GetTemplateMaterialsResponse
     */
    public GetTemplateMaterialsResponse getTemplateMaterials(GetTemplateMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateMaterialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模板参数信息</p>
     * 
     * @param request GetTemplateParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateParamsResponse
     */
    public GetTemplateParamsResponse getTemplateParamsWithOptions(GetTemplateParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateParams"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模板参数信息</p>
     * 
     * @param request GetTemplateParamsRequest
     * @return GetTemplateParamsResponse
     */
    public GetTemplateParamsResponse getTemplateParams(GetTemplateParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateParamsWithOptions(request, runtime);
    }

    /**
     * @param request GetTranscodeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTranscodeJobResponse
     */
    public GetTranscodeJobResponse getTranscodeJobWithOptions(GetTranscodeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentJobId)) {
            query.put("ParentJobId", request.parentJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranscodeJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranscodeJobResponse());
    }

    /**
     * @param request GetTranscodeJobRequest
     * @return GetTranscodeJobResponse
     */
    public GetTranscodeJobResponse getTranscodeJob(GetTranscodeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取URL上传信息</p>
     * 
     * @param request GetUrlUploadInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUrlUploadInfosResponse
     */
    public GetUrlUploadInfosResponse getUrlUploadInfosWithOptions(GetUrlUploadInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadURLs)) {
            query.put("UploadURLs", request.uploadURLs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUrlUploadInfos"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUrlUploadInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取URL上传信息</p>
     * 
     * @param request GetUrlUploadInfosRequest
     * @return GetUrlUploadInfosResponse
     */
    public GetUrlUploadInfosResponse getUrlUploadInfos(GetUrlUploadInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUrlUploadInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资新增列表</p>
     * 
     * @param request GetVideoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoListResponse
     */
    public GetVideoListResponse getVideoListWithOptions(GetVideoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoList"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资新增列表</p>
     * 
     * @param request GetVideoListRequest
     * @return GetVideoListResponse
     */
    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流任务</p>
     * 
     * @param request GetWorkflowTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowTaskResponse
     */
    public GetWorkflowTaskResponse getWorkflowTaskWithOptions(GetWorkflowTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowTask"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作流任务</p>
     * 
     * @param request GetWorkflowTaskRequest
     * @return GetWorkflowTaskResponse
     */
    public GetWorkflowTaskResponse getWorkflowTask(GetWorkflowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插入媒资到搜索</p>
     * 
     * @param request InsertMediaToSearchLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertMediaToSearchLibResponse
     */
    public InsertMediaToSearchLibResponse insertMediaToSearchLibWithOptions(InsertMediaToSearchLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgBody)) {
            query.put("MsgBody", request.msgBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertMediaToSearchLib"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertMediaToSearchLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>插入媒资到搜索</p>
     * 
     * @param request InsertMediaToSearchLibRequest
     * @return InsertMediaToSearchLibResponse
     */
    public InsertMediaToSearchLibResponse insertMediaToSearchLib(InsertMediaToSearchLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertMediaToSearchLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出公共素材库所有标签</p>
     * 
     * @param request ListAllPublicMediaTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllPublicMediaTagsResponse
     */
    public ListAllPublicMediaTagsResponse listAllPublicMediaTagsWithOptions(ListAllPublicMediaTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllPublicMediaTags"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllPublicMediaTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出公共素材库所有标签</p>
     * 
     * @param request ListAllPublicMediaTagsRequest
     * @return ListAllPublicMediaTagsResponse
     */
    public ListAllPublicMediaTagsResponse listAllPublicMediaTags(ListAllPublicMediaTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllPublicMediaTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人训练任务列表，列出当前用户的所有数字人训练任务</p>
     * 
     * @param request ListAvatarTrainingJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvatarTrainingJobsResponse
     */
    public ListAvatarTrainingJobsResponse listAvatarTrainingJobsWithOptions(ListAvatarTrainingJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvatarTrainingJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvatarTrainingJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人训练任务列表，列出当前用户的所有数字人训练任务</p>
     * 
     * @param request ListAvatarTrainingJobsRequest
     * @return ListAvatarTrainingJobsResponse
     */
    public ListAvatarTrainingJobsResponse listAvatarTrainingJobs(ListAvatarTrainingJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvatarTrainingJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人列表，列出当前用户的所有数字人</p>
     * 
     * @param request ListAvatarsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvatarsResponse
     */
    public ListAvatarsResponse listAvatarsWithOptions(ListAvatarsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarType)) {
            query.put("AvatarType", request.avatarType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvatars"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvatarsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人列表，列出当前用户的所有数字人</p>
     * 
     * @param request ListAvatarsRequest
     * @return ListAvatarsResponse
     */
    public ListAvatarsResponse listAvatars(ListAvatarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvatarsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一键成片任务列表</p>
     * 
     * @param request ListBatchMediaProducingJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBatchMediaProducingJobsResponse
     */
    public ListBatchMediaProducingJobsResponse listBatchMediaProducingJobsWithOptions(ListBatchMediaProducingJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBatchMediaProducingJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBatchMediaProducingJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一键成片任务列表</p>
     * 
     * @param request ListBatchMediaProducingJobsRequest
     * @return ListBatchMediaProducingJobsResponse
     */
    public ListBatchMediaProducingJobsResponse listBatchMediaProducingJobs(ListBatchMediaProducingJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBatchMediaProducingJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒体处理自定义模板列表</p>
     * 
     * @param request ListCustomTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomTemplatesResponse
     */
    public ListCustomTemplatesResponse listCustomTemplatesWithOptions(ListCustomTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtype)) {
            query.put("Subtype", request.subtype);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomTemplates"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒体处理自定义模板列表</p>
     * 
     * @param request ListCustomTemplatesRequest
     * @return ListCustomTemplatesResponse
     */
    public ListCustomTemplatesResponse listCustomTemplates(ListCustomTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询人声克隆训练任务列表，列出当前用户的所有人声克隆训练任务</p>
     * 
     * @param request ListCustomizedVoiceJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomizedVoiceJobsResponse
     */
    public ListCustomizedVoiceJobsResponse listCustomizedVoiceJobsWithOptions(ListCustomizedVoiceJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomizedVoiceJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomizedVoiceJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询人声克隆训练任务列表，列出当前用户的所有人声克隆训练任务</p>
     * 
     * @param request ListCustomizedVoiceJobsRequest
     * @return ListCustomizedVoiceJobsResponse
     */
    public ListCustomizedVoiceJobsResponse listCustomizedVoiceJobs(ListCustomizedVoiceJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomizedVoiceJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的专属人声列表</p>
     * 
     * @param request ListCustomizedVoicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomizedVoicesResponse
     */
    public ListCustomizedVoicesResponse listCustomizedVoicesWithOptions(ListCustomizedVoicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomizedVoices"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomizedVoicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的专属人声列表</p>
     * 
     * @param request ListCustomizedVoicesRequest
     * @return ListCustomizedVoicesResponse
     */
    public ListCustomizedVoicesResponse listCustomizedVoices(ListCustomizedVoicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomizedVoicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询DNA库</p>
     * 
     * @param request ListDNADBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDNADBResponse
     */
    public ListDNADBResponse listDNADBWithOptions(ListDNADBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBIds)) {
            query.put("DBIds", request.DBIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDNADB"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDNADBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询DNA库</p>
     * 
     * @param request ListDNADBRequest
     * @return ListDNADBResponse
     */
    public ListDNADBResponse listDNADB(ListDNADBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDNADBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询DNA文件</p>
     * 
     * @param request ListDNAFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDNAFilesResponse
     */
    public ListDNAFilesResponse listDNAFilesWithOptions(ListDNAFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBId)) {
            query.put("DBId", request.DBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDNAFiles"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDNAFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询DNA文件</p>
     * 
     * @param request ListDNAFilesRequest
     * @return ListDNAFilesResponse
     */
    public ListDNAFilesResponse listDNAFiles(ListDNAFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDNAFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询截图任务列表接口</p>
     * 
     * @param request ListDynamicImageJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicImageJobsResponse
     */
    public ListDynamicImageJobsResponse listDynamicImageJobsWithOptions(ListDynamicImageJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfCreateTime)) {
            query.put("EndOfCreateTime", request.endOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfCreateTime)) {
            query.put("StartOfCreateTime", request.startOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicImageJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicImageJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询截图任务列表接口</p>
     * 
     * @param request ListDynamicImageJobsRequest
     * @return ListDynamicImageJobsResponse
     */
    public ListDynamicImageJobsResponse listDynamicImageJobs(ListDynamicImageJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicImageJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制文件</p>
     * 
     * @param request ListLiveRecordFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveRecordFilesResponse
     */
    public ListLiveRecordFilesResponse listLiveRecordFilesWithOptions(ListLiveRecordFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveRecordFiles"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveRecordFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制文件</p>
     * 
     * @param request ListLiveRecordFilesRequest
     * @return ListLiveRecordFilesResponse
     */
    public ListLiveRecordFilesResponse listLiveRecordFiles(ListLiveRecordFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制任务</p>
     * 
     * @param request ListLiveRecordJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveRecordJobsResponse
     */
    public ListLiveRecordJobsResponse listLiveRecordJobsWithOptions(ListLiveRecordJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveRecordJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveRecordJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制任务</p>
     * 
     * @param request ListLiveRecordJobsRequest
     * @return ListLiveRecordJobsResponse
     */
    public ListLiveRecordJobsResponse listLiveRecordJobs(ListLiveRecordJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播录制模板</p>
     * 
     * @param request ListLiveRecordTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveRecordTemplatesResponse
     */
    public ListLiveRecordTemplatesResponse listLiveRecordTemplatesWithOptions(ListLiveRecordTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveRecordTemplates"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveRecordTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播录制模板</p>
     * 
     * @param request ListLiveRecordTemplatesRequest
     * @return ListLiveRecordTemplatesResponse
     */
    public ListLiveRecordTemplatesResponse listLiveRecordTemplates(ListLiveRecordTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图文件列表</p>
     * 
     * @param request ListLiveSnapshotFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveSnapshotFilesResponse
     */
    public ListLiveSnapshotFilesResponse listLiveSnapshotFilesWithOptions(ListLiveSnapshotFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveSnapshotFiles"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveSnapshotFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图文件列表</p>
     * 
     * @param request ListLiveSnapshotFilesRequest
     * @return ListLiveSnapshotFilesResponse
     */
    public ListLiveSnapshotFilesResponse listLiveSnapshotFiles(ListLiveSnapshotFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveSnapshotFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图任务列表</p>
     * 
     * @param request ListLiveSnapshotJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveSnapshotJobsResponse
     */
    public ListLiveSnapshotJobsResponse listLiveSnapshotJobsWithOptions(ListLiveSnapshotJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveSnapshotJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveSnapshotJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图任务列表</p>
     * 
     * @param request ListLiveSnapshotJobsRequest
     * @return ListLiveSnapshotJobsResponse
     */
    public ListLiveSnapshotJobsResponse listLiveSnapshotJobs(ListLiveSnapshotJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveSnapshotJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图模板列表</p>
     * 
     * @param request ListLiveSnapshotTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveSnapshotTemplatesResponse
     */
    public ListLiveSnapshotTemplatesResponse listLiveSnapshotTemplatesWithOptions(ListLiveSnapshotTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveSnapshotTemplates"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveSnapshotTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询直播截图模板列表</p>
     * 
     * @param request ListLiveSnapshotTemplatesRequest
     * @return ListLiveSnapshotTemplatesResponse
     */
    public ListLiveSnapshotTemplatesResponse listLiveSnapshotTemplates(ListLiveSnapshotTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveSnapshotTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码任务列表</p>
     * 
     * @param request ListLiveTranscodeJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveTranscodeJobsResponse
     */
    public ListLiveTranscodeJobsResponse listLiveTranscodeJobsWithOptions(ListLiveTranscodeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startMode)) {
            query.put("StartMode", request.startMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveTranscodeJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveTranscodeJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码任务列表</p>
     * 
     * @param request ListLiveTranscodeJobsRequest
     * @return ListLiveTranscodeJobsResponse
     */
    public ListLiveTranscodeJobsResponse listLiveTranscodeJobs(ListLiveTranscodeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveTranscodeJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码模版列表</p>
     * 
     * @param request ListLiveTranscodeTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLiveTranscodeTemplatesResponse
     */
    public ListLiveTranscodeTemplatesResponse listLiveTranscodeTemplatesWithOptions(ListLiveTranscodeTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoCodec)) {
            query.put("VideoCodec", request.videoCodec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveTranscodeTemplates"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLiveTranscodeTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询转码模版列表</p>
     * 
     * @param request ListLiveTranscodeTemplatesRequest
     * @return ListLiveTranscodeTemplatesResponse
     */
    public ListLiveTranscodeTemplatesResponse listLiveTranscodeTemplates(ListLiveTranscodeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveTranscodeTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出符合条件的媒资基础信息</p>
     * 
     * @param request ListMediaBasicInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediaBasicInfosResponse
     */
    public ListMediaBasicInfosResponse listMediaBasicInfosWithOptions(ListMediaBasicInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeFileBasicInfo)) {
            query.put("IncludeFileBasicInfo", request.includeFileBasicInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaBasicInfos"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaBasicInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出符合条件的媒资基础信息</p>
     * 
     * @param request ListMediaBasicInfosRequest
     * @return ListMediaBasicInfosResponse
     */
    public ListMediaBasicInfosResponse listMediaBasicInfos(ListMediaBasicInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaBasicInfosWithOptions(request, runtime);
    }

    /**
     * @param request ListMediaInfoJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediaInfoJobsResponse
     */
    public ListMediaInfoJobsResponse listMediaInfoJobsWithOptions(ListMediaInfoJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfCreateTime)) {
            query.put("EndOfCreateTime", request.endOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfCreateTime)) {
            query.put("StartOfCreateTime", request.startOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaInfoJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaInfoJobsResponse());
    }

    /**
     * @param request ListMediaInfoJobsRequest
     * @return ListMediaInfoJobsResponse
     */
    public ListMediaInfoJobsResponse listMediaInfoJobs(ListMediaInfoJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaInfoJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资的标注信息</p>
     * 
     * @param request ListMediaMarksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediaMarksResponse
     */
    public ListMediaMarksResponse listMediaMarksWithOptions(ListMediaMarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMarkIds)) {
            query.put("MediaMarkIds", request.mediaMarkIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaMarks"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaMarksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒资的标注信息</p>
     * 
     * @param request ListMediaMarksRequest
     * @return ListMediaMarksResponse
     */
    public ListMediaMarksResponse listMediaMarks(ListMediaMarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaMarksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出合成任务列表</p>
     * 
     * @param request ListMediaProducingJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediaProducingJobsResponse
     */
    public ListMediaProducingJobsResponse listMediaProducingJobsWithOptions(ListMediaProducingJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterJobId)) {
            query.put("MasterJobId", request.masterJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaProducingJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaProducingJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出合成任务列表</p>
     * 
     * @param request ListMediaProducingJobsRequest
     * @return ListMediaProducingJobsResponse
     */
    public ListMediaProducingJobsResponse listMediaProducingJobs(ListMediaProducingJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaProducingJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取打包任务列表</p>
     * 
     * @param request ListPackageJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPackageJobsResponse
     */
    public ListPackageJobsResponse listPackageJobsWithOptions(ListPackageJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfCreateTime)) {
            query.put("EndOfCreateTime", request.endOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfCreateTime)) {
            query.put("StartOfCreateTime", request.startOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPackageJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPackageJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取打包任务列表</p>
     * 
     * @param request ListPackageJobsRequest
     * @return ListPackageJobsResponse
     */
    public ListPackageJobsResponse listPackageJobs(ListPackageJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPackageJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取管道配置列表</p>
     * 
     * @param request ListPipelinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelinesWithOptions(ListPipelinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelines"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取管道配置列表</p>
     * 
     * @param request ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPipelinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出公共素材库素材的基础信息</p>
     * 
     * @param request ListPublicMediaBasicInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicMediaBasicInfosResponse
     */
    public ListPublicMediaBasicInfosResponse listPublicMediaBasicInfosWithOptions(ListPublicMediaBasicInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeFileBasicInfo)) {
            query.put("IncludeFileBasicInfo", request.includeFileBasicInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaTagId)) {
            query.put("MediaTagId", request.mediaTagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicMediaBasicInfos"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicMediaBasicInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出公共素材库素材的基础信息</p>
     * 
     * @param request ListPublicMediaBasicInfosRequest
     * @return ListPublicMediaBasicInfosResponse
     */
    public ListPublicMediaBasicInfosResponse listPublicMediaBasicInfos(ListPublicMediaBasicInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicMediaBasicInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSmartJobs</p>
     * 
     * @param request ListSmartJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmartJobsResponse
     */
    public ListSmartJobsResponse listSmartJobsWithOptions(ListSmartJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmartJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmartJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSmartJobs</p>
     * 
     * @param request ListSmartJobsRequest
     * @return ListSmartJobsResponse
     */
    public ListSmartJobsResponse listSmartJobs(ListSmartJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmartJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出虚拟人官方模特配置</p>
     * 
     * @param request ListSmartSysAvatarModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmartSysAvatarModelsResponse
     */
    public ListSmartSysAvatarModelsResponse listSmartSysAvatarModelsWithOptions(ListSmartSysAvatarModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkVersion)) {
            query.put("SdkVersion", request.sdkVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmartSysAvatarModels"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmartSysAvatarModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出虚拟人官方模特配置</p>
     * 
     * @param request ListSmartSysAvatarModelsRequest
     * @return ListSmartSysAvatarModelsResponse
     */
    public ListSmartSysAvatarModelsResponse listSmartSysAvatarModels(ListSmartSysAvatarModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmartSysAvatarModelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出智能语音发音人信息</p>
     * 
     * @param request ListSmartVoiceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmartVoiceGroupsResponse
     */
    public ListSmartVoiceGroupsResponse listSmartVoiceGroupsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmartVoiceGroups"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmartVoiceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出智能语音发音人信息</p>
     * @return ListSmartVoiceGroupsResponse
     */
    public ListSmartVoiceGroupsResponse listSmartVoiceGroups() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmartVoiceGroupsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询截图任务列表接口</p>
     * 
     * @param request ListSnapshotJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSnapshotJobsResponse
     */
    public ListSnapshotJobsResponse listSnapshotJobsWithOptions(ListSnapshotJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfCreateTime)) {
            query.put("EndOfCreateTime", request.endOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfCreateTime)) {
            query.put("StartOfCreateTime", request.startOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshotJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询截图任务列表接口</p>
     * 
     * @param request ListSnapshotJobsRequest
     * @return ListSnapshotJobsResponse
     */
    public ListSnapshotJobsResponse listSnapshotJobs(ListSnapshotJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒体处理系统模板列表</p>
     * 
     * @param request ListSystemTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSystemTemplatesResponse
     */
    public ListSystemTemplatesResponse listSystemTemplatesWithOptions(ListSystemTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtype)) {
            query.put("Subtype", request.subtype);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemTemplates"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSystemTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒体处理系统模板列表</p>
     * 
     * @param request ListSystemTemplatesRequest
     * @return ListSystemTemplatesResponse
     */
    public ListSystemTemplatesResponse listSystemTemplates(ListSystemTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSystemTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListTemplates</p>
     * 
     * @param request ListTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createSource)) {
            query.put("CreateSource", request.createSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListTemplates</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request ListTranscodeJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTranscodeJobsResponse
     */
    public ListTranscodeJobsResponse listTranscodeJobsWithOptions(ListTranscodeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfCreateTime)) {
            query.put("EndOfCreateTime", request.endOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentJobId)) {
            query.put("ParentJobId", request.parentJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfCreateTime)) {
            query.put("StartOfCreateTime", request.startOfCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTranscodeJobs"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTranscodeJobsResponse());
    }

    /**
     * @param request ListTranscodeJobsRequest
     * @return ListTranscodeJobsResponse
     */
    public ListTranscodeJobsResponse listTranscodeJobs(ListTranscodeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询DNA作业</p>
     * 
     * @param request QueryDNAJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDNAJobListResponse
     */
    public QueryDNAJobListResponse queryDNAJobListWithOptions(QueryDNAJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDNAJobList"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDNAJobListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询DNA作业</p>
     * 
     * @param request QueryDNAJobListRequest
     * @return QueryDNAJobListResponse
     */
    public QueryDNAJobListResponse queryDNAJobList(QueryDNAJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDNAJobListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询智能生产作业</p>
     * 
     * @param request QueryIProductionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIProductionJobResponse
     */
    public QueryIProductionJobResponse queryIProductionJobWithOptions(QueryIProductionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIProductionJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIProductionJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询智能生产作业</p>
     * 
     * @param request QueryIProductionJobRequest
     * @return QueryIProductionJobResponse
     */
    public QueryIProductionJobResponse queryIProductionJob(QueryIProductionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryIProductionJobWithOptions(request, runtime);
    }

    /**
     * @param request QueryMediaCensorJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaCensorJobDetailResponse
     */
    public QueryMediaCensorJobDetailResponse queryMediaCensorJobDetailWithOptions(QueryMediaCensorJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaCensorJobDetail"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaCensorJobDetailResponse());
    }

    /**
     * @param request QueryMediaCensorJobDetailRequest
     * @return QueryMediaCensorJobDetailResponse
     */
    public QueryMediaCensorJobDetailResponse queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaCensorJobDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryMediaCensorJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaCensorJobListResponse
     */
    public QueryMediaCensorJobListResponse queryMediaCensorJobListWithOptions(QueryMediaCensorJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfJobCreatedTimeRange)) {
            query.put("EndOfJobCreatedTimeRange", request.endOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfJobCreatedTimeRange)) {
            query.put("StartOfJobCreatedTimeRange", request.startOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaCensorJobList"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaCensorJobListResponse());
    }

    /**
     * @param request QueryMediaCensorJobListRequest
     * @return QueryMediaCensorJobListResponse
     */
    public QueryMediaCensorJobListResponse queryMediaCensorJobList(QueryMediaCensorJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaCensorJobListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询索引任务</p>
     * 
     * @param request QueryMediaIndexJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaIndexJobResponse
     */
    public QueryMediaIndexJobResponse queryMediaIndexJobWithOptions(QueryMediaIndexJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaIndexJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaIndexJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询索引任务</p>
     * 
     * @param request QueryMediaIndexJobRequest
     * @return QueryMediaIndexJobResponse
     */
    public QueryMediaIndexJobResponse queryMediaIndexJob(QueryMediaIndexJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaIndexJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询搜索索引</p>
     * 
     * @param request QuerySearchIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySearchIndexResponse
     */
    public QuerySearchIndexResponse querySearchIndexWithOptions(QuerySearchIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexType)) {
            query.put("IndexType", request.indexType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySearchIndex"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySearchIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询搜索索引</p>
     * 
     * @param request QuerySearchIndexRequest
     * @return QuerySearchIndexResponse
     */
    public QuerySearchIndexResponse querySearchIndex(QuerySearchIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySearchIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询库</p>
     * 
     * @param request QuerySearchLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySearchLibResponse
     */
    public QuerySearchLibResponse querySearchLibWithOptions(QuerySearchLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySearchLib"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySearchLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询库</p>
     * 
     * @param request QuerySearchLibRequest
     * @return QuerySearchLibResponse
     */
    public QuerySearchLibResponse querySearchLib(QuerySearchLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySearchLibWithOptions(request, runtime);
    }

    /**
     * @param request QuerySmarttagJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmarttagJobResponse
     */
    public QuerySmarttagJobResponse querySmarttagJobWithOptions(QuerySmarttagJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmarttagJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmarttagJobResponse());
    }

    /**
     * @param request QuerySmarttagJobRequest
     * @return QuerySmarttagJobResponse
     */
    public QuerySmarttagJobResponse querySmarttagJob(QuerySmarttagJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmarttagJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新媒资上传凭证</p>
     * 
     * @param request RefreshUploadMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshUploadMediaResponse
     */
    public RefreshUploadMediaResponse refreshUploadMediaWithOptions(RefreshUploadMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshUploadMedia"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshUploadMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新媒资上传凭证</p>
     * 
     * @param request RefreshUploadMediaRequest
     * @return RefreshUploadMediaResponse
     */
    public RefreshUploadMediaResponse refreshUploadMedia(RefreshUploadMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册内容库资源</p>
     * 
     * @param request RegisterMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterMediaInfoResponse
     */
    public RegisterMediaInfoResponse registerMediaInfoWithOptions(RegisterMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaTags)) {
            query.put("MediaTags", request.mediaTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerConfig)) {
            query.put("RegisterConfig", request.registerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartTagTemplateId)) {
            query.put("SmartTagTemplateId", request.smartTagTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterMediaInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册内容库资源</p>
     * 
     * @param request RegisterMediaInfoRequest
     * @return RegisterMediaInfoResponse
     */
    public RegisterMediaInfoResponse registerMediaInfo(RegisterMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册媒体流</p>
     * 
     * @param request RegisterMediaStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterMediaStreamResponse
     */
    public RegisterMediaStreamResponse registerMediaStreamWithOptions(RegisterMediaStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterMediaStream"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterMediaStreamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册媒体流</p>
     * 
     * @param request RegisterMediaStreamRequest
     * @return RegisterMediaStreamResponse
     */
    public RegisterMediaStreamResponse registerMediaStream(RegisterMediaStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerMediaStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SearchEditingProject</p>
     * 
     * @param request SearchEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchEditingProjectResponse
     */
    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createSource)) {
            query.put("CreateSource", request.createSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectType)) {
            query.put("ProjectType", request.projectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchEditingProject"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchEditingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SearchEditingProject</p>
     * 
     * @param request SearchEditingProjectRequest
     * @return SearchEditingProjectResponse
     */
    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about media assets based on the request parameters.</p>
     * 
     * @param request SearchMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            query.put("Match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scrollToken)) {
            query.put("ScrollToken", request.scrollToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMedia"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about media assets based on the request parameters.</p>
     * 
     * @param request SearchMediaRequest
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能标签搜索</p>
     * 
     * @param request SearchMediaByAILabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaByAILabelResponse
     */
    public SearchMediaByAILabelResponse searchMediaByAILabelWithOptions(SearchMediaByAILabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multimodalSearchType)) {
            query.put("MultimodalSearchType", request.multimodalSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificSearch)) {
            query.put("SpecificSearch", request.specificSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMediaByAILabel"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaByAILabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能标签搜索</p>
     * 
     * @param request SearchMediaByAILabelRequest
     * @return SearchMediaByAILabelResponse
     */
    public SearchMediaByAILabelResponse searchMediaByAILabel(SearchMediaByAILabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaByAILabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人脸搜粗搜接口，输入一张人脸图片，搜索该人物所在媒资的相关信息</p>
     * 
     * @param request SearchMediaByFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaByFaceResponse
     */
    public SearchMediaByFaceResponse searchMediaByFaceWithOptions(SearchMediaByFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceSearchToken)) {
            query.put("FaceSearchToken", request.faceSearchToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personImageUrl)) {
            query.put("PersonImageUrl", request.personImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMediaByFace"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaByFaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人脸搜粗搜接口，输入一张人脸图片，搜索该人物所在媒资的相关信息</p>
     * 
     * @param request SearchMediaByFaceRequest
     * @return SearchMediaByFaceResponse
     */
    public SearchMediaByFaceResponse searchMediaByFace(SearchMediaByFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaByFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>混合搜索</p>
     * 
     * @param request SearchMediaByHybridRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaByHybridResponse
     */
    public SearchMediaByHybridResponse searchMediaByHybridWithOptions(SearchMediaByHybridRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMediaByHybrid"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaByHybridResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>混合搜索</p>
     * 
     * @param request SearchMediaByHybridRequest
     * @return SearchMediaByHybridResponse
     */
    public SearchMediaByHybridResponse searchMediaByHybrid(SearchMediaByHybridRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaByHybridWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态搜索</p>
     * 
     * @param request SearchMediaByMultimodalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaByMultimodalResponse
     */
    public SearchMediaByMultimodalResponse searchMediaByMultimodalWithOptions(SearchMediaByMultimodalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMediaByMultimodal"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaByMultimodalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态搜索</p>
     * 
     * @param request SearchMediaByMultimodalRequest
     * @return SearchMediaByMultimodalResponse
     */
    public SearchMediaByMultimodalResponse searchMediaByMultimodal(SearchMediaByMultimodalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaByMultimodalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人脸搜精搜接口，基于粗搜结果返回该人物所在媒资的相关人物片段信息</p>
     * 
     * @param request SearchMediaClipByFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaClipByFaceResponse
     */
    public SearchMediaClipByFaceResponse searchMediaClipByFaceWithOptions(SearchMediaClipByFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceSearchToken)) {
            query.put("FaceSearchToken", request.faceSearchToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMediaClipByFace"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaClipByFaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人脸搜精搜接口，基于粗搜结果返回该人物所在媒资的相关人物片段信息</p>
     * 
     * @param request SearchMediaClipByFaceRequest
     * @return SearchMediaClipByFaceResponse
     */
    public SearchMediaClipByFaceResponse searchMediaClipByFace(SearchMediaClipByFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaClipByFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索公共媒资信息</p>
     * 
     * @param request SearchPublicMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchPublicMediaInfoResponse
     */
    public SearchPublicMediaInfoResponse searchPublicMediaInfoWithOptions(SearchPublicMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorized)) {
            query.put("Authorized", request.authorized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicMetaDataMatchFields)) {
            query.put("DynamicMetaDataMatchFields", request.dynamicMetaDataMatchFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.favorite)) {
            query.put("Favorite", request.favorite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPublicMediaInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPublicMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>搜索公共媒资信息</p>
     * 
     * @param request SearchPublicMediaInfoRequest
     * @return SearchPublicMediaInfoResponse
     */
    public SearchPublicMediaInfoResponse searchPublicMediaInfo(SearchPublicMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchPublicMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送实时截图任务指令</p>
     * 
     * @param request SendLiveSnapshotJobCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendLiveSnapshotJobCommandResponse
     */
    public SendLiveSnapshotJobCommandResponse sendLiveSnapshotJobCommandWithOptions(SendLiveSnapshotJobCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            body.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendLiveSnapshotJobCommand"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendLiveSnapshotJobCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送实时截图任务指令</p>
     * 
     * @param request SendLiveSnapshotJobCommandRequest
     * @return SendLiveSnapshotJobCommandResponse
     */
    public SendLiveSnapshotJobCommandResponse sendLiveSnapshotJobCommand(SendLiveSnapshotJobCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendLiveSnapshotJobCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给指定转码任务发实时命令</p>
     * 
     * @param request SendLiveTranscodeJobCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendLiveTranscodeJobCommandResponse
     */
    public SendLiveTranscodeJobCommandResponse sendLiveTranscodeJobCommandWithOptions(SendLiveTranscodeJobCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendLiveTranscodeJobCommand"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendLiveTranscodeJobCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>给指定转码任务发实时命令</p>
     * 
     * @param request SendLiveTranscodeJobCommandRequest
     * @return SendLiveTranscodeJobCommandResponse
     */
    public SendLiveTranscodeJobCommandResponse sendLiveTranscodeJobCommand(SendLiveTranscodeJobCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendLiveTranscodeJobCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置内容分析搜索配置</p>
     * 
     * @param request SetContentAnalyzeConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetContentAnalyzeConfigResponse
     */
    public SetContentAnalyzeConfigResponse setContentAnalyzeConfigWithOptions(SetContentAnalyzeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auto)) {
            query.put("Auto", request.auto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveType)) {
            query.put("SaveType", request.saveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetContentAnalyzeConfig"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetContentAnalyzeConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置内容分析搜索配置</p>
     * 
     * @param request SetContentAnalyzeConfigRequest
     * @return SetContentAnalyzeConfigResponse
     */
    public SetContentAnalyzeConfigResponse setContentAnalyzeConfig(SetContentAnalyzeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setContentAnalyzeConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置默认媒体处理模板</p>
     * 
     * @param request SetDefaultCustomTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultCustomTemplateResponse
     */
    public SetDefaultCustomTemplateResponse setDefaultCustomTemplateWithOptions(SetDefaultCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultCustomTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultCustomTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置默认媒体处理模板</p>
     * 
     * @param request SetDefaultCustomTemplateRequest
     * @return SetDefaultCustomTemplateResponse
     */
    public SetDefaultCustomTemplateResponse setDefaultCustomTemplate(SetDefaultCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultCustomTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置默认存储路径</p>
     * 
     * @param request SetDefaultStorageLocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultStorageLocationResponse
     */
    public SetDefaultStorageLocationResponse setDefaultStorageLocationWithOptions(SetDefaultStorageLocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultStorageLocation"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultStorageLocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置默认存储路径</p>
     * 
     * @param request SetDefaultStorageLocationRequest
     * @return SetDefaultStorageLocationResponse
     */
    public SetDefaultStorageLocationResponse setDefaultStorageLocation(SetDefaultStorageLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultStorageLocationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置事件回调地址</p>
     * 
     * @param request SetEventCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetEventCallbackResponse
     */
    public SetEventCallbackResponse setEventCallbackWithOptions(SetEventCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSwitch)) {
            query.put("AuthSwitch", request.authSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackQueueName)) {
            query.put("CallbackQueueName", request.callbackQueueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackType)) {
            query.put("CallbackType", request.callbackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackURL)) {
            query.put("CallbackURL", request.callbackURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTypeList)) {
            query.put("EventTypeList", request.eventTypeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEventCallback"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEventCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置事件回调地址</p>
     * 
     * @param request SetEventCallbackRequest
     * @return SetEventCallbackResponse
     */
    public SetEventCallbackResponse setEventCallback(SetEventCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEventCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动工作流</p>
     * 
     * @param request StartWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartWorkflowResponse
     */
    public StartWorkflowResponse startWorkflowWithOptions(StartWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskInput)) {
            query.put("TaskInput", request.taskInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartWorkflow"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动工作流</p>
     * 
     * @param request StartWorkflowRequest
     * @return StartWorkflowResponse
     */
    public StartWorkflowResponse startWorkflow(StartWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitASRJob</p>
     * 
     * @param request SubmitASRJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitASRJobResponse
     */
    public SubmitASRJobResponse submitASRJobWithOptions(SubmitASRJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputFile)) {
            query.put("InputFile", request.inputFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitASRJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitASRJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitASRJob</p>
     * 
     * @param request SubmitASRJobRequest
     * @return SubmitASRJobResponse
     */
    public SubmitASRJobResponse submitASRJob(SubmitASRJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitASRJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitAudioProduceJob</p>
     * 
     * @param request SubmitAudioProduceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAudioProduceJobResponse
     */
    public SubmitAudioProduceJobResponse submitAudioProduceJobWithOptions(SubmitAudioProduceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.editingConfig)) {
            query.put("EditingConfig", request.editingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputConfig)) {
            query.put("InputConfig", request.inputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputConfig)) {
            query.put("OutputConfig", request.outputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAudioProduceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAudioProduceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitAudioProduceJob</p>
     * 
     * @param request SubmitAudioProduceJobRequest
     * @return SubmitAudioProduceJobResponse
     */
    public SubmitAudioProduceJobResponse submitAudioProduceJob(SubmitAudioProduceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAudioProduceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交数字人训练任务</p>
     * 
     * @param request SubmitAvatarTrainingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAvatarTrainingJobResponse
     */
    public SubmitAvatarTrainingJobResponse submitAvatarTrainingJobWithOptions(SubmitAvatarTrainingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAvatarTrainingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAvatarTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交数字人训练任务</p>
     * 
     * @param request SubmitAvatarTrainingJobRequest
     * @return SubmitAvatarTrainingJobResponse
     */
    public SubmitAvatarTrainingJobResponse submitAvatarTrainingJob(SubmitAvatarTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAvatarTrainingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交虚拟人视频合成任务</p>
     * 
     * @param request SubmitAvatarVideoJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAvatarVideoJobResponse
     */
    public SubmitAvatarVideoJobResponse submitAvatarVideoJobWithOptions(SubmitAvatarVideoJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.editingConfig)) {
            query.put("EditingConfig", request.editingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputConfig)) {
            query.put("InputConfig", request.inputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputConfig)) {
            query.put("OutputConfig", request.outputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAvatarVideoJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAvatarVideoJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交虚拟人视频合成任务</p>
     * 
     * @param request SubmitAvatarVideoJobRequest
     * @return SubmitAvatarVideoJobResponse
     */
    public SubmitAvatarVideoJobResponse submitAvatarVideoJob(SubmitAvatarVideoJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAvatarVideoJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitBatchMediaProducingJob</p>
     * 
     * @param request SubmitBatchMediaProducingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitBatchMediaProducingJobResponse
     */
    public SubmitBatchMediaProducingJobResponse submitBatchMediaProducingJobWithOptions(SubmitBatchMediaProducingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputConfig)) {
            query.put("OutputConfig", request.outputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.editingConfig)) {
            body.put("EditingConfig", request.editingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputConfig)) {
            body.put("InputConfig", request.inputConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitBatchMediaProducingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitBatchMediaProducingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitBatchMediaProducingJob</p>
     * 
     * @param request SubmitBatchMediaProducingJobRequest
     * @return SubmitBatchMediaProducingJobResponse
     */
    public SubmitBatchMediaProducingJobResponse submitBatchMediaProducingJob(SubmitBatchMediaProducingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitBatchMediaProducingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交人声克隆训练任务</p>
     * 
     * @param request SubmitCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitCustomizedVoiceJobResponse
     */
    public SubmitCustomizedVoiceJobResponse submitCustomizedVoiceJobWithOptions(SubmitCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.demoAudioMediaURL)) {
            query.put("DemoAudioMediaURL", request.demoAudioMediaURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceId)) {
            query.put("VoiceId", request.voiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交人声克隆训练任务</p>
     * 
     * @param request SubmitCustomizedVoiceJobRequest
     * @return SubmitCustomizedVoiceJobResponse
     */
    public SubmitCustomizedVoiceJobResponse submitCustomizedVoiceJob(SubmitCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交DNA作业</p>
     * 
     * @param tmpReq SubmitDNAJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDNAJobResponse
     */
    public SubmitDNAJobResponse submitDNAJobWithOptions(SubmitDNAJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitDNAJobShrinkRequest request = new SubmitDNAJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBId)) {
            query.put("DBId", request.DBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            query.put("PrimaryKey", request.primaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDNAJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDNAJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交DNA作业</p>
     * 
     * @param request SubmitDNAJobRequest
     * @return SubmitDNAJobResponse
     */
    public SubmitDNAJobResponse submitDNAJob(SubmitDNAJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDNAJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交动态图表任务</p>
     * 
     * @param request SubmitDynamicChartJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDynamicChartJobResponse
     */
    public SubmitDynamicChartJobResponse submitDynamicChartJobWithOptions(SubmitDynamicChartJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.axisParams)) {
            query.put("AxisParams", request.axisParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.background)) {
            query.put("Background", request.background);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chartConfig)) {
            query.put("ChartConfig", request.chartConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chartTitle)) {
            query.put("ChartTitle", request.chartTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chartType)) {
            query.put("ChartType", request.chartType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputConfig)) {
            query.put("OutputConfig", request.outputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtitle)) {
            query.put("Subtitle", request.subtitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unit)) {
            query.put("Unit", request.unit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDynamicChartJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDynamicChartJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交动态图表任务</p>
     * 
     * @param request SubmitDynamicChartJobRequest
     * @return SubmitDynamicChartJobResponse
     */
    public SubmitDynamicChartJobResponse submitDynamicChartJob(SubmitDynamicChartJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDynamicChartJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步动图任务接口</p>
     * 
     * @param tmpReq SubmitDynamicImageJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDynamicImageJobResponse
     */
    public SubmitDynamicImageJobResponse submitDynamicImageJobWithOptions(SubmitDynamicImageJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitDynamicImageJobShrinkRequest request = new SubmitDynamicImageJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.output)) {
            request.outputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.output, "Output", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateConfig)) {
            request.templateConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateConfig, "TemplateConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputShrink)) {
            query.put("Output", request.outputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfigShrink)) {
            query.put("TemplateConfig", request.templateConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDynamicImageJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDynamicImageJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步动图任务接口</p>
     * 
     * @param request SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    public SubmitDynamicImageJobResponse submitDynamicImageJob(SubmitDynamicImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDynamicImageJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交智能生产作业</p>
     * 
     * @param tmpReq SubmitIProductionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIProductionJobResponse
     */
    public SubmitIProductionJobResponse submitIProductionJobWithOptions(SubmitIProductionJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitIProductionJobShrinkRequest request = new SubmitIProductionJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.output)) {
            request.outputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.output, "Output", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            query.put("JobParams", request.jobParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputShrink)) {
            query.put("Output", request.outputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIProductionJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIProductionJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交智能生产作业</p>
     * 
     * @param request SubmitIProductionJobRequest
     * @return SubmitIProductionJobResponse
     */
    public SubmitIProductionJobResponse submitIProductionJob(SubmitIProductionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIProductionJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交直播剪辑任务</p>
     * 
     * @param request SubmitLiveEditingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitLiveEditingJobResponse
     */
    public SubmitLiveEditingJobResponse submitLiveEditingJobWithOptions(SubmitLiveEditingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clips)) {
            query.put("Clips", request.clips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveStreamConfig)) {
            query.put("LiveStreamConfig", request.liveStreamConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaProduceConfig)) {
            query.put("MediaProduceConfig", request.mediaProduceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputMediaConfig)) {
            query.put("OutputMediaConfig", request.outputMediaConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputMediaTarget)) {
            query.put("OutputMediaTarget", request.outputMediaTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitLiveEditingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitLiveEditingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交直播剪辑任务</p>
     * 
     * @param request SubmitLiveEditingJobRequest
     * @return SubmitLiveEditingJobResponse
     */
    public SubmitLiveEditingJobResponse submitLiveEditingJob(SubmitLiveEditingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitLiveEditingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交录制任务</p>
     * 
     * @param tmpReq SubmitLiveRecordJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitLiveRecordJobResponse
     */
    public SubmitLiveRecordJobResponse submitLiveRecordJobWithOptions(SubmitLiveRecordJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitLiveRecordJobShrinkRequest request = new SubmitLiveRecordJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordOutput)) {
            request.recordOutputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordOutput, "RecordOutput", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamInput)) {
            request.streamInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamInput, "StreamInput", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            body.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordOutputShrink)) {
            body.put("RecordOutput", request.recordOutputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamInputShrink)) {
            body.put("StreamInput", request.streamInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitLiveRecordJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitLiveRecordJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交录制任务</p>
     * 
     * @param request SubmitLiveRecordJobRequest
     * @return SubmitLiveRecordJobResponse
     */
    public SubmitLiveRecordJobResponse submitLiveRecordJob(SubmitLiveRecordJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitLiveRecordJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建直播截图任务</p>
     * 
     * @param tmpReq SubmitLiveSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitLiveSnapshotJobResponse
     */
    public SubmitLiveSnapshotJobResponse submitLiveSnapshotJobWithOptions(SubmitLiveSnapshotJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitLiveSnapshotJobShrinkRequest request = new SubmitLiveSnapshotJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.snapshotOutput)) {
            request.snapshotOutputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.snapshotOutput, "SnapshotOutput", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamInput)) {
            request.streamInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamInput, "StreamInput", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotOutputShrink)) {
            body.put("SnapshotOutput", request.snapshotOutputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamInputShrink)) {
            body.put("StreamInput", request.streamInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitLiveSnapshotJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitLiveSnapshotJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建直播截图任务</p>
     * 
     * @param request SubmitLiveSnapshotJobRequest
     * @return SubmitLiveSnapshotJobResponse
     */
    public SubmitLiveSnapshotJobResponse submitLiveSnapshotJob(SubmitLiveSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitLiveSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交转码任务</p>
     * 
     * @param tmpReq SubmitLiveTranscodeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitLiveTranscodeJobResponse
     */
    public SubmitLiveTranscodeJobResponse submitLiveTranscodeJobWithOptions(SubmitLiveTranscodeJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitLiveTranscodeJobShrinkRequest request = new SubmitLiveTranscodeJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamInput)) {
            request.streamInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamInput, "StreamInput", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timedConfig)) {
            request.timedConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timedConfig, "TimedConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transcodeOutput)) {
            request.transcodeOutputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transcodeOutput, "TranscodeOutput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startMode)) {
            query.put("StartMode", request.startMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamInputShrink)) {
            query.put("StreamInput", request.streamInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timedConfigShrink)) {
            query.put("TimedConfig", request.timedConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeOutputShrink)) {
            query.put("TranscodeOutput", request.transcodeOutputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitLiveTranscodeJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitLiveTranscodeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交转码任务</p>
     * 
     * @param request SubmitLiveTranscodeJobRequest
     * @return SubmitLiveTranscodeJobResponse
     */
    public SubmitLiveTranscodeJobResponse submitLiveTranscodeJob(SubmitLiveTranscodeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitLiveTranscodeJobWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SubmitMediaCensorJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaCensorJobResponse
     */
    public SubmitMediaCensorJobResponse submitMediaCensorJobWithOptions(SubmitMediaCensorJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitMediaCensorJobShrinkRequest request = new SubmitMediaCensorJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.barrages)) {
            query.put("Barrages", request.barrages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverImages)) {
            query.put("CoverImages", request.coverImages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaCensorJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaCensorJobResponse());
    }

    /**
     * @param request SubmitMediaCensorJobRequest
     * @return SubmitMediaCensorJobResponse
     */
    public SubmitMediaCensorJobResponse submitMediaCensorJob(SubmitMediaCensorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaCensorJobWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SubmitMediaInfoJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaInfoJobResponse
     */
    public SubmitMediaInfoJobResponse submitMediaInfoJobWithOptions(SubmitMediaInfoJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitMediaInfoJobShrinkRequest request = new SubmitMediaInfoJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaInfoJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaInfoJobResponse());
    }

    /**
     * @param request SubmitMediaInfoJobRequest
     * @return SubmitMediaInfoJobResponse
     */
    public SubmitMediaInfoJobResponse submitMediaInfoJob(SubmitMediaInfoJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaInfoJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitMediaProducingJob</p>
     * 
     * @param request SubmitMediaProducingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaProducingJobResponse
     */
    public SubmitMediaProducingJobResponse submitMediaProducingJobWithOptions(SubmitMediaProducingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipsParam)) {
            query.put("ClipsParam", request.clipsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.editingProduceConfig)) {
            query.put("EditingProduceConfig", request.editingProduceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMetadata)) {
            query.put("MediaMetadata", request.mediaMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputMediaConfig)) {
            query.put("OutputMediaConfig", request.outputMediaConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputMediaTarget)) {
            query.put("OutputMediaTarget", request.outputMediaTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectMetadata)) {
            query.put("ProjectMetadata", request.projectMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timeline)) {
            body.put("Timeline", request.timeline);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaProducingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaProducingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitMediaProducingJob</p>
     * 
     * @param request SubmitMediaProducingJobRequest
     * @return SubmitMediaProducingJobResponse
     */
    public SubmitMediaProducingJobResponse submitMediaProducingJob(SubmitMediaProducingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaProducingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交打包任务</p>
     * 
     * @param tmpReq SubmitPackageJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitPackageJobResponse
     */
    public SubmitPackageJobResponse submitPackageJobWithOptions(SubmitPackageJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitPackageJobShrinkRequest request = new SubmitPackageJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.output)) {
            request.outputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.output, "Output", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            query.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputShrink)) {
            query.put("Output", request.outputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitPackageJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitPackageJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交打包任务</p>
     * 
     * @param request SubmitPackageJobRequest
     * @return SubmitPackageJobResponse
     */
    public SubmitPackageJobResponse submitPackageJob(SubmitPackageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPackageJobWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SubmitSmarttagJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSmarttagJobResponse
     */
    public SubmitSmarttagJobResponse submitSmarttagJobWithOptions(SubmitSmarttagJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSmarttagJobShrinkRequest request = new SubmitSmarttagJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentAddr)) {
            query.put("ContentAddr", request.contentAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSmarttagJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmarttagJobResponse());
    }

    /**
     * @param request SubmitSmarttagJobRequest
     * @return SubmitSmarttagJobResponse
     */
    public SubmitSmarttagJobResponse submitSmarttagJob(SubmitSmarttagJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmarttagJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步截图任务</p>
     * 
     * @param tmpReq SubmitSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSnapshotJobShrinkRequest request = new SubmitSnapshotJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.output)) {
            request.outputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.output, "Output", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateConfig)) {
            request.templateConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateConfig, "TemplateConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputShrink)) {
            query.put("Output", request.outputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfigShrink)) {
            query.put("TemplateConfig", request.templateConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSnapshotJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSnapshotJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步截图任务</p>
     * 
     * @param request SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交标准版人声克隆训练任务</p>
     * 
     * @param request SubmitStandardCustomizedVoiceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitStandardCustomizedVoiceJobResponse
     */
    public SubmitStandardCustomizedVoiceJobResponse submitStandardCustomizedVoiceJobWithOptions(SubmitStandardCustomizedVoiceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audios)) {
            query.put("Audios", request.audios);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authentication)) {
            query.put("Authentication", request.authentication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.demoAudioMediaURL)) {
            query.put("DemoAudioMediaURL", request.demoAudioMediaURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceName)) {
            query.put("VoiceName", request.voiceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitStandardCustomizedVoiceJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitStandardCustomizedVoiceJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交标准版人声克隆训练任务</p>
     * 
     * @param request SubmitStandardCustomizedVoiceJobRequest
     * @return SubmitStandardCustomizedVoiceJobResponse
     */
    public SubmitStandardCustomizedVoiceJobResponse submitStandardCustomizedVoiceJob(SubmitStandardCustomizedVoiceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitStandardCustomizedVoiceJobWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SubmitSyncMediaInfoJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSyncMediaInfoJobResponse
     */
    public SubmitSyncMediaInfoJobResponse submitSyncMediaInfoJobWithOptions(SubmitSyncMediaInfoJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSyncMediaInfoJobShrinkRequest request = new SubmitSyncMediaInfoJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSyncMediaInfoJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSyncMediaInfoJobResponse());
    }

    /**
     * @param request SubmitSyncMediaInfoJobRequest
     * @return SubmitSyncMediaInfoJobResponse
     */
    public SubmitSyncMediaInfoJobResponse submitSyncMediaInfoJob(SubmitSyncMediaInfoJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSyncMediaInfoJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交文本生成任务</p>
     * 
     * @param request SubmitTextGenerateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTextGenerateJobResponse
     */
    public SubmitTextGenerateJobResponse submitTextGenerateJobWithOptions(SubmitTextGenerateJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateConfig)) {
            query.put("GenerateConfig", request.generateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTextGenerateJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTextGenerateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交文本生成任务</p>
     * 
     * @param request SubmitTextGenerateJobRequest
     * @return SubmitTextGenerateJobResponse
     */
    public SubmitTextGenerateJobResponse submitTextGenerateJob(SubmitTextGenerateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTextGenerateJobWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SubmitTranscodeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTranscodeJobResponse
     */
    public SubmitTranscodeJobResponse submitTranscodeJobWithOptions(SubmitTranscodeJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTranscodeJobShrinkRequest request = new SubmitTranscodeJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputGroup)) {
            request.inputGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputGroup, "InputGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputGroup)) {
            request.outputGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputGroup, "OutputGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfig)) {
            request.scheduleConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfig, "ScheduleConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputGroupShrink)) {
            query.put("InputGroup", request.inputGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputGroupShrink)) {
            query.put("OutputGroup", request.outputGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfigShrink)) {
            query.put("ScheduleConfig", request.scheduleConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTranscodeJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTranscodeJobResponse());
    }

    /**
     * @param request SubmitTranscodeJobRequest
     * @return SubmitTranscodeJobResponse
     */
    public SubmitTranscodeJobResponse submitTranscodeJob(SubmitTranscodeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTranscodeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频翻译任务</p>
     * 
     * @param request SubmitVideoTranslationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoTranslationJobResponse
     */
    public SubmitVideoTranslationJobResponse submitVideoTranslationJobWithOptions(SubmitVideoTranslationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.editingConfig)) {
            query.put("EditingConfig", request.editingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputConfig)) {
            query.put("InputConfig", request.inputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputConfig)) {
            query.put("OutputConfig", request.outputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoTranslationJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoTranslationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频翻译任务</p>
     * 
     * @param request SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    public SubmitVideoTranslationJobResponse submitVideoTranslationJob(SubmitVideoTranslationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoTranslationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数字人训练任务信息</p>
     * 
     * @param request UpdateAvatarTrainingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAvatarTrainingJobResponse
     */
    public UpdateAvatarTrainingJobResponse updateAvatarTrainingJobWithOptions(UpdateAvatarTrainingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarDescription)) {
            query.put("AvatarDescription", request.avatarDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarName)) {
            query.put("AvatarName", request.avatarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portrait)) {
            query.put("Portrait", request.portrait);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnail)) {
            query.put("Thumbnail", request.thumbnail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparent)) {
            query.put("Transparent", request.transparent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAvatarTrainingJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAvatarTrainingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数字人训练任务信息</p>
     * 
     * @param request UpdateAvatarTrainingJobRequest
     * @return UpdateAvatarTrainingJobResponse
     */
    public UpdateAvatarTrainingJobResponse updateAvatarTrainingJob(UpdateAvatarTrainingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAvatarTrainingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒资分类</p>
     * 
     * @param request UpdateCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCategoryResponse
     */
    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateName)) {
            query.put("CateName", request.cateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCategory"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒资分类</p>
     * 
     * @param request UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒体处理自定义模板</p>
     * 
     * @param request UpdateCustomTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomTemplateResponse
     */
    public UpdateCustomTemplateResponse updateCustomTemplateWithOptions(UpdateCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfig)) {
            query.put("TemplateConfig", request.templateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒体处理自定义模板</p>
     * 
     * @param request UpdateCustomTemplateRequest
     * @return UpdateCustomTemplateResponse
     */
    public UpdateCustomTemplateResponse updateCustomTemplate(UpdateCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户的专属人声</p>
     * 
     * @param request UpdateCustomizedVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomizedVoiceResponse
     */
    public UpdateCustomizedVoiceResponse updateCustomizedVoiceWithOptions(UpdateCustomizedVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.demoAudioMediaId)) {
            query.put("DemoAudioMediaId", request.demoAudioMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceId)) {
            query.put("VoiceId", request.voiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomizedVoice"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomizedVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户的专属人声</p>
     * 
     * @param request UpdateCustomizedVoiceRequest
     * @return UpdateCustomizedVoiceResponse
     */
    public UpdateCustomizedVoiceResponse updateCustomizedVoice(UpdateCustomizedVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomizedVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改云剪辑工程</p>
     * 
     * @param request UpdateEditingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEditingProjectResponse
     */
    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessStatus)) {
            query.put("BusinessStatus", request.businessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipsParam)) {
            query.put("ClipsParam", request.clipsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timeline)) {
            body.put("Timeline", request.timeline);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEditingProject"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEditingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改云剪辑工程</p>
     * 
     * @param request UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改直播录制模板</p>
     * 
     * @param tmpReq UpdateLiveRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLiveRecordTemplateResponse
     */
    public UpdateLiveRecordTemplateResponse updateLiveRecordTemplateWithOptions(UpdateLiveRecordTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLiveRecordTemplateShrinkRequest request = new UpdateLiveRecordTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordFormat)) {
            request.recordFormatShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordFormat, "RecordFormat", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordFormatShrink)) {
            body.put("RecordFormat", request.recordFormatShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLiveRecordTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveRecordTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改直播录制模板</p>
     * 
     * @param request UpdateLiveRecordTemplateRequest
     * @return UpdateLiveRecordTemplateResponse
     */
    public UpdateLiveRecordTemplateResponse updateLiveRecordTemplate(UpdateLiveRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新直播截图模板</p>
     * 
     * @param request UpdateLiveSnapshotTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLiveSnapshotTemplateResponse
     */
    public UpdateLiveSnapshotTemplateResponse updateLiveSnapshotTemplateWithOptions(UpdateLiveSnapshotTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.overwriteFormat)) {
            body.put("OverwriteFormat", request.overwriteFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceFormat)) {
            body.put("SequenceFormat", request.sequenceFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeInterval)) {
            body.put("TimeInterval", request.timeInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLiveSnapshotTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveSnapshotTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新直播截图模板</p>
     * 
     * @param request UpdateLiveSnapshotTemplateRequest
     * @return UpdateLiveSnapshotTemplateResponse
     */
    public UpdateLiveSnapshotTemplateResponse updateLiveSnapshotTemplate(UpdateLiveSnapshotTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveSnapshotTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新转码任务配置</p>
     * 
     * @param tmpReq UpdateLiveTranscodeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLiveTranscodeJobResponse
     */
    public UpdateLiveTranscodeJobResponse updateLiveTranscodeJobWithOptions(UpdateLiveTranscodeJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLiveTranscodeJobShrinkRequest request = new UpdateLiveTranscodeJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamInput)) {
            request.streamInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamInput, "StreamInput", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timedConfig)) {
            request.timedConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timedConfig, "TimedConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transcodeOutput)) {
            request.transcodeOutputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transcodeOutput, "TranscodeOutput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamInputShrink)) {
            query.put("StreamInput", request.streamInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timedConfigShrink)) {
            query.put("TimedConfig", request.timedConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcodeOutputShrink)) {
            query.put("TranscodeOutput", request.transcodeOutputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLiveTranscodeJob"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveTranscodeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新转码任务配置</p>
     * 
     * @param request UpdateLiveTranscodeJobRequest
     * @return UpdateLiveTranscodeJobResponse
     */
    public UpdateLiveTranscodeJobResponse updateLiveTranscodeJob(UpdateLiveTranscodeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveTranscodeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新转码模版</p>
     * 
     * @param tmpReq UpdateLiveTranscodeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLiveTranscodeTemplateResponse
     */
    public UpdateLiveTranscodeTemplateResponse updateLiveTranscodeTemplateWithOptions(UpdateLiveTranscodeTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLiveTranscodeTemplateShrinkRequest request = new UpdateLiveTranscodeTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateConfig)) {
            request.templateConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateConfig, "TemplateConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateConfigShrink)) {
            query.put("TemplateConfig", request.templateConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLiveTranscodeTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveTranscodeTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新转码模版</p>
     * 
     * @param request UpdateLiveTranscodeTemplateRequest
     * @return UpdateLiveTranscodeTemplateResponse
     */
    public UpdateLiveTranscodeTemplateResponse updateLiveTranscodeTemplate(UpdateLiveTranscodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveTranscodeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateMediaInfo</p>
     * 
     * @param request UpdateMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaInfoResponse
     */
    public UpdateMediaInfoResponse updateMediaInfoWithOptions(UpdateMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendTags)) {
            query.put("AppendTags", request.appendTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaTags)) {
            query.put("MediaTags", request.mediaTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceId)) {
            query.put("ReferenceId", request.referenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaInfo"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateMediaInfo</p>
     * 
     * @param request UpdateMediaInfoRequest
     * @return UpdateMediaInfoResponse
     */
    public UpdateMediaInfoResponse updateMediaInfo(UpdateMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为媒资修改标注信息</p>
     * 
     * @param request UpdateMediaMarksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaMarksResponse
     */
    public UpdateMediaMarksResponse updateMediaMarksWithOptions(UpdateMediaMarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMarks)) {
            query.put("MediaMarks", request.mediaMarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaMarks"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaMarksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为媒资修改标注信息</p>
     * 
     * @param request UpdateMediaMarksRequest
     * @return UpdateMediaMarksResponse
     */
    public UpdateMediaMarksResponse updateMediaMarks(UpdateMediaMarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaMarksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒资到搜索</p>
     * 
     * @param request UpdateMediaToSearchLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaToSearchLibResponse
     */
    public UpdateMediaToSearchLibResponse updateMediaToSearchLibWithOptions(UpdateMediaToSearchLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgBody)) {
            query.put("MsgBody", request.msgBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaToSearchLib"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaToSearchLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒资到搜索</p>
     * 
     * @param request UpdateMediaToSearchLibRequest
     * @return UpdateMediaToSearchLibResponse
     */
    public UpdateMediaToSearchLibResponse updateMediaToSearchLib(UpdateMediaToSearchLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaToSearchLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新管道配置</p>
     * 
     * @param request UpdatePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipelineWithOptions(UpdatePipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipeline"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新管道配置</p>
     * 
     * @param request UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateTemplate</p>
     * 
     * @param request UpdateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            query.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewMedia)) {
            query.put("PreviewMedia", request.previewMedia);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedMediaids)) {
            query.put("RelatedMediaids", request.relatedMediaids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateTemplate</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>URL拉取上传</p>
     * 
     * @param request UploadMediaByURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadMediaByURLResponse
     */
    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMetaData)) {
            query.put("MediaMetaData", request.mediaMetaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postProcessConfig)) {
            query.put("PostProcessConfig", request.postProcessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadTargetConfig)) {
            query.put("UploadTargetConfig", request.uploadTargetConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadURLs)) {
            query.put("UploadURLs", request.uploadURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMediaByURL"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMediaByURLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>URL拉取上传</p>
     * 
     * @param request UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>URL拉取上传媒体流</p>
     * 
     * @param request UploadStreamByURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadStreamByURLResponse
     */
    public UploadStreamByURLResponse uploadStreamByURLWithOptions(UploadStreamByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            query.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileExtension)) {
            query.put("FileExtension", request.fileExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HDRType)) {
            query.put("HDRType", request.HDRType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamURL)) {
            query.put("StreamURL", request.streamURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadStreamByURL"),
            new TeaPair("version", "2020-11-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadStreamByURLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>URL拉取上传媒体流</p>
     * 
     * @param request UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    public UploadStreamByURLResponse uploadStreamByURL(UploadStreamByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadStreamByURLWithOptions(request, runtime);
    }
}
