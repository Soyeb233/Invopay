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
public class PyamentInitiatorInfoDTO {
    private String initiator_id;
    private String initiator_id_type_code;
    private String initiator_legal_name;
    private String initiator_name;
}
