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
public class ApplicationSegmentTypeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       applicationSegmentTypeId;
    private String        applicationSegmentTypeName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ApplicationSegmentTypeDTO() {}

    public ApplicationSegmentTypeDTO(ApplicationSegmentTypeDTO value) {
        this.applicationSegmentTypeId = value.applicationSegmentTypeId;
        this.applicationSegmentTypeName = value.applicationSegmentTypeName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ApplicationSegmentTypeDTO(
        Integer       applicationSegmentTypeId,
        String        applicationSegmentTypeName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.applicationSegmentTypeId = applicationSegmentTypeId;
        this.applicationSegmentTypeName = applicationSegmentTypeName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.application_segment_type.application_segment_type_id</code>.
     */
    public Integer getApplicationSegmentTypeId() {
        return this.applicationSegmentTypeId;
    }

    /**
     * Setter for <code>invopay.application_segment_type.application_segment_type_id</code>.
     */
    public ApplicationSegmentTypeDTO setApplicationSegmentTypeId(Integer applicationSegmentTypeId) {
        this.applicationSegmentTypeId = applicationSegmentTypeId;
        return this;
    }

    /**
     * Getter for <code>invopay.application_segment_type.application_segment_type_name</code>. Application Segment type
     */
    public String getApplicationSegmentTypeName() {
        return this.applicationSegmentTypeName;
    }

    /**
     * Setter for <code>invopay.application_segment_type.application_segment_type_name</code>. Application Segment type
     */
    public ApplicationSegmentTypeDTO setApplicationSegmentTypeName(String applicationSegmentTypeName) {
        this.applicationSegmentTypeName = applicationSegmentTypeName;
        return this;
    }

    /**
     * Getter for <code>invopay.application_segment_type.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.application_segment_type.ref_user_id</code>. User
     */
    public ApplicationSegmentTypeDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.application_segment_type.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.application_segment_type.delete_status</code>.
     */
    public ApplicationSegmentTypeDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.application_segment_type.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.application_segment_type.transaction_id</code>.
     */
    public ApplicationSegmentTypeDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.application_segment_type.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.application_segment_type.added_date</code>. Added Date
     */
    public ApplicationSegmentTypeDTO setAddedDate(LocalDateTime addedDate) {
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
        final ApplicationSegmentTypeDTO other = (ApplicationSegmentTypeDTO) obj;
        if (applicationSegmentTypeId == null) {
            if (other.applicationSegmentTypeId != null)
                return false;
        }
        else if (!applicationSegmentTypeId.equals(other.applicationSegmentTypeId))
            return false;
        if (applicationSegmentTypeName == null) {
            if (other.applicationSegmentTypeName != null)
                return false;
        }
        else if (!applicationSegmentTypeName.equals(other.applicationSegmentTypeName))
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
        result = prime * result + ((this.applicationSegmentTypeId == null) ? 0 : this.applicationSegmentTypeId.hashCode());
        result = prime * result + ((this.applicationSegmentTypeName == null) ? 0 : this.applicationSegmentTypeName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicationSegmentType (");

        sb.append(applicationSegmentTypeId);
        sb.append(", ").append(applicationSegmentTypeName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
