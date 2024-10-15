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
public class DesignationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       designationId;
    private String        designationName;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DesignationDTO() {}

    public DesignationDTO(DesignationDTO value) {
        this.designationId = value.designationId;
        this.designationName = value.designationName;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DesignationDTO(
        Integer       designationId,
        String        designationName,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.designationId = designationId;
        this.designationName = designationName;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.designation.designation_id</code>.
     */
    public Integer getDesignationId() {
        return this.designationId;
    }

    /**
     * Setter for <code>invopay.designation.designation_id</code>.
     */
    public DesignationDTO setDesignationId(Integer designationId) {
        this.designationId = designationId;
        return this;
    }

    /**
     * Getter for <code>invopay.designation.designation_name</code>. Designation
     */
    public String getDesignationName() {
        return this.designationName;
    }

    /**
     * Setter for <code>invopay.designation.designation_name</code>. Designation
     */
    public DesignationDTO setDesignationName(String designationName) {
        this.designationName = designationName;
        return this;
    }

    /**
     * Getter for <code>invopay.designation.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.designation.delete_status</code>.
     */
    public DesignationDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.designation.ref_user_id</code>. User Name
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.designation.ref_user_id</code>. User Name
     */
    public DesignationDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.designation.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.designation.transaction_id</code>.
     */
    public DesignationDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.designation.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.designation.added_date</code>. Added Date
     */
    public DesignationDTO setAddedDate(LocalDateTime addedDate) {
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
        final DesignationDTO other = (DesignationDTO) obj;
        if (designationId == null) {
            if (other.designationId != null)
                return false;
        }
        else if (!designationId.equals(other.designationId))
            return false;
        if (designationName == null) {
            if (other.designationName != null)
                return false;
        }
        else if (!designationName.equals(other.designationName))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
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
        result = prime * result + ((this.designationId == null) ? 0 : this.designationId.hashCode());
        result = prime * result + ((this.designationName == null) ? 0 : this.designationName.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Designation (");

        sb.append(designationId);
        sb.append(", ").append(designationName);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}