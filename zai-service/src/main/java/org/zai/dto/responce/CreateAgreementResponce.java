package org.zai.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CreateAgreementResponce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String agreement_uuid;
    private String status;
    private String created_at;
    private String updated_at;
    private String clientId;
    private String marchentId;
}
