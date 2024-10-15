package org.invopayWebService.repository;

import org.invopayWebService.entity.Product1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Product1Repository extends JpaRepository<Product1, Integer>,
    JpaSpecificationExecutor<Product1> {

}