package org.invopayWebService.repository;

import org.invopayWebService.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer>,
    JpaSpecificationExecutor<CustomerOrder> {

}