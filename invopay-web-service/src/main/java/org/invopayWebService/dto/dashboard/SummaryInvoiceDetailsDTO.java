package org.invopayWebService.dto.dashboard;


public class SummaryInvoiceDetailsDTO {

    private Integer merchantCount;
    private Integer clientCount;

    private Integer pendingInvoice;

    private Integer completedInvoice;

    private Integer cancelledInvoice;

    private Integer totalAmount;

    private Integer receivedAmount;

    private Integer outstandingAmount;

    public SummaryInvoiceDetailsDTO() {
    }

    public SummaryInvoiceDetailsDTO(Integer merchantCount, Integer clientCount, Integer pendingInvoice, Integer completedInvoice, Integer cancelledInvoice, Integer totalAmount, Integer receivedAmount, Integer outstandingAmount) {
        this.merchantCount = merchantCount;
        this.clientCount = clientCount;
        this.pendingInvoice = pendingInvoice;
        this.completedInvoice = completedInvoice;
        this.cancelledInvoice = cancelledInvoice;
        this.totalAmount = totalAmount;
        this.receivedAmount = receivedAmount;
        this.outstandingAmount = outstandingAmount;
    }

    public Integer getMerchantCount() {
        return merchantCount;
    }

    public void setMerchantCount(Integer merchantCount) {
        this.merchantCount = merchantCount;
    }

    public Integer getClientCount() {
        return clientCount;
    }

    public void setClientCount(Integer clientCount) {
        this.clientCount = clientCount;
    }

    public Integer getPendingInvoice() {
        return pendingInvoice;
    }

    public void setPendingInvoice(Integer pendingInvoice) {
        this.pendingInvoice = pendingInvoice;
    }

    public Integer getCompletedInvoice() {
        return completedInvoice;
    }

    public void setCompletedInvoice(Integer completedInvoice) {
        this.completedInvoice = completedInvoice;
    }

    public Integer getCancelledInvoice() {
        return cancelledInvoice;
    }

    public void setCancelledInvoice(Integer cancelledInvoice) {
        this.cancelledInvoice = cancelledInvoice;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Integer receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Integer getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(Integer outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
}
