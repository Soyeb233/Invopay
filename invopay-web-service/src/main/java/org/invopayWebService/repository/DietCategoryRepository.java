package org.invopayWebService.repository;

import org.invopayWebService.entity.DietCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DietCategoryRepository extends JpaRepository<DietCategory, Integer>,
    JpaSpecificationExecutor<DietCategory> {

}