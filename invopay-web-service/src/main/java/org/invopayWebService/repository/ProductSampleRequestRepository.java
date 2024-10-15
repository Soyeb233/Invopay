package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductSampleRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductSampleRequestRepository extends
    JpaRepository<ProductSampleRequest, Integer>, JpaSpecificationExecutor<ProductSampleRequest> {

}