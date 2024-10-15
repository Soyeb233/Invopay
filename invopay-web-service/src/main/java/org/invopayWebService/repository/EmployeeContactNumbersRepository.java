package org.invopayWebService.repository;

import org.invopayWebService.entity.EmployeeContactNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeContactNumbersRepository extends
    JpaRepository<EmployeeContactNumbers, Integer>,
    JpaSpecificationExecutor<EmployeeContactNumbers> {

}