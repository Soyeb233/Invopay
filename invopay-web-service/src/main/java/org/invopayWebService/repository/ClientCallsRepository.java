package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientCalls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientCallsRepository extends JpaRepository<ClientCalls, Integer>,
    JpaSpecificationExecutor<ClientCalls> {

}