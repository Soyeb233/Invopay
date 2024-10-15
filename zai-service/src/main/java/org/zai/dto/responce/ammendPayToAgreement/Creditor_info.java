
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class Creditor_info {

    private String ultimate_creditor_name;
    private String creditor_reference;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUltimate_creditor_name() {
        return ultimate_creditor_name;
    }

    public void setUltimate_creditor_name(String ultimate_creditor_name) {
        this.ultimate_creditor_name = ultimate_creditor_name;
    }

    public String getCreditor_reference() {
        return creditor_reference;
    }

    public void setCreditor_reference(String creditor_reference) {
        this.creditor_reference = creditor_reference;
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
        sb.append(Creditor_info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ultimate_creditor_name");
        sb.append('=');
        sb.append(((this.ultimate_creditor_name == null)?"<null>":this.ultimate_creditor_name));
        sb.append(',');
        sb.append("creditor_reference");
        sb.append('=');
        sb.append(((this.creditor_reference == null)?"<null>":this.creditor_reference));
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
        result = ((result* 31)+((this.creditor_reference == null)? 0 :this.creditor_reference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ultimate_creditor_name == null)? 0 :this.ultimate_creditor_name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Creditor_info) == false) {
            return false;
        }
        Creditor_info rhs = ((Creditor_info) other);
        return ((((this.creditor_reference == rhs.creditor_reference)||((this.creditor_reference!= null)&&this.creditor_reference.equals(rhs.creditor_reference)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ultimate_creditor_name == rhs.ultimate_creditor_name)||((this.ultimate_creditor_name!= null)&&this.ultimate_creditor_name.equals(rhs.ultimate_creditor_name))));
    }

}
