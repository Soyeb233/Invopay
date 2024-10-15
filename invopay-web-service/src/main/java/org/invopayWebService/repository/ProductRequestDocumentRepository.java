package org.invopayWebService.repository;

import org.invopayWebService.entity.ProductRequestDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRequestDocumentRepository extends
    JpaRepository<ProductRequestDocument, Integer>,
    JpaSpecificationExecutor<ProductRequestDocument> {

}