package org.invopayWebService.repository;

import org.invopayWebService.entity.ClientCallFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientCallFeedbackRepository extends JpaRepository<ClientCallFeedback, Integer>,
    JpaSpecificationExecutor<ClientCallFeedback> {

}