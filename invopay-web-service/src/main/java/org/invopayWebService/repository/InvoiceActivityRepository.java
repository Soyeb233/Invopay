package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceActivityRepository extends JpaRepository<InvoiceActivity, Integer>,
    JpaSpecificationExecutor<InvoiceActivity> {

}