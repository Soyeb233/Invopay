/*
 * This file is generated by jOOQ.
 */
package org.invopayWebService.dto.bank;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       bankId;
    private String        bankName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public BankDTO() {}

    public BankDTO(BankDTO value) {
        this.bankId = value.bankId;
        this.bankName = value.bankName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public BankDTO(
        Integer       bankId,
        String        bankName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.bank.bank_id</code>.
     */
    public Integer getBankId() {
        return this.bankId;
    }

    /**
     * Setter for <code>invopay.bank.bank_id</code>.
     */
    public BankDTO setBankId(Integer bankId) {
        this.bankId = bankId;
        return this;
    }

    /**
     * Getter for <code>invopay.bank.bank_name</code>. Bank / Branch Name
     */
    public String getBankName() {
        return this.bankName;
    }

    /**
     * Setter for <code>invopay.bank.bank_name</code>. Bank / Branch Name
     */
    public BankDTO setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /**
     * Getter for <code>invopay.bank.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.bank.ref_user_id</code>.
     */
    public BankDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.bank.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.bank.delete_status</code>.
     */
    public BankDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.bank.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.bank.transaction_id</code>.
     */
    public BankDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.bank.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.bank.added_date</code>.
     */
    public BankDTO setAddedDate(LocalDateTime addedDate) {
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
        final BankDTO other = (BankDTO) obj;
        if (bankId == null) {
            if (other.bankId != null)
                return false;
        }
        else if (!bankId.equals(other.bankId))
            return false;
        if (bankName == null) {
            if (other.bankName != null)
                return false;
        }
        else if (!bankName.equals(other.bankName))
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
        result = prime * result + ((this.bankId == null) ? 0 : this.bankId.hashCode());
        result = prime * result + ((this.bankName == null) ? 0 : this.bankName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bank (");

        sb.append(bankId);
        sb.append(", ").append(bankName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}