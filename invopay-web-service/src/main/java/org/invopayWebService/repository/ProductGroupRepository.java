package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Integer>,
    JpaSpecificationExecutor<ProductGroup> {

}