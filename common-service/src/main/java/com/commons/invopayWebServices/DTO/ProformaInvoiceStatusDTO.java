/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProformaInvoiceStatusDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       proformaInvoiceStatusId;
    private String        proformaInvoiceStatusName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ProformaInvoiceStatusDTO() {}

    public ProformaInvoiceStatusDTO(ProformaInvoiceStatusDTO value) {
        this.proformaInvoiceStatusId = value.proformaInvoiceStatusId;
        this.proformaInvoiceStatusName = value.proformaInvoiceStatusName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ProformaInvoiceStatusDTO(
        Integer       proformaInvoiceStatusId,
        String        proformaInvoiceStatusName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.proformaInvoiceStatusId = proformaInvoiceStatusId;
        this.proformaInvoiceStatusName = proformaInvoiceStatusName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_status.proforma_invoice_status_id</code>.
     */
    public Integer getProformaInvoiceStatusId() {
        return this.proformaInvoiceStatusId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_status.proforma_invoice_status_id</code>.
     */
    public ProformaInvoiceStatusDTO setProformaInvoiceStatusId(Integer proformaInvoiceStatusId) {
        this.proformaInvoiceStatusId = proformaInvoiceStatusId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_status.proforma_invoice_status_name</code>. Proforma Status
     */
    public String getProformaInvoiceStatusName() {
        return this.proformaInvoiceStatusName;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_status.proforma_invoice_status_name</code>. Proforma Status
     */
    public ProformaInvoiceStatusDTO setProformaInvoiceStatusName(String proformaInvoiceStatusName) {
        this.proformaInvoiceStatusName = proformaInvoiceStatusName;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_status.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_status.ref_user_id</code>. User
     */
    public ProformaInvoiceStatusDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_status.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_status.delete_status</code>.
     */
    public ProformaInvoiceStatusDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_status.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_status.transaction_id</code>.
     */
    public ProformaInvoiceStatusDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_status.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_status.added_date</code>. Added Date
     */
    public ProformaInvoiceStatusDTO setAddedDate(LocalDateTime addedDate) {
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
        final ProformaInvoiceStatusDTO other = (ProformaInvoiceStatusDTO) obj;
        if (proformaInvoiceStatusId == null) {
            if (other.proformaInvoiceStatusId != null)
                return false;
        }
        else if (!proformaInvoiceStatusId.equals(other.proformaInvoiceStatusId))
            return false;
        if (proformaInvoiceStatusName == null) {
            if (other.proformaInvoiceStatusName != null)
                return false;
        }
        else if (!proformaInvoiceStatusName.equals(other.proformaInvoiceStatusName))
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
        result = prime * result + ((this.proformaInvoiceStatusId == null) ? 0 : this.proformaInvoiceStatusId.hashCode());
        result = prime * result + ((this.proformaInvoiceStatusName == null) ? 0 : this.proformaInvoiceStatusName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProformaInvoiceStatus (");

        sb.append(proformaInvoiceStatusId);
        sb.append(", ").append(proformaInvoiceStatusName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
