// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForPublicResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **OperatorLimit**: The carrier prohibits the query of the phone number.</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     * <br>
     * <p>>  For a list of error codes, see [Service error codes](https://next.api.aliyun.com/document/Dytnsapi/2020-02-17/errorCode).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public PhoneNumberStatusForPublicResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForPublicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForPublicResponseBody self = new PhoneNumberStatusForPublicResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForPublicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForPublicResponseBody setData(PhoneNumberStatusForPublicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForPublicResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForPublicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForPublicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForPublicResponseBodyData extends TeaModel {
        /**
         * <p>The basic carrier who assigns the phone number. If the queried phone number involves mobile number portability, the carrier after mobile number portability is returned.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **CMCC**: China Mobile</p>
         * <p>*   **CUCC**: China Unicom</p>
         * <p>*   **CTCC**: China Telecom</p>
         * <br>
         * <p>>  You are not allowed to query the phone numbers assigned by China Broadnet.</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The returned status for the queried phone number. Valid values:</p>
         * <br>
         * <p>*   **NORMAL**: The queried phone number can be reached.</p>
         * <p>*   **SHUTDOWN**: The queried phone number is suspended.</p>
         * <p>*   **POWER_OFF**: The phone is powered off.</p>
         * <p>*   **NOT_EXIST**: The queried phone number is a nonexistent number.</p>
         * <p>*   **SUSPECTED_POWER_OFF**: The phone is suspected to be powered off.</p>
         * <p>*   **BUSY**: The queried phone number is busy.</p>
         * <p>*   **UNKNOWN**: The queried phone number is unknown.</p>
         * <br>
         * <p>>  Due to system adjustment of the carrier, the BUSY and POWER_OFF states cannot be returned for the numbers assigned by China Telecom. [For more information, see the official announcements](https://help.aliyun.com/document_detail/2489709.html).</p>
         */
        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForPublicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForPublicResponseBodyData self = new PhoneNumberStatusForPublicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForPublicResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForPublicResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
