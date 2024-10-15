package org.invopayWebService.repository;

import org.invopayWebService.entity.CustomerLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerLocationRepository extends JpaRepository<CustomerLocation, Integer>,
    JpaSpecificationExecutor<CustomerLocation> {

}