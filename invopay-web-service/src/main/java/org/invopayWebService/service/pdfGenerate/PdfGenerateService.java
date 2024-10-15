package org.invopayWebService.service.pdfGenerate;

import java.io.ByteArrayInputStream;

public interface PdfGenerateService {

    ByteArrayInputStream generateInvoicePdfById(int invoiceId);

    ByteArrayInputStream generatePaymentReceiptPdfById(int invoiceId);
}
