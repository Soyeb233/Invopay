package org.invopayWebService.dto.dashboard;

import java.util.Date;

public class RecentInvoiceDTO {

    private String invoiceNo;
    private Date invoiceDate;
    private Date invoiceDueDate;
    private String supplierName;
    private String client_name;
    private Integer invoicePaymentStatus;

    public RecentInvoiceDTO() {
    }

    public RecentInvoiceDTO(String invoiceNo, Date invoiceDate, Date invoiceDueDate, String supplierName, String client_name, Integer invoicePaymentStatus) {
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.invoiceDueDate = invoiceDueDate;
        this.supplierName = supplierName;
        this.client_name = client_name;
        this.invoicePaymentStatus = invoicePaymentStatus;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Integer getInvoicePaymentStatus() {
        return invoicePaymentStatus;
    }

    public void setInvoicePaymentStatus(Integer invoicePaymentStatus) {
        this.invoicePaymentStatus = invoicePaymentStatus;
    }

    @Override
    public String toString() {
        return "RecentInvoiceDTO{" +
                "invoiceNo='" + invoiceNo + '\'' +
                ", invoiceDate=" + invoiceDate +
                ", invoiceDueDate=" + invoiceDueDate +
                ", supplierName='" + supplierName + '\'' +
                ", client_name='" + client_name + '\'' +
                ", invoicePaymentStatus=" + invoicePaymentStatus +
                '}';
    }
}
