package org.invopayWebService.repository;

import org.invopayWebService.entity.LeadRemark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadRemarkRepository extends JpaRepository<LeadRemark, Integer>,
    JpaSpecificationExecutor<LeadRemark> {

}