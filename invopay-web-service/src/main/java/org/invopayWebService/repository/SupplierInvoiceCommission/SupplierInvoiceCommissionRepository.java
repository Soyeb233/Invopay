package org.invopayWebService.repository.SupplierInvoiceCommission;

import org.invopayWebService.entity.SupplierInvoiceCommission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface SupplierInvoiceCommissionRepository extends
    JpaRepository<SupplierInvoiceCommission, Integer>,
    JpaSpecificationExecutor<SupplierInvoiceCommission> {

    @Query(value = "SELECT Sum(totalAmount) as iTotal FROM SupplierInvoiceCommission ")
    public Integer getSumReceivedAmount();

}