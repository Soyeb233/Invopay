package org.invopayWebService.dto.merchantCommissionSettlement;

import javax.persistence.Column;
import java.util.Date;

public class MerchantCommissionSettlementDTO {

    private Date invoiceDate;
    private String invoiceNo;
    private Float grandTotal;
    private Float commissionPercentage;
    private Float commissionAmount;
    private String client_name;
    private String supplierName;
    private Float totalAmount;
    private Date receivedDate;
    private String paymentTypeName;
    private String remarks;

    public MerchantCommissionSettlementDTO() {
    }

    public MerchantCommissionSettlementDTO(Date invoiceDate, String invoiceNo, Float grandTotal, Float commissionPercentage, Float commissionAmount, String client_name, String supplierName) {
        this.invoiceDate = invoiceDate;
        this.invoiceNo = invoiceNo;
        this.grandTotal = grandTotal;
        this.commissionPercentage = commissionPercentage;
        this.commissionAmount = commissionAmount;
        this.client_name = client_name;
        this.supplierName = supplierName;
    }

    public MerchantCommissionSettlementDTO(String supplierName, Float totalAmount, Date receivedDate, String paymentTypeName, String remarks){
        this.supplierName = supplierName;
        this.totalAmount = totalAmount;
        this.receivedDate = receivedDate;
        this.paymentTypeName = paymentTypeName;
        this.remarks = remarks;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Float getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(Float commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public Float getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Float commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "MerchantCommissionSettlementDTO{" +
                "invoiceDate=" + invoiceDate +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", grandTotal=" + grandTotal +
                ", commissionPercentage=" + commissionPercentage +
                ", commissionAmount=" + commissionAmount +
                ", client_name='" + client_name + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", totalAmount=" + totalAmount +
                ", receivedDate=" + receivedDate +
                ", paymentTypeName='" + paymentTypeName + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
