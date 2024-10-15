package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductBatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductBatchRepository extends JpaRepository<ProductBatch, Integer>,
    JpaSpecificationExecutor<ProductBatch> {

}