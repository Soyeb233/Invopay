package org.invopayWebService.repository;

import org.invopayWebService.entity.DummyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DummyProductRepository extends JpaRepository<DummyProduct, Integer>,
    JpaSpecificationExecutor<DummyProduct> {

}