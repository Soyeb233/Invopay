package org.invopayWebService.repository;

import org.invopayWebService.entity.SampleRequestCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SampleRequestCategoryRepository extends
    JpaRepository<SampleRequestCategory, Integer>, JpaSpecificationExecutor<SampleRequestCategory> {

}