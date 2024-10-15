package org.invopayWebService.repository;

import org.invopayWebService.entity.PatientReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientReferenceRepository extends JpaRepository<PatientReference, Integer>,
    JpaSpecificationExecutor<PatientReference> {

}