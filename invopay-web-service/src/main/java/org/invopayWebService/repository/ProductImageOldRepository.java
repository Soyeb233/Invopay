package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductImageOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductImageOldRepository extends JpaRepository<ProductImageOld, Integer>,
    JpaSpecificationExecutor<ProductImageOld> {

}