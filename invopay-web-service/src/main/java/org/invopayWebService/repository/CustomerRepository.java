package org.invopayWebService.repository;

import org.invopayWebService.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer, Integer>,
    JpaSpecificationExecutor<Customer> {

}