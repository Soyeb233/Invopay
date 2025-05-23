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
public class DistrictDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       districtId;
    private String        districtName;
    private Integer       refStateId;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DistrictDTO() {}

    public DistrictDTO(DistrictDTO value) {
        this.districtId = value.districtId;
        this.districtName = value.districtName;
        this.refStateId = value.refStateId;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DistrictDTO(
        Integer       districtId,
        String        districtName,
        Integer       refStateId,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.districtId = districtId;
        this.districtName = districtName;
        this.refStateId = refStateId;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.district.district_id</code>.
     */
    public Integer getDistrictId() {
        return this.districtId;
    }

    /**
     * Setter for <code>invopay.district.district_id</code>.
     */
    public DistrictDTO setDistrictId(Integer districtId) {
        this.districtId = districtId;
        return this;
    }

    /**
     * Getter for <code>invopay.district.district_name</code>.
     */
    public String getDistrictName() {
        return this.districtName;
    }

    /**
     * Setter for <code>invopay.district.district_name</code>.
     */
    public DistrictDTO setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    /**
     * Getter for <code>invopay.district.ref_state_id</code>.
     */
    public Integer getRefStateId() {
        return this.refStateId;
    }

    /**
     * Setter for <code>invopay.district.ref_state_id</code>.
     */
    public DistrictDTO setRefStateId(Integer refStateId) {
        this.refStateId = refStateId;
        return this;
    }

    /**
     * Getter for <code>invopay.district.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.district.ref_user_id</code>.
     */
    public DistrictDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.district.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.district.delete_status</code>.
     */
    public DistrictDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.district.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.district.transaction_id</code>.
     */
    public DistrictDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.district.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.district.added_date</code>.
     */
    public DistrictDTO setAddedDate(LocalDateTime addedDate) {
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
        final DistrictDTO other = (DistrictDTO) obj;
        if (districtId == null) {
            if (other.districtId != null)
                return false;
        }
        else if (!districtId.equals(other.districtId))
            return false;
        if (districtName == null) {
            if (other.districtName != null)
                return false;
        }
        else if (!districtName.equals(other.districtName))
            return false;
        if (refStateId == null) {
            if (other.refStateId != null)
                return false;
        }
        else if (!refStateId.equals(other.refStateId))
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
        result = prime * result + ((this.districtId == null) ? 0 : this.districtId.hashCode());
        result = prime * result + ((this.districtName == null) ? 0 : this.districtName.hashCode());
        result = prime * result + ((this.refStateId == null) ? 0 : this.refStateId.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("District (");

        sb.append(districtId);
        sb.append(", ").append(districtName);
        sb.append(", ").append(refStateId);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
