package org.zai.dto.payment.responce;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InitiatePayToPyamentResponce {
    private String payment_request_uuid;
    private String agreement_uuid;
    private String instruction_id;
    private String status;
    private String created_at;
    private String updated_at;
    private String agreement_id;
}
