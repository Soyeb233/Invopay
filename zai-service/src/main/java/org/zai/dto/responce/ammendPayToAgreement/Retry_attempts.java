
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Retry_attempts {

    private Integer count;
    private List<Retry_info> retry_info = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Retry_info> getRetry_info() {
        return retry_info;
    }

    public void setRetry_info(List<Retry_info> retry_info) {
        this.retry_info = retry_info;
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
        sb.append(Retry_attempts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("retry_info");
        sb.append('=');
        sb.append(((this.retry_info == null)?"<null>":this.retry_info));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.retry_info == null)? 0 :this.retry_info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Retry_attempts) == false) {
            return false;
        }
        Retry_attempts rhs = ((Retry_attempts) other);
        return ((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.retry_info == rhs.retry_info)||((this.retry_info!= null)&&this.retry_info.equals(rhs.retry_info))));
    }

}
