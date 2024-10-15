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
public class DietProductsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       dietProductsId;
    private String        action;
    private String        refDietCategoryId;
    private Integer       refDietproductId;
    private Integer       refPatientId;
    private Integer       refPatientVisitId;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DietProductsDTO() {}

    public DietProductsDTO(DietProductsDTO value) {
        this.dietProductsId = value.dietProductsId;
        this.action = value.action;
        this.refDietCategoryId = value.refDietCategoryId;
        this.refDietproductId = value.refDietproductId;
        this.refPatientId = value.refPatientId;
        this.refPatientVisitId = value.refPatientVisitId;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DietProductsDTO(
        Integer       dietProductsId,
        String        action,
        String        refDietCategoryId,
        Integer       refDietproductId,
        Integer       refPatientId,
        Integer       refPatientVisitId,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.dietProductsId = dietProductsId;
        this.action = action;
        this.refDietCategoryId = refDietCategoryId;
        this.refDietproductId = refDietproductId;
        this.refPatientId = refPatientId;
        this.refPatientVisitId = refPatientVisitId;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.diet_products.diet_products_id</code>.
     */
    public Integer getDietProductsId() {
        return this.dietProductsId;
    }

    /**
     * Setter for <code>invopay.diet_products.diet_products_id</code>.
     */
    public DietProductsDTO setDietProductsId(Integer dietProductsId) {
        this.dietProductsId = dietProductsId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.action</code>.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Setter for <code>invopay.diet_products.action</code>.
     */
    public DietProductsDTO setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.ref_diet_category_id</code>.
     */
    public String getRefDietCategoryId() {
        return this.refDietCategoryId;
    }

    /**
     * Setter for <code>invopay.diet_products.ref_diet_category_id</code>.
     */
    public DietProductsDTO setRefDietCategoryId(String refDietCategoryId) {
        this.refDietCategoryId = refDietCategoryId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.ref_dietproduct_id</code>.
     */
    public Integer getRefDietproductId() {
        return this.refDietproductId;
    }

    /**
     * Setter for <code>invopay.diet_products.ref_dietproduct_id</code>.
     */
    public DietProductsDTO setRefDietproductId(Integer refDietproductId) {
        this.refDietproductId = refDietproductId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.ref_patient_id</code>.
     */
    public Integer getRefPatientId() {
        return this.refPatientId;
    }

    /**
     * Setter for <code>invopay.diet_products.ref_patient_id</code>.
     */
    public DietProductsDTO setRefPatientId(Integer refPatientId) {
        this.refPatientId = refPatientId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.ref_patient_visit_id</code>.
     */
    public Integer getRefPatientVisitId() {
        return this.refPatientVisitId;
    }

    /**
     * Setter for <code>invopay.diet_products.ref_patient_visit_id</code>.
     */
    public DietProductsDTO setRefPatientVisitId(Integer refPatientVisitId) {
        this.refPatientVisitId = refPatientVisitId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.diet_products.ref_user_id</code>.
     */
    public DietProductsDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.diet_products.delete_status</code>.
     */
    public DietProductsDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.diet_products.transaction_id</code>.
     */
    public DietProductsDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.diet_products.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.diet_products.added_date</code>.
     */
    public DietProductsDTO setAddedDate(LocalDateTime addedDate) {
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
        final DietProductsDTO other = (DietProductsDTO) obj;
        if (dietProductsId == null) {
            if (other.dietProductsId != null)
                return false;
        }
        else if (!dietProductsId.equals(other.dietProductsId))
            return false;
        if (action == null) {
            if (other.action != null)
                return false;
        }
        else if (!action.equals(other.action))
            return false;
        if (refDietCategoryId == null) {
            if (other.refDietCategoryId != null)
                return false;
        }
        else if (!refDietCategoryId.equals(other.refDietCategoryId))
            return false;
        if (refDietproductId == null) {
            if (other.refDietproductId != null)
                return false;
        }
        else if (!refDietproductId.equals(other.refDietproductId))
            return false;
        if (refPatientId == null) {
            if (other.refPatientId != null)
                return false;
        }
        else if (!refPatientId.equals(other.refPatientId))
            return false;
        if (refPatientVisitId == null) {
            if (other.refPatientVisitId != null)
                return false;
        }
        else if (!refPatientVisitId.equals(other.refPatientVisitId))
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
        result = prime * result + ((this.dietProductsId == null) ? 0 : this.dietProductsId.hashCode());
        result = prime * result + ((this.action == null) ? 0 : this.action.hashCode());
        result = prime * result + ((this.refDietCategoryId == null) ? 0 : this.refDietCategoryId.hashCode());
        result = prime * result + ((this.refDietproductId == null) ? 0 : this.refDietproductId.hashCode());
        result = prime * result + ((this.refPatientId == null) ? 0 : this.refPatientId.hashCode());
        result = prime * result + ((this.refPatientVisitId == null) ? 0 : this.refPatientVisitId.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DietProducts (");

        sb.append(dietProductsId);
        sb.append(", ").append(action);
        sb.append(", ").append(refDietCategoryId);
        sb.append(", ").append(refDietproductId);
        sb.append(", ").append(refPatientId);
        sb.append(", ").append(refPatientVisitId);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
