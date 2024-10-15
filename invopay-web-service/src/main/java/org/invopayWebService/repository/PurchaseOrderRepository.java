package org.invopayWebService.repository;

import org.invopayWebService.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer>,
    JpaSpecificationExecutor<PurchaseOrder> {

}