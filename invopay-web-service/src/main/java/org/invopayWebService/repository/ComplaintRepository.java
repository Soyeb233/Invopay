package org.invopayWebService.repository;

import org.invopayWebService.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer>,
    JpaSpecificationExecutor<Complaint> {

}