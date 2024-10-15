package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadCallNotConnected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadCallNotConnectedRepository extends
    JpaRepository<LeadCallNotConnected, Integer>, JpaSpecificationExecutor<LeadCallNotConnected> {

}