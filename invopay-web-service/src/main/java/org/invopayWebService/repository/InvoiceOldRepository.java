package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceOldRepository extends JpaRepository<InvoiceOld, Integer>,
    JpaSpecificationExecutor<InvoiceOld> {

}