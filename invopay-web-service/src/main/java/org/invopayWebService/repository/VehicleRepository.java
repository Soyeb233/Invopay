package org.invopayWebService.repository;

import org.invopayWebService.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>,
    JpaSpecificationExecutor<Vehicle> {

}