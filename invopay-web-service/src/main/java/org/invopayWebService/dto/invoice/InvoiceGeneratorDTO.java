package org.invopayWebService.dto.invoice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class InvoiceGeneratorDTO {
    private int client_id;
    private Integer invoiceId;
    private String invoiceName;
    private Date invoiceDate;
    private String client_fname;
    private String client_lname;
    private String client_name;
    private String supplierName;
    private Float subTotal;
    private Float gstTotal;
    private Float discountTotal;
    private Float grandTotal;
    private Float appFee;
    private String paymentTypeName;
    private Date invoiceDueDate;
    private Integer invoicePaymentStatus;


    //These fields are  used in pdf invoice generator

    private String client_address_line1;
    private String client_address_line2;
    private String client_address_line3;

    private String client_city;

    private String client_state;

    private String client_pincode;

    private String supplierFname;

    private String supplierLname;

    private String supplierAddressLine1;

    private String supplierAddressLine2;

    private String supplierCity;

    private String supplierState;

    private String supplierPincode;

    private Float balanceTotal;

    private String productName;

    private String description;

    private Float price;

    private Integer productQty;

    private String countryName;









    public InvoiceGeneratorDTO(Integer invoiceId, String invoiceName, Date invoiceDate, String client_name, String supplierName, Float subTotal, Float gstTotal, Float discountTotal, Float grandTotal, Float appFee, String paymentTypeName, Date invoiceDueDate, Integer invoicePaymentStatus) {

        this.invoiceId = invoiceId;
        this.invoiceName = invoiceName;
        this.invoiceDate = invoiceDate;
        this.client_name = client_name;
        this.supplierName = supplierName;
        this.subTotal = subTotal;
        this.gstTotal = gstTotal;
        this.discountTotal = discountTotal;
        this.grandTotal = grandTotal;
        this.appFee = appFee;
        this.paymentTypeName = paymentTypeName;
        this.invoiceDueDate = invoiceDueDate;
        this.invoicePaymentStatus = invoicePaymentStatus;
    }

    public InvoiceGeneratorDTO(int client_id, Integer invoiceId, String invoiceName, Date invoiceDate, String client_name, String supplierName, Float subTotal, Float gstTotal, Float discountTotal, Float grandTotal, Float appFee, String paymentTypeName, Date invoiceDueDate, Integer invoicePaymentStatus) {
        this.client_id = client_id;
        this.invoiceId = invoiceId;
        this.invoiceName = invoiceName;
        this.invoiceDate = invoiceDate;
        this.client_name = client_name;
        this.supplierName = supplierName;
        this.subTotal = subTotal;
        this.gstTotal = gstTotal;
        this.discountTotal = discountTotal;
        this.grandTotal = grandTotal;
        this.appFee = appFee;
        this.paymentTypeName = paymentTypeName;
        this.invoiceDueDate = invoiceDueDate;
        this.invoicePaymentStatus = invoicePaymentStatus;
    }

    public InvoiceGeneratorDTO(int client_id, Integer invoiceId, String invoiceName, Date invoiceDate, String client_fname, String client_lname, String client_name, String supplierName, Float subTotal, Float gstTotal, Float discountTotal, Float grandTotal, Float appFee, String paymentTypeName, Date invoiceDueDate, Integer invoicePaymentStatus) {
        this.client_id = client_id;
        this.invoiceId = invoiceId;
        this.invoiceName = invoiceName;
        this.invoiceDate = invoiceDate;
        this.client_fname = client_fname;
        this.client_lname = client_lname;
        this.client_name = client_name;
        this.supplierName = supplierName;
        this.subTotal = subTotal;
        this.gstTotal = gstTotal;
        this.discountTotal = discountTotal;
        this.grandTotal = grandTotal;
        this.appFee = appFee;
        this.paymentTypeName = paymentTypeName;
        this.invoiceDueDate = invoiceDueDate;
        this.invoicePaymentStatus = invoicePaymentStatus;
    }

    //This constructor for invoice pdf generator

    public InvoiceGeneratorDTO(Integer invoiceId, String invoiceName, Date invoiceDate, String client_fname, String client_lname, String client_name, String supplierName, Float subTotal, Float gstTotal, Float grandTotal, String client_address_line1, String client_address_line2, String client_address_line3, String client_city, String client_state, String client_pincode, String supplierFname, String supplierLname, String supplierAddressLine1, String supplierAddressLine2, String supplierCity, String supplierState, String supplierPincode, Float balanceTotal, String productName, String description, Float price, Integer productQty) {
        this.invoiceId = invoiceId;
        this.invoiceName = invoiceName;
        this.invoiceDate = invoiceDate;
        this.client_fname = client_fname;
        this.client_lname = client_lname;
        this.client_name = client_name;
        this.supplierName = supplierName;
        this.subTotal = subTotal;
        this.gstTotal = gstTotal;
        this.grandTotal = grandTotal;
        this.client_address_line1 = client_address_line1;
        this.client_address_line2 = client_address_line2;
        this.client_address_line3 = client_address_line3;
        this.client_city = client_city;
        this.client_state = client_state;
        this.client_pincode = client_pincode;
        this.supplierFname = supplierFname;
        this.supplierLname = supplierLname;
        this.supplierAddressLine1 = supplierAddressLine1;
        this.supplierAddressLine2 = supplierAddressLine2;
        this.supplierCity = supplierCity;
        this.supplierState = supplierState;
        this.supplierPincode = supplierPincode;
        this.balanceTotal = balanceTotal;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.productQty = productQty;

    }
}