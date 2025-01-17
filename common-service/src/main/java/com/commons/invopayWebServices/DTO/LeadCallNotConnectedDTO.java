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
public class LeadCallNotConnectedDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       leadCallNotConnectedId;
    private String        leadCallNotConnectedName;
    private Integer       deleteStatus;
    private Integer       userId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public LeadCallNotConnectedDTO() {}

    public LeadCallNotConnectedDTO(LeadCallNotConnectedDTO value) {
        this.leadCallNotConnectedId = value.leadCallNotConnectedId;
        this.leadCallNotConnectedName = value.leadCallNotConnectedName;
        this.deleteStatus = value.deleteStatus;
        this.userId = value.userId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public LeadCallNotConnectedDTO(
        Integer       leadCallNotConnectedId,
        String        leadCallNotConnectedName,
        Integer       deleteStatus,
        Integer       userId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.leadCallNotConnectedId = leadCallNotConnectedId;
        this.leadCallNotConnectedName = leadCallNotConnectedName;
        this.deleteStatus = deleteStatus;
        this.userId = userId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.lead_call_not_connected.lead_call_not_connected_id</code>.
     */
    public Integer getLeadCallNotConnectedId() {
        return this.leadCallNotConnectedId;
    }

    /**
     * Setter for <code>invopay.lead_call_not_connected.lead_call_not_connected_id</code>.
     */
    public LeadCallNotConnectedDTO setLeadCallNotConnectedId(Integer leadCallNotConnectedId) {
        this.leadCallNotConnectedId = leadCallNotConnectedId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_call_not_connected.lead_call_not_connected_name</code>.
     */
    public String getLeadCallNotConnectedName() {
        return this.leadCallNotConnectedName;
    }

    /**
     * Setter for <code>invopay.lead_call_not_connected.lead_call_not_connected_name</code>.
     */
    public LeadCallNotConnectedDTO setLeadCallNotConnectedName(String leadCallNotConnectedName) {
        this.leadCallNotConnectedName = leadCallNotConnectedName;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_call_not_connected.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.lead_call_not_connected.delete_status</code>.
     */
    public LeadCallNotConnectedDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_call_not_connected.user_id</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>invopay.lead_call_not_connected.user_id</code>.
     */
    public LeadCallNotConnectedDTO setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_call_not_connected.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.lead_call_not_connected.transaction_id</code>.
     */
    public LeadCallNotConnectedDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_call_not_connected.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.lead_call_not_connected.added_date</code>.
     */
    public LeadCallNotConnectedDTO setAddedDate(LocalDateTime addedDate) {
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
        final LeadCallNotConnectedDTO other = (LeadCallNotConnectedDTO) obj;
        if (leadCallNotConnectedId == null) {
            if (other.leadCallNotConnectedId != null)
                return false;
        }
        else if (!leadCallNotConnectedId.equals(other.leadCallNotConnectedId))
            return false;
        if (leadCallNotConnectedName == null) {
            if (other.leadCallNotConnectedName != null)
                return false;
        }
        else if (!leadCallNotConnectedName.equals(other.leadCallNotConnectedName))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
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
        result = prime * result + ((this.leadCallNotConnectedId == null) ? 0 : this.leadCallNotConnectedId.hashCode());
        result = prime * result + ((this.leadCallNotConnectedName == null) ? 0 : this.leadCallNotConnectedName.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LeadCallNotConnected (");

        sb.append(leadCallNotConnectedId);
        sb.append(", ").append(leadCallNotConnectedName);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(userId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
