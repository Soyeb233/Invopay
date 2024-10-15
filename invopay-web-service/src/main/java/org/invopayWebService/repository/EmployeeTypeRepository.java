package org.invopayWebService.repository;

import org.invopayWebService.entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer>,
    JpaSpecificationExecutor<EmployeeType> {

}