
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class Retry_info {

    private String instruction_id;
    private String status;
    private String status_description;
    private String status_reason_code;
    private String status_reason_description;
    private String created_at;
    private String updated_at;
    private Payment_info__1 payment_info;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getInstruction_id() {
        return instruction_id;
    }

    public void setInstruction_id(String instruction_id) {
        this.instruction_id = instruction_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }

    public String getStatus_reason_code() {
        return status_reason_code;
    }

    public void setStatus_reason_code(String status_reason_code) {
        this.status_reason_code = status_reason_code;
    }

    public String getStatus_reason_description() {
        return status_reason_description;
    }

    public void setStatus_reason_description(String status_reason_description) {
        this.status_reason_description = status_reason_description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Payment_info__1 getPayment_info() {
        return payment_info;
    }

    public void setPayment_info(Payment_info__1 payment_info) {
        this.payment_info = payment_info;
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
        sb.append("instruction_id");
        sb.append('=');
        sb.append(((this.instruction_id == null)?"<null>":this.instruction_id));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("status_description");
        sb.append('=');
        sb.append(((this.status_description == null)?"<null>":this.status_description));
        sb.append(',');
        sb.append("status_reason_code");
        sb.append('=');
        sb.append(((this.status_reason_code == null)?"<null>":this.status_reason_code));
        sb.append(',');
        sb.append("status_reason_description");
        sb.append('=');
        sb.append(((this.status_reason_description == null)?"<null>":this.status_reason_description));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null)?"<null>":this.created_at));
        sb.append(',');
        sb.append("updated_at");
        sb.append('=');
        sb.append(((this.updated_at == null)?"<null>":this.updated_at));
        sb.append(',');
        sb.append("payment_info");
        sb.append('=');
        sb.append(((this.payment_info == null)?"<null>":this.payment_info));
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
        result = ((result* 31)+((this.status_description == null)? 0 :this.status_description.hashCode()));
        result = ((result* 31)+((this.status_reason_description == null)? 0 :this.status_reason_description.hashCode()));
        result = ((result* 31)+((this.updated_at == null)? 0 :this.updated_at.hashCode()));
        result = ((result* 31)+((this.created_at == null)? 0 :this.created_at.hashCode()));
        result = ((result* 31)+((this.status_reason_code == null)? 0 :this.status_reason_code.hashCode()));
        result = ((result* 31)+((this.payment_info == null)? 0 :this.payment_info.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instruction_id == null)? 0 :this.instruction_id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
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
        return ((((((((((this.status_description == rhs.status_description)||((this.status_description!= null)&&this.status_description.equals(rhs.status_description)))&&((this.status_reason_description == rhs.status_reason_description)||((this.status_reason_description!= null)&&this.status_reason_description.equals(rhs.status_reason_description))))&&((this.updated_at == rhs.updated_at)||((this.updated_at!= null)&&this.updated_at.equals(rhs.updated_at))))&&((this.created_at == rhs.created_at)||((this.created_at!= null)&&this.created_at.equals(rhs.created_at))))&&((this.status_reason_code == rhs.status_reason_code)||((this.status_reason_code!= null)&&this.status_reason_code.equals(rhs.status_reason_code))))&&((this.payment_info == rhs.payment_info)||((this.payment_info!= null)&&this.payment_info.equals(rhs.payment_info))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instruction_id == rhs.instruction_id)||((this.instruction_id!= null)&&this.instruction_id.equals(rhs.instruction_id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
