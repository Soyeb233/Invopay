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
public class ActiveStatusDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       activeStatusId;
    private String        activeStatusName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ActiveStatusDTO() {}

    public ActiveStatusDTO(ActiveStatusDTO value) {
        this.activeStatusId = value.activeStatusId;
        this.activeStatusName = value.activeStatusName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ActiveStatusDTO(
        Integer       activeStatusId,
        String        activeStatusName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.activeStatusId = activeStatusId;
        this.activeStatusName = activeStatusName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.active_status.active_status_id</code>.
     */
    public Integer getActiveStatusId() {
        return this.activeStatusId;
    }

    /**
     * Setter for <code>invopay.active_status.active_status_id</code>.
     */
    public ActiveStatusDTO setActiveStatusId(Integer activeStatusId) {
        this.activeStatusId = activeStatusId;
        return this;
    }

    /**
     * Getter for <code>invopay.active_status.active_status_name</code>. Status
     */
    public String getActiveStatusName() {
        return this.activeStatusName;
    }

    /**
     * Setter for <code>invopay.active_status.active_status_name</code>. Status
     */
    public ActiveStatusDTO setActiveStatusName(String activeStatusName) {
        this.activeStatusName = activeStatusName;
        return this;
    }

    /**
     * Getter for <code>invopay.active_status.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.active_status.ref_user_id</code>.
     */
    public ActiveStatusDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.active_status.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.active_status.delete_status</code>.
     */
    public ActiveStatusDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.active_status.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.active_status.transaction_id</code>.
     */
    public ActiveStatusDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.active_status.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.active_status.added_date</code>.
     */
    public ActiveStatusDTO setAddedDate(LocalDateTime addedDate) {
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
        final ActiveStatusDTO other = (ActiveStatusDTO) obj;
        if (activeStatusId == null) {
            if (other.activeStatusId != null)
                return false;
        }
        else if (!activeStatusId.equals(other.activeStatusId))
            return false;
        if (activeStatusName == null) {
            if (other.activeStatusName != null)
                return false;
        }
        else if (!activeStatusName.equals(other.activeStatusName))
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
        result = prime * result + ((this.activeStatusId == null) ? 0 : this.activeStatusId.hashCode());
        result = prime * result + ((this.activeStatusName == null) ? 0 : this.activeStatusName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActiveStatus (");

        sb.append(activeStatusId);
        sb.append(", ").append(activeStatusName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
