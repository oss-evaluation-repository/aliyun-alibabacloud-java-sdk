// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAggregateFunctionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAggregateFunctionResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAggregateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAggregateFunctionResponseBody self = new DescribeAggregateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAggregateFunctionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAggregateFunctionResponseBody setData(java.util.List<DescribeAggregateFunctionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAggregateFunctionResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAggregateFunctionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAggregateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAggregateFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAggregateFunctionResponseBodyData extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("FunctionName")
        public String functionName;

        public static DescribeAggregateFunctionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAggregateFunctionResponseBodyData self = new DescribeAggregateFunctionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAggregateFunctionResponseBodyData setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeAggregateFunctionResponseBodyData setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
