
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class Payment_initiator_info {

    private String initiator_id;
    private String initiator_id_type_code;
    private String initiator_legal_name;
    private String initiator_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getInitiator_id() {
        return initiator_id;
    }

    public void setInitiator_id(String initiator_id) {
        this.initiator_id = initiator_id;
    }

    public String getInitiator_id_type_code() {
        return initiator_id_type_code;
    }

    public void setInitiator_id_type_code(String initiator_id_type_code) {
        this.initiator_id_type_code = initiator_id_type_code;
    }

    public String getInitiator_legal_name() {
        return initiator_legal_name;
    }

    public void setInitiator_legal_name(String initiator_legal_name) {
        this.initiator_legal_name = initiator_legal_name;
    }

    public String getInitiator_name() {
        return initiator_name;
    }

    public void setInitiator_name(String initiator_name) {
        this.initiator_name = initiator_name;
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
        sb.append(Payment_initiator_info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("initiator_id");
        sb.append('=');
        sb.append(((this.initiator_id == null)?"<null>":this.initiator_id));
        sb.append(',');
        sb.append("initiator_id_type_code");
        sb.append('=');
        sb.append(((this.initiator_id_type_code == null)?"<null>":this.initiator_id_type_code));
        sb.append(',');
        sb.append("initiator_legal_name");
        sb.append('=');
        sb.append(((this.initiator_legal_name == null)?"<null>":this.initiator_legal_name));
        sb.append(',');
        sb.append("initiator_name");
        sb.append('=');
        sb.append(((this.initiator_name == null)?"<null>":this.initiator_name));
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
        result = ((result* 31)+((this.initiator_legal_name == null)? 0 :this.initiator_legal_name.hashCode()));
        result = ((result* 31)+((this.initiator_name == null)? 0 :this.initiator_name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.initiator_id_type_code == null)? 0 :this.initiator_id_type_code.hashCode()));
        result = ((result* 31)+((this.initiator_id == null)? 0 :this.initiator_id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment_initiator_info) == false) {
            return false;
        }
        Payment_initiator_info rhs = ((Payment_initiator_info) other);
        return ((((((this.initiator_legal_name == rhs.initiator_legal_name)||((this.initiator_legal_name!= null)&&this.initiator_legal_name.equals(rhs.initiator_legal_name)))&&((this.initiator_name == rhs.initiator_name)||((this.initiator_name!= null)&&this.initiator_name.equals(rhs.initiator_name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.initiator_id_type_code == rhs.initiator_id_type_code)||((this.initiator_id_type_code!= null)&&this.initiator_id_type_code.equals(rhs.initiator_id_type_code))))&&((this.initiator_id == rhs.initiator_id)||((this.initiator_id!= null)&&this.initiator_id.equals(rhs.initiator_id))));
    }

}
