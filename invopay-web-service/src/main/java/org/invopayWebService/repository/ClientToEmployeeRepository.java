package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientToEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientToEmployeeRepository extends JpaRepository<ClientToEmployee, Integer>,
    JpaSpecificationExecutor<ClientToEmployee> {

}