// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthorizeRequest extends TeaModel {
    /**
     * <p>The application ID returned when the application was created.</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>Specifies whether to hide the consent page.</p>
     */
    @NameInMap("hide_consent")
    public Boolean hideConsent;

    /**
     * <p>The authentication method. Valid values:</p>
     * <br>
     * <p>*   default: all logon methods that are integrated on the default logon page provided by Drive and Photo Service.</p>
     * <p>*   ding: logs on by scanning a DingTalk QR code.</p>
     * <p>*   ding_sns: logs on by entering a DingTalk account and its password.</p>
     * <p>*   ram: logs on as an Alibaba Cloud Resource Access Management (RAM) user.</p>
     * <p>*   wechat: logs on by scanning a WeCom QR code.</p>
     * <p>*   wechat_app: logs on without authentication in WeCom.</p>
     */
    @NameInMap("login_type")
    public String loginType;

    /**
     * <p>The callback URL specified when the application was created.</p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The format in which to return the response. Set the value to code.</p>
     */
    @NameInMap("response_type")
    public String responseType;

    /**
     * <p>The requested permissions. By default, all permissions are requested.</p>
     */
    @NameInMap("scope")
    public java.util.List<String> scope;

    /**
     * <p>The user-defined parameter to return in the callback URL after the requested permissions are granted.</p>
     */
    @NameInMap("state")
    public String state;

    public static AuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRequest self = new AuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AuthorizeRequest setHideConsent(Boolean hideConsent) {
        this.hideConsent = hideConsent;
        return this;
    }
    public Boolean getHideConsent() {
        return this.hideConsent;
    }

    public AuthorizeRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public AuthorizeRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public AuthorizeRequest setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }
    public String getResponseType() {
        return this.responseType;
    }

    public AuthorizeRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public AuthorizeRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
