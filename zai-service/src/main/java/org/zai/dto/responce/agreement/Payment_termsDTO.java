package org.zai.dto.responce.agreement;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment_termsDTO {
    private PaymentInfoDTO payment_amount_info;
    private PaymentInfoDTO first_payment_info;
    private PaymentInfoDTO last_payment_info;
    private PaymentInfoDTO maximum_amount_info;
    private String payment_executed_not_before_time;
    private String point_in_time;
    private String count_per_period;
    private String frequency;
}
