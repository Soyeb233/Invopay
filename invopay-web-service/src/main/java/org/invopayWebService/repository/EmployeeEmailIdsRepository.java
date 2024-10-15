package org.invopayWebService.repository;

import org.invopayWebService.entity.EmployeeEmailIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeEmailIdsRepository extends JpaRepository<EmployeeEmailIds, Integer>,
    JpaSpecificationExecutor<EmployeeEmailIds> {

}