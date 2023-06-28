// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileResponseBody extends TeaModel {
    /**
     * <p>The result of the modification. A value of success indicates that the modification is successful. If the modification failed, an error message is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message that is returned. This parameter is not returned if the value of Code is success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response object when you move a file.</p>
     */
    @NameInMap("MoveCdsFileModel")
    public MoveCdsFileResponseBodyMoveCdsFileModel moveCdsFileModel;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MoveCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveCdsFileResponseBody self = new MoveCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveCdsFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MoveCdsFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveCdsFileResponseBody setMoveCdsFileModel(MoveCdsFileResponseBodyMoveCdsFileModel moveCdsFileModel) {
        this.moveCdsFileModel = moveCdsFileModel;
        return this;
    }
    public MoveCdsFileResponseBodyMoveCdsFileModel getMoveCdsFileModel() {
        return this.moveCdsFileModel;
    }

    public MoveCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveCdsFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MoveCdsFileResponseBodyMoveCdsFileModel extends TeaModel {
        /**
         * <p>The ID of the asynchronous task. This parameter is not returned if you copy files. This parameter is returned if you copy folders in the backend in an asynchronous manner. You can call the GetAsyncTask operation to obtain the ID and details of an asynchronous task.</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <p>Indicates whether the file exists.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   <!-- --></p>
         * <br>
         * <p>    false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Exist")
        public Boolean exist;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        public static MoveCdsFileResponseBodyMoveCdsFileModel build(java.util.Map<String, ?> map) throws Exception {
            MoveCdsFileResponseBodyMoveCdsFileModel self = new MoveCdsFileResponseBodyMoveCdsFileModel();
            return TeaModel.build(map, self);
        }

        public MoveCdsFileResponseBodyMoveCdsFileModel setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public MoveCdsFileResponseBodyMoveCdsFileModel setExist(Boolean exist) {
            this.exist = exist;
            return this;
        }
        public Boolean getExist() {
            return this.exist;
        }

        public MoveCdsFileResponseBodyMoveCdsFileModel setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
