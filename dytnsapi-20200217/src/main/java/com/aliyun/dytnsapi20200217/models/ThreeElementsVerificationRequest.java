// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p> On the <strong>My Applications</strong> page in the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, you can obtain the authorization code (also known as authorization ID).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QASDW@#**</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The ID card number to be verified.</p>
     * <ul>
     * <li>If the value of Mask is NORMAL, specify a value in plaintext for this field.</li>
     * <li>If the value of Mask is MD5, specify a MD5-encrypted value for this field.</li>
     * <li>If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</li>
     * </ul>
     * <blockquote>
     * <p> Letters in the encrypted strings are not case-sensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>83d8040d3cb2181e04****dc6ff5566d4493876a4a5da782887446356b0a787e</p>
     */
    @NameInMap("CertCode")
    public String certCode;

    /**
     * <p>The phone number to be verified.</p>
     * <ul>
     * <li>If the value of Mask is NORMAL, specify a value in plaintext for this field.</li>
     * <li>If the value of Mask is MD5, specify a MD5-encrypted value for this field.</li>
     * <li>If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</li>
     * </ul>
     * <blockquote>
     * <p> Letters in the encrypted strings are not case-sensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: The phone number is not encrypted.</li>
     * <li><strong>MD5</strong></li>
     * <li><strong>SHA256</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The name to be verified.</p>
     * <ul>
     * <li>If the value of Mask is NORMAL, specify a value in plaintext for this field.</li>
     * <li>If the value of Mask is MD5, specify a MD5-encrypted value for this field.</li>
     * <li>If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</li>
     * </ul>
     * <blockquote>
     * <p> Letters in the encrypted strings are not case-sensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ThreeElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ThreeElementsVerificationRequest self = new ThreeElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public ThreeElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public ThreeElementsVerificationRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public ThreeElementsVerificationRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public ThreeElementsVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ThreeElementsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ThreeElementsVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ThreeElementsVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ThreeElementsVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
