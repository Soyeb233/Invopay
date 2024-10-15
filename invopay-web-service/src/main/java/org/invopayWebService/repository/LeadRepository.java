package org.invopayWebService.repository;

import org.invopayWebService.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadRepository extends JpaRepository<Lead, Integer>,
    JpaSpecificationExecutor<Lead> {

}