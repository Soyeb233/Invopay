package org.invopayWebService.repository;

import org.invopayWebService.entity.ApplicationSegmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ApplicationSegmentTypeRepository extends
    JpaRepository<ApplicationSegmentType, Integer>,
    JpaSpecificationExecutor<ApplicationSegmentType> {

}