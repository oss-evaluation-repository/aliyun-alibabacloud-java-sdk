// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMediaPlayDataRequest extends TeaModel {
    /**
     * <p>The ID of the media file (VideoId). You can specify this parameter to query all playback data of a media file. You can specify only one media ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the page that appears, view the media ID.</li>
     * <li>Obtain the value of the VideoId parameter in the response to the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that you called to upload the audio or video file.</li>
     * <li>Obtain the value of VideoId by calling the <a href="~~SearchMedia~~">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9ae2af636ca6c10412f44891fc****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The name of the metric. This parameter must be specified together with the <code>OrderType</code> parameter. You can specify this parameter to sort the returned data in ascending or descending order based on specific metrics. Valid values:</p>
     * <ul>
     * <li><strong>PlaySuccessVv</strong>: the total number of views.</li>
     * <li><strong>PlayPerVv</strong>: the average views per viewer.</li>
     * <li><strong>PlayDuration</strong>: the total playback duration.</li>
     * <li><strong>PlayDurationPerUv</strong>: the average playback duration per viewer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlaySuccessVv</p>
     */
    @NameInMap("OrderName")
    public String orderName;

    /**
     * <p>The sort type. This parameter must be specified together with the <code>OrderName</code> parameter. You can specify this parameter to sort the returned data in ascending or descending order based on specific metrics. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: The returned data is sorted in ascending order.</li>
     * <li><strong>DESC</strong>: The returned data is sorted in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The operating system of the player. You can specify this parameter to query all playback data generated on a specific operating system. Valid values:</p>
     * <ul>
     * <li><strong>Android</strong></li>
     * <li><strong>iOS</strong></li>
     * <li><strong>Windows</strong></li>
     * <li><strong>macOS</strong></li>
     * <li><strong>Linux</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The number of the page. You can specify a page number to return data from the specified page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The playback time. You can specify this parameter to query all playback data generated only on the specified date. You can query data only by day. Specify the value in the yyyyMMdd format.</p>
     * 
     * <strong>example:</strong>
     * <p>20240322</p>
     */
    @NameInMap("PlayDate")
    public String playDate;

    /**
     * <p>The region in which ApsaraVideo VOD is activated. You can specify this parameter to query all playback data generated only in a specific region. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>ap-south-1</strong>: India (Mumbai)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The type of the player SDK. You can specify this parameter to query all playback data generated by using a specific type of player SDK. Valid values:</p>
     * <ul>
     * <li><strong>Native</strong>: ApsaraVideo Player SDK for Android or ApsaraVideo Player SDK for iOS</li>
     * <li><strong>Web</strong>: ApsaraVideo Player SDK for Web</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Native</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeVodMediaPlayDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMediaPlayDataRequest self = new DescribeVodMediaPlayDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodMediaPlayDataRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DescribeVodMediaPlayDataRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribeVodMediaPlayDataRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeVodMediaPlayDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeVodMediaPlayDataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeVodMediaPlayDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodMediaPlayDataRequest setPlayDate(String playDate) {
        this.playDate = playDate;
        return this;
    }
    public String getPlayDate() {
        return this.playDate;
    }

    public DescribeVodMediaPlayDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodMediaPlayDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
