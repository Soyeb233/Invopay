package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceParticularsLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceParticularsLineItemRepository extends
    JpaRepository<InvoiceParticularsLineItem, Integer>,
    JpaSpecificationExecutor<InvoiceParticularsLineItem> {

}