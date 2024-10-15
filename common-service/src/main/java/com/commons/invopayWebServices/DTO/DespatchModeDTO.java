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
public class DespatchModeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       despatchModeId;
    private String        despatchModeName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DespatchModeDTO() {}

    public DespatchModeDTO(DespatchModeDTO value) {
        this.despatchModeId = value.despatchModeId;
        this.despatchModeName = value.despatchModeName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DespatchModeDTO(
        Integer       despatchModeId,
        String        despatchModeName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.despatchModeId = despatchModeId;
        this.despatchModeName = despatchModeName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.despatch_mode.despatch_mode_id</code>.
     */
    public Integer getDespatchModeId() {
        return this.despatchModeId;
    }

    /**
     * Setter for <code>invopay.despatch_mode.despatch_mode_id</code>.
     */
    public DespatchModeDTO setDespatchModeId(Integer despatchModeId) {
        this.despatchModeId = despatchModeId;
        return this;
    }

    /**
     * Getter for <code>invopay.despatch_mode.despatch_mode_name</code>. Despatch Mode
     */
    public String getDespatchModeName() {
        return this.despatchModeName;
    }

    /**
     * Setter for <code>invopay.despatch_mode.despatch_mode_name</code>. Despatch Mode
     */
    public DespatchModeDTO setDespatchModeName(String despatchModeName) {
        this.despatchModeName = despatchModeName;
        return this;
    }

    /**
     * Getter for <code>invopay.despatch_mode.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.despatch_mode.ref_user_id</code>. User
     */
    public DespatchModeDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.despatch_mode.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.despatch_mode.delete_status</code>.
     */
    public DespatchModeDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.despatch_mode.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.despatch_mode.transaction_id</code>.
     */
    public DespatchModeDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.despatch_mode.added_date</code>. Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.despatch_mode.added_date</code>. Date
     */
    public DespatchModeDTO setAddedDate(LocalDateTime addedDate) {
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
        final DespatchModeDTO other = (DespatchModeDTO) obj;
        if (despatchModeId == null) {
            if (other.despatchModeId != null)
                return false;
        }
        else if (!despatchModeId.equals(other.despatchModeId))
            return false;
        if (despatchModeName == null) {
            if (other.despatchModeName != null)
                return false;
        }
        else if (!despatchModeName.equals(other.despatchModeName))
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
        result = prime * result + ((this.despatchModeId == null) ? 0 : this.despatchModeId.hashCode());
        result = prime * result + ((this.despatchModeName == null) ? 0 : this.despatchModeName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DespatchMode (");

        sb.append(despatchModeId);
        sb.append(", ").append(despatchModeName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
