package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadContactEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadContactEmailRepository extends JpaRepository<LeadContactEmail, Integer>,
    JpaSpecificationExecutor<LeadContactEmail> {

}