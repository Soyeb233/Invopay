package org.invopayWebService.repository;

import org.invopayWebService.entity.EmployeeOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeOldRepository extends JpaRepository<EmployeeOld, Integer>,
    JpaSpecificationExecutor<EmployeeOld> {

}