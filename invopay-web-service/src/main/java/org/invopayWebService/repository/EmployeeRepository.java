package org.invopayWebService.repository;

import org.invopayWebService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>,
    JpaSpecificationExecutor<Employee> {

}