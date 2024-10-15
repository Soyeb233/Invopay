package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductOldRepository extends JpaRepository<ProductOld, Integer>,
    JpaSpecificationExecutor<ProductOld> {

}