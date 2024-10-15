
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class Unilateral_amendments {

    private String description;
    private String short_description;
    private Creditor_info creditor_info;
    private Payment_initiator_info payment_initiator_info;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public Creditor_info getCreditor_info() {
        return creditor_info;
    }

    public void setCreditor_info(Creditor_info creditor_info) {
        this.creditor_info = creditor_info;
    }

    public Payment_initiator_info getPayment_initiator_info() {
        return payment_initiator_info;
    }

    public void setPayment_initiator_info(Payment_initiator_info payment_initiator_info) {
        this.payment_initiator_info = payment_initiator_info;
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
        sb.append(Unilateral_amendments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("short_description");
        sb.append('=');
        sb.append(((this.short_description == null)?"<null>":this.short_description));
        sb.append(',');
        sb.append("creditor_info");
        sb.append('=');
        sb.append(((this.creditor_info == null)?"<null>":this.creditor_info));
        sb.append(',');
        sb.append("payment_initiator_info");
        sb.append('=');
        sb.append(((this.payment_initiator_info == null)?"<null>":this.payment_initiator_info));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.short_description == null)? 0 :this.short_description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.creditor_info == null)? 0 :this.creditor_info.hashCode()));
        result = ((result* 31)+((this.payment_initiator_info == null)? 0 :this.payment_initiator_info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Unilateral_amendments) == false) {
            return false;
        }
        Unilateral_amendments rhs = ((Unilateral_amendments) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.short_description == rhs.short_description)||((this.short_description!= null)&&this.short_description.equals(rhs.short_description))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.creditor_info == rhs.creditor_info)||((this.creditor_info!= null)&&this.creditor_info.equals(rhs.creditor_info))))&&((this.payment_initiator_info == rhs.payment_initiator_info)||((this.payment_initiator_info!= null)&&this.payment_initiator_info.equals(rhs.payment_initiator_info))));
    }

}
