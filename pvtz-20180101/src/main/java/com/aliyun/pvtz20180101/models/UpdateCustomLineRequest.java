// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateCustomLineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ipv4s")
    public java.util.List<String> ipv4s;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100003</p>
     */
    @NameInMap("LineId")
    public String lineId;

    @NameInMap("Name")
    public String name;

    public static UpdateCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLineRequest self = new UpdateCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLineRequest setIpv4s(java.util.List<String> ipv4s) {
        this.ipv4s = ipv4s;
        return this;
    }
    public java.util.List<String> getIpv4s() {
        return this.ipv4s;
    }

    public UpdateCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCustomLineRequest setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public UpdateCustomLineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
