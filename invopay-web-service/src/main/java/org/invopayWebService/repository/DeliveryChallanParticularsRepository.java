package org.invopayWebService.repository;

import org.invopayWebService.entity.DeliveryChallanParticulars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeliveryChallanParticularsRepository extends
    JpaRepository<DeliveryChallanParticulars, Integer>,
    JpaSpecificationExecutor<DeliveryChallanParticulars> {

}