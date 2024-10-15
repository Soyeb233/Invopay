package org.invopayWebService.repository;

import org.invopayWebService.entity.TempProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TempProductRepository extends JpaRepository<TempProduct, Integer>,
    JpaSpecificationExecutor<TempProduct> {

}