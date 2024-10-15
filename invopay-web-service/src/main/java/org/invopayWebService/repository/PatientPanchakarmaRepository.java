package org.invopayWebService.repository;

import org.invopayWebService.entity.PatientPanchakarma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientPanchakarmaRepository extends JpaRepository<PatientPanchakarma, Integer>,
    JpaSpecificationExecutor<PatientPanchakarma> {

}