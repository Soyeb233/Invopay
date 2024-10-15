package org.invopayWebService.repository.dashboard;

import org.invopayWebService.dto.dashboard.RecentInvoiceDTO;
import org.invopayWebService.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecentInvoiceRepository extends JpaRepository<Invoice,Integer>,
        JpaSpecificationExecutor<Invoice> {
        @Query(value = "select new org.invopayWebService.dto.dashboard.RecentInvoiceDTO(i.invoiceNo,i.invoiceDate,i.invoiceDueDate,s.supplierName,c.client_name,i.invoicePaymentStatus) from Invoice i INNER JOIN Supplier s ON i.refSupplierId = s.supplierId INNER JOIN Client c ON i.refClientId = c.client_id ORDER BY i.invoiceDate DESC ")
        public List<RecentInvoiceDTO> getAllMerCommSettlement();

}
