package org.zai.dto.responce.agreement;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgreementInfoDTO {
    private String description;
    private String short_description;
    private String purpose_code;
    private String agreement_type;
    private boolean automatic_renewal;
    private String validity_start_date;
    private LocalDate validity_end_date;
    private String transfer_arrangement;
    private DebtorDTO debtor_info;
    private CreditorDTO creditor_info;
    private PyamentInitiatorInfoDTO payment_initiator_info;
    private Payment_termsDTO payment_terms;
}
