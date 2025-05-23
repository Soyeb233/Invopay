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
public class CompactCotBigDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       compactCotBigId;
    private String        compactCotBigName;
    private String        compactCotBigQuality;
    private Integer       compactCotBigSize;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public CompactCotBigDTO() {}

    public CompactCotBigDTO(CompactCotBigDTO value) {
        this.compactCotBigId = value.compactCotBigId;
        this.compactCotBigName = value.compactCotBigName;
        this.compactCotBigQuality = value.compactCotBigQuality;
        this.compactCotBigSize = value.compactCotBigSize;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public CompactCotBigDTO(
        Integer       compactCotBigId,
        String        compactCotBigName,
        String        compactCotBigQuality,
        Integer       compactCotBigSize,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.compactCotBigId = compactCotBigId;
        this.compactCotBigName = compactCotBigName;
        this.compactCotBigQuality = compactCotBigQuality;
        this.compactCotBigSize = compactCotBigSize;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.compact_cot_big_id</code>.
     */
    public Integer getCompactCotBigId() {
        return this.compactCotBigId;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.compact_cot_big_id</code>.
     */
    public CompactCotBigDTO setCompactCotBigId(Integer compactCotBigId) {
        this.compactCotBigId = compactCotBigId;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.compact_cot_big_name</code>. Compact Cot Big Name 
     */
    public String getCompactCotBigName() {
        return this.compactCotBigName;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.compact_cot_big_name</code>. Compact Cot Big Name 
     */
    public CompactCotBigDTO setCompactCotBigName(String compactCotBigName) {
        this.compactCotBigName = compactCotBigName;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.compact_cot_big_quality</code>. Quality
     */
    public String getCompactCotBigQuality() {
        return this.compactCotBigQuality;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.compact_cot_big_quality</code>. Quality
     */
    public CompactCotBigDTO setCompactCotBigQuality(String compactCotBigQuality) {
        this.compactCotBigQuality = compactCotBigQuality;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.compact_cot_big_size</code>. Size
     */
    public Integer getCompactCotBigSize() {
        return this.compactCotBigSize;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.compact_cot_big_size</code>. Size
     */
    public CompactCotBigDTO setCompactCotBigSize(Integer compactCotBigSize) {
        this.compactCotBigSize = compactCotBigSize;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.ref_user_id</code>. User
     */
    public CompactCotBigDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.delete_status</code>.
     */
    public CompactCotBigDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.transaction_id</code>.
     */
    public CompactCotBigDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.compact_cot_big.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.compact_cot_big.added_date</code>. Added Date
     */
    public CompactCotBigDTO setAddedDate(LocalDateTime addedDate) {
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
        final CompactCotBigDTO other = (CompactCotBigDTO) obj;
        if (compactCotBigId == null) {
            if (other.compactCotBigId != null)
                return false;
        }
        else if (!compactCotBigId.equals(other.compactCotBigId))
            return false;
        if (compactCotBigName == null) {
            if (other.compactCotBigName != null)
                return false;
        }
        else if (!compactCotBigName.equals(other.compactCotBigName))
            return false;
        if (compactCotBigQuality == null) {
            if (other.compactCotBigQuality != null)
                return false;
        }
        else if (!compactCotBigQuality.equals(other.compactCotBigQuality))
            return false;
        if (compactCotBigSize == null) {
            if (other.compactCotBigSize != null)
                return false;
        }
        else if (!compactCotBigSize.equals(other.compactCotBigSize))
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
        result = prime * result + ((this.compactCotBigId == null) ? 0 : this.compactCotBigId.hashCode());
        result = prime * result + ((this.compactCotBigName == null) ? 0 : this.compactCotBigName.hashCode());
        result = prime * result + ((this.compactCotBigQuality == null) ? 0 : this.compactCotBigQuality.hashCode());
        result = prime * result + ((this.compactCotBigSize == null) ? 0 : this.compactCotBigSize.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompactCotBig (");

        sb.append(compactCotBigId);
        sb.append(", ").append(compactCotBigName);
        sb.append(", ").append(compactCotBigQuality);
        sb.append(", ").append(compactCotBigSize);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
