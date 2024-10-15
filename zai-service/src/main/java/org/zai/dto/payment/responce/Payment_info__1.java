
package org.zai.dto.payment.responce;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Payment_info__1 {

    private String instruction_id;
    private String instructed_amount;
    private Boolean last_payment;
    private String end_to_end_id;
    private String remittance_info;
    private String unique_superannuation_id;
    private String unique_superannuation_code;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getInstruction_id() {
        return instruction_id;
    }

    public void setInstruction_id(String instruction_id) {
        this.instruction_id = instruction_id;
    }

    public String getInstructed_amount() {
        return instructed_amount;
    }

    public void setInstructed_amount(String instructed_amount) {
        this.instructed_amount = instructed_amount;
    }

    public Boolean getLast_payment() {
        return last_payment;
    }

    public void setLast_payment(Boolean last_payment) {
        this.last_payment = last_payment;
    }

    public String getEnd_to_end_id() {
        return end_to_end_id;
    }

    public void setEnd_to_end_id(String end_to_end_id) {
        this.end_to_end_id = end_to_end_id;
    }

    public String getRemittance_info() {
        return remittance_info;
    }

    public void setRemittance_info(String remittance_info) {
        this.remittance_info = remittance_info;
    }

    public String getUnique_superannuation_id() {
        return unique_superannuation_id;
    }

    public void setUnique_superannuation_id(String unique_superannuation_id) {
        this.unique_superannuation_id = unique_superannuation_id;
    }

    public String getUnique_superannuation_code() {
        return unique_superannuation_code;
    }

    public void setUnique_superannuation_code(String unique_superannuation_code) {
        this.unique_superannuation_code = unique_superannuation_code;
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
        sb.append(Payment_info__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instruction_id");
        sb.append('=');
        sb.append(((this.instruction_id == null)?"<null>":this.instruction_id));
        sb.append(',');
        sb.append("instructed_amount");
        sb.append('=');
        sb.append(((this.instructed_amount == null)?"<null>":this.instructed_amount));
        sb.append(',');
        sb.append("last_payment");
        sb.append('=');
        sb.append(((this.last_payment == null)?"<null>":this.last_payment));
        sb.append(',');
        sb.append("end_to_end_id");
        sb.append('=');
        sb.append(((this.end_to_end_id == null)?"<null>":this.end_to_end_id));
        sb.append(',');
        sb.append("remittance_info");
        sb.append('=');
        sb.append(((this.remittance_info == null)?"<null>":this.remittance_info));
        sb.append(',');
        sb.append("unique_superannuation_id");
        sb.append('=');
        sb.append(((this.unique_superannuation_id == null)?"<null>":this.unique_superannuation_id));
        sb.append(',');
        sb.append("unique_superannuation_code");
        sb.append('=');
        sb.append(((this.unique_superannuation_code == null)?"<null>":this.unique_superannuation_code));
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
        result = ((result* 31)+((this.instructed_amount == null)? 0 :this.instructed_amount.hashCode()));
        result = ((result* 31)+((this.unique_superannuation_id == null)? 0 :this.unique_superannuation_id.hashCode()));
        result = ((result* 31)+((this.end_to_end_id == null)? 0 :this.end_to_end_id.hashCode()));
        result = ((result* 31)+((this.unique_superannuation_code == null)? 0 :this.unique_superannuation_code.hashCode()));
        result = ((result* 31)+((this.last_payment == null)? 0 :this.last_payment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instruction_id == null)? 0 :this.instruction_id.hashCode()));
        result = ((result* 31)+((this.remittance_info == null)? 0 :this.remittance_info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment_info__1) == false) {
            return false;
        }
        Payment_info__1 rhs = ((Payment_info__1) other);
        return (((((((((this.instructed_amount == rhs.instructed_amount)||((this.instructed_amount!= null)&&this.instructed_amount.equals(rhs.instructed_amount)))&&((this.unique_superannuation_id == rhs.unique_superannuation_id)||((this.unique_superannuation_id!= null)&&this.unique_superannuation_id.equals(rhs.unique_superannuation_id))))&&((this.end_to_end_id == rhs.end_to_end_id)||((this.end_to_end_id!= null)&&this.end_to_end_id.equals(rhs.end_to_end_id))))&&((this.unique_superannuation_code == rhs.unique_superannuation_code)||((this.unique_superannuation_code!= null)&&this.unique_superannuation_code.equals(rhs.unique_superannuation_code))))&&((this.last_payment == rhs.last_payment)||((this.last_payment!= null)&&this.last_payment.equals(rhs.last_payment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instruction_id == rhs.instruction_id)||((this.instruction_id!= null)&&this.instruction_id.equals(rhs.instruction_id))))&&((this.remittance_info == rhs.remittance_info)||((this.remittance_info!= null)&&this.remittance_info.equals(rhs.remittance_info))));
    }

}
