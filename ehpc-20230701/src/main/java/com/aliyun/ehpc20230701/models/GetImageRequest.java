// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class GetImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRequest self = new GetImageRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
