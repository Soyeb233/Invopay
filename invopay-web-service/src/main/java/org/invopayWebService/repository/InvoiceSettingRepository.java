package org.invopayWebService.repository;

import org.invopayWebService.entity.InvoiceSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceSettingRepository extends JpaRepository<InvoiceSetting, Integer>,
    JpaSpecificationExecutor<InvoiceSetting> {

}