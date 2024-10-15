package org.invopayWebService.repository;

import org.invopayWebService.entity.MDiagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MDiagnosisRepository extends JpaRepository<MDiagnosis, Integer>,
    JpaSpecificationExecutor<MDiagnosis> {

}