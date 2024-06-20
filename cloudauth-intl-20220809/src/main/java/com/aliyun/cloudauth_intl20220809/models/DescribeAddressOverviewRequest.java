// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeAddressOverviewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0xabds***djskjds</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>ETH</p>
     */
    @NameInMap("Coin")
    public String coin;

    /**
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    public static DescribeAddressOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressOverviewRequest self = new DescribeAddressOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddressOverviewRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeAddressOverviewRequest setCoin(String coin) {
        this.coin = coin;
        return this;
    }
    public String getCoin() {
        return this.coin;
    }

    public DescribeAddressOverviewRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

}
