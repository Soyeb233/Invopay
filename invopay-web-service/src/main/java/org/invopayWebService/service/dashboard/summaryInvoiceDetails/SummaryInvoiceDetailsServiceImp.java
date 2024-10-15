package org.invopayWebService.service.dashboard.summaryInvoiceDetails;

import org.invopayWebService.dto.dashboard.SummaryInvoiceDetailsDTO;
import org.invopayWebService.repository.SupplierInvoiceCommission.SupplierInvoiceCommissionRepository;
import org.invopayWebService.repository.client.ClientRepository;
import org.invopayWebService.repository.invoice.InvoiceRepository;
import org.invopayWebService.repository.supplier.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummaryInvoiceDetailsServiceImp implements  SummaryInvoiceDetailsService{



    @Autowired
    ClientRepository clientRepository;
    @Autowired
    SupplierRepository supplierRepository;

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    SupplierInvoiceCommissionRepository supplierInvoiceCommissionRepository;

    public SummaryInvoiceDetailsDTO getAllSummaryInvoiceDetails(){

        SummaryInvoiceDetailsDTO summaryInvoiceDetailsDTO = new SummaryInvoiceDetailsDTO();

        summaryInvoiceDetailsDTO.setClientCount(getClientCount());
        summaryInvoiceDetailsDTO.setMerchantCount(getMerchantCount());
        summaryInvoiceDetailsDTO.setPendingInvoice(getCountPendingInvoice());
        summaryInvoiceDetailsDTO.setCompletedInvoice(getCountCompletedInvoice());
        summaryInvoiceDetailsDTO.setCancelledInvoice(getCountCancelledInvoice());
        summaryInvoiceDetailsDTO.setTotalAmount(getSumTotalAmount());
        summaryInvoiceDetailsDTO.setReceivedAmount(getSumReceivedAmount());
        summaryInvoiceDetailsDTO.setOutstandingAmount(getSumTotalAmount() - getSumReceivedAmount());



        return summaryInvoiceDetailsDTO;


    }
   public Integer getMerchantCount(){

        return  supplierRepository.getMerchantCount();
    }
   public Integer getClientCount(){

       return clientRepository.getClientCount();
   }

    public Integer getCountPendingInvoice(){

        return invoiceRepository.getCountPendingInvoice();
    }
    public Integer getCountCompletedInvoice(){

        return invoiceRepository.getCountCompletedInvoice();

    }

    public Integer getCountCancelledInvoice(){

       return invoiceRepository.getCountCancelledInvoice();

    }

    public Integer getSumTotalAmount(){

        return invoiceRepository.getSumTotalAmount();
    }

    public Integer getSumReceivedAmount(){

        return supplierInvoiceCommissionRepository.getSumReceivedAmount();
    }

}
