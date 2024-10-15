
package org.zai.dto.payment.payToPayment;

import java.util.HashMap;
import java.util.Map;


public class Retry_info {

    private String payment_request_uuid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPayment_request_uuid() {
        return payment_request_uuid;
    }

    public void setPayment_request_uuid(String payment_request_uuid) {
        this.payment_request_uuid = payment_request_uuid;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Retry_info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("payment_request_uuid");
        sb.append('=');
        sb.append(((this.payment_request_uuid == null)?"<null>":this.payment_request_uuid));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.payment_request_uuid == null)? 0 :this.payment_request_uuid.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Retry_info) == false) {
            return false;
        }
        Retry_info rhs = ((Retry_info) other);
        return (((this.payment_request_uuid == rhs.payment_request_uuid)||((this.payment_request_uuid!= null)&&this.payment_request_uuid.equals(rhs.payment_request_uuid)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
