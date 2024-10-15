package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientEmailIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientEmailIdsRepository extends JpaRepository<ClientEmailIds, Integer>,
    JpaSpecificationExecutor<ClientEmailIds> {

}