package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadContactNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadContactNumberRepository extends JpaRepository<LeadContactNumber, Integer>,
    JpaSpecificationExecutor<LeadContactNumber> {

}