package org.invopayWebService.repository;

import org.invopayWebService.entity.ProformaInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProformaInvoiceRepository extends JpaRepository<ProformaInvoice, Integer>,
    JpaSpecificationExecutor<ProformaInvoice> {

}