package org.invopayWebService.repository;

import org.invopayWebService.entity.ComplaintParticular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComplaintParticularRepository extends JpaRepository<ComplaintParticular, Integer>,
    JpaSpecificationExecutor<ComplaintParticular> {

}