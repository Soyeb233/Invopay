package org.zai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zai.dto.responce.CreateAgreementResponce;

@Repository
public interface CreateAgreementResponceRepository extends JpaRepository<CreateAgreementResponce, Integer> {

}
