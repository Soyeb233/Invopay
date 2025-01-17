package org.invopayWebService.repository;

import org.invopayWebService.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientRepository extends JpaRepository<Patient, Integer>,
    JpaSpecificationExecutor<Patient> {

}