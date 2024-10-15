package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientOutstanding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientOutstandingRepository extends JpaRepository<ClientOutstanding, Integer>,
    JpaSpecificationExecutor<ClientOutstanding> {

}