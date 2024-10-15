
package org.zai.dto.responce.ammendPayToAgreement;

import java.util.HashMap;
import java.util.Map;


public class Payment_terms {

    private Payment_amount_info payment_amount_info;
    private First_payment_info first_payment_info;
    private Last_payment_info last_payment_info;
    private Maximum_amount_info maximum_amount_info;
    private String payment_executed_not_before_time;
    private String point_in_time;
    private String count_per_period;
    private String frequency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Payment_amount_info getPayment_amount_info() {
        return payment_amount_info;
    }

    public void setPayment_amount_info(Payment_amount_info payment_amount_info) {
        this.payment_amount_info = payment_amount_info;
    }

    public First_payment_info getFirst_payment_info() {
        return first_payment_info;
    }

    public void setFirst_payment_info(First_payment_info first_payment_info) {
        this.first_payment_info = first_payment_info;
    }

    public Last_payment_info getLast_payment_info() {
        return last_payment_info;
    }

    public void setLast_payment_info(Last_payment_info last_payment_info) {
        this.last_payment_info = last_payment_info;
    }

    public Maximum_amount_info getMaximum_amount_info() {
        return maximum_amount_info;
    }

    public void setMaximum_amount_info(Maximum_amount_info maximum_amount_info) {
        this.maximum_amount_info = maximum_amount_info;
    }

    public String getPayment_executed_not_before_time() {
        return payment_executed_not_before_time;
    }

    public void setPayment_executed_not_before_time(String payment_executed_not_before_time) {
        this.payment_executed_not_before_time = payment_executed_not_before_time;
    }

    public String getPoint_in_time() {
        return point_in_time;
    }

    public void setPoint_in_time(String point_in_time) {
        this.point_in_time = point_in_time;
    }

    public String getCount_per_period() {
        return count_per_period;
    }

    public void setCount_per_period(String count_per_period) {
        this.count_per_period = count_per_period;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
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
        sb.append(Payment_terms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("payment_amount_info");
        sb.append('=');
        sb.append(((this.payment_amount_info == null)?"<null>":this.payment_amount_info));
        sb.append(',');
        sb.append("first_payment_info");
        sb.append('=');
        sb.append(((this.first_payment_info == null)?"<null>":this.first_payment_info));
        sb.append(',');
        sb.append("last_payment_info");
        sb.append('=');
        sb.append(((this.last_payment_info == null)?"<null>":this.last_payment_info));
        sb.append(',');
        sb.append("maximum_amount_info");
        sb.append('=');
        sb.append(((this.maximum_amount_info == null)?"<null>":this.maximum_amount_info));
        sb.append(',');
        sb.append("payment_executed_not_before_time");
        sb.append('=');
        sb.append(((this.payment_executed_not_before_time == null)?"<null>":this.payment_executed_not_before_time));
        sb.append(',');
        sb.append("point_in_time");
        sb.append('=');
        sb.append(((this.point_in_time == null)?"<null>":this.point_in_time));
        sb.append(',');
        sb.append("count_per_period");
        sb.append('=');
        sb.append(((this.count_per_period == null)?"<null>":this.count_per_period));
        sb.append(',');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
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
        result = ((result* 31)+((this.payment_amount_info == null)? 0 :this.payment_amount_info.hashCode()));
        result = ((result* 31)+((this.payment_executed_not_before_time == null)? 0 :this.payment_executed_not_before_time.hashCode()));
        result = ((result* 31)+((this.maximum_amount_info == null)? 0 :this.maximum_amount_info.hashCode()));
        result = ((result* 31)+((this.point_in_time == null)? 0 :this.point_in_time.hashCode()));
        result = ((result* 31)+((this.first_payment_info == null)? 0 :this.first_payment_info.hashCode()));
        result = ((result* 31)+((this.last_payment_info == null)? 0 :this.last_payment_info.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.count_per_period == null)? 0 :this.count_per_period.hashCode()));
        result = ((result* 31)+((this.frequency == null)? 0 :this.frequency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment_terms) == false) {
            return false;
        }
        Payment_terms rhs = ((Payment_terms) other);
        return ((((((((((this.payment_amount_info == rhs.payment_amount_info)||((this.payment_amount_info!= null)&&this.payment_amount_info.equals(rhs.payment_amount_info)))&&((this.payment_executed_not_before_time == rhs.payment_executed_not_before_time)||((this.payment_executed_not_before_time!= null)&&this.payment_executed_not_before_time.equals(rhs.payment_executed_not_before_time))))&&((this.maximum_amount_info == rhs.maximum_amount_info)||((this.maximum_amount_info!= null)&&this.maximum_amount_info.equals(rhs.maximum_amount_info))))&&((this.point_in_time == rhs.point_in_time)||((this.point_in_time!= null)&&this.point_in_time.equals(rhs.point_in_time))))&&((this.first_payment_info == rhs.first_payment_info)||((this.first_payment_info!= null)&&this.first_payment_info.equals(rhs.first_payment_info))))&&((this.last_payment_info == rhs.last_payment_info)||((this.last_payment_info!= null)&&this.last_payment_info.equals(rhs.last_payment_info))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.count_per_period == rhs.count_per_period)||((this.count_per_period!= null)&&this.count_per_period.equals(rhs.count_per_period))))&&((this.frequency == rhs.frequency)||((this.frequency!= null)&&this.frequency.equals(rhs.frequency))));
    }

}
