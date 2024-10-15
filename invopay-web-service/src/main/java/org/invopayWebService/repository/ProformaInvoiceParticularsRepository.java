package org.invopayWebService.repository;

import org.invopayWebService.entity.ProformaInvoiceParticulars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProformaInvoiceParticularsRepository extends
    JpaRepository<ProformaInvoiceParticulars, Integer>,
    JpaSpecificationExecutor<ProformaInvoiceParticulars> {

}