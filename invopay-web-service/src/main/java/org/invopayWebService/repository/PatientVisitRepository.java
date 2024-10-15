package org.invopayWebService.repository;

import org.invopayWebService.entity.PatientVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientVisitRepository extends JpaRepository<PatientVisit, Integer>,
    JpaSpecificationExecutor<PatientVisit> {

}