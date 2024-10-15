package org.invopayWebService.repository;

import org.invopayWebService.entity.Patient1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Patient1Repository extends JpaRepository<Patient1, Integer>,
    JpaSpecificationExecutor<Patient1> {

}