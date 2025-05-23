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
public class DiscountDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       discountId;
    private String        discountName;
    private Integer       refSupplierId;
    private Double        rate;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DiscountDTO() {}

    public DiscountDTO(DiscountDTO value) {
        this.discountId = value.discountId;
        this.discountName = value.discountName;
        this.refSupplierId = value.refSupplierId;
        this.rate = value.rate;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DiscountDTO(
        Integer       discountId,
        String        discountName,
        Integer       refSupplierId,
        Double        rate,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.discountId = discountId;
        this.discountName = discountName;
        this.refSupplierId = refSupplierId;
        this.rate = rate;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.discount.discount_id</code>.
     */
    public Integer getDiscountId() {
        return this.discountId;
    }

    /**
     * Setter for <code>invopay.discount.discount_id</code>.
     */
    public DiscountDTO setDiscountId(Integer discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.discount_name</code>.
     */
    public String getDiscountName() {
        return this.discountName;
    }

    /**
     * Setter for <code>invopay.discount.discount_name</code>.
     */
    public DiscountDTO setDiscountName(String discountName) {
        this.discountName = discountName;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.ref_supplier_id</code>.
     */
    public Integer getRefSupplierId() {
        return this.refSupplierId;
    }

    /**
     * Setter for <code>invopay.discount.ref_supplier_id</code>.
     */
    public DiscountDTO setRefSupplierId(Integer refSupplierId) {
        this.refSupplierId = refSupplierId;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.rate</code>.
     */
    public Double getRate() {
        return this.rate;
    }

    /**
     * Setter for <code>invopay.discount.rate</code>.
     */
    public DiscountDTO setRate(Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.discount.delete_status</code>.
     */
    public DiscountDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.discount.ref_user_id</code>.
     */
    public DiscountDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.discount.transaction_id</code>.
     */
    public DiscountDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.discount.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.discount.added_date</code>.
     */
    public DiscountDTO setAddedDate(LocalDateTime addedDate) {
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
        final DiscountDTO other = (DiscountDTO) obj;
        if (discountId == null) {
            if (other.discountId != null)
                return false;
        }
        else if (!discountId.equals(other.discountId))
            return false;
        if (discountName == null) {
            if (other.discountName != null)
                return false;
        }
        else if (!discountName.equals(other.discountName))
            return false;
        if (refSupplierId == null) {
            if (other.refSupplierId != null)
                return false;
        }
        else if (!refSupplierId.equals(other.refSupplierId))
            return false;
        if (rate == null) {
            if (other.rate != null)
                return false;
        }
        else if (!rate.equals(other.rate))
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
        result = prime * result + ((this.discountId == null) ? 0 : this.discountId.hashCode());
        result = prime * result + ((this.discountName == null) ? 0 : this.discountName.hashCode());
        result = prime * result + ((this.refSupplierId == null) ? 0 : this.refSupplierId.hashCode());
        result = prime * result + ((this.rate == null) ? 0 : this.rate.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Discount (");

        sb.append(discountId);
        sb.append(", ").append(discountName);
        sb.append(", ").append(refSupplierId);
        sb.append(", ").append(rate);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
