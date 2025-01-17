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
public class DietCategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       dietCategoryId;
    private String        dietCategoryName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DietCategoryDTO() {}

    public DietCategoryDTO(DietCategoryDTO value) {
        this.dietCategoryId = value.dietCategoryId;
        this.dietCategoryName = value.dietCategoryName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DietCategoryDTO(
        Integer       dietCategoryId,
        String        dietCategoryName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.dietCategoryId = dietCategoryId;
        this.dietCategoryName = dietCategoryName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.diet_category.diet_category_id</code>.
     */
    public Integer getDietCategoryId() {
        return this.dietCategoryId;
    }

    /**
     * Setter for <code>invopay.diet_category.diet_category_id</code>.
     */
    public DietCategoryDTO setDietCategoryId(Integer dietCategoryId) {
        this.dietCategoryId = dietCategoryId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_category.diet_category_name</code>. Diet Category Name
     */
    public String getDietCategoryName() {
        return this.dietCategoryName;
    }

    /**
     * Setter for <code>invopay.diet_category.diet_category_name</code>. Diet Category Name
     */
    public DietCategoryDTO setDietCategoryName(String dietCategoryName) {
        this.dietCategoryName = dietCategoryName;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_category.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.diet_category.ref_user_id</code>.
     */
    public DietCategoryDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_category.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.diet_category.delete_status</code>.
     */
    public DietCategoryDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_category.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.diet_category.transaction_id</code>.
     */
    public DietCategoryDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_category.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.diet_category.added_date</code>.
     */
    public DietCategoryDTO setAddedDate(LocalDateTime addedDate) {
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
        final DietCategoryDTO other = (DietCategoryDTO) obj;
        if (dietCategoryId == null) {
            if (other.dietCategoryId != null)
                return false;
        }
        else if (!dietCategoryId.equals(other.dietCategoryId))
            return false;
        if (dietCategoryName == null) {
            if (other.dietCategoryName != null)
                return false;
        }
        else if (!dietCategoryName.equals(other.dietCategoryName))
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
        result = prime * result + ((this.dietCategoryId == null) ? 0 : this.dietCategoryId.hashCode());
        result = prime * result + ((this.dietCategoryName == null) ? 0 : this.dietCategoryName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DietCategory (");

        sb.append(dietCategoryId);
        sb.append(", ").append(dietCategoryName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
