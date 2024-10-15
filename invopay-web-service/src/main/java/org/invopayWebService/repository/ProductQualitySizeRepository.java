package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductQualitySize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductQualitySizeRepository extends JpaRepository<ProductQualitySize, Integer>,
    JpaSpecificationExecutor<ProductQualitySize> {

}