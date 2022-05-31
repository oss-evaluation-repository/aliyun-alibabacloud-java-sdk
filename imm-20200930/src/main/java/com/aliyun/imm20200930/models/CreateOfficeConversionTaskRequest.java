// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    // 转换终止页，包含终止页，默认转换到最后一页，表格转图片时需要指定 SheetIndex 才有效
    @NameInMap("EndPage")
    public Long endPage;

    // 表格转图片参数，是否只返回表格的第一张图片，默认为否
    @NameInMap("FirstPage")
    public Boolean firstPage;

    // 表格转图片参数，是否将所有行输出到一张图片，默认为否
    @NameInMap("FitToHeight")
    public Boolean fitToHeight;

    // 表格转图片参数，是否将所有列输出到一张图片，默认为否
    @NameInMap("FitToWidth")
    public Boolean fitToWidth;

    // 转文本时是否保留文档中的换行符，默认不保留
    @NameInMap("HoldLineFeed")
    public Boolean holdLineFeed;

    // 输出图片 DPI，允许范围 96-600，默认 96
    @NameInMap("ImageDPI")
    public Long imageDPI;

    // 转图片时是否转换成一张长图，最多支持将 20 页合成一张长图，超过可能报错，默认为不转成长图
    @NameInMap("LongPicture")
    public Boolean longPicture;

    // 转文本时是否转换成长文本，默认每页是个独立的文本
    @NameInMap("LongText")
    public Boolean longText;

    // 表格转图片的最大列数，在 LongPicture 为 true 时生效，默认转所有列
    @NameInMap("MaxSheetColumn")
    public Long maxSheetColumn;

    // 表格转图片的最大行数，在 LongPicture 为 true 时生效，默认转所有行
    @NameInMap("MaxSheetRow")
    public Long maxSheetRow;

    // mns 消息通知地址
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    // mns 消息通知 topic
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    // 指定转换页码，优先级高于 StartPage/EndPage，格式：多个页码用 “," 拼接，连续页码用 "-" 连接，样例参考: 1,2-4,7
    @NameInMap("Pages")
    public String pages;

    // 表格转图片纸张是否水平放置，默认为否
    @NameInMap("PaperHorizontal")
    public Boolean paperHorizontal;

    // 表格转图片纸张大小，支持 A4/A2/A0，默认A4，配合 FitToHeight 或 FitToWidth 一起使用才有效
    @NameInMap("PaperSize")
    public String paperSize;

    // 文档密码
    @NameInMap("Password")
    public String password;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 质量参数，范围是0-100，越大质量越好，默认系统自动选择适合的分辨率
    @NameInMap("Quality")
    public Long quality;

    // 缩放参数，允许范围 20~200，100代表不缩放，小于100表示缩小，大于100表示放大，默认不缩放
    @NameInMap("ScalePercentage")
    public Long scalePercentage;

    // 表格转图片参数，指定转换表格中的 sheet 数量，默认转换所有 sheet
    @NameInMap("SheetCount")
    public Long sheetCount;

    // 表格转图片参数，指定转换哪一个 sheet，从 1 开始，默认从起始页开始转
    @NameInMap("SheetIndex")
    public Long sheetIndex;

    // 文字转图片，是否显示批注，目前只支持文字转图片时携带批注，默认不显示批注
    @NameInMap("ShowComments")
    public Boolean showComments;

    // 输入文件格式，默认使用文件名后缀小写格式
    @NameInMap("SourceType")
    public String sourceType;

    // 文档转换输入文件地址
    @NameInMap("SourceURI")
    public String sourceURI;

    // 转换起始页，从 1 开始，包含起始页，默认从第一页开始转换，表格转图片时需要指定 SheetIndex 才有效
    @NameInMap("StartPage")
    public Long startPage;

    // 用户自定义标签
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    // 输出文件格式
    @NameInMap("TargetType")
    public String targetType;

    // 文档转换输出文件地址前缀
    @NameInMap("TargetURIPrefix")
    public String targetURIPrefix;

    // 表格瘦身
    @NameInMap("TrimPolicy")
    public TrimPolicy trimPolicy;

    // 用户自定义数据，在消息通知中返回
    @NameInMap("UserData")
    public String userData;

    public static CreateOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskRequest self = new CreateOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateOfficeConversionTaskRequest setEndPage(Long endPage) {
        this.endPage = endPage;
        return this;
    }
    public Long getEndPage() {
        return this.endPage;
    }

    public CreateOfficeConversionTaskRequest setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    public Boolean getFirstPage() {
        return this.firstPage;
    }

    public CreateOfficeConversionTaskRequest setFitToHeight(Boolean fitToHeight) {
        this.fitToHeight = fitToHeight;
        return this;
    }
    public Boolean getFitToHeight() {
        return this.fitToHeight;
    }

    public CreateOfficeConversionTaskRequest setFitToWidth(Boolean fitToWidth) {
        this.fitToWidth = fitToWidth;
        return this;
    }
    public Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public CreateOfficeConversionTaskRequest setHoldLineFeed(Boolean holdLineFeed) {
        this.holdLineFeed = holdLineFeed;
        return this;
    }
    public Boolean getHoldLineFeed() {
        return this.holdLineFeed;
    }

    public CreateOfficeConversionTaskRequest setImageDPI(Long imageDPI) {
        this.imageDPI = imageDPI;
        return this;
    }
    public Long getImageDPI() {
        return this.imageDPI;
    }

    public CreateOfficeConversionTaskRequest setLongPicture(Boolean longPicture) {
        this.longPicture = longPicture;
        return this;
    }
    public Boolean getLongPicture() {
        return this.longPicture;
    }

    public CreateOfficeConversionTaskRequest setLongText(Boolean longText) {
        this.longText = longText;
        return this;
    }
    public Boolean getLongText() {
        return this.longText;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetColumn(Long maxSheetColumn) {
        this.maxSheetColumn = maxSheetColumn;
        return this;
    }
    public Long getMaxSheetColumn() {
        return this.maxSheetColumn;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetRow(Long maxSheetRow) {
        this.maxSheetRow = maxSheetRow;
        return this;
    }
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    public CreateOfficeConversionTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateOfficeConversionTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateOfficeConversionTaskRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public CreateOfficeConversionTaskRequest setPaperHorizontal(Boolean paperHorizontal) {
        this.paperHorizontal = paperHorizontal;
        return this;
    }
    public Boolean getPaperHorizontal() {
        return this.paperHorizontal;
    }

    public CreateOfficeConversionTaskRequest setPaperSize(String paperSize) {
        this.paperSize = paperSize;
        return this;
    }
    public String getPaperSize() {
        return this.paperSize;
    }

    public CreateOfficeConversionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOfficeConversionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOfficeConversionTaskRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateOfficeConversionTaskRequest setScalePercentage(Long scalePercentage) {
        this.scalePercentage = scalePercentage;
        return this;
    }
    public Long getScalePercentage() {
        return this.scalePercentage;
    }

    public CreateOfficeConversionTaskRequest setSheetCount(Long sheetCount) {
        this.sheetCount = sheetCount;
        return this;
    }
    public Long getSheetCount() {
        return this.sheetCount;
    }

    public CreateOfficeConversionTaskRequest setSheetIndex(Long sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }
    public Long getSheetIndex() {
        return this.sheetIndex;
    }

    public CreateOfficeConversionTaskRequest setShowComments(Boolean showComments) {
        this.showComments = showComments;
        return this;
    }
    public Boolean getShowComments() {
        return this.showComments;
    }

    public CreateOfficeConversionTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateOfficeConversionTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateOfficeConversionTaskRequest setStartPage(Long startPage) {
        this.startPage = startPage;
        return this;
    }
    public Long getStartPage() {
        return this.startPage;
    }

    public CreateOfficeConversionTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateOfficeConversionTaskRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateOfficeConversionTaskRequest setTargetURIPrefix(String targetURIPrefix) {
        this.targetURIPrefix = targetURIPrefix;
        return this;
    }
    public String getTargetURIPrefix() {
        return this.targetURIPrefix;
    }

    public CreateOfficeConversionTaskRequest setTrimPolicy(TrimPolicy trimPolicy) {
        this.trimPolicy = trimPolicy;
        return this;
    }
    public TrimPolicy getTrimPolicy() {
        return this.trimPolicy;
    }

    public CreateOfficeConversionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
