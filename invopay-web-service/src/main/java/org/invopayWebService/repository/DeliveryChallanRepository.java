package org.invopayWebService.repository;

import org.invopayWebService.entity.DeliveryChallan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeliveryChallanRepository extends JpaRepository<DeliveryChallan, Integer>,
    JpaSpecificationExecutor<DeliveryChallan> {

}