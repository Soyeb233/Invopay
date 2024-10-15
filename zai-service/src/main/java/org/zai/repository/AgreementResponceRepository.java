package org.zai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.zai.dto.responce.CreateAgreementResponce;

import java.util.List;

@Repository
public interface AgreementResponceRepository extends JpaRepository<CreateAgreementResponce , Integer> {
    @Query("select a from CreateAgreementResponce a where a.marchentId=?1 and a.clientId=?2")
    CreateAgreementResponce findByClientIdAndMarchentId(String valueOf, String substring);
}
