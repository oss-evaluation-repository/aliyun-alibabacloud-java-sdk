// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ResetUserPasswordRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to enable the system to automatically generate a new password. Valid values:</p>
     * <br>
     * <p>*   True: The new password is automatically generated by the system.</p>
     * <p>*   False: The new password must be manually specified. This is the default value.</p>
     */
    @NameInMap("GenerateRandomPassword")
    public Boolean generateRandomPassword;

    /**
     * <p>The new password.</p>
     * <br>
     * <p>The password must contain the following types of characters: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <br>
     * <p>The password must be 8 to 32 characters in length.</p>
     * <br>
     * <p>>  If you set `GenerateRandomPassword` to `False`, you must specify `Password` .</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether password reset is required upon the next logon. Valid values:</p>
     * <br>
     * <p>*   True: Password reset is required upon the next logon.</p>
     * <p>*   False: Password reset is not required upon the next logon. This is the default value.</p>
     */
    @NameInMap("RequirePasswordResetForNextLogin")
    public Boolean requirePasswordResetForNextLogin;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ResetUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordRequest self = new ResetUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ResetUserPasswordRequest setGenerateRandomPassword(Boolean generateRandomPassword) {
        this.generateRandomPassword = generateRandomPassword;
        return this;
    }
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    public ResetUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetUserPasswordRequest setRequirePasswordResetForNextLogin(Boolean requirePasswordResetForNextLogin) {
        this.requirePasswordResetForNextLogin = requirePasswordResetForNextLogin;
        return this;
    }
    public Boolean getRequirePasswordResetForNextLogin() {
        return this.requirePasswordResetForNextLogin;
    }

    public ResetUserPasswordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
