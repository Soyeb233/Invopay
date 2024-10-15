package org.invopayWebService.repository;

import org.invopayWebService.entity.SupplierCommissionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SupplierCommissionDetailsRepository extends
    JpaRepository<SupplierCommissionDetails, Integer>,
    JpaSpecificationExecutor<SupplierCommissionDetails> {

}