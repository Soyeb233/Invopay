package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductRequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRequestStatusRepository extends
    JpaRepository<ProductRequestStatus, Integer>, JpaSpecificationExecutor<ProductRequestStatus> {

}