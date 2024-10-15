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
public class DebtorDetailsDTO {
    private String debtor_name;
    private String ultimate_debtor_name;
    private String debtor_id;
    private String debtor_type;
    private String debtor_id_type;
    private String debtor_reference;

}
