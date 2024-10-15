/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceCommissionHistoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       invoiceCommissionHistoryId;
    private Integer       refInvoiceId;
    private LocalDate     invoiceCommissionDate;
    private Integer       invoiceCommissionAmount;
    private String        invoiceCommissionDetails;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public InvoiceCommissionHistoryDTO() {}

    public InvoiceCommissionHistoryDTO(InvoiceCommissionHistoryDTO value) {
        this.invoiceCommissionHistoryId = value.invoiceCommissionHistoryId;
        this.refInvoiceId = value.refInvoiceId;
        this.invoiceCommissionDate = value.invoiceCommissionDate;
        this.invoiceCommissionAmount = value.invoiceCommissionAmount;
        this.invoiceCommissionDetails = value.invoiceCommissionDetails;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public InvoiceCommissionHistoryDTO(
        Integer       invoiceCommissionHistoryId,
        Integer       refInvoiceId,
        LocalDate     invoiceCommissionDate,
        Integer       invoiceCommissionAmount,
        String        invoiceCommissionDetails,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.invoiceCommissionHistoryId = invoiceCommissionHistoryId;
        this.refInvoiceId = refInvoiceId;
        this.invoiceCommissionDate = invoiceCommissionDate;
        this.invoiceCommissionAmount = invoiceCommissionAmount;
        this.invoiceCommissionDetails = invoiceCommissionDetails;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.invoice_commission_history_id</code>.
     */
    public Integer getInvoiceCommissionHistoryId() {
        return this.invoiceCommissionHistoryId;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.invoice_commission_history_id</code>.
     */
    public InvoiceCommissionHistoryDTO setInvoiceCommissionHistoryId(Integer invoiceCommissionHistoryId) {
        this.invoiceCommissionHistoryId = invoiceCommissionHistoryId;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.ref_invoice_id</code>.
     */
    public Integer getRefInvoiceId() {
        return this.refInvoiceId;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.ref_invoice_id</code>.
     */
    public InvoiceCommissionHistoryDTO setRefInvoiceId(Integer refInvoiceId) {
        this.refInvoiceId = refInvoiceId;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.invoice_commission_date</code>.
     */
    public LocalDate getInvoiceCommissionDate() {
        return this.invoiceCommissionDate;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.invoice_commission_date</code>.
     */
    public InvoiceCommissionHistoryDTO setInvoiceCommissionDate(LocalDate invoiceCommissionDate) {
        this.invoiceCommissionDate = invoiceCommissionDate;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.invoice_commission_amount</code>.
     */
    public Integer getInvoiceCommissionAmount() {
        return this.invoiceCommissionAmount;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.invoice_commission_amount</code>.
     */
    public InvoiceCommissionHistoryDTO setInvoiceCommissionAmount(Integer invoiceCommissionAmount) {
        this.invoiceCommissionAmount = invoiceCommissionAmount;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.invoice_commission_details</code>.
     */
    public String getInvoiceCommissionDetails() {
        return this.invoiceCommissionDetails;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.invoice_commission_details</code>.
     */
    public InvoiceCommissionHistoryDTO setInvoiceCommissionDetails(String invoiceCommissionDetails) {
        this.invoiceCommissionDetails = invoiceCommissionDetails;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.ref_user_id</code>.
     */
    public InvoiceCommissionHistoryDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.delete_status</code>.
     */
    public InvoiceCommissionHistoryDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.transaction_id</code>.
     */
    public InvoiceCommissionHistoryDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.invoice_commission_history.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.invoice_commission_history.added_date</code>.
     */
    public InvoiceCommissionHistoryDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InvoiceCommissionHistoryDTO other = (InvoiceCommissionHistoryDTO) obj;
        if (invoiceCommissionHistoryId == null) {
            if (other.invoiceCommissionHistoryId != null)
                return false;
        }
        else if (!invoiceCommissionHistoryId.equals(other.invoiceCommissionHistoryId))
            return false;
        if (refInvoiceId == null) {
            if (other.refInvoiceId != null)
                return false;
        }
        else if (!refInvoiceId.equals(other.refInvoiceId))
            return false;
        if (invoiceCommissionDate == null) {
            if (other.invoiceCommissionDate != null)
                return false;
        }
        else if (!invoiceCommissionDate.equals(other.invoiceCommissionDate))
            return false;
        if (invoiceCommissionAmount == null) {
            if (other.invoiceCommissionAmount != null)
                return false;
        }
        else if (!invoiceCommissionAmount.equals(other.invoiceCommissionAmount))
            return false;
        if (invoiceCommissionDetails == null) {
            if (other.invoiceCommissionDetails != null)
                return false;
        }
        else if (!invoiceCommissionDetails.equals(other.invoiceCommissionDetails))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
            return false;
        if (addedDate == null) {
            if (other.addedDate != null)
                return false;
        }
        else if (!addedDate.equals(other.addedDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.invoiceCommissionHistoryId == null) ? 0 : this.invoiceCommissionHistoryId.hashCode());
        result = prime * result + ((this.refInvoiceId == null) ? 0 : this.refInvoiceId.hashCode());
        result = prime * result + ((this.invoiceCommissionDate == null) ? 0 : this.invoiceCommissionDate.hashCode());
        result = prime * result + ((this.invoiceCommissionAmount == null) ? 0 : this.invoiceCommissionAmount.hashCode());
        result = prime * result + ((this.invoiceCommissionDetails == null) ? 0 : this.invoiceCommissionDetails.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceCommissionHistory (");

        sb.append(invoiceCommissionHistoryId);
        sb.append(", ").append(refInvoiceId);
        sb.append(", ").append(invoiceCommissionDate);
        sb.append(", ").append(invoiceCommissionAmount);
        sb.append(", ").append(invoiceCommissionDetails);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}