package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductSampleRequestParticulars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductSampleRequestParticularsRepository extends
    JpaRepository<ProductSampleRequestParticulars, Integer>,
    JpaSpecificationExecutor<ProductSampleRequestParticulars> {

}