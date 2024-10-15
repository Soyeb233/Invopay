package org.invopayWebService.repository.merchantCommissionSettlement;

import org.invopayWebService.dto.merchantCommissionSettlement.MerchantCommissionSettlementDTO;
import org.invopayWebService.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MerchantCommissionSettlementRepository extends JpaRepository<Invoice, Integer>,
        JpaSpecificationExecutor<Invoice> {

    @Query(value ="select new org.invopayWebService.dto.merchantCommissionSettlement.MerchantCommissionSettlementDTO(i.invoiceDate, i.invoiceNo, i.grandTotal, i.commissionPercentage, i.commissionAmount, c.client_name, s.supplierName )"+" from Invoice i INNER JOIN Client c ON  i.refClientId = c.client_id INNER JOIN Supplier s on i.refSupplierId = s.supplierId")
    List<MerchantCommissionSettlementDTO> findAllMerCommSettlement();
    @Query(value ="select new org.invopayWebService.dto.merchantCommissionSettlement.MerchantCommissionSettlementDTO(i.invoiceDate, i.invoiceNo, i.grandTotal, i.commissionPercentage, i.commissionAmount, c.client_name, s.supplierName )"+" from Invoice i INNER JOIN Client c ON  i.refClientId = c.client_id INNER JOIN Supplier s on i.refSupplierId = s.supplierId WHERE s.supplierId=?1")
    List<MerchantCommissionSettlementDTO> findMerchantById(int id);
}
