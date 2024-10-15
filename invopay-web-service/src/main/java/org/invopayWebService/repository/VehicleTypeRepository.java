package org.invopayWebService.repository;

import org.invopayWebService.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer>,
    JpaSpecificationExecutor<VehicleType> {

}