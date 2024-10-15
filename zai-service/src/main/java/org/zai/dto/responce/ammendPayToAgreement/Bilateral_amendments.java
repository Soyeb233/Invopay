
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class Bilateral_amendments {

    private Boolean automatic_renewal;
    private String validity_end_date;
    private String transfer_arrangement;
    private Payment_terms payment_terms;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getAutomatic_renewal() {
        return automatic_renewal;
    }

    public void setAutomatic_renewal(Boolean automatic_renewal) {
        this.automatic_renewal = automatic_renewal;
    }

    public String getValidity_end_date() {
        return validity_end_date;
    }

    public void setValidity_end_date(String validity_end_date) {
        this.validity_end_date = validity_end_date;
    }

    public String getTransfer_arrangement() {
        return transfer_arrangement;
    }

    public void setTransfer_arrangement(String transfer_arrangement) {
        this.transfer_arrangement = transfer_arrangement;
    }

    public Payment_terms getPayment_terms() {
        return payment_terms;
    }

    public void setPayment_terms(Payment_terms payment_terms) {
        this.payment_terms = payment_terms;
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
        sb.append(Bilateral_amendments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("automatic_renewal");
        sb.append('=');
        sb.append(((this.automatic_renewal == null)?"<null>":this.automatic_renewal));
        sb.append(',');
        sb.append("validity_end_date");
        sb.append('=');
        sb.append(((this.validity_end_date == null)?"<null>":this.validity_end_date));
        sb.append(',');
        sb.append("transfer_arrangement");
        sb.append('=');
        sb.append(((this.transfer_arrangement == null)?"<null>":this.transfer_arrangement));
        sb.append(',');
        sb.append("payment_terms");
        sb.append('=');
        sb.append(((this.payment_terms == null)?"<null>":this.payment_terms));
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
        result = ((result* 31)+((this.automatic_renewal == null)? 0 :this.automatic_renewal.hashCode()));
        result = ((result* 31)+((this.transfer_arrangement == null)? 0 :this.transfer_arrangement.hashCode()));
        result = ((result* 31)+((this.validity_end_date == null)? 0 :this.validity_end_date.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.payment_terms == null)? 0 :this.payment_terms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bilateral_amendments) == false) {
            return false;
        }
        Bilateral_amendments rhs = ((Bilateral_amendments) other);
        return ((((((this.automatic_renewal == rhs.automatic_renewal)||((this.automatic_renewal!= null)&&this.automatic_renewal.equals(rhs.automatic_renewal)))&&((this.transfer_arrangement == rhs.transfer_arrangement)||((this.transfer_arrangement!= null)&&this.transfer_arrangement.equals(rhs.transfer_arrangement))))&&((this.validity_end_date == rhs.validity_end_date)||((this.validity_end_date!= null)&&this.validity_end_date.equals(rhs.validity_end_date))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.payment_terms == rhs.payment_terms)||((this.payment_terms!= null)&&this.payment_terms.equals(rhs.payment_terms))));
    }

}
