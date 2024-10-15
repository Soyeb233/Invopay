package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadCalls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadCallsRepository extends JpaRepository<LeadCalls, Integer>,
    JpaSpecificationExecutor<LeadCalls> {

}