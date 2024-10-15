package org.invopayWebService.repository;

import org.invopayWebService.entity.ProformaInvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProformaInvoiceStatusRepository extends
    JpaRepository<ProformaInvoiceStatus, Integer>, JpaSpecificationExecutor<ProformaInvoiceStatus> {

}