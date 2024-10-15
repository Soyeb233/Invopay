package org.invopayWebService.repository;

import org.invopayWebService.entity.PatientOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientOldRepository extends JpaRepository<PatientOld, Integer>,
    JpaSpecificationExecutor<PatientOld> {

}