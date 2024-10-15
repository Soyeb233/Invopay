package org.invopayWebService.repository;

import org.invopayWebService.entity.CustomerOrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerOrderProductRepository extends
    JpaRepository<CustomerOrderProduct, Integer>, JpaSpecificationExecutor<CustomerOrderProduct> {

}