package org.invopayWebService.repository;

import org.invopayWebService.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer>,
    JpaSpecificationExecutor<Manufacturer> {

}