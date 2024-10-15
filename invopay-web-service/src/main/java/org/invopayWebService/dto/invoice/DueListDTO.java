package org.invopayWebService.dto.invoice;

import java.util.Date;

public class DueListDTO {


    private Date invoiceDate;
    private Date invoiceDueDate;
    private String supplierName;
    private String client_lname;
    private String client_fname;
    private String invoiceNo;
    private String clientName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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


    public String getClient_lname() {
        return client_lname;
    }

    public void setClient_lname(String client_lname) {
        this.client_lname = client_lname;
    }

    public String getClient_fname() {
        return client_fname;
    }

    public void setClient_fname(String client_fname) {
        this.client_fname = client_fname;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }


    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public DueListDTO() {
        super();
    }

    public DueListDTO( Date invoiceDate, Date invoiceDueDate, String supplierName, String client_lname,
                       String client_fname, String invoiceNo) {

        this.invoiceDate = invoiceDate;
        this.invoiceDueDate = invoiceDueDate;
        this.supplierName = supplierName;
        this.client_lname = client_lname;
        this.client_fname = client_fname;
        this.invoiceNo = invoiceNo;

    }
    public DueListDTO( Date invoiceDate, Date invoiceDueDate, String supplierName, String client_lname,
                       String client_fname, String invoiceNo,String clientName) {

        this.invoiceDate = invoiceDate;
        this.invoiceDueDate = invoiceDueDate;
        this.supplierName = supplierName;
        this.client_lname = client_lname;
        this.client_fname = client_fname;
        this.invoiceNo = invoiceNo;
        this.clientName=clientName;
    }

}
