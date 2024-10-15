package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductEnquiryRepository extends JpaRepository<ProductEnquiry, Integer>,
    JpaSpecificationExecutor<ProductEnquiry> {

}