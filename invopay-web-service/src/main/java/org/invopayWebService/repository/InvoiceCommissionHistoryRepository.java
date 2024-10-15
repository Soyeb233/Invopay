package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceCommissionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceCommissionHistoryRepository extends
    JpaRepository<InvoiceCommissionHistory, Integer>,
    JpaSpecificationExecutor<InvoiceCommissionHistory> {

}