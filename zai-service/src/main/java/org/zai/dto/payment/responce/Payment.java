package org.zai.dto.payment.responce;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Payment {

    private String payment_request_uuid;
    private String instruction_id;
    private String agreement_uuid;
    private String agreement_id;
    private String status;
    private String status_description;
    private String status_reason_code;
    private String status_reason_description;
    private String created_at;
    private String updated_at;
    private Payment_info payment_info;
    private Retry_attempts retry_attempts;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPayment_request_uuid() {
        return payment_request_uuid;
    }

    public void setPayment_request_uuid(String payment_request_uuid) {
        this.payment_request_uuid = payment_request_uuid;
    }

    public String getInstruction_id() {
        return instruction_id;
    }

    public void setInstruction_id(String instruction_id) {
        this.instruction_id = instruction_id;
    }

    public String getAgreement_uuid() {
        return agreement_uuid;
    }

    public void setAgreement_uuid(String agreement_uuid) {
        this.agreement_uuid = agreement_uuid;
    }

    public String getAgreement_id() {
        return agreement_id;
    }

    public void setAgreement_id(String agreement_id) {
        this.agreement_id = agreement_id;
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

    public Payment_info getPayment_info() {
        return payment_info;
    }

    public void setPayment_info(Payment_info payment_info) {
        this.payment_info = payment_info;
    }

    public Retry_attempts getRetry_attempts() {
        return retry_attempts;
    }

    public void setRetry_attempts(Retry_attempts retry_attempts) {
        this.retry_attempts = retry_attempts;
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
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("payment_request_uuid");
        sb.append('=');
        sb.append(((this.payment_request_uuid == null)?"<null>":this.payment_request_uuid));
        sb.append(',');
        sb.append("instruction_id");
        sb.append('=');
        sb.append(((this.instruction_id == null)?"<null>":this.instruction_id));
        sb.append(',');
        sb.append("agreement_uuid");
        sb.append('=');
        sb.append(((this.agreement_uuid == null)?"<null>":this.agreement_uuid));
        sb.append(',');
        sb.append("agreement_id");
        sb.append('=');
        sb.append(((this.agreement_id == null)?"<null>":this.agreement_id));
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
        sb.append("retry_attempts");
        sb.append('=');
        sb.append(((this.retry_attempts == null)?"<null>":this.retry_attempts));
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
        result = ((result* 31)+((this.status_description == null)? 0 :this.status_description.hashCode()));
        result = ((result* 31)+((this.status_reason_description == null)? 0 :this.status_reason_description.hashCode()));
        result = ((result* 31)+((this.created_at == null)? 0 :this.created_at.hashCode()));
        result = ((result* 31)+((this.status_reason_code == null)? 0 :this.status_reason_code.hashCode()));
        result = ((result* 31)+((this.agreement_uuid == null)? 0 :this.agreement_uuid.hashCode()));
        result = ((result* 31)+((this.agreement_id == null)? 0 :this.agreement_id.hashCode()));
        result = ((result* 31)+((this.updated_at == null)? 0 :this.updated_at.hashCode()));
        result = ((result* 31)+((this.payment_info == null)? 0 :this.payment_info.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.retry_attempts == null)? 0 :this.retry_attempts.hashCode()));
        result = ((result* 31)+((this.instruction_id == null)? 0 :this.instruction_id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment) == false) {
            return false;
        }
        Payment rhs = ((Payment) other);
        return ((((((((((((((this.payment_request_uuid == rhs.payment_request_uuid)||((this.payment_request_uuid!= null)&&this.payment_request_uuid.equals(rhs.payment_request_uuid)))&&((this.status_description == rhs.status_description)||((this.status_description!= null)&&this.status_description.equals(rhs.status_description))))&&((this.status_reason_description == rhs.status_reason_description)||((this.status_reason_description!= null)&&this.status_reason_description.equals(rhs.status_reason_description))))&&((this.created_at == rhs.created_at)||((this.created_at!= null)&&this.created_at.equals(rhs.created_at))))&&((this.status_reason_code == rhs.status_reason_code)||((this.status_reason_code!= null)&&this.status_reason_code.equals(rhs.status_reason_code))))&&((this.agreement_uuid == rhs.agreement_uuid)||((this.agreement_uuid!= null)&&this.agreement_uuid.equals(rhs.agreement_uuid))))&&((this.agreement_id == rhs.agreement_id)||((this.agreement_id!= null)&&this.agreement_id.equals(rhs.agreement_id))))&&((this.updated_at == rhs.updated_at)||((this.updated_at!= null)&&this.updated_at.equals(rhs.updated_at))))&&((this.payment_info == rhs.payment_info)||((this.payment_info!= null)&&this.payment_info.equals(rhs.payment_info))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.retry_attempts == rhs.retry_attempts)||((this.retry_attempts!= null)&&this.retry_attempts.equals(rhs.retry_attempts))))&&((this.instruction_id == rhs.instruction_id)||((this.instruction_id!= null)&&this.instruction_id.equals(rhs.instruction_id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
