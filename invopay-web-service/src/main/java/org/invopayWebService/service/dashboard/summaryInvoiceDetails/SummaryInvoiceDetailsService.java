package org.invopayWebService.service.dashboard.summaryInvoiceDetails;

import org.invopayWebService.dto.dashboard.SummaryInvoiceDetailsDTO;

public interface SummaryInvoiceDetailsService {

    public SummaryInvoiceDetailsDTO getAllSummaryInvoiceDetails();

    public Integer getMerchantCount();

    public Integer getClientCount();

    public Integer getCountPendingInvoice();

    public Integer getCountCompletedInvoice();

    public Integer getCountCancelledInvoice();
    public Integer getSumTotalAmount();

    public Integer getSumReceivedAmount();
}
