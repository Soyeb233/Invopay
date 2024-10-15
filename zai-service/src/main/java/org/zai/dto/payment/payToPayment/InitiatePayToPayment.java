
package org.zai.dto.payment.payToPayment;

import java.util.HashMap;
import java.util.Map;


public class InitiatePayToPayment {

    private String priority;
    private Payment_info payment_info;
    private Retry_info retry_info;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Payment_info getPayment_info() {
        return payment_info;
    }

    public void setPayment_info(Payment_info payment_info) {
        this.payment_info = payment_info;
    }

    public Retry_info getRetry_info() {
        return retry_info;
    }

    public void setRetry_info(Retry_info retry_info) {
        this.retry_info = retry_info;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(InitiatePayToPayment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("priority");
//        sb.append('=');
//        sb.append(((this.priority == null)?"<null>":this.priority));
//        sb.append(',');
//        sb.append("payment_info");
//        sb.append('=');
//        sb.append(((this.payment_info == null)?"<null>":this.payment_info));
//        sb.append(',');
//        sb.append("retry_info");
//        sb.append('=');
//        sb.append(((this.retry_info == null)?"<null>":this.retry_info));
//        sb.append(',');
//        sb.append("additionalProperties");
//        sb.append('=');
//        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
//        sb.append(',');
//        if (sb.charAt((sb.length()- 1)) == ',') {
//            sb.setCharAt((sb.length()- 1), ']');
//        } else {
//            sb.append(']');
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 1;
//        result = ((result* 31)+((this.payment_info == null)? 0 :this.payment_info.hashCode()));
//        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
//        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
//        result = ((result* 31)+((this.retry_info == null)? 0 :this.retry_info.hashCode()));
//        return result;
//    }

//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof InitiatePayToPayment) == false) {
//            return false;
//        }
//        InitiatePayToPayment rhs = ((InitiatePayToPayment) other);
//        return (((((this.payment_info == rhs.payment_info)||((this.payment_info!= null)&&this.payment_info.equals(rhs.payment_info)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.retry_info == rhs.retry_info)||((this.retry_info!= null)&&this.retry_info.equals(rhs.retry_info))));
//    }

}
