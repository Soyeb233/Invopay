package org.invopayWebService.repository;

import org.invopayWebService.entity.PurchaseOrderParticulars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PurchaseOrderParticularsRepository extends
    JpaRepository<PurchaseOrderParticulars, Integer>,
    JpaSpecificationExecutor<PurchaseOrderParticulars> {

}