
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class AmendPayToAgreementDetails {

    private String priority;
    private Unilateral_amendments unilateral_amendments;
    private Bilateral_amendments bilateral_amendments;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Unilateral_amendments getUnilateral_amendments() {
        return unilateral_amendments;
    }

    public void setUnilateral_amendments(Unilateral_amendments unilateral_amendments) {
        this.unilateral_amendments = unilateral_amendments;
    }

    public Bilateral_amendments getBilateral_amendments() {
        return bilateral_amendments;
    }

    public void setBilateral_amendments(Bilateral_amendments bilateral_amendments) {
        this.bilateral_amendments = bilateral_amendments;
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
        sb.append(AmendPayToAgreementDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("unilateral_amendments");
        sb.append('=');
        sb.append(((this.unilateral_amendments == null)?"<null>":this.unilateral_amendments));
        sb.append(',');
        sb.append("bilateral_amendments");
        sb.append('=');
        sb.append(((this.bilateral_amendments == null)?"<null>":this.bilateral_amendments));
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
        result = ((result* 31)+((this.unilateral_amendments == null)? 0 :this.unilateral_amendments.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.bilateral_amendments == null)? 0 :this.bilateral_amendments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmendPayToAgreementDetails) == false) {
            return false;
        }
        AmendPayToAgreementDetails rhs = ((AmendPayToAgreementDetails) other);
        return (((((this.unilateral_amendments == rhs.unilateral_amendments)||((this.unilateral_amendments!= null)&&this.unilateral_amendments.equals(rhs.unilateral_amendments)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.bilateral_amendments == rhs.bilateral_amendments)||((this.bilateral_amendments!= null)&&this.bilateral_amendments.equals(rhs.bilateral_amendments))));
    }

}
