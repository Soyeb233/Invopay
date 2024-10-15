package org.invopayWebService.repository;

import org.invopayWebService.entity.AyurvedaDiagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AyurvedaDiagnosisRepository extends JpaRepository<AyurvedaDiagnosis, Integer>,
    JpaSpecificationExecutor<AyurvedaDiagnosis> {

}