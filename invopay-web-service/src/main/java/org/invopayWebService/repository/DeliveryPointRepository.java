package org.invopayWebService.repository;

import org.invopayWebService.entity.DeliveryPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeliveryPointRepository extends JpaRepository<DeliveryPoint, Integer>,
    JpaSpecificationExecutor<DeliveryPoint> {

}