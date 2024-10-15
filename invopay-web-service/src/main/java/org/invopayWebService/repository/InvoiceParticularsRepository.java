package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceParticulars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceParticularsRepository extends JpaRepository<InvoiceParticulars, Integer>,
    JpaSpecificationExecutor<InvoiceParticulars> {

}