package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductImageRepository extends JpaRepository<ProductImage, Integer>,
    JpaSpecificationExecutor<ProductImage> {

}