package org.invopayWebService.repository;

import org.invopayWebService.entity.CustomerLocationVia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerLocationViaRepository extends JpaRepository<CustomerLocationVia, Integer>,
    JpaSpecificationExecutor<CustomerLocationVia> {

}