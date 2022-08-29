// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyMpcSqlJobShrinkRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataSetDtos")
    public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtos> dataSetDtos;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("Inputs")
    public String inputsShrink;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobStatus")
    public Integer jobStatus;

    @NameInMap("JobType")
    public Integer jobType;

    @NameInMap("JobTypeName")
    public String jobTypeName;

    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("ModeName")
    public String modeName;

    @NameInMap("Outputs")
    public String outputsShrink;

    @NameInMap("PlanList")
    public String planListShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProtocolTypeList")
    public String protocolTypeListShrink;

    @NameInMap("ScheduleCron")
    public String scheduleCron;

    @NameInMap("ScheduleType")
    public Integer scheduleType;

    @NameInMap("ScheduleTypeName")
    public String scheduleTypeName;

    @NameInMap("Sql")
    public String sql;

    public static ModifyMpcSqlJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMpcSqlJobShrinkRequest self = new ModifyMpcSqlJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMpcSqlJobShrinkRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public ModifyMpcSqlJobShrinkRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public ModifyMpcSqlJobShrinkRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ModifyMpcSqlJobShrinkRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public ModifyMpcSqlJobShrinkRequest setDataSetDtos(java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public ModifyMpcSqlJobShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModifyMpcSqlJobShrinkRequest setInputsShrink(String inputsShrink) {
        this.inputsShrink = inputsShrink;
        return this;
    }
    public String getInputsShrink() {
        return this.inputsShrink;
    }

    public ModifyMpcSqlJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyMpcSqlJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ModifyMpcSqlJobShrinkRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ModifyMpcSqlJobShrinkRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public ModifyMpcSqlJobShrinkRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public ModifyMpcSqlJobShrinkRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ModifyMpcSqlJobShrinkRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public ModifyMpcSqlJobShrinkRequest setOutputsShrink(String outputsShrink) {
        this.outputsShrink = outputsShrink;
        return this;
    }
    public String getOutputsShrink() {
        return this.outputsShrink;
    }

    public ModifyMpcSqlJobShrinkRequest setPlanListShrink(String planListShrink) {
        this.planListShrink = planListShrink;
        return this;
    }
    public String getPlanListShrink() {
        return this.planListShrink;
    }

    public ModifyMpcSqlJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyMpcSqlJobShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyMpcSqlJobShrinkRequest setProtocolTypeListShrink(String protocolTypeListShrink) {
        this.protocolTypeListShrink = protocolTypeListShrink;
        return this;
    }
    public String getProtocolTypeListShrink() {
        return this.protocolTypeListShrink;
    }

    public ModifyMpcSqlJobShrinkRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public ModifyMpcSqlJobShrinkRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public ModifyMpcSqlJobShrinkRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public ModifyMpcSqlJobShrinkRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public static class ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns self = new ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns extends TeaModel {
        @NameInMap("DataSetRole")
        public Integer dataSetRole;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("InputColumnDesc")
        public String inputColumnDesc;

        @NameInMap("InputColumnName")
        public String inputColumnName;

        @NameInMap("OutputColumnDesc")
        public String outputColumnDesc;

        @NameInMap("OutputColumnName")
        public String outputColumnName;

        public static ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns self = new ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns extends TeaModel {
        @NameInMap("DataSetRole")
        public Integer dataSetRole;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("InputColumnDesc")
        public String inputColumnDesc;

        @NameInMap("InputColumnName")
        public String inputColumnName;

        @NameInMap("OutputColumnDesc")
        public String outputColumnDesc;

        @NameInMap("OutputColumnName")
        public String outputColumnName;

        public static ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns self = new ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyMpcSqlJobShrinkRequestDataSetDtos extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("DataOwnerId")
        public Long dataOwnerId;

        @NameInMap("DataOwnerName")
        public String dataOwnerName;

        @NameInMap("DataRole")
        public Integer dataRole;

        @NameInMap("DataSetId")
        public Long dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("DataSetUsage")
        public Integer dataSetUsage;

        @NameInMap("FilterStr")
        public String filterStr;

        @NameInMap("FlFeatureColumns")
        public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static ModifyMpcSqlJobShrinkRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            ModifyMpcSqlJobShrinkRequestDataSetDtos self = new ModifyMpcSqlJobShrinkRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setFlFeatureColumns(java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setInputColumns(java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setOutputColumns(java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<ModifyMpcSqlJobShrinkRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public ModifyMpcSqlJobShrinkRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
