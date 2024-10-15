package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientCallNotConnected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientCallNotConnectedRepository extends
    JpaRepository<ClientCallNotConnected, Integer>,
    JpaSpecificationExecutor<ClientCallNotConnected> {

}