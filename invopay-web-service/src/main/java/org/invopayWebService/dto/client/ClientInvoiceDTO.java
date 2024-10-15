package org.invopayWebService.dto.client;

import lombok.Data;

import java.util.Date;
@Data
public class ClientInvoiceDTO {
    private int client_id;
    private String invoiceName;
    private String supplierName;
    private String client_fname;
    private String client_lname;
    private String client_name;
    private Date paymentDate;
    private int paidAmount;

    public ClientInvoiceDTO(int client_id, String invoiceName, String supplierName, String client_name) {
        this.client_id = client_id;
        this.invoiceName = invoiceName;
        this.supplierName = supplierName;
        this.client_name = client_name;
    }

    public ClientInvoiceDTO(int client_id,String client_fname, String client_lname, String supplierName, String invoiceName) {
        this.client_id = client_id;
        this.client_fname = client_fname;
        this.client_lname = client_lname;
        this.supplierName = supplierName;
        this.invoiceName = invoiceName;


    }

    public ClientInvoiceDTO(int client_id, String invoiceName, String supplierName, String client_name, Date paymentDate) {
        this.client_id = client_id;
        this.invoiceName = invoiceName;
        this.supplierName = supplierName;
        this.client_name = client_name;
        this.paymentDate = paymentDate;
    }

    public ClientInvoiceDTO(int client_id, String invoiceName, String supplierName, String client_name, Date paymentDate, int paidAmount) {
        this.client_id = client_id;
        this.invoiceName = invoiceName;
        this.supplierName = supplierName;
        this.client_name = client_name;
        this.paymentDate = paymentDate;
        this.paidAmount = paidAmount;
    }
}
