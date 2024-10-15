package org.invopayWebService.repository;

import org.invopayWebService.entity.CustomerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Integer>,
    JpaSpecificationExecutor<CustomerProduct> {

}