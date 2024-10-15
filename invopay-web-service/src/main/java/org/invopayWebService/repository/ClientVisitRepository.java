package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientVisitRepository extends JpaRepository<ClientVisit, Integer>,
    JpaSpecificationExecutor<ClientVisit> {

}