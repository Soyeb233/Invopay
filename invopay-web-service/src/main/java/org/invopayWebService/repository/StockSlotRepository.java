package org.invopayWebService.repository;

import org.invopayWebService.entity.StockSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StockSlotRepository extends JpaRepository<StockSlot, Integer>,
    JpaSpecificationExecutor<StockSlot> {

}