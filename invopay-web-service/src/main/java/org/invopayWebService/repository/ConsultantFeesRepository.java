package org.invopayWebService.repository;

import org.invopayWebService.entity.ConsultantFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConsultantFeesRepository extends JpaRepository<ConsultantFees, Integer>,
    JpaSpecificationExecutor<ConsultantFees> {

}