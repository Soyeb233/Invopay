package org.invopayWebService.repository;

import org.invopayWebService.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShippingRepository extends JpaRepository<Shipping, Integer>,
    JpaSpecificationExecutor<Shipping> {

}