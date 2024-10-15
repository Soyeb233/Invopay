package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductRequestEmailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRequestEmailTemplateRepository extends
    JpaRepository<ProductRequestEmailTemplate, Integer>,
    JpaSpecificationExecutor<ProductRequestEmailTemplate> {

}