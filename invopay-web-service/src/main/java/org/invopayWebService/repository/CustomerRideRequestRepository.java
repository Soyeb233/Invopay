package org.invopayWebService.repository;

import org.invopayWebService.entity.CustomerRideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRideRequestRepository extends JpaRepository<CustomerRideRequest, Integer>,
    JpaSpecificationExecutor<CustomerRideRequest> {

}