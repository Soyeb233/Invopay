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
public class TempProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       tempProductId;
    private Integer       productId;
    private Integer       quantity;
    private Integer       customerId;
    private Integer       transactionId;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private LocalDateTime addedDate;

    public TempProductDTO() {}

    public TempProductDTO(TempProductDTO value) {
        this.tempProductId = value.tempProductId;
        this.productId = value.productId;
        this.quantity = value.quantity;
        this.customerId = value.customerId;
        this.transactionId = value.transactionId;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.addedDate = value.addedDate;
    }

    public TempProductDTO(
        Integer       tempProductId,
        Integer       productId,
        Integer       quantity,
        Integer       customerId,
        Integer       transactionId,
        Integer       refUserId,
        Integer       deleteStatus,
        LocalDateTime addedDate
    ) {
        this.tempProductId = tempProductId;
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
        this.transactionId = transactionId;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.temp_product.temp_product_id</code>.
     */
    public Integer getTempProductId() {
        return this.tempProductId;
    }

    /**
     * Setter for <code>invopay.temp_product.temp_product_id</code>.
     */
    public TempProductDTO setTempProductId(Integer tempProductId) {
        this.tempProductId = tempProductId;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.product_id</code>.
     */
    public Integer getProductId() {
        return this.productId;
    }

    /**
     * Setter for <code>invopay.temp_product.product_id</code>.
     */
    public TempProductDTO setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.quantity</code>.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>invopay.temp_product.quantity</code>.
     */
    public TempProductDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.customer_id</code>.
     */
    public Integer getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>invopay.temp_product.customer_id</code>.
     */
    public TempProductDTO setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.temp_product.transaction_id</code>.
     */
    public TempProductDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.temp_product.ref_user_id</code>.
     */
    public TempProductDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.temp_product.delete_status</code>.
     */
    public TempProductDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.temp_product.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.temp_product.added_date</code>.
     */
    public TempProductDTO setAddedDate(LocalDateTime addedDate) {
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
        final TempProductDTO other = (TempProductDTO) obj;
        if (tempProductId == null) {
            if (other.tempProductId != null)
                return false;
        }
        else if (!tempProductId.equals(other.tempProductId))
            return false;
        if (productId == null) {
            if (other.productId != null)
                return false;
        }
        else if (!productId.equals(other.productId))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        }
        else if (!quantity.equals(other.quantity))
            return false;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!customerId.equals(other.customerId))
            return false;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
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
        result = prime * result + ((this.tempProductId == null) ? 0 : this.tempProductId.hashCode());
        result = prime * result + ((this.productId == null) ? 0 : this.productId.hashCode());
        result = prime * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TempProduct (");

        sb.append(tempProductId);
        sb.append(", ").append(productId);
        sb.append(", ").append(quantity);
        sb.append(", ").append(customerId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}