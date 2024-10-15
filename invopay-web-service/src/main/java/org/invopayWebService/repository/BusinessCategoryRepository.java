package org.invopayWebService.repository;

import org.invopayWebService.entity.BusinessCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BusinessCategoryRepository extends JpaRepository<BusinessCategory, Integer>,
    JpaSpecificationExecutor<BusinessCategory> {

}