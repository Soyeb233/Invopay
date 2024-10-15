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
public class FrontCotDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       frontCotId;
    private String        frontCotName;
    private String        frontCotQuality;
    private Integer       frontCotSize;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public FrontCotDTO() {}

    public FrontCotDTO(FrontCotDTO value) {
        this.frontCotId = value.frontCotId;
        this.frontCotName = value.frontCotName;
        this.frontCotQuality = value.frontCotQuality;
        this.frontCotSize = value.frontCotSize;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public FrontCotDTO(
        Integer       frontCotId,
        String        frontCotName,
        String        frontCotQuality,
        Integer       frontCotSize,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.frontCotId = frontCotId;
        this.frontCotName = frontCotName;
        this.frontCotQuality = frontCotQuality;
        this.frontCotSize = frontCotSize;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.front_cot.front_cot_id</code>.
     */
    public Integer getFrontCotId() {
        return this.frontCotId;
    }

    /**
     * Setter for <code>invopay.front_cot.front_cot_id</code>.
     */
    public FrontCotDTO setFrontCotId(Integer frontCotId) {
        this.frontCotId = frontCotId;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.front_cot_name</code>. Front Cot Name
     */
    public String getFrontCotName() {
        return this.frontCotName;
    }

    /**
     * Setter for <code>invopay.front_cot.front_cot_name</code>. Front Cot Name
     */
    public FrontCotDTO setFrontCotName(String frontCotName) {
        this.frontCotName = frontCotName;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.front_cot_quality</code>. Quality
     */
    public String getFrontCotQuality() {
        return this.frontCotQuality;
    }

    /**
     * Setter for <code>invopay.front_cot.front_cot_quality</code>. Quality
     */
    public FrontCotDTO setFrontCotQuality(String frontCotQuality) {
        this.frontCotQuality = frontCotQuality;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.front_cot_size</code>. Size
     */
    public Integer getFrontCotSize() {
        return this.frontCotSize;
    }

    /**
     * Setter for <code>invopay.front_cot.front_cot_size</code>. Size
     */
    public FrontCotDTO setFrontCotSize(Integer frontCotSize) {
        this.frontCotSize = frontCotSize;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.front_cot.ref_user_id</code>. User
     */
    public FrontCotDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.front_cot.delete_status</code>.
     */
    public FrontCotDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.front_cot.transaction_id</code>.
     */
    public FrontCotDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.front_cot.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.front_cot.added_date</code>. Added Date
     */
    public FrontCotDTO setAddedDate(LocalDateTime addedDate) {
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
        final FrontCotDTO other = (FrontCotDTO) obj;
        if (frontCotId == null) {
            if (other.frontCotId != null)
                return false;
        }
        else if (!frontCotId.equals(other.frontCotId))
            return false;
        if (frontCotName == null) {
            if (other.frontCotName != null)
                return false;
        }
        else if (!frontCotName.equals(other.frontCotName))
            return false;
        if (frontCotQuality == null) {
            if (other.frontCotQuality != null)
                return false;
        }
        else if (!frontCotQuality.equals(other.frontCotQuality))
            return false;
        if (frontCotSize == null) {
            if (other.frontCotSize != null)
                return false;
        }
        else if (!frontCotSize.equals(other.frontCotSize))
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
        result = prime * result + ((this.frontCotId == null) ? 0 : this.frontCotId.hashCode());
        result = prime * result + ((this.frontCotName == null) ? 0 : this.frontCotName.hashCode());
        result = prime * result + ((this.frontCotQuality == null) ? 0 : this.frontCotQuality.hashCode());
        result = prime * result + ((this.frontCotSize == null) ? 0 : this.frontCotSize.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FrontCot (");

        sb.append(frontCotId);
        sb.append(", ").append(frontCotName);
        sb.append(", ").append(frontCotQuality);
        sb.append(", ").append(frontCotSize);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
