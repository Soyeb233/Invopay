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
public class BloodGroupDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       bloodGroupId;
    private String        bloodGroupName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public BloodGroupDTO() {}

    public BloodGroupDTO(BloodGroupDTO value) {
        this.bloodGroupId = value.bloodGroupId;
        this.bloodGroupName = value.bloodGroupName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public BloodGroupDTO(
        Integer       bloodGroupId,
        String        bloodGroupName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.bloodGroupId = bloodGroupId;
        this.bloodGroupName = bloodGroupName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.blood_group.blood_group_id</code>.
     */
    public Integer getBloodGroupId() {
        return this.bloodGroupId;
    }

    /**
     * Setter for <code>invopay.blood_group.blood_group_id</code>.
     */
    public BloodGroupDTO setBloodGroupId(Integer bloodGroupId) {
        this.bloodGroupId = bloodGroupId;
        return this;
    }

    /**
     * Getter for <code>invopay.blood_group.blood_group_name</code>.
     */
    public String getBloodGroupName() {
        return this.bloodGroupName;
    }

    /**
     * Setter for <code>invopay.blood_group.blood_group_name</code>.
     */
    public BloodGroupDTO setBloodGroupName(String bloodGroupName) {
        this.bloodGroupName = bloodGroupName;
        return this;
    }

    /**
     * Getter for <code>invopay.blood_group.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.blood_group.ref_user_id</code>.
     */
    public BloodGroupDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.blood_group.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.blood_group.delete_status</code>.
     */
    public BloodGroupDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.blood_group.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.blood_group.transaction_id</code>.
     */
    public BloodGroupDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.blood_group.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.blood_group.added_date</code>.
     */
    public BloodGroupDTO setAddedDate(LocalDateTime addedDate) {
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
        final BloodGroupDTO other = (BloodGroupDTO) obj;
        if (bloodGroupId == null) {
            if (other.bloodGroupId != null)
                return false;
        }
        else if (!bloodGroupId.equals(other.bloodGroupId))
            return false;
        if (bloodGroupName == null) {
            if (other.bloodGroupName != null)
                return false;
        }
        else if (!bloodGroupName.equals(other.bloodGroupName))
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
        result = prime * result + ((this.bloodGroupId == null) ? 0 : this.bloodGroupId.hashCode());
        result = prime * result + ((this.bloodGroupName == null) ? 0 : this.bloodGroupName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BloodGroup (");

        sb.append(bloodGroupId);
        sb.append(", ").append(bloodGroupName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
