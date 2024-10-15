package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadCallFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadCallFeedbackRepository extends JpaRepository<LeadCallFeedback, Integer>,
    JpaSpecificationExecutor<LeadCallFeedback> {

}