package org.invopayWebService.repository;

import org.invopayWebService.entity.ComplaintReplacementParticular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComplaintReplacementParticularRepository extends
    JpaRepository<ComplaintReplacementParticular, Integer>,
    JpaSpecificationExecutor<ComplaintReplacementParticular> {

}